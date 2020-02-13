package tech.zdev.packages.loading.packetloadingmanager.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import tech.zdev.packages.loading.packetloadingmanager.model.Flight;
import tech.zdev.packages.loading.packetloadingmanager.repository.FlightRepository;

@Repository
public class FlightRepositoryImpl implements FlightRepository{
	
	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public void saveFlight(Flight flight) {
		mongoTemplate.save(flight);
	}

}
