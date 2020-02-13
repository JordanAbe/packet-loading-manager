package tech.zdev.packages.loading.packetloadingmanager.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import tech.zdev.packages.loading.packetloadingmanager.model.PackageInfo;
import tech.zdev.packages.loading.packetloadingmanager.repository.PaqueteRepository;

@Repository
public class PaqueteRepositoryImpl implements PaqueteRepository {

	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public void savePaquete(PackageInfo paquete) {
		mongoTemplate.save(paquete);
	}

	@Override
	public PackageInfo findByCode(String code) {
		PackageInfo p = null;
		try {
			Query query = new Query();
			query.addCriteria(Criteria.where("code").is(code));
			p = mongoTemplate.findOne(query, PackageInfo.class);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return p;
	}

	@Override
	public List<PackageInfo> findAll() {
		return mongoTemplate.findAll(PackageInfo.class);
	}

}
