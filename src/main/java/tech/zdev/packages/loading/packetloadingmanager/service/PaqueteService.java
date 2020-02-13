package tech.zdev.packages.loading.packetloadingmanager.service;

import java.util.List;

import tech.zdev.packages.loading.packetloadingmanager.model.PackageInfo;

public interface PaqueteService {
	
	void insertPaquete(List<PackageInfo> paquete);
	PackageInfo findByCode(String code);
	List<PackageInfo> findAll();

}
