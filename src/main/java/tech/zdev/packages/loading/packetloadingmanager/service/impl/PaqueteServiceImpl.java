package tech.zdev.packages.loading.packetloadingmanager.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.zdev.packages.loading.packetloadingmanager.model.Currency;
import tech.zdev.packages.loading.packetloadingmanager.model.Flight;
import tech.zdev.packages.loading.packetloadingmanager.model.PackageInfo;
import tech.zdev.packages.loading.packetloadingmanager.model.Packagedate;
import tech.zdev.packages.loading.packetloadingmanager.model.Segment;
import tech.zdev.packages.loading.packetloadingmanager.repository.AirlineRepository;
import tech.zdev.packages.loading.packetloadingmanager.repository.AirportRepository;
import tech.zdev.packages.loading.packetloadingmanager.repository.CurrencyRepository;
import tech.zdev.packages.loading.packetloadingmanager.repository.FlightRepository;
import tech.zdev.packages.loading.packetloadingmanager.repository.HotelRepository;
import tech.zdev.packages.loading.packetloadingmanager.repository.PackagedateRepository;
import tech.zdev.packages.loading.packetloadingmanager.repository.PaqueteRepository;
import tech.zdev.packages.loading.packetloadingmanager.repository.SegmentRepository;
import tech.zdev.packages.loading.packetloadingmanager.service.PaqueteService;

@Service
public class PaqueteServiceImpl implements PaqueteService {

	PaqueteRepository paqueteRepository;
	FlightRepository flightRepository;
	SegmentRepository segmentRepository;
	PackagedateRepository packagedateRepository;
	CurrencyRepository currencyRepository;
	HotelRepository hotelRepository;
	AirportRepository airportRepository;
	AirlineRepository airlineRepository;

	@Autowired
	public PaqueteServiceImpl(PaqueteRepository paqueteRepository, FlightRepository flightRepository,
			SegmentRepository segmentRepository, PackagedateRepository packagedateRepository,
			CurrencyRepository currencyRepository, HotelRepository hotelRepository, AirportRepository airportRepository,
			AirlineRepository airlineRepository) {
		super();
		this.paqueteRepository = paqueteRepository;
		this.flightRepository = flightRepository;
		this.segmentRepository = segmentRepository;
		this.packagedateRepository = packagedateRepository;
		this.currencyRepository = currencyRepository;
		this.hotelRepository = hotelRepository;
		this.airportRepository = airportRepository;
		this.airlineRepository = airlineRepository;
	}

	@Override
	public void insertPaquete(List<PackageInfo> paquetes) {
		try {
			for (PackageInfo paquete : paquetes) {
				for (Flight flight : paquete.getFlights()) {
					for (Segment segment : flight.getSegments()) {
						segment.setAirline(airlineRepository.findByCode(segment.getAirline().getCode()));
						segment.setAirportOrigin(
								airportRepository.findByCode(segment.getAirportOrigin().getCodeIATA()));
						segment.setAirportDestination(
								airportRepository.findByCode(segment.getAirportDestination().getCodeIATA()));
						segmentRepository.saveSegment(segment);
					}
					flight.setAirline(airlineRepository.findByCode(flight.getAirline().getCode()));
					flight.setAirportOrigin(airportRepository.findByCode(flight.getAirportOrigin().getCodeIATA()));
					flight.setAirportDestination(
							airportRepository.findByCode(flight.getAirportDestination().getCodeIATA()));
					flightRepository.saveFlight(flight);
				}
				for (Packagedate packagedate : paquete.getPackageDate()) {
					for (Currency currency : packagedate.getCurrencies()) {
						currencyRepository.save(currency);
					}
					packagedateRepository.save(packagedate);
				}
				hotelRepository.save(paquete.getHotel());
				paqueteRepository.savePaquete(paquete);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public PackageInfo findByCode(String code) {
		PackageInfo packet = paqueteRepository.findByCode(code);
		List<Segment> segmentsUtil = new ArrayList<Segment>();
		for (Flight f : packet.getFlights()) {
			for (Segment s : f.getSegments()) {
				Segment segment = new Segment(s.getDepartureDate(), s.getDepartureTime(), s.getArrivalDate(),
						s.getArrivalTime(), s.getFlightNumber(), s.getAirline(), s.getAirportOrigin(),
						s.getAirportDestination());
				segment.setIndicator(f.getIndicator());
				segmentsUtil.add(segment);
			}
		}
		packet.setSegmentsUtil(segmentsUtil);
		return packet;
	}

	@Override
	public List<PackageInfo> findAll() {
		return paqueteRepository.findAll();
	}

}
