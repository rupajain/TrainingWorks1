package com.training.profile;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;


//dev--mysql



//@Qualifier
//@Profile("Production")
@Configuration
public class ProdDatabaseConfig implements DatabaseConfig {

	
	@Override
	@Bean
	public DataSource createDataSource() {
		System.out.println("creating production databse instance");

		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		return driverManagerDataSource;
	}

}
