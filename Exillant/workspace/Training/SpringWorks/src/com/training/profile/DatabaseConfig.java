package com.training.profile;

import javax.sql.DataSource;

public interface DatabaseConfig {
DataSource createDataSource();
}
