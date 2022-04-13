package com.eni.tp.superhero.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.eni.tp.superhero.bean.Superpower;
import com.eni.tp.superhero.service.SuperpowerService;



@RestController
public class SuperpowerController {
	@Autowired
	SuperpowerService superpowerService;

	@GetMapping("/superpower")
	public ModelAndView superpower(String filterByName) {
		ModelAndView mav = new ModelAndView("superpower");
		mav.addObject("superpowerForm", new Superpower());

		if (filterByName == null) {
			mav.addObject("superpowers", superpowerService.findAll());
		} else {
			mav.addObject("superpowers", superpowerService.findByName(filterByName));
		}

		return mav;
	}

	@PostMapping("/submit-superpower")
	public ModelAndView submitSuperpower(@ModelAttribute("superpowerForm") Superpower superpowerForm) {
		System.out.println(superpowerForm);
		superpowerService.createOrUpdate(superpowerForm);
		return superpower("");
	}

	@PostMapping("/delete-superpower")
	public ModelAndView deleteSuperpower(@RequestParam("id") int id) {
		System.out.println(id);
		superpowerService.deleteById(id);
		return superpower("");
	}

	@PostMapping("/filter-by-name")
	public ModelAndView filterByName(@RequestParam("filterByName") String filterByName) {
		System.out.println(filterByName);
		return superpower(filterByName);
	}
}
