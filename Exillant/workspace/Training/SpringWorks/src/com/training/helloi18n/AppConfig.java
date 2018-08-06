package com.training.helloi18n;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class AppConfig {

	@Bean(name = "english")
	public Greeting enGreeting() {
		return new GreetEnglish();
	};

	@Bean(name = "french")
	public Greeting frenchGreet() {
		return new GreetFrench();
	}
}
