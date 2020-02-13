package tech.zdev.packages.loading.packetloadingmanager.service;

import java.util.List;

import tech.zdev.packages.loading.packetloadingmanager.model.Airline;

public interface AirlineService {
	
	void save(Airline airline);
	Airline findByCode(String code);
	List<Airline> findAll();

}
