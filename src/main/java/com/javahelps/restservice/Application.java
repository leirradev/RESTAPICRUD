package com.javahelps.restservice;

import com.javahelps.restservice.entity.User;
import com.javahelps.restservice.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    protected CommandLineRunner init(final UserRepository userRepository) {

        return args -> {
            User user = new User();
            user.setUsername("admin");
            user.setPassword("admin");
            user.setName("Administrator");
            user.setEmail("admin@javahelps.com");
            userRepository.save(user);

        };
    }
}