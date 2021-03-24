package publisher;

import javax.xml.ws.Endpoint;


import library.LibraryService;



public class LibraryPublisher {

	
public static void main (String[]args) {
		
		Endpoint ep=Endpoint.create(new LibraryService());
		ep.publish("http://localhost:8085/LibraryService");
		
	}
}
