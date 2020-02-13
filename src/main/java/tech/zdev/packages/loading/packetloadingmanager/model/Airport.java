package tech.zdev.packages.loading.packetloadingmanager.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="airport")
public class Airport {
	
	@Id
	private ObjectId id;
	private String codeIATA;
	
	public Airport() {
		super();
	}

	public Airport(String codeIATA) {
		super();
		this.codeIATA = codeIATA;
	}
	
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public String getCodeIATA() {
		return codeIATA;
	}
	public void setCodeIATA(String codeIATA) {
		this.codeIATA = codeIATA;
	}
	
	
}
