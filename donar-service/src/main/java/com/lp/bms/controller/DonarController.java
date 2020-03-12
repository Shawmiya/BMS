package com.lp.bms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lp.bms.controller.dto.DonarDto;
import com.lp.bms.controller.dto.mapper.DonarMapper;

import ch.qos.logback.classic.BasicConfigurator;



@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class DonarController {


	@Autowired
	private DonarMapper donarMapper;
	
	@PostMapping(value = "/donar")
	public ResponseEntity<Object> createDonar(@RequestBody DonarDto donarDto) {
		
		if (donarMapper.createDonar(donarDto)) {
			
			return new ResponseEntity<>("Donar Added Success", HttpStatus.OK);
		} else {
			
			return new ResponseEntity<>("Donar Added Failure", HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping(value = "/donars")
	public List<DonarDto> getAllDonar() {
	
		return donarMapper.getAllDonar();
	}

	
	
	@GetMapping(value = "/donar/{id}")
	public DonarDto getDonarById(@PathVariable Long id) {
	
		return donarMapper.getDonarById(id);
	}

	
	
	@DeleteMapping("/donar/{id}")
	public ResponseEntity<Object> deleteDonar(@PathVariable Long id, @RequestBody DonarDto donarDto) {
		
		donarMapper.deleteDonar(id);
		
		return new ResponseEntity<>("Donar Deleted Successfully", HttpStatus.OK);
	}

}
