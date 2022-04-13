package com.eni.tp.superhero.dao;

import org.springframework.data.repository.CrudRepository;

import com.eni.tp.superhero.bean.Category;



public interface CategoryDao extends CrudRepository<Category, Integer> {

}
