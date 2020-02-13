package tech.zdev.packages.loading.packetloadingmanager.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import tech.zdev.packages.loading.packetloadingmanager.model.Airline;
import tech.zdev.packages.loading.packetloadingmanager.repository.AirlineRepository;

@Repository
public class AirlineRepositoryImpl implements AirlineRepository {

	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public Airline findByCode(String code) {
		Query query = new Query();
		query.addCriteria(Criteria.where("code").is(code));
		return mongoTemplate.findOne(query, Airline.class);
	}

	@Override
	public void save(Airline airline) {
		mongoTemplate.save(airline);
	}

	@Override
	public List<Airline> findAll() {
		return mongoTemplate.findAll(Airline.class);
	}

}
