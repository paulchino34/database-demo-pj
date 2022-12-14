/**
 * 
 */
package com.pj.database.databasedemopj.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.pj.database.databasedemopj.entity.Person;

/**
 * @author Paul
 *
 */
@Repository
@Transactional
public class PersonJpaRepository {
	
	@PersistenceContext
	EntityManager entityManager;
	
	public Person findById(int id) {
		return entityManager.find(Person.class, id);
	}
	
	public Person update(Person person) {
		return entityManager.merge(person);
	}
	
	public Person insert(Person person) {
		return this.update(person);
	}
	
	public void deleteById(int id) {
		Person person= findById(id);
		entityManager.remove(person);
	}
	
	public List<Person> findAll(){
		 TypedQuery<Person> nameQuery = entityManager.createNamedQuery("find_all_person", Person.class);
		 return nameQuery.getResultList();
	}

}
