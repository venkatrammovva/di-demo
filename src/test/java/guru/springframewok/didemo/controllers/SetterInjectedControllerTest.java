package guru.springframewok.didemo.controllers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import guru.springframewok.didemo.services.GreetingServiceImpl;

public class SetterInjectedControllerTest {
	private SetterInjectedController setterInjectedController;
	@Before
	public void setup() {
		this.setterInjectedController = new SetterInjectedController();
		this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
	}
	@Test
	public void testGreeting() throws Exception{
		Assert.assertEquals(GreetingServiceImpl.HELLO_GURUS, setterInjectedController.sayHello());
	}
	
}
