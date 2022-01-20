package com.example.vocProject.service;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.vocProject.dto.Penalty;
import com.example.vocProject.dto.Voc;
import com.example.vocProject.repoaitory.PenaltyRepository;

@Service
public class PenaltyService {
	
	@Autowired
	PenaltyRepository penaltyRepository;

	public void setSinglePenalty(Penalty pen) {
		
		penaltyRepository.setSinglePenalty(pen.getDeliveryDid()
				,pen.getVocVid()
				,pen.getDeliveryCheck()
				,pen.getDeliveryAgree()
				,pen.getPenaltyWriter());
	}
	
	public void updatePenalty(Penalty pen) {
		penaltyRepository.updateSinglePenalty(pen.getPid()
							, pen.getDeliveryCheck()
							, pen.getDeliveryAgree());
	}
	
	public void removeVoc(int pid) {
		
		penaltyRepository.deleteSinglePenalty(pid);
	}
	
	
	
	
}
