package com.training.profile;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;



@Profile("Development")
@Configuration
public class DevDatabaseConfig implements DatabaseConfig {

	@Override
	@Bean
	public DataSource createDataSource() {
		// TODO Auto-generated method stub
		System.out.println("creating development databse instance");

		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		return driverManagerDataSource;
	}

}
