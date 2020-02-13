package tech.zdev.packages.loading.packetloadingmanager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.zdev.packages.loading.packetloadingmanager.model.Airport;
import tech.zdev.packages.loading.packetloadingmanager.repository.AirportRepository;
import tech.zdev.packages.loading.packetloadingmanager.service.AirportService;

@Service
public class AirportServiceImpl implements AirportService {

	AirportRepository airportRepository;

	@Autowired
	public AirportServiceImpl(AirportRepository airportRepository) {
		this.airportRepository = airportRepository;
	}

	@Override
	public void save(Airport airport) {
		Airport a = this.findByCode(airport.getCodeIATA());
		if (a == null) {
			airportRepository.save(airport);
		}
	}

	@Override
	public Airport findByCode(String code) {
		return airportRepository.findByCode(code);
	}

	@Override
	public List<Airport> findAll() {
		return airportRepository.findAll();
	}

}
