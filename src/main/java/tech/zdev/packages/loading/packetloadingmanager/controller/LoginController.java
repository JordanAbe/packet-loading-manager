package tech.zdev.packages.loading.packetloadingmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@GetMapping(value = "/login")
	public String loginPage(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout, Model model) {
		String message = null;
		if (error != null) {
			message = "Username or Password is incorrect !!";
		}
		if (logout != null) {
			message = "You have been successfully logged out !!";
		}
		model.addAttribute("error", error);
		model.addAttribute("logout", logout);
		model.addAttribute("message", message);
		return "login";
	}

	@PostMapping("/home")
	public String loginProcess() {
		return "home";
	}

}
