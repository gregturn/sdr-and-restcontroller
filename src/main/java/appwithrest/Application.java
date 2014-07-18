package appwithrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);

		PersonRepository repository = ctx.getBean(PersonRepository.class);
		repository.save(new Person("Bilbo", "Baggins"));
		repository.save(new Person("Frodo", "Baggins"));
	}
}
