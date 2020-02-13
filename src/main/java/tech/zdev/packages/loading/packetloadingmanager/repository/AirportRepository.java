package tech.zdev.packages.loading.packetloadingmanager.repository;

import java.util.List;

import tech.zdev.packages.loading.packetloadingmanager.model.Airport;

public interface AirportRepository {

	void save(Airport airport);
	Airport findByCode(String code);
	List<Airport> findAll();

}
