package tech.zdev.packages.loading.packetloadingmanager.controller;

import java.security.Principal;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import tech.zdev.packages.loading.packetloadingmanager.util.TransferUtil;

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

	@GetMapping("/home")
	public String loginProcess(Principal principal) {
//		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//		String currentPrincipalName = authentication.getName();
		System.out.println("Bienvenido : " + TransferUtil.objectToJson(principal));
		return "home";
	}
	
	@GetMapping("/error/403")
	public String forbidden() {
		return "403";
	}
	
	@GetMapping("/error/405")
	public String methodNotSupported() {
		return "405";
	}

}
