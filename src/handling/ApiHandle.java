package handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


// USE third party library to parse requests to objects --> from maven repository, use JSON in JAVA --> or build your own (research needed)
public class ApiHandle {
	private static HttpURLConnection connection;
	
	public static void main (String[] args) {
		ApiHandle obj = new ApiHandle();
		obj.newMethod();
	}
	
	public void oldMethod() {
		BufferedReader reader;	// reads off of the response from connection
		String line;	// every line of the response
		StringBuffer responseContent = new StringBuffer();	// every line is appended to responseContent
		
		try {
			URL url = new URL("https://jsonplaceholder.typicode.com/albums");	// throws iOE excpetion
			// opening connection to the url
			connection = (HttpURLConnection) url.openConnection();				// throws malformedurl exception
			
			// Request Setup
			connection.setRequestMethod("GET");	// send a get request
			connection.setConnectTimeout(5000); // close connection if no response within 5 seconds
			connection.setReadTimeout(5000);	// 
			
			// get response code for connection status
			int status = connection.getResponseCode();
			System.out.println(status);
			
			if(status > 299) {
				// getting error stream since status is greater than 200 range
				reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
				while((line = reader.readLine()) != null ) {
					responseContent.append(line);
				}
				reader.close();
			}else {
				// getting input stream if connection is successful
				reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
				while((line = reader.readLine()) != null ) {
					responseContent.toString();
				}
				reader.close();
			}
			
			System.out.println(responseContent.toString());
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			connection.disconnect(); // disconnecting from the url
		}
	}
	
	// Method 2: Uses java.net.http.HttpClient (new method for Java 11 -> handles async request)
	public void newMethod() {
		HttpClient client = HttpClient.newHttpClient();
		// Building http requests
		HttpRequest request = HttpRequest
								.newBuilder()
								.uri(
									URI.create("https://jsonplaceholder.typicode.com/albums")
									)
								.build();
		
		// Sending http requests asynchronously
		client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
			.thenApply(HttpResponse::body)		// get body of the response
			.thenAccept(System.out::println)	// realistically, map the response to a model object
			.join();
		
	}
}
