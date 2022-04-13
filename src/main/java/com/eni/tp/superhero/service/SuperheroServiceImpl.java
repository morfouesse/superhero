package com.eni.tp.superhero.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eni.tp.superhero.bean.Superhero;
import com.eni.tp.superhero.dao.SuperheroDao;



@Service
public class SuperheroServiceImpl implements SuperheroService{
	@Autowired
	SuperheroDao superheroDao;

	@Override
	public Superhero createOrUpdate(Superhero superhero) {
		System.out.println("SuperheroServiceImpl createOrUpdate dedans");
		return superheroDao.save(superhero);
	}

	@Override
	public void deleteById(int id) {
		superheroDao.deleteById(id);
	}

	@Override
	public Superhero findById(int id) {
		Optional<Superhero> superheroOptional = superheroDao.findById(id);
		if (superheroOptional.isPresent()) {
			return superheroOptional.get();
		} else {
			// TODO : Gérer l'erreur de pas avoir trouver le superhero
			return null;
		}
	}

	@Override
	public List<Superhero> findAll() {
		return (List<Superhero>) superheroDao.findAll();
	}

}
