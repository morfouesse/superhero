package com.eni.tp.superhero.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.eni.tp.superhero.bean.Superhero;
import com.eni.tp.superhero.service.CategoryService;
import com.eni.tp.superhero.service.SuperheroService;
import com.eni.tp.superhero.service.SuperpowerService;



@RestController
@RequestMapping("superhero")
public class SuperHeroController {
	@Autowired
	SuperheroService superheroService;

	@Autowired
	CategoryService categoryService;

	@Autowired
	SuperpowerService superpowerService;

	@GetMapping("")
	public ModelAndView listSuperhero() {
		ModelAndView mav = new ModelAndView("list-superhero");
		mav.addObject("superheros", superheroService.findAll());
		return mav;
	}

	@GetMapping("/add")
	public ModelAndView addSuperhero() {
		ModelAndView mav = new ModelAndView("add-superhero");

		// mav.addObject("categories", Category.values()); // Avec Enum
		mav.addObject("categories", categoryService.findAll());
		mav.addObject("superpowers", superpowerService.findAll());
		mav.addObject("superheroForm", new Superhero());
		return mav;
	}

	@PostMapping("/submit-superhero")
	public ModelAndView submitSuperhero(
			@ModelAttribute("superheroForm") Superhero superheroForm
	) {
		// Traitement de mes données Superhero
		System.out.println("submitSuperhero");
		System.out.println(superheroForm);
		superheroService.createOrUpdate(superheroForm);

		// A la fin des traitements je redirige vers une page
		return addSuperhero();
	}

	@PostMapping("/delete-superhero")
	public ModelAndView deleteSuperhero(@RequestParam("id") int id) {
		System.out.println(id);
		superheroService.deleteById(id);
		return listSuperhero();
	}

	// Pour le formulaire de base sans Spring Boot MVC
//	@PostMapping("/submit-superhero")
//	public ModelAndView submitSuperhero(
//			@RequestParam("lastName") String lastName,
//			@RequestParam("firstName") String firstName,
//			@RequestParam("pseudo") String pseudo,
//			@RequestParam("category") String category
//	) {
//		// Traitement de mes données Superhero
//		System.out.println("submitSuperhero");
//		System.out.println(lastName);
//		System.out.println(firstName);
//		System.out.println(pseudo);
//		System.out.println(category);
//		// A la fin des traitements je redirige vers une page
//		return addSuperhero();
//	}

	@GetMapping("/detail/{id}")
	public ModelAndView detailSuperhero(@PathVariable("id") int id) {
		System.out.println(id);
		ModelAndView mav = new ModelAndView("add-superhero");

		// mav.addObject("categories", Category.values()); // Avec Enum
		mav.addObject("categories", categoryService.findAll());
		mav.addObject("superpowers", superpowerService.findAll());
		mav.addObject("superheroForm", superheroService.findById(id));
		return mav;
	}
}
