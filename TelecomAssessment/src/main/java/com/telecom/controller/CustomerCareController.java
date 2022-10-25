/**
 * 
 */
package com.telecom.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telecom.entity.CustomerCare;
import com.telecom.repo.CustomerCareRepo;

/**
 * @author Robert Joasilus
 *
 * @date: Oct 25, 2022
 */
@RestController
@RequestMapping("api/customercare")
public class CustomerCareController {

	@Autowired
	CustomerCareRepo ccrepo;
	
	@GetMapping("/getcustomercare")
	private List<CustomerCare> getAllCustomerCare(){
		return ccrepo.findAll();
		
		
	}
	
	@PostMapping("/addcustomercare")
	CustomerCare newCustomerCare(@RequestBody CustomerCare cc) {
		
		
		return ccrepo.save(cc);
	}
	
	@DeleteMapping("/deletecustomercare/{id}")
	String deleteCC(@PathVariable("id") int id) {
	ccrepo.deleteById(id);
	return "Customer Care object deleted";
	}
}
