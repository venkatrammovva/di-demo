package guru.springframewok.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import guru.springframewok.didemo.services.GreetingServiceImpl;
@Controller
public class PropertyInjectedController {
	@Autowired
	public GreetingServiceImpl greetingService;
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}
	
}
