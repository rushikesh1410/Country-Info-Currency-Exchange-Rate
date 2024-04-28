# Country-Info-Currency-Exchange-Rate
Country-Info-Currency-Exchange-Rate is a Java Spring Boot Restful API that provides comprehensive country details, including common name, official name, capital, population, and currency information, with real-time exchange rates compared to the Euro.

# Project Name: Country-Info-Currency-Exchange-Rate
 
**Description:**
Country-Info-Currency-Exchange-Rate is a sophisticated RESTful web service developed using Java Spring Boot. It leverages the power of two prominent APIs available over the internet, restcountries and exchangerate, to provide comprehensive details about countries and their exchange rates compared to the Euro.
- restcountries : https://restcountries.com/
- exchangerate : https://exchangerate.host/  **exchangeRate is paid service**
 
# Key Features:
1. **Country Information**: Users can obtain detailed information about any country by simply providing the country name. The information includes:
   - Common Name
   - Official Name
   - Capital
   - Population
   - Currencies
 
2. **Exchange Rate Comparison**: In addition to country information, users can also compare the exchange rate of the country's currency with the Euro.
   - euroConversion
 
# Technical Details:
   - **Java Spring Boot**: The project is built using Java Spring Boot.
   - **RESTful Architecture**: Follows RESTful principles for easy integration and consumption by client applications.
   - **restcountries API**: Provides detailed information about countries, including Common Name, Official Name, Capital, Population, and Currencies.
   - **exchangerate API**: Offers real-time exchange rate data.
   - **User-Friendly Interface**: Designed for ease of use, making it simple for users to access country information and exchange rates with minimal effort.
 
 Country-Info-Currency-Exchange-Rate aims to provide a seamless and efficient solution for accessing country information and exchange rates, catering to the needs of developers, businesses, and individuals alike.

# Sample example:

 - Get Request : http://localhost:8080/restcountries/India
 - Outcome : 
         {
            "commonName": "India",
            "officalName": "Republic of India",
            "currencies": {
                "INR": {
                    "name": "Indian rupee",
                    "symbol": "₹"
                }
            },
            "capital": [
                "New Delhi"
            ],
            "population": 1380004385,
            "euroConversion": 89.263031
        }
