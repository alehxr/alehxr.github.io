package com.registro.usuarios.weather;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WeatherController {

	@Value("${weather.api.key}")
	private String apiKey; // Configura tu clave de API en el application.properties

	@GetMapping("/getWeather")
	public String getWeather(@RequestParam String city) {
		String apiUrl = "http://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey;

		// Realiza una solicitud HTTP a la API del clima
		RestTemplate restTemplate = new RestTemplate();
		String response = restTemplate.getForObject(apiUrl, String.class);

		return response;
	}
}
