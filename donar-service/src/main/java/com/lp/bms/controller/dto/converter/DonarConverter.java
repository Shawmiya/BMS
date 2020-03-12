package com.lp.bms.controller.dto.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.lp.bms.controller.dto.DonarDto;
import com.lp.bms.model.Donar;

@Service
public class DonarConverter {
	private DonarConverter() {

	}

	public Donar donarDtoToDonar(DonarDto donarDto) {
		// TODO Auto-generated method stub
		Donar donar = new Donar();
		donar.setId(donarDto.getId());
		donar.setName(donarDto.getName());
		donar.setPhone_no(donarDto.getPhone_no());
		donar.setAddress(donarDto.getAddress());
		return donar;
		
	}
	
	// Convert entity to dto
		public DonarDto donarToDonarDto(Donar donar) {
			DonarDto donarDto = new DonarDto();
			
			if(donar != null) {
				donarDto.setId(donar.getId());
				donarDto.setName(donar.getName());
				donarDto.setPhone_no(donar.getPhone_no());
				donarDto.setAddress(donar.getAddress());
				return donarDto;
			}
			return null;
		}

	public List<DonarDto> donarToDonarDto(List<Donar> donarList) {
		// TODO Auto-generated method stub
		
		if(donarList != null) {
			List<DonarDto> listDonarDto = new ArrayList<>();
			for (Donar defectType: donarList) {
				DonarDto donarDto = new DonarDto();
				
//				donarDto.setId(donar.getId());
//				donarDto.setName(donar.getName());
				
				listDonarDto.add(donarDto);
			}
			return listDonarDto;
		}
		return null;
	}
	
	
	
	
}
