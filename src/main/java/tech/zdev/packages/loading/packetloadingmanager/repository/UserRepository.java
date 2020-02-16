package tech.zdev.packages.loading.packetloadingmanager.repository;

import tech.zdev.packages.loading.packetloadingmanager.model.User;

public interface UserRepository {
	
	User findByUsername(String username);
	User save(User user);

}
