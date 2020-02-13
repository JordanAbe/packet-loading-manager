package tech.zdev.packages.loading.packetloadingmanager.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;

//import ch.qos.logback.classic.Level;
//import ch.qos.logback.classic.Logger;
//import ch.qos.logback.classic.LoggerContext;

@Configuration
@EnableMongoRepositories(basePackages = { "tech.zdev.packages.loading.packetloadingmanager.repository" })
public class MongoConfig {
	
//	LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
//	Logger rootLogger = loggerContext.getLogger("org.mongodb.driver");

	@Value("${spring.data.mongodb.database}")
	private String database;
	
	@Value("${spring.data.mongodb.host}")
	private String host;
	
//	public MongoConfig() {
//		rootLogger.setLevel(Level.OFF);
//	}

	@Bean
	public MongoClient mongoClient() {
		ServerAddress address = new ServerAddress(host, 27017);
//		MongoCredential credential = MongoCredential.createCredential("mdbUser", databaseName, "cp".toCharArray());
//		MongoClientOptions options = new MongoClientOptions.Builder().build();
//		MongoClient client = new MongoClient(address, credential, options);
		MongoClient client = new MongoClient(address);
		return client;
	}

	@Bean
	public MongoDbFactory mongoDbFactory() {
		MongoDbFactory factory = new  SimpleMongoDbFactory(mongoClient(), database);
		return factory;
	}

	@Bean
	public MongoTemplate mongoTemplate() {
		MongoTemplate template = new MongoTemplate(mongoDbFactory());
		return template;
	}

}
