package tech.zdev.packages.loading.packetloadingmanager.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="hotel")
public class Hotel {
	
	@Id
	private ObjectId id;
	private String code;
	private String name;
	private String address;
	private String roomtype;
	private String ratingAward;
	
	public Hotel() {}
	
	public Hotel(String code, String name, String address, String roomtype, String ratingAward) {
		super();
		this.code = code;
		this.name = name;
		this.address = address;
		this.roomtype = roomtype;
		this.ratingAward = ratingAward;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRoomtype() {
		return roomtype;
	}
	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}
	public String getRatingAward() {
		return ratingAward;
	}
	public void setRatingAward(String ratingAward) {
		this.ratingAward = ratingAward;
	}

}
