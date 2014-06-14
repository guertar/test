package be.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import be.service.UserService;


@Controller
@RequestMapping("/")
@SessionAttributes("user")
public class UserServiceController {
	UserService userService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	   public String redirectToAccuiel() {
	      return "index";
	   }
	
	@RequestMapping(value={"/login"}, method = RequestMethod.GET)
	public String login(ModelMap model,@RequestParam(value="user", required = false ) String user){
		model.addAttribute("user","tarek");
		return "index1";
	}
	
	@RequestMapping(value={"/unlogin"}, method = RequestMethod.GET)
	public String unlogin(ModelMap model,@RequestParam(value="user", required = false ) String user){
		System.out.println("Pre-handle");
		model.addAttribute("user","");
		return "end";
		
	}
	
	@RequestMapping(value={"/test"}, method = RequestMethod.GET)
	public String test(ModelMap model){
			return "ok";
	}
}
