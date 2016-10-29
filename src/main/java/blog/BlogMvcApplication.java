package blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// applies the default configuration settings for our Spring Boot application
// (finds and loads all entities, controllers, UI templates and other application assets)
@SpringBootApplication
public class BlogMvcApplication {
    public static void main(String[] args) {
        // configures and starts Spring Boot application
        SpringApplication.run(BlogMvcApplication.class, args);
    }
}
