package com.example.ptfBackEnd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class PtfBackEndApplication {

	public static void main(String[] args) {
//		Dotenv dotenv = Dotenv.load();

		SpringApplication.run(PtfBackEndApplication.class, args);
	}

}


// <dependency>
//     <groupId>io.github.cdimascio</groupId>
//     <artifactId>dotenv-java</artifactId>
//     <version>2.5.1</version>
// </dependency>
