package tech.zdev.packages.loading.packetloadingmanager.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import tech.zdev.packages.loading.packetloadingmanager.model.User;
import tech.zdev.packages.loading.packetloadingmanager.repository.UserRepository;

@Repository
public class UserRepositoryImpl implements UserRepository{
	
	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public User findByUsername(String username) {
		Query query = new Query();
		query.addCriteria(Criteria.where("code").is(username));
		return mongoTemplate.findOne(query, User.class);
	}
	
	@Override
	public User save(User user) {
		return mongoTemplate.save(user);
	}

}
