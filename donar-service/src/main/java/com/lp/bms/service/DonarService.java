package com.lp.bms.service;

import java.util.List;

import com.lp.bms.model.Donar;

public interface DonarService {
	public Object createDonar(Donar donar); 

	Donar findDonarById(long id); 
	List<Donar> findAllDonar(); 
	Boolean deleteDonarById(long id); 
	
}

