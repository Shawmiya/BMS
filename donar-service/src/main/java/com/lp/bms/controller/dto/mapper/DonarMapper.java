package com.lp.bms.controller.dto.mapper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lp.bms.controller.dto.DonarDto;
import com.lp.bms.controller.dto.converter.DonarConverter;
import com.lp.bms.model.Donar;
import com.lp.bms.service.DonarService;

@Service
public class DonarMapper {

	@Autowired
	private DonarService donarService;
	
	@Autowired
	private DonarConverter donarConverter;
	
	public Boolean createDonar (DonarDto donarDto){
		
		Donar donar = donarConverter.donarDtoToDonar(donarDto);
		donarService.createDonar(donar);
		return true;
	}
	
	public List<DonarDto> getAllDonar(){
		
		List<Donar> donarList = donarService.findAllDonar();
		if(donarList != null) {
			
			return (donarConverter.donarToDonarDto(donarList));
		}
		else {
			
			return null;
		}			
	}
	
	public DonarDto getDonarById(Long id) {
		
	    Donar donarList =donarService.findDonarById(id);
	    if (donarList != null) {
	    	
	    	return donarConverter.donarToDonarDto(donarList);
	    }
	    else {
	    	
	    	return null;
	    }	    
	}
	
	
	public Boolean deleteDonar(Long id) {
		
		if(donarService.deleteDonarById(id)) {
		
			return true;
		}
		else {
			
			return false;
		}		
	}
	
	
	

	

}
