package com.pj.database.databasedemopj;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pj.database.databasedemopj.jdbc.PersonJdbcDao;

@SpringBootApplication
public class DatabaseDemoPjApplication implements CommandLineRunner {

	Logger logger = LoggerFactory.getLogger(DatabaseDemoPjApplication.class);

	@Autowired
	PersonJdbcDao dao;

	public static void main(String[] args) {
		SpringApplication.run(DatabaseDemoPjApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("All users ->{}", dao.findAll());
	}

}
