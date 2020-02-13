package tech.zdev.packages.loading.packetloadingmanager.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("currency")
public class Currency {
	
	@Id
	private ObjectId id;
	private String code;
	private String priceAdult;
	private String priceChildren;
	
	public Currency() {
		
	}
	public Currency(String code, String priceAdult, String priceChildren) {
		super();
		this.code = code;
		this.priceAdult = priceAdult;
		this.priceChildren = priceChildren;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getPriceAdult() {
		return priceAdult;
	}
	public void setPriceAdult(String priceAdult) {
		this.priceAdult = priceAdult;
	}
	public String getPriceChildren() {
		return priceChildren;
	}
	public void setPriceChildren(String priceChildren) {
		this.priceChildren = priceChildren;
	}

}
