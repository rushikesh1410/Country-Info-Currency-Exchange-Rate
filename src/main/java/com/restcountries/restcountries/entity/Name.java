package com.restcountries.restcountries.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Name {

	private String common;
	private String official;

	public Name() {
		super();
	}

	public Name(String common, String official) {
		super();
		this.common = common;
		this.official = official;
	}

	public String getCommon() {
		return common;
	}

	public void setCommon(String common) {
		this.common = common;
	}

	public String getOfficial() {
		return official;
	}

	public void setOfficial(String official) {
		this.official = official;
	}

	@Override
	public String toString() {
		return "Name [common=" + common + ", official=" + official + "]";
	}

}
