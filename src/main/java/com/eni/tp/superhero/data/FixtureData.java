package com.eni.tp.superhero.data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.eni.tp.superhero.bean.Category;

import com.eni.tp.superhero.bean.Superhero;
import com.eni.tp.superhero.bean.Superpower;

import com.eni.tp.superhero.dao.CategoryDao;

import com.eni.tp.superhero.dao.SuperheroDao;
import com.eni.tp.superhero.dao.SuperpowerDao;

@Component
public class FixtureData {
    @Autowired
    private SuperpowerDao superpowerDao;

    @Autowired
    private CategoryDao categoryDao;

    @Autowired
    private SuperheroDao superheroDao;

    @EventListener
    public void appReady(ApplicationReadyEvent event) {

    	Category catGood = categoryDao.save(new Category("Gentil"));
    	Category catBad = categoryDao.save(new Category("Méchant"));
    	Category catGoodBad = categoryDao.save(new Category("Gentil/Méchant"));

    	Superpower superpower1 = superpowerDao.save(new Superpower("Flemme", "La flemme..."));
    	Superpower superpower2 = superpowerDao.save(new Superpower("Test", "Le testeur"));
    	Superpower superpower3 = superpowerDao.save(new Superpower("Le sportif", "Capable de faire tous les sports"));
    	Superpower superpower4 = superpowerDao.save(new Superpower("Shampoing", "Capable de jeter du shampoing"));
    	Superpower superpower5 = superpowerDao.save(new Superpower("Musclor", "Très très fort !"));

    	Superhero superhero1 = superheroDao.save(new Superhero(
    			"Echo",
    			"Erwan",
    			"Baccon",
    			LocalDate.of(1990, 6, 26),
    			catGoodBad,
    			new ArrayList<Superpower>(List.of(superpower1, superpower2))
    	));
    	Superhero superhero2 = superheroDao.save(new Superhero(
    			"PerversPepere",
    			"Pervers",
    			"Pepere",
    			LocalDate.of(1950, 1, 1),
    			catBad,
    			new ArrayList<Superpower>(List.of(superpower1, superpower3, superpower5))
    	));

    }
}