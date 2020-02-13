package tech.zdev.packages.loading.packetloadingmanager.service;

import java.util.List;

import tech.zdev.packages.loading.packetloadingmanager.model.Airport;

public interface AirportService {
	
	void save(Airport airport);
	Airport findByCode(String code);
	List<Airport> findAll();

}
