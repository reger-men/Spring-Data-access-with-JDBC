package springJDBC.com.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import springJDBC.com.service.UserService;

@Controller
public class IndexController {

//	@RequestMapping("/index")
//	public String index(){
//		return "index";
//	}
	
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/index")
	public String users(Model model) {
		model.addAttribute("users", userService.findAll());
		return "index";
	}
}
