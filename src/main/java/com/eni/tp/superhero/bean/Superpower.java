package com.eni.tp.superhero.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;



@Entity
public class Superpower {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String description;

	@ManyToMany(mappedBy="superpowers")
	private List<Superhero> superheros;

	public Superpower() {
	}

	public Superpower(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public Superpower(int id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Superhero> getSuperheros() {
		return superheros;
	}

	public void setSuperheros(List<Superhero> superheros) {
		this.superheros = superheros;
	}

	@Override
	public String toString() {
		return "Superpower [id=" + id + ", name=" + name + ", description=" + description + "]";
	}

}
