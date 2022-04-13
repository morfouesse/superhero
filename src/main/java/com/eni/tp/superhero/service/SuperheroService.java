package com.eni.tp.superhero.service;

import java.util.List;

import com.eni.tp.superhero.bean.Superhero;



public interface SuperheroService {
	public Superhero createOrUpdate(Superhero superhero);
	public void deleteById(int id);
	public Superhero findById(int id);
	public List<Superhero> findAll();
}
