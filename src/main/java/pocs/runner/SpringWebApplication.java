package pocs.runner;

import org.apache.camel.spring.boot.CamelSpringBootApplicationController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "pocs.process")
public class SpringWebApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringWebApplication.class, args);
		CamelSpringBootApplicationController ctrl = ctx.getBean(CamelSpringBootApplicationController.class);
		ctrl.blockMainThread();
	}
}
