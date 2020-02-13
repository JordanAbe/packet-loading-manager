package tech.zdev.packages.loading.packetloadingmanager.repository;

import java.util.List;

import tech.zdev.packages.loading.packetloadingmanager.model.PackageInfo;

public interface PaqueteRepository {
	
	void savePaquete(PackageInfo paquete);
	PackageInfo findByCode(String code);
	List<PackageInfo> findAll();

}
