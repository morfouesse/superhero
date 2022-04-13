package com.eni.tp.superhero.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.eni.tp.superhero.bean.Superpower;



public interface SuperpowerDao extends CrudRepository<Superpower, Integer> {
	public List<Superpower> findByNameContains(String filterByName);
}
