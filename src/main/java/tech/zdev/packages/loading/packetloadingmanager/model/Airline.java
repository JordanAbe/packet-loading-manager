package tech.zdev.packages.loading.packetloadingmanager.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="airline")
public class Airline {
	
	@Id
	private ObjectId id;
	private String code;
	private String name;
	
	public Airline() {
		super();
	}
	
	public Airline(String code) {
		super();
		this.code = code;
	}
	
	public Airline(String code, String name) {
		super();
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
