package tech.zdev.packages.loading.packetloadingmanager.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="segment")
public class Segment {
	
	@Id
	private ObjectId id;
	private String departureDate;
	private String departureTime;
	private String arrivalDate;
	private String arrivalTime;
	private String flightNumber;
	@Transient
	private String indicator;
	@DBRef
	private Airline airline;
	@DBRef
	private Airport airportOrigin;
	@DBRef
	private Airport airportDestination;
	
	public Segment(String departureDate, String departureTime, String arrivalDate, String arrivalTime,
			String flightNumber, Airline airline, Airport airportOrigin, Airport airportDestination) {
		super();
		this.departureDate = departureDate;
		this.departureTime = departureTime;
		this.arrivalDate = arrivalDate;
		this.arrivalTime = arrivalTime;
		this.flightNumber = flightNumber;
		this.airline = airline;
		this.airportOrigin = airportOrigin;
		this.airportDestination = airportDestination;
	}
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public String getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public Airline getAirline() {
		return airline;
	}
	public void setAirline(Airline airline) {
		this.airline = airline;
	}
	public Airport getAirportOrigin() {
		return airportOrigin;
	}
	public void setAirportOrigin(Airport airportOrigin) {
		this.airportOrigin = airportOrigin;
	}
	public Airport getAirportDestination() {
		return airportDestination;
	}
	public void setAirportDestination(Airport airportDestination) {
		this.airportDestination = airportDestination;
	}
	public String getIndicator() {
		return indicator;
	}
	public void setIndicator(String indicator) {
		this.indicator = indicator;
	}

}
