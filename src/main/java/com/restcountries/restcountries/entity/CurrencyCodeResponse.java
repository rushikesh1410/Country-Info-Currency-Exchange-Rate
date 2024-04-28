package com.restcountries.restcountries.entity;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Component
@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrencyCodeResponse {

	private Object currencies;

	public CurrencyCodeResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CurrencyCodeResponse(Object currencies) {
		super();
		this.currencies = currencies;
	}

	public Object getCurrencies() {
		return currencies;
	}

	public void setCurrencies(Object currencies) {
		this.currencies = currencies;
	}

	@Override
	public String toString() {
		return "CurrencyCodeResponse [currencies=" + currencies + "]";
	}
	
	
}
