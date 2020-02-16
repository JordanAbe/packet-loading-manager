package tech.zdev.packages.loading.packetloadingmanager.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import tech.zdev.packages.loading.packetloadingmanager.model.Rol;
import tech.zdev.packages.loading.packetloadingmanager.model.User;
import tech.zdev.packages.loading.packetloadingmanager.repository.UserRepository;

@Service
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {

	@Autowired
	UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByUsername(username);
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		for (Rol rol : user.getRoles()) {
			authorities.add(new SimpleGrantedAuthority(rol.getName()));
		}
		UserDetails userDetails = new org.springframework.security.core.userdetails.User(user.getUsername(),
				user.getClave(), authorities);
		return userDetails;
	}

}
