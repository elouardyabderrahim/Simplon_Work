package com.gestionemployees.controller;

import java.util.Objects;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gestionemployees.model.Administrateur;


@Controller
public class LoginController<AdministrateurService> {

	@Autowired
    private AdministrateurService administrateurService;
	
	@GetMapping("/login")
    public ModelAndView login() {
     ModelAndView mav = new ModelAndView("login");
        mav.addObject("administrateur", new Administrateur());
        return mav;
    }
 
    @PostMapping("/login")
    public String login(@ModelAttribute("admin") Administrateur administrateur ) {
    
    	Administrateur oauthAdmin = administrateurService.
 
     System.out.print(oauthAdmin);
     
     if(Objects.nonNull(oauthAdmin))
     {
  
     return "redirect:/";
    
    
     } else {
     return "redirect:/login";
    
    
     }
 
}
    
    @RequestMapping(value = {"/logout"}, method = RequestMethod.POST)
    public String logoutDo(HttpServletRequest request,HttpServletResponse response)
    {
        return "redirect:/login";
    }
}
