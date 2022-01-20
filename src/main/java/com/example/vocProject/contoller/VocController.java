package com.example.vocProject.contoller;


import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.vocProject.dto.PenaltyVoc;
import com.example.vocProject.dto.Voc;
import com.example.vocProject.dto.VocListView;
import com.example.vocProject.repoaitory.VocRepository;
import com.example.vocProject.service.VocService;
import com.example.vocProject.service.VocServiceImpl;

@Transactional
@RestController
@RequestMapping("/voc")
public class VocController {

	@Autowired
	private VocRepository vocMapper;
	
	@Autowired
	private VocServiceImpl service ;
	
	String redirectUri="http://localhost:9090/voc/before-voc-list";
	
	
	
	@GetMapping("/before-voc-list")
	public Model vocList(Model model) {
		
		List<Voc> vocList = vocMapper.findVocList();
		
		
		model.addAttribute("vocList", vocList);
		
		return model;
	}
	
	@GetMapping("/after-voc-list")
	public Model penaltyVocList(Model model) {
		
		List<VocListView> vocList = vocMapper.penaltyVocList();
		
	
		model.addAttribute("vocList", vocList);
		
		return model;
	}
	
	
	@GetMapping("/detail")
	public Model getSigleVoc(@RequestParam("vid") int vid, Model model ) {
	
		Voc voc = vocMapper.getSingleVoc(vid);
		model.addAttribute("voc", voc);	
		
		if(service.PenaltyPost(vid).equals("empty")) 
			model.addAttribute("result","empty");
	
		System.out.println("voc:"+voc);
		
		return model;
	}
	
	@GetMapping("/after-detail")
	public Model getAfterVoc(@RequestParam("vid") int vid, Model model ) {
	
		PenaltyVoc penVoc = vocMapper.getpenaltyVoc(vid);
		model.addAttribute("penVoc", penVoc);	
		
	
		System.out.println("penVoc:"+penVoc);
		
		return model;
	}
	
	
	@GetMapping("/edit")
	public Model vocEdit(@RequestParam("vid") int vid, Model model) {
	
		Voc voc = vocMapper.getSingleVoc(vid);
		model.addAttribute("voc", voc);	
		
		
		return model;
	}
	
	@GetMapping("/post")
	public Model vocPost( Model model) {
	
	
		return model;
	}
	

	@PostMapping("/insertVoc")
	public void insertVoc(Voc voc ,HttpServletResponse response) throws IOException {
		
	service.setSingleVoc(voc);
	response.sendRedirect(this.redirectUri);
	
	}
	
	@PostMapping("/updateVoc")
	public void updateVoc(Voc voc ,HttpServletResponse response) throws IOException {
		
	service.updateSingleVoc(voc);
	response.sendRedirect(this.redirectUri);
	
	}
	
	
	@DeleteMapping("/deleteVoc/{id}")
	public void deleteVoc(@PathVariable("id") int vid) throws IOException {
	
		service.removeVoc(vid);
		
	}
}
