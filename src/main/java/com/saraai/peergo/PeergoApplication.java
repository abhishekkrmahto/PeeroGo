package com.saraai.peergo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class PeergoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PeergoApplication.class, args);
	}
}
