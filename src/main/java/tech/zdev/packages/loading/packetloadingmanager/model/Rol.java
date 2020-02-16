package tech.zdev.packages.loading.packetloadingmanager.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Rol {

	private String name;

	public Rol() {
		super();
	}

	public Rol(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
