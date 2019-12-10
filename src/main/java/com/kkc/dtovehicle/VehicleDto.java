package com.kkc.dtovehicle;

import javax.validation.constraints.NotNull;

public class VehicleDto {
	private String vin;
	
	@NotNull(message="cannot be null")
	private String make;
	
	@NotNull(message="cannot be null")
	private String model;
	private String year;
	private String engine;

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "VehicleDto [vin=" + vin + ", make=" + make + ", model=" + model + ", year=" + year + ", engine="
				+ engine + "]";
	}
	
	

}
