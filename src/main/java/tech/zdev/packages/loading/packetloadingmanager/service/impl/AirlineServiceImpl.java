package tech.zdev.packages.loading.packetloadingmanager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.zdev.packages.loading.packetloadingmanager.model.Airline;
import tech.zdev.packages.loading.packetloadingmanager.repository.AirlineRepository;
import tech.zdev.packages.loading.packetloadingmanager.service.AirlineService;

@Service
public class AirlineServiceImpl implements AirlineService {

	AirlineRepository airlineRepository;

	@Autowired
	public AirlineServiceImpl(AirlineRepository AirlineRepository) {
		this.airlineRepository = AirlineRepository;
	}

	@Override
	public void save(Airline airline) {
		Airline a = this.findByCode(airline.getCode());
		if (a == null) {
			airlineRepository.save(airline);
		}
	}

	@Override
	public Airline findByCode(String code) {
		return airlineRepository.findByCode(code);
	}

	@Override
	public List<Airline> findAll() {
		return airlineRepository.findAll();
	}

}
