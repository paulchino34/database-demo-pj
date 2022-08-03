package com.pj.database.databasedemopj;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pj.database.databasedemopj.entity.Person;
import com.pj.database.databasedemopj.jpa.PersonJpaRepository;

@SpringBootApplication
public class JpaDatabaseDemoPjApplication implements CommandLineRunner {

	Logger logger = LoggerFactory.getLogger(JpaDatabaseDemoPjApplication.class);

	@Autowired
	PersonJpaRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(JpaDatabaseDemoPjApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		logger.info("By id user 10001 -> {}", repository.findById(10001));
		logger.info("Inserting 10004 -> {}", repository.insert(new Person(10004, "Byron", "Cuba", new Date())));
		logger.info("Update 10003 -> {}", repository.update(new Person(10003, "Mariana", "Lucha", new Date())));
		repository.deleteById(10002);
		logger.info("Deleting 10002");
		logger.info("All users ->{}", repository.findAll());
	}

}
