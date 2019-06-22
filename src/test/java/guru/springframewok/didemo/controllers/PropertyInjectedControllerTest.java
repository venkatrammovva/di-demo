package guru.springframewok.didemo.controllers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import guru.springframewok.didemo.services.GreetingServiceImpl;

public class PropertyInjectedControllerTest {
	private PropertyInjectedController propertyInjectedController;
	
	@Before
	public void setup() throws Exception{
		this.propertyInjectedController = new PropertyInjectedController();
		this.propertyInjectedController.greetingService = new GreetingServiceImpl();
	}
	
	@Test
	public void testGreeting() throws Exception{
		Assert.assertEquals(GreetingServiceImpl.HELLO_GURUS, propertyInjectedController.sayHello());
	}
}
