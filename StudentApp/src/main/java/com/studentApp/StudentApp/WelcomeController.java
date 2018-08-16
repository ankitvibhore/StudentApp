package com.studentApp.StudentApp;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.studentApp.StudentApp.configuration.BasicConfiguration;
@RestController
public class WelcomeController 
{
	@Autowired
	private WelcomeService service;
	@Autowired
	private BasicConfiguration configuration;
	
	@RequestMapping("/welcome")
	public String welcome()
	{
		return service.retrieveWelcomeMessage();
		
	}
public Map<String,Object> dynamicConfiguration()
{
	Map<String,Object> map=new HashMap<String,Object>();
	map.put("message", configuration.getMessage());
	map.put("number", configuration.getNumber());
	map.put("value", configuration.isValue());
	return map;
	}
}
