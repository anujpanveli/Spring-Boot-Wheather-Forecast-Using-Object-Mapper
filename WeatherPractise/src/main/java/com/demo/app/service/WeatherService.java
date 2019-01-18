package com.demo.app.service;

import org.json.JSONArray;
import org.json.JSONObject;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import com.demo.app.model.*;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.List;

@Service
public class WeatherService extends MappingJackson2HttpMessageConverter   {

    private static WeatherService ourInstance = new WeatherService();
       
    public static WeatherService getInstance() {
        return ourInstance;
    }

    private WeatherService() {
    	setPrettyPrint(true);
    }

    
    public List<Example> getWeatherForFive(String city) throws ParseException, JsonParseException, JsonMappingException, IOException {
    	String websiteResponse = "http://api.openweathermap.org/data/2.5/forecast?q="+city+"&mode=json&appid=212c66a25a472c08ed353270edf23703"+"&units=metric";
    	
    	List<Example> weatherList = new ArrayList<>();
    	
    	RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(websiteResponse, String.class);	
        
        Example example = objectMapper.readValue(result, Example.class); 
          weatherList.add(example);
          
          return weatherList;
    }   
}
