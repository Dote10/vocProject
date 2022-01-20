package com.example.vocProject.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.vocProject.dto.Voc;
import com.example.vocProject.dto.VocListView;
import com.example.vocProject.repoaitory.VocRepository;

@Transactional
@Service
public class VocServiceImpl implements VocService {
	

	@Autowired
	VocRepository vocRepository;
	
	public void setSingleVoc(Voc voc) {
		
		vocRepository.setSingleVoc(voc.getCarrierCpnCaid()
				  ,voc.getClientCpnClid()
				  ,voc.getDeliveryDid()
				  ,voc.getClaimCheck()
				  ,voc.getCompensationCheck()
				  ,voc.getPenaltyCost()
				  ,voc.getRespTarget()
				  ,voc.getRespReason()
				  ,voc.getVocWrite());
	}
	
	public void updateSingleVoc(Voc voc) {
		
		vocRepository.updateSingleVoc(voc.getVid()  
				  ,voc.getCarrierCpnCaid()
				  ,voc.getClientCpnClid()
				  ,voc.getDeliveryDid()
				  ,voc.getClaimCheck()
				  ,voc.getCompensationCheck()
				  ,voc.getPenaltyCost()
				  ,voc.getRespTarget()
				  ,voc.getRespReason()
				  ,voc.getVocWrite());
	}
	
	public void removeVoc(int vid) {
		
		vocRepository.deleteSingleVoc(vid);
	}
	

	public String PenaltyPost(int vid) {
	
		
		
		int check = vocRepository.isCheckPenalty(vid);
		
		System.out.println("check:"+check);
		if(check == 0)  
			return "empty";
		else 	
			return "notEmpty";
			

	}
}
