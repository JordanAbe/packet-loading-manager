package tech.zdev.packages.loading.packetloadingmanager.repository;

import java.util.List;

import tech.zdev.packages.loading.packetloadingmanager.model.Packagedate;

public interface PackagedateRepository {
	
	void save(Packagedate packagedate);
	Packagedate findByCode(String code);
	List<Packagedate> findAll();

}
