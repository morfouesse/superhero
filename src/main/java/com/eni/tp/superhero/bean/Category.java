/**
 *
 */
package com.eni.tp.superhero.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author amorf
 *
 */

@Entity
//Géré par Hibernate
@Table(name= "Category")
public class Category {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	private String name;




	public Category(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Category(String name) {
		this.name = name;
	}

	public Category() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Category [name=" + name + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


}
