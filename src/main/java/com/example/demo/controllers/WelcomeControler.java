
package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.example.demo.model.BloodDonor;

@Controller
public class WelcomeControler {
	@Autowired
	private ModelAndView mdlView;
	
	
	private BloodDonor donor;
	@Autowired
	public void setDonor(BloodDonor donor) {
		this.donor = donor;
	}
	
	@RequestMapping(value="/donors", method=RequestMethod.GET)
	public ModelAndView addDonor() {
		mdlView.setViewName("addDonor");
		mdlView.addObject("command",donor);
		return mdlView;
	}
	
	@RequestMapping(value = "/donors",method = RequestMethod.POST)
	public String submitdonor( @Valid @ModelAttribute("command")BloodDonor entity) {
		System.out.println(entity);
		return "index";
//		 return sucees.jsp;
//		if(return.haserrors()) {
//			return "index";
//		}
//		else
//		{
//			return "success";
//		}
		
	}
	@RequestMapping("/")
	public String init(Model model) {
		model.addAttribute("title","jeevan blood bank");
		return "index";
	}

}

