package be.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import be.service.UserService;

@Controller
@RequestMapping("/login")
public class UserServiceController {
	UserService userService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String login(ModelMap model){
		String user="Tarek";
		try {
			userService.loginUser(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		model.addAttribute("user",user);
		return "login";
		
	}

}
