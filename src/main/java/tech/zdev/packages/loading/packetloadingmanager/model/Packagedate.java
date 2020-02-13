package tech.zdev.packages.loading.packetloadingmanager.model;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="packagedate")
public class Packagedate {
	@Id
	private ObjectId id;
	private String code;
	private String tourId;
	private String tourDate;
	private String finalTourDate;
	private String durationDays;
	@DBRef
	private List<Currency> currencies;
	
	public Packagedate() {
		
	}
	public Packagedate(String code, String tourId, String tourDate, String finalTourDate, String durationDays,
			List<Currency> currencies) {
		super();
		this.code = code;
		this.tourId = tourId;
		this.tourDate = tourDate;
		this.finalTourDate = finalTourDate;
		this.durationDays = durationDays;
		this.currencies = currencies;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getTourId() {
		return tourId;
	}
	public void setTourId(String tourId) {
		this.tourId = tourId;
	}
	public String getTourDate() {
		return tourDate;
	}
	public void setTourDate(String tourDate) {
		this.tourDate = tourDate;
	}
	public String getFinalTourDate() {
		return finalTourDate;
	}
	public void setFinalTourDate(String finalTourDate) {
		this.finalTourDate = finalTourDate;
	}
	public String getDurationDays() {
		return durationDays;
	}
	public void setDurationDays(String durationDays) {
		this.durationDays = durationDays;
	}
	public List<Currency> getCurrencies() {
		return currencies;
	}
	public void setCurrencies(List<Currency> currencies) {
		this.currencies = currencies;
	}
}
