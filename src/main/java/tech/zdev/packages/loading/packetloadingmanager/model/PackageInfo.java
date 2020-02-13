package tech.zdev.packages.loading.packetloadingmanager.model;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="packageInfo")
public class PackageInfo {
	
	@Id
	private ObjectId id;
	private String code;
	private String tittle;
	private String content;
	private String subtittle;
	private List<String> cont;
	private String typeOfTrip;
	private String updateDate;
	private String mainBanner;
	private String highlights;
	private String image;
	private String smallSample;
	private String stock;
	private String availabityExtraInfo;
	@DBRef
	private Category category;
	@DBRef
	private List<Flight> flights;
	@Transient
	private List<Segment> segmentsUtil;
	@DBRef
	private Hotel hotel;
	@DBRef
	private List<Packagedate> packageDate;
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
	public String getTittle() {
		return tittle;
	}
	public void setTittle(String tittle) {
		this.tittle = tittle;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTypeOfTrip() {
		return typeOfTrip;
	}
	public void setTypeOfTrip(String typeOfTrip) {
		this.typeOfTrip = typeOfTrip;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	public String getMainBanner() {
		return mainBanner;
	}
	public void setMainBanner(String mainBanner) {
		this.mainBanner = mainBanner;
	}
	public String getHighlights() {
		return highlights;
	}
	public void setHighlights(String highlights) {
		this.highlights = highlights;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getSmallSample() {
		return smallSample;
	}
	public void setSmallSample(String smallSample) {
		this.smallSample = smallSample;
	}
	public String getStock() {
		return stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
	}
	public String getAvailabityExtraInfo() {
		return availabityExtraInfo;
	}
	public void setAvailabityExtraInfo(String availabityExtraInfo) {
		this.availabityExtraInfo = availabityExtraInfo;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public List<Flight> getFlights() {
		return flights;
	}
	public void setFlights(List<Flight> flights) {
		this.flights = flights;
	}
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	public List<Packagedate> getPackageDate() {
		return packageDate;
	}
	public void setPackageDate(List<Packagedate> packageDate) {
		this.packageDate = packageDate;
	}
	public String getSubtittle() {
		return subtittle;
	}
	public void setSubtittle(String subtittle) {
		this.subtittle = subtittle;
	}
	public List<String> getCont() {
		return cont;
	}
	public void setCont(List<String> cont) {
		this.cont = cont;
	}
	public List<Segment> getSegmentsUtil() {
		return segmentsUtil;
	}
	public void setSegmentsUtil(List<Segment> segmentsUtil) {
		this.segmentsUtil = segmentsUtil;
	}

}
