package common_dsa_questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class BitcoinRate {

	// The main method retrieves the current bitcoin rate using the provided REST
	// API and converts it to words.
	public static void main(String[] args) {
		try {
			// Make a GET request to the API
			String response = sendGetRequest("https://api.coindesk.com/v1/bpi/currentprice.json");

			// Extract the bitcoin rate from the response
			String rate = extractRateFromResponse(response);

			// Convert the rate to words
			String rateInWords = convertRateToWords(rate);

			// Print the rate in words
			System.out.println(rateInWords);
		} catch (IOException e) {
			System.out.println("An error occurred while fetching the Bitcoin rate.");
			e.printStackTrace();
		}
	}

	// The sendGetRequest method is responsible for making a GET request to the API
	// using the provided url and returns the response from the API as
	// a string.
	private static String sendGetRequest(String url) throws IOException {
		URL apiUrl = new URL(url);
		HttpURLConnection connection = (HttpURLConnection) apiUrl.openConnection();
		connection.setRequestMethod("GET");

		int responseCode = connection.getResponseCode();

		if (responseCode == HttpURLConnection.HTTP_OK) {
			BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			StringBuilder response = new StringBuilder();
			String line;

			while ((line = reader.readLine()) != null) {
				response.append(line);
			}

			reader.close();
			return response.toString();
		} else {
			throw new IOException("GET request failed with response code: " + responseCode);
		}
	}

	// The extractRateFromResponse method takes the API response as input and
	// extracts the bitcoin rate using regular expressions and looks for the
	// pattern "rate" in the response and returns the rate as a string.
	private static String extractRateFromResponse(String response) {
		Pattern pattern = Pattern.compile("\"rate\":\"([0-9,.]+)\"");
		Matcher matcher = pattern.matcher(response);

		if (matcher.find()) {
			return matcher.group(1);
		} else {
			throw new IllegalArgumentException("Failed to extract Bitcoin rate from the response.");
		}
	}

	// The convertRateToWords method takes the rate as a string and removes the
	// decimal part and any commas, and converts it to an integer
	private static String convertRateToWords(String rate) {
		// Remove decimal part and any commas
		String rateWithoutDecimal = rate.split("\\.")[0].replaceAll(",", "");

		int num = Integer.parseInt(rateWithoutDecimal);

		// Define the words for numbers 1-19
		String[] units = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
				"Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };

		// Define the words for tens multiples
		String[] tens = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };

		// Convert the number to words
		if (num == 0) // checking if the number is zero and returns "Zero" otherwise it calls the
						// convertToWords method to convert the number to words
		{
			return "Zero";
		} else {
			return convertToWords(num, units, tens);
		}
	}

	// The convertToWords converts a given number to words using the units and tens
	// arrays and based on the magnitude of the number to handle cases
	// up to crores. This method recursively calls itself to convert the remaining
	// digits after each magnitude step.
	private static String convertToWords(int num, String[] units, String[] tens) {

		if (num < 20) {
			return units[num];
		} else if (num < 100) {
			return tens[num / 10] + " " + convertToWords(num % 10, units, tens);
		} else if (num < 1000) {
			return units[num / 100] + " Hundred " + convertToWords(num % 100, units, tens);
		} else if (num < 100000) {
			return convertToWords(num / 1000, units, tens) + " Thousand " + convertToWords(num % 1000, units, tens);
		} else if (num < 10000000) {
			return convertToWords(num / 100000, units, tens) + " Lakh " + convertToWords(num % 100000, units, tens);
		} else {
			return convertToWords(num / 10000000, units, tens) + " Crore "
					+ convertToWords(num % 10000000, units, tens);
		}
	}
}

// Overall, the program fetches the bitcoin rate from the API, extracts the rate value, converts it to an integer, and then converts it to words using
// recursive conversion and then prints the result in console.