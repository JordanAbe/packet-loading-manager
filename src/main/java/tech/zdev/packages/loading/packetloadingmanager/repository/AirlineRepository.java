package tech.zdev.packages.loading.packetloadingmanager.repository;

import java.util.List;

import tech.zdev.packages.loading.packetloadingmanager.model.Airline;

public interface AirlineRepository {
	
	void save(Airline airport);
	Airline findByCode(String code);
	List<Airline> findAll();

}
