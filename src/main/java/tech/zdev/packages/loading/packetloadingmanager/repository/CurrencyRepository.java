package tech.zdev.packages.loading.packetloadingmanager.repository;

import java.util.List;

import tech.zdev.packages.loading.packetloadingmanager.model.Currency;

public interface CurrencyRepository {
	
	void save(Currency currency);
	Currency findByCode(String code);
	List<Currency> findAll();
	
}
