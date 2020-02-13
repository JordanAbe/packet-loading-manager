package tech.zdev.packages.loading.packetloadingmanager.repository;

import java.util.List;

import tech.zdev.packages.loading.packetloadingmanager.model.Hotel;

public interface HotelRepository {
	
	void save(Hotel hotel);
	Hotel findByCode(String code);
	List<Hotel> findAll();

}
