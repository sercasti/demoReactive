package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class Controller {

	@GetMapping("/reactive")
	public Mono<String> getMonoSha512Hex() {
		return Mono.fromCallable(() -> {
			Pi.computePi(5000);
			return "done";
		});
	}

}
