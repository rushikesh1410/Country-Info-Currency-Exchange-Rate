package com.restcountries.restcountries.service;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.restcountries.restcountries.entity.CountryInfo;
import com.restcountries.restcountries.entity.CurrencyCodeResponse;
import com.restcountries.restcountries.entity.RatesResponse;
import com.restcountries.restcountries.entity.Responce;
import com.restcountries.restcountries.entity.RestcountriesResponse;

@Service
public class RestServiceImpl implements IRestService {

	@Autowired
	private Responce response;

	@Autowired
	private CountryInfo countryInfo;

	ObjectMapper mapper = new ObjectMapper();

	@Override
	public CountryInfo getRestCountries(String countryName) throws JsonMappingException, JsonProcessingException {

		String uri = "https://restcountries.com/v3.1/name/" + countryName;

		RestTemplate restTemplate = new RestTemplate();

		String restCountries = restTemplate.getForObject(uri, String.class);

		RestcountriesResponse[] restCountriesResponse = mapper.readValue(restCountries, RestcountriesResponse[].class);

		if (restCountriesResponse.length > 0) {
			RestcountriesResponse firstCountryResponse = restCountriesResponse[0];

			CountryInfo countryInfo = new CountryInfo();

			countryInfo.setCommonName(firstCountryResponse.getName().getCommon());
			countryInfo.setOfficalName(firstCountryResponse.getName().getOfficial());
			countryInfo.setCurrencies(firstCountryResponse.getCurrencies());
			countryInfo.setCapital(firstCountryResponse.getCapital());
			countryInfo.setPopulation(firstCountryResponse.getPopulation());

			return countryInfo;
		} else {
			return null;
		}
	}

	@Override
	public String getCurrencyCode(String countryName) throws JsonMappingException, JsonProcessingException {

		String uri = "https://restcountries.com/v3.1/name/" + countryName;

		RestTemplate restTemplate = new RestTemplate();

		String restCountries = restTemplate.getForObject(uri, String.class);

		CurrencyCodeResponse[] currencyCodeResponse = mapper.readValue(restCountries, CurrencyCodeResponse[].class);

		if (currencyCodeResponse.length > 0) {

			CurrencyCodeResponse firstCurrencyCode = currencyCodeResponse[0];

			// Object str =firstCurrencyCode.getCurrencies();

			JSONObject jsonObject = new JSONObject(firstCurrencyCode);

			JSONObject currencyObj = jsonObject.getJSONObject("currencies");

			// String currencyObj1 = currencyObj.toString();

//	    	Map<String, Object> map = new HashMap<>();
//	    	
//	    	for (String key : currencyObj.keySet()) {
//	    	
//				Object value = currencyObj.getJSONObject(key);
//				map.put(key, value);
//			}

			String firstKey = currencyObj.keys().next();

			System.out.println(firstKey);

//	        System.out.println( map.keySet().toString());

			return firstKey;
		}

		return null;
	}

	@Override
	public Double getCurrencyExchangeRateOfCountry(String countryCode)
			throws JsonMappingException, JsonProcessingException {

		Double value = 0.0;
		String uri = "http://api.exchangerate.host/latest?access_key=a7c382c99654069336d835f166db1523";
		RestTemplate restTemplate = new RestTemplate();
		String exchangeRatesOfCountries = restTemplate.getForObject(uri, String.class);

		ObjectMapper mapper = new ObjectMapper();

		RatesResponse exchangeRatesResponse = mapper.readValue(exchangeRatesOfCountries, RatesResponse.class);

		JSONObject jsonObject = new JSONObject(exchangeRatesResponse);

		JSONObject ratesObj = jsonObject.getJSONObject("rates");

		String rates = ratesObj.toString();

		Map<String, Double> map = new HashMap<>();

		for (String key : ratesObj.keySet()) {
			value = ratesObj.getDouble(key);
			map.put(key, value);
		}

		System.out.println(map);

		if (map.containsKey(countryCode)) {
			value = map.get(countryCode);

		}

		countryInfo.setEuroConversion(value.doubleValue());

		System.out.println(value);
		
		System.out.println("euroConversion : " + countryInfo.getEuroConversion());

		countryInfo.setEuroConversion(value.doubleValue());

		return countryInfo.getEuroConversion();
	}

}
