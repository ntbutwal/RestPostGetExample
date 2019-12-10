package com.kkc.utils;

import java.util.HashMap;
import java.util.Map;

import com.kkc.dtovehicle.VehicleDto;

public class InMemoryVehicleDatabase {

	public static Map<String, VehicleDto> vehicledata;

	static {
		vehicledata = new HashMap<String, VehicleDto>();
		VehicleDto vd = new VehicleDto();
		vd.setVin("abc1234");
		vd.setMake("Toyota");
		vd.setModel("Camry");
		vd.setEngine("V4");
		vd.setYear("2017");
		vehicledata.put("abc1234", vd);

		VehicleDto vd1 = new VehicleDto();
		vd1.setVin("abc2345");
		vd1.setMake("Toyota");
		vd1.setModel("Highlander");
		vd1.setEngine("V6");
		vd1.setYear("2020");
		vehicledata.put("abc2345", vd1);

		VehicleDto vd2 = new VehicleDto();
		vd2.setVin("ab3456");
		vd2.setMake("Honda");
		vd2.setModel("Accord");
		vd2.setEngine("V4");
		vd2.setYear("2019");
		vehicledata.put("abc3456", vd2);

		VehicleDto vd3 = new VehicleDto();
		vd3.setVin("abc4567");
		vd3.setMake("BMW");
		vd3.setModel("X7");
		vd3.setEngine("V8");
		vd3.setYear("2020");
		vehicledata.put("abc4567", vd3);

	}

}
