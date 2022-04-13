package com.eni.tp.superhero.dao;

import org.springframework.data.repository.CrudRepository;

import com.eni.tp.superhero.bean.Superhero;



public interface SuperheroDao extends CrudRepository<Superhero, Integer>{

}
