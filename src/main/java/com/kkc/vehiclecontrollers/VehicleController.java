package com.kkc.vehiclecontrollers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kkc.dtovehicle.VehicleDto;
import com.kkc.vehicleservices.VehicleService;

@Controller
@RestController
@RequestMapping("/vehicle")
public class VehicleController {

	@Autowired
	private VehicleService vehicleserv;

	@GetMapping(value = "/{vin}/data")
	public VehicleDto getDatafromDto(@PathVariable(value = "vin") String vinid) {

		return vehicleserv.getDataByDto(vinid);
	}

	@RequestMapping(value = "/{n}/datas", method = RequestMethod.GET)
	public VehicleDto getVehicleData(@PathVariable(value = "n") String id, @RequestParam String make,
			@RequestParam String model) {
		return vehicleserv.getDataByDto(id);
	}
	
	

	@PostMapping
	@Validated 
	public void postVehicalData(@RequestBody VehicleDto dto) {
		System.out.println(dto.toString());

	}

	@PutMapping
	@Validated 
	public void putVehicalData(@RequestBody VehicleDto dto1) {
		System.out.println(dto1.toString());
	}

	

}