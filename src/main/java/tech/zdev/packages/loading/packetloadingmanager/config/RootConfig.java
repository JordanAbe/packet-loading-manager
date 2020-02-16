package tech.zdev.packages.loading.packetloadingmanager.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = { "tech.zdev.packages.loading.packetloadingmanager.service",
		"tech.zdev.packages.loading.packetloadingmanager.repository" })
@PropertySource(value = { "classpath:/application-${ENV}.properties" })
@Import(value = { MongoConfig.class, SecurityConfig.class })
public class RootConfig {

}
