package tech.zdev.packages.loading.packetloadingmanager.model;

import org.bson.types.ObjectId;

public class Category {
	
	private ObjectId id;
	private String code;
	private String name;

	public Category(ObjectId id, String code, String name) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
	}
	
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
