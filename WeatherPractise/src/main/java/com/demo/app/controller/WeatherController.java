package com.demo.app.controller;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.*;


import com.demo.app.model.Example;

import com.demo.app.service.WeatherService;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;


@RestController
public class WeatherController {

    private final WeatherService weatherService;

    @Autowired
    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
    
	@RequestMapping("forecast/{city}")
	public List<Example> getWeatherForFive(
			@PathVariable String city) throws ParseException, JsonParseException, JsonMappingException, IOException {
		return this.weatherService.getWeatherForFive(city);		
	}
	
}