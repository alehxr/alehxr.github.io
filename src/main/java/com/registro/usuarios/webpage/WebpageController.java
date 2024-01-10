package com.registro.usuarios.webpage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebpageController {

	@GetMapping("/webpage")
	public String showWebpage() {
		return "webpage";
	}
}