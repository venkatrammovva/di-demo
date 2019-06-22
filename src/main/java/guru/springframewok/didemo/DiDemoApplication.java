package guru.springframewok.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframewok.didemo.controllers.ConstructorInjectedController;
import guru.springframewok.didemo.controllers.MyController;
import guru.springframewok.didemo.controllers.PropertyInjectedController;
import guru.springframewok.didemo.controllers.SetterInjectedController;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
		MyController controller = (MyController) ctx.getBean(MyController.class);
		System.out.println(controller.hello());
		
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
	}

}
