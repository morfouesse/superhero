package com.eni.tp.superhero.bean;

public enum CategoryV2 {
	GENTIL("Gentil"),
	MECHANT("Méchant"),
	GENTIL_MECHANT("Gentil/mechant");

	private String name;

	private CategoryV2(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
