/**
 * 
 */
package com.telecom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telecom.entity.Plans;
import com.telecom.repo.PlansRepo;

/**
 * @author Robert Joasilus
 *
 * @date: Oct 25, 2022
 */
@RestController
@RequestMapping("api/plans")
public class PlansController {
	
	@Autowired
	PlansRepo plansRepo;
	
	@GetMapping("/getplans")
	private List<Plans> getallPlans(){
		
		return plansRepo.findAll();
		
		
	}
	
	@PostMapping("/addplans")
	Plans newplans(@RequestBody Plans plans) {
		return plansRepo.save(plans);
		
		
		
	}
	
	@DeleteMapping("/deleteplans/{id}")
	String deleteplans(@PathVariable("id") int id) {
		plansRepo.deleteById(id);
		return "Plans object deleted";
		
		
	}
	
}
