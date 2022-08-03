package com.pj.database.databasedemopj.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@NamedQuery(name = "find_all_person", query = "select p from Person p")
public class Person {

	@Id
	@GeneratedValue
	private int id;

	private String name;
	private String location;
	private Date birthDate;
	
	/**
	 * @param name
	 * @param location
	 * @param birthDate
	 */
	public Person(String name, String location, Date birthDate) {
		super();
		this.name = name;
		this.location = location;
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return String.format("\nPerson [id=%s, name=%s, location=%s, birthDate=%s]", id, name, location, birthDate);
	}
}
