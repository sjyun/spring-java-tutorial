package com.thecodinglive.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SimpleController {
    @RequestMapping("home")
	public String basic(Model m){
		m.addAttribute("name", "theCodingLive");
		return "home";
	}
}
