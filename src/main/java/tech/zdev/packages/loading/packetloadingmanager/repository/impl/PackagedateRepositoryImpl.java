package tech.zdev.packages.loading.packetloadingmanager.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import tech.zdev.packages.loading.packetloadingmanager.model.Packagedate;
import tech.zdev.packages.loading.packetloadingmanager.repository.PackagedateRepository;

@Repository
public class PackagedateRepositoryImpl implements PackagedateRepository {

	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public void save(Packagedate packagedate) {
		mongoTemplate.save(packagedate);
	}

	@Override
	public Packagedate findByCode(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Packagedate> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
