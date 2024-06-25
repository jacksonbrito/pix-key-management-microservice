package com.br.pix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class Application {

	@RequestMapping("/key")
	public String teste(){
		return "testado 200 ok";

	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}