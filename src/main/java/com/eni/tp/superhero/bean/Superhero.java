package com.eni.tp.superhero.bean;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;





@Entity
public class Superhero {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String alias;
	private String firstName;
	private String lastName;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate birthday;

	@ManyToOne
	private Category category;

	@ManyToMany
	private List<Superpower> superpowers;

	public Superhero() {

	}

	public Superhero(String alias, String firstName, String lastName, Category category, LocalDate birthday) {
		this.alias = alias;
		this.firstName = firstName;
		this.lastName = lastName;
		this.category = category;
		this.birthday = birthday;
	}

	public Superhero(int id, String alias, String firstName, String lastName, Category category, LocalDate birthday) {
		this.id = id;
		this.alias = alias;
		this.firstName = firstName;
		this.lastName = lastName;
		this.category = category;
		this.birthday = birthday;
	}

	public Superhero(String alias, String firstName, String lastName, LocalDate birthday, Category category,
			List<Superpower> superpowers) {
		this.alias = alias;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthday = birthday;
		this.category = category;
		this.superpowers = superpowers;
	}

	public Superhero(int id, String alias, String firstName, String lastName, LocalDate birthday, Category category,
			List<Superpower> superpowers) {
		this.id = id;
		this.alias = alias;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthday = birthday;
		this.category = category;
		this.superpowers = superpowers;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public List<Superpower> getSuperpowers() {
		return superpowers;
	}

	public void setSuperpowers(List<Superpower> superpowers) {
		this.superpowers = superpowers;
	}

	@Override
	public String toString() {
		return "Superhero [id=" + id + ", alias=" + alias + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", category=" + category + ", birthday=" + birthday + "]";
	}

}