package guru.springframewok.didemo.controllers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import guru.springframewok.didemo.services.GreetingServiceImpl;

public class ConstructorInjectedControllerTest {
	private ConstructorInjectedController constructorInjectedController;
	@Before
	public void setup() {
		this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
	}
	@Test
	public void testGreeting() throws Exception{
		Assert.assertEquals(GreetingServiceImpl.HELLO_GURUS, constructorInjectedController.sayHello());
	}
}
