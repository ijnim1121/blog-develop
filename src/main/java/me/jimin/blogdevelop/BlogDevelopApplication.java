package me.jimin.blogdevelop;

import me.jimin.blogdevelop.config.jwt.JwtProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class BlogDevelopApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogDevelopApplication.class, args);
    }

}
