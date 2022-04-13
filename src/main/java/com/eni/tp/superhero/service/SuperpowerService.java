package com.eni.tp.superhero.service;

import java.util.List;

import com.eni.tp.superhero.bean.Superpower;



public interface SuperpowerService {
	public Superpower createOrUpdate(Superpower superpower);
	public List<Superpower> findAll();
	public void deleteById(int idSuperpowerToDelete);
	public List<Superpower> findByName(String filterByName);
}
