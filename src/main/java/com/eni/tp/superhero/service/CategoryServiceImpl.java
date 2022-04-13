package com.eni.tp.superhero.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eni.tp.superhero.bean.Category;
import com.eni.tp.superhero.dao.CategoryDao;


@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	CategoryDao categoryDao;

	@Override
	public List<Category> findAll() {
		return (List<Category>) categoryDao.findAll();
	}

}
