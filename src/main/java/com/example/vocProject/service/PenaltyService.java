package com.example.vocProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.vocProject.dto.Penalty;
import com.example.vocProject.dto.Voc;
import com.example.vocProject.mapper.PenaltyMapper;

@Service
public class PenaltyService {
	
	@Autowired
	PenaltyMapper mapper;

	public void setSinglePenalty(Penalty pen) {
		
		mapper.setSinglePenalty(pen.getDeliveryDid()
				,pen.getVocVid()
				,pen.getDeliveryCheck()
				,pen.getDeliveryAgree()
				,pen.getPenaltyWriter());
	}
	
	public void removeVoc(int pid) {
		
		mapper.deleteSinglePenalty(pid);
	}
	
	
	
	
}
