package com.restcountries.restcountries.entity;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Responce {
	

	private String commonName;
	
	private String officalName;
	
	private Object currencies;

	private List<String> capital;

	private int population;

	private double euroConversion;

	public Responce() {
		super();
	}

	public Responce(String commonName, String officalName, Object currencies, List<String> capital, int population,
			double euroConversion) {
		super();
		this.commonName = commonName;
		this.officalName = officalName;
		this.currencies = currencies;
		this.capital = capital;
		this.population = population;
		this.euroConversion = euroConversion;
	}

	public String getCommonName() {
		return commonName;
	}

	public void setCommonName(String commonName) {
		this.commonName = commonName;
	}

	public String getOfficalName() {
		return officalName;
	}

	public void setOfficalName(String officalName) {
		this.officalName = officalName;
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

	public double getEuroConversion() {
		return euroConversion;
	}

	public void setEuroConversion(double euroConversion) {
		this.euroConversion = euroConversion;
	}

	@Override
	public String toString() {
		return "Responce [commonName=" + commonName + ", officalName=" + officalName + ", currencies=" + currencies
				+ ", capital=" + capital + ", population=" + population + ", euroConversion=" + euroConversion + "]";
	}
	
	
	

	
	

}
