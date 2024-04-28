package com.restcountries.restcountries.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RatesResponse {

	private Object rates;

	public RatesResponse() {
		super();
	}

	public RatesResponse(Object rates) {
		super();
		this.rates = rates;
	}

	public Object getRates() {
		return rates;
	}

	public void setRates(Object rates) {
		this.rates = rates;
	}

	@Override
	public String toString() {
		return "RatesResponse [rates=" + rates + "]";
	}
	
	
}
