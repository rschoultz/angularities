package nu.schoultz.springbootfun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@PropertySources(value = {@PropertySource("classpath:application.properties")})
public class SpringFun {
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SpringFun.class);
		app.setShowBanner(false);
		app.run(args);
	}
}
