package tech.zdev.packages.loading.packetloadingmanager.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import tech.zdev.packages.loading.packetloadingmanager.model.Hotel;
import tech.zdev.packages.loading.packetloadingmanager.repository.HotelRepository;

@Repository
public class HotelRepositoryImpl implements HotelRepository {

	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public void save(Hotel hotel) {
		mongoTemplate.save(hotel);
	}

	@Override
	public Hotel findByCode(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hotel> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
