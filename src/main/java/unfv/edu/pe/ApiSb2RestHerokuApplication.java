package unfv.edu.pe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ApiSb2RestHerokuApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiSb2RestHerokuApplication.class, args);
	}
	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/api/v1/estado/**")
				.allowedMethods("GET", "POST")
				.allowedOrigins("*");
			}
		};
	}
}
