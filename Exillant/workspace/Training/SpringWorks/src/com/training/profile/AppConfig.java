package com.training.profile;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@ComponentScan(basePackages="com.training.profile")
@Configuration
public class AppConfig {
	@Autowired(required=true)
public DataSource dataSource;
}
