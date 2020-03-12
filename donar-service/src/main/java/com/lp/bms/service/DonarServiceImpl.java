package com.lp.bms.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lp.bms.model.Donar;
import com.lp.bms.repository.DonarRepository;

@Service

public class DonarServiceImpl implements DonarService {
	
	@Autowired
	private DonarRepository donarRepository;
	
	public static<T> List<T> reverseList(List<T> list)
	{
		List<T> reverse = new ArrayList<>(list);
		Collections.reverse(reverse);
		return reverse;
	}

	@Override
	public Object createDonar(Donar donar) {
		// TODO Auto-generated method stub
		return donarRepository.save(donar);
	}

	@Override
	public Donar findDonarById(long id) {
		// TODO Auto-generated method stub
		return donarRepository.findById(id).orElse(null);
	}

	@Override
	public List<Donar> findAllDonar() {
		// TODO Auto-generated method stub
		List<Donar> donars = donarRepository.findAll();
	
		return reverseList(donars);
	}

	@Override
	public Boolean deleteDonarById(long id) {
		// TODO Auto-generated method stub
		donarRepository.deleteById(id);
		
		return true;
	}

}
