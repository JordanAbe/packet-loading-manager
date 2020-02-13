package tech.zdev.packages.loading.packetloadingmanager.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import tech.zdev.packages.loading.packetloadingmanager.model.Segment;
import tech.zdev.packages.loading.packetloadingmanager.repository.SegmentRepository;

@Repository
public class SegmentRepositoryImpl implements SegmentRepository {
	
	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public void saveSegment(Segment segment) {
		mongoTemplate.save(segment);
	}

}
