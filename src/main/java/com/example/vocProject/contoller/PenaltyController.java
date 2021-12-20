package com.example.vocProject.contoller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.vocProject.dto.Penalty;
import com.example.vocProject.dto.Voc;
import com.example.vocProject.dto.VocListView;
import com.example.vocProject.mapper.PenaltyMapper;
import com.example.vocProject.mapper.VocMapper;
import com.example.vocProject.service.PenaltyService;
import com.example.vocProject.service.VocServiceImpl;

@RestController
@RequestMapping("/penalty")
public class PenaltyController {
	@Autowired
	private PenaltyService service;
	
	@Autowired
	private PenaltyMapper mapper;
	
	
	String redirectUri="http://localhost:9090/penalty/list";
	
	
	@GetMapping("/list")
	public Model penaltyList(Model model) {
		
		List<Penalty> penList = mapper.findPenaltyList();
		
		
		model.addAttribute("penList",penList );
		
		return model;
	}
	
	@GetMapping("/detail")
	public Model getSigleVoc(@RequestParam("pid") int pid, Model model ) {
	
		Penalty penalty = mapper.getSinglePenalty(pid);
		model.addAttribute("penalty", penalty );	
		
	
		return model;
	}
	
	
	@GetMapping("/post")
	public Model PenaltyPost(@RequestParam("vid") int vid
							,@RequestParam("did") int did
							,Model model) {
	
		

		model.addAttribute("vid", vid);
		model.addAttribute("did", did);
		
	
		return model;
	}
	@GetMapping("/edit")
	public Model PenaltyEdit(@RequestParam("pid") int pid
							,Model model) {

		Penalty pen = mapper.getSinglePenalty(pid);
		model.addAttribute("pen", pen);	
		return model;
	}
	
	
	@PostMapping("/insertPenalty")
	public void insertPenalty(Penalty pen ,HttpServletResponse response) throws IOException {
	
	System.out.println("pen:"+pen);
	service.setSinglePenalty(pen);
	response.sendRedirect(this.redirectUri);
	
	}
	
	@PostMapping("/updatePenalty")
	public void updatePenalty(Penalty pen ,HttpServletResponse response) throws IOException {
		
	service.updatePenalty(pen);
	response.sendRedirect(this.redirectUri);
	
	}
	
	@DeleteMapping("/deletePenalty/{id}")
	public void deleteVoc(@PathVariable("id") int pid) throws IOException {
	
		service.removeVoc(pid);
		
	}
}
