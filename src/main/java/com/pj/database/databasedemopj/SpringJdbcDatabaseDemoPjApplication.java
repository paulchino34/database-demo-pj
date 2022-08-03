package com.pj.database.databasedemopj;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pj.database.databasedemopj.entity.Person;
import com.pj.database.databasedemopj.jdbc.PersonJdbcDao;

@SpringBootApplication
public class SpringJdbcDatabaseDemoPjApplication {

	Logger logger = LoggerFactory.getLogger(SpringJdbcDatabaseDemoPjApplication.class);

	@Autowired
	PersonJdbcDao dao;

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcDatabaseDemoPjApplication.class, args);
	}

	
	public void run(String... args) throws Exception {
		logger.info("All users ->{}", dao.findAll());
		logger.info("By id user 10001 -> {}", dao.findById(10001));
		logger.info("Deleting 10002 -> Nomber of rows deleted {}", dao.deleteById(10002));
		logger.info("All users -> {}", dao.findAll());
		logger.info("Inserting 10004 -> {}", dao.insert(new Person(10004, "Byron", "Cuba", new Date())));
		logger.info("Update 10003 -> {}", dao.update(new Person(10003, "Mariana", "Lucha", new Date())));
	}

}
