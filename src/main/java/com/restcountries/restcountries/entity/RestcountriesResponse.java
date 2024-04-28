package com.restcountries.restcountries.entity;

import java.util.List;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Component
@JsonIgnoreProperties(ignoreUnknown = true)
public class RestcountriesResponse {

	private Name name;
	private Object currencies;
	private List<String> capital;
	private int population;

	public RestcountriesResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RestcountriesResponse(Name name, Object currencies, List<String> capital, int population) {
		super();
		this.name = name;
		this.currencies = currencies;
		this.capital = capital;
		this.population = population;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public Object getCurrencies() {
		return currencies;
	}

	public void setCurrencies(Object currencies) {
		this.currencies = currencies;
	}

	public List<String> getCapital() {
		return capital;
	}

	public void setCapital(List<String> capital) {
		this.capital = capital;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	@Override
	public String toString() {
		return "RestcountriesResponse [name=" + name + ", currencies=" + currencies + ", capital=" + capital
				+ ", population=" + population + "]";
	}

}
