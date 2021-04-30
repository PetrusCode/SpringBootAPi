package com.netmind.demo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("spring.datasource")
public class DatabaseConfig {

	static final Logger logger = LoggerFactory.getLogger(DatabaseConfig.class);

	private String url;
	private String user;
	private String password;
	private String driverClassName;

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	public String getDriverClassName() {
		return driverClassName;
	}

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	/**
	 * @return the user
	 */
	public String getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(String user) {
		this.user = user;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	@Profile("dev")
	@Bean
	public String devDatabaseConnection() {
		logger.info(url);
		logger.info(user);
		logger.info(password);
		logger.info(driverClassName);
		return url;
	}

	@Profile("pro")
	@Bean
	public String proDatabaseConnection() {
		logger.info(url);
		logger.info(user);
		logger.info(password);
		logger.info(driverClassName);
		return url;
	}
}
