package tech.zdev.packages.loading.packetloadingmanager.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import tech.zdev.packages.loading.packetloadingmanager.model.Airport;
import tech.zdev.packages.loading.packetloadingmanager.repository.AirportRepository;

@Repository
public class AirportRepositoryImpl implements AirportRepository {
	
	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public Airport findByCode(String code) {
		Query query = new Query();
		query.addCriteria(Criteria.where("codeIATA").is(code));
		return mongoTemplate.findOne(query, Airport.class);
	}

	@Override
	public void save(Airport airport) {
		mongoTemplate.save(airport);
	}

	@Override
	public List<Airport> findAll() {
		return mongoTemplate.findAll(Airport.class);
	}

}
