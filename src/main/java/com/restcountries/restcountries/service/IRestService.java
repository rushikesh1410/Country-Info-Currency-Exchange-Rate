package com.restcountries.restcountries.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.restcountries.restcountries.entity.CountryInfo;

public interface IRestService {
	
	public CountryInfo getRestCountries(String countryName) throws JsonMappingException, JsonProcessingException;
	
	public String getCurrencyCode(String countryName) throws JsonMappingException, JsonProcessingException;
	
	public Double getCurrencyExchangeRateOfCountry(String countryCode) throws JsonMappingException, JsonProcessingException;
}
