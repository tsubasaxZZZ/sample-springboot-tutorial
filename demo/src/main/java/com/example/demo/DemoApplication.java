package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import jakarta.servlet.http.HttpServletRequest;


@SpringBootApplication
@RestController
public class DemoApplication {
    public static void main(String[] args) {
    	SpringApplication.run(DemoApplication.class, args);
    }
    
    @GetMapping("/")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name, HttpServletRequest request) {
		// Print IP address of client IP
		System.out.println("Client IP: " + request.getRemoteAddr());
    	return String.format("Hello %s!(%s)", name, request.getRemoteAddr());
    }
}
