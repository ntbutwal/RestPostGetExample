package com.kkc.vehicleservices;

import org.springframework.stereotype.Service;

import com.kkc.dtovehicle.VehicleDto;
import com.kkc.utils.InMemoryVehicleDatabase;

@Service
public class VehicleService {

	public VehicleDto getDataByDto(String vin) {
		return InMemoryVehicleDatabase.vehicledata.get(vin);
	}

	
}
