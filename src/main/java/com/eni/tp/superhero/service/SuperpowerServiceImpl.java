package com.eni.tp.superhero.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eni.tp.superhero.bean.Superpower;
import com.eni.tp.superhero.dao.SuperpowerDao;



@Service
public class SuperpowerServiceImpl implements SuperpowerService {
	@Autowired
	SuperpowerDao superpowerDao;

	@Override
	public Superpower createOrUpdate(Superpower superpower) {
		return superpowerDao.save(superpower);
	}

	@Override
	public List<Superpower> findAll() {
		return (List<Superpower>) superpowerDao.findAll();
	}

	@Override
	public void deleteById(int idSuperpowerToDelete) {
		superpowerDao.deleteById(idSuperpowerToDelete);
	}

	@Override
	public List<Superpower> findByName(String filterByName) {
		return superpowerDao.findByNameContains(filterByName);
	}

}
