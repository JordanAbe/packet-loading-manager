package tech.zdev.packages.loading.packetloadingmanager.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import tech.zdev.packages.loading.packetloadingmanager.model.Currency;
import tech.zdev.packages.loading.packetloadingmanager.repository.CurrencyRepository;

@Repository
public class CurrencyRepositoryImpl implements CurrencyRepository {

	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public void save(Currency currency) {
		mongoTemplate.save(currency);
	}

	@Override
	public Currency findByCode(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Currency> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
