/**
 * 
 */
package com.pj.database.databasedemopj.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Paul
 *
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Person {
	
	private int id;
	private String name;
	private String location;
	private Date birthDate;
	
	@Override
	public String toString() {
		return String.format("Person [id=%s, name=%s, location=%s, birthDate=%s]", id, name, location, birthDate);
	}

}
