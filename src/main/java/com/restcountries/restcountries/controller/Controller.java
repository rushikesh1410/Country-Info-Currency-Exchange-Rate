package com.restcountries.restcountries.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.restcountries.restcountries.entity.CountryInfo;
import com.restcountries.restcountries.entity.Responce;
import com.restcountries.restcountries.service.RestServiceImpl;

@RestController
public class Controller {

	@Autowired
	private RestServiceImpl service;

	@Autowired
	private Responce responce;
	
	@Autowired 
	private CountryInfo countryInfo;

	@GetMapping("/restcountries/{countryName}")
	public Responce getRestCountries(@PathVariable String countryName)	throws JsonMappingException, JsonProcessingException {

		CountryInfo info = service.getRestCountries(countryName);

		final String currencyCode = service.getCurrencyCode(countryName);

		System.out.println(currencyCode);
		
		double euroConversion = service.getCurrencyExchangeRateOfCountry(currencyCode);
		
		countryInfo.setEuroConversion(euroConversion);
		
		System.out.println(countryInfo.getEuroConversion()+"hiiii");
		
	
		responce.setCommonName(info.getCommonName());
		responce.setOfficalName(info.getOfficalName());
		responce.setCurrencies(info.getCurrencies());
		responce.setCapital(info.getCapital());
		responce.setPopulation(info.getPopulation());
		responce.setEuroConversion(euroConversion);

		return responce;

	}

}
