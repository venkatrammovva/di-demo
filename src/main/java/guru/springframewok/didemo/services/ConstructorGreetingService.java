 package guru.springframewok.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService{
	@Override
	public String sayGreeting() {
		return "Hello, I am being injected from the constructor";
	}
}
