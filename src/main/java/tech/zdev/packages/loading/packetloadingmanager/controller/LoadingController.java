package tech.zdev.packages.loading.packetloadingmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;

import tech.zdev.packages.loading.packetloadingmanager.model.PackageInfo;
import tech.zdev.packages.loading.packetloadingmanager.service.AirlineService;
import tech.zdev.packages.loading.packetloadingmanager.service.PaqueteService;
import tech.zdev.packages.loading.packetloadingmanager.util.TransferUtil;

@Controller
public class LoadingController {

	private PaqueteService paqueteService;

	@Autowired
	public LoadingController(AirlineService airlineService, PaqueteService paqueteService) {
		this.paqueteService = paqueteService;
	}

	@GetMapping("/packages/{code}")
	public String getPackage(@PathVariable String code, Model model) {
		System.out.println("****** find " + code);
		PackageInfo paquete = paqueteService.findByCode(code);
		model.addAttribute("packageInfo", paquete);
		return "index";
	}

	@GetMapping("/packagess/{code}")
	@ResponseBody
	public PackageInfo getPackages(@PathVariable String code) {
		return paqueteService.findByCode(code);
	}
	
	@PostMapping("/packages")
	public String savePackage(@ModelAttribute PackageInfo packageInfo) {
		System.out.println("******** " + TransferUtil.objectToJson(packageInfo));;
		return "redirect:/packages/" + packageInfo.getCode();
	}

}
