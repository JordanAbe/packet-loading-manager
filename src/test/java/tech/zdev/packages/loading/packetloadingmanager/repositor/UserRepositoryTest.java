package tech.zdev.packages.loading.packetloadingmanager.repositor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import tech.zdev.packages.loading.packetloadingmanager.config.RootConfig;
import tech.zdev.packages.loading.packetloadingmanager.model.Rol;
import tech.zdev.packages.loading.packetloadingmanager.model.User;
import tech.zdev.packages.loading.packetloadingmanager.repository.UserRepository;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { RootConfig.class })
public class UserRepositoryTest {

	static {
		System.setProperty("ENV", "dev");
	}

	@Autowired
	PasswordEncoder passwordEncoder;

	@Autowired
	UserRepository userRepository;

	@Disabled
	@Test
	public void shouldSaveUser() {
		User user = new User();
		user.setUsername("alex");
		user.setClave(passwordEncoder.encode("666"));
		List<Rol> roles = new ArrayList<Rol>();
		roles.add(new Rol("ADMIN"));
		user.setRoles(roles);
		User resolve = userRepository.save(user);
		assertEquals(resolve.getClave(), user.getClave());
	}

}
