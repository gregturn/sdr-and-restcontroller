package appwithrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.boot.autoconfigure.web.HttpMessageConvertersAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration(exclude = HttpMessageConvertersAutoConfiguration.class)
public class Application {

	@Bean
	HttpMessageConverters httpMessageConverters() {
		return new HttpMessageConverters();
	}

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);

		PersonRepository repository = ctx.getBean(PersonRepository.class);
		repository.save(new Person("Bilbo", "Baggins"));
		repository.save(new Person("Frodo", "Baggins"));
	}
}
