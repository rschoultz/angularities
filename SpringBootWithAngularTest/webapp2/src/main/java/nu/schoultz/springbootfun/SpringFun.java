package nu.schoultz.springbootfun;

import org.springframework.boot.SpringApplication;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

@Configuration
@ComponentScan
@EnableAutoConfiguration

@PropertySources(value = {@PropertySource("classpath:application.properties")})
public class SpringFun extends WebMvcConfigurerAdapter {
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SpringFun.class);
		app.setShowBanner(false);
		app.run(args);
	}
	
	
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
	    registry.addViewController("/login").setViewName("login");
	}
}
