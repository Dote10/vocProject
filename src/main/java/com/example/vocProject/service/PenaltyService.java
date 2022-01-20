package com.example.vocProject.service;

import java.util.List;

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
	
	
	public List<Penalty> findPenaltyList() {
		
		List<Penalty> penList = penaltyRepository.findPenaltyList();
		

		return penList;
	}
	
	
	public Penalty getPenaltyEdit(int pid) {

		Penalty pen = penaltyRepository.getSinglePenalty(pid);
		
		return pen;
		}

	
	
	public Penalty getSiglePenalty(int pid) {
		
		Penalty penalty = penaltyRepository.getSinglePenalty(pid);
	
		return penalty;
	}

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
