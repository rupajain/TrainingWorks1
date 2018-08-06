package com.training.airlines.bookingtickets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	public static final ApiInfo API_INFO = new ApiInfo("training spring boot", "Testing Swagger", "", "", "", "", "");

	private static final Set<String> DEFAULT_PRODUCES_AND_CONSUMES = new HashSet<>(
			Arrays.asList("applicayion.json", "application.xml"));

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(API_INFO).produces(DEFAULT_PRODUCES_AND_CONSUMES)
				.consumes(DEFAULT_PRODUCES_AND_CONSUMES);
	}
}
