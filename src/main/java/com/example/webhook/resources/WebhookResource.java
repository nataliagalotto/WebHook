package com.example.webhook.resources;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class WebhookResource {
	
	
	 	@PostMapping(path="/captura", consumes="application/x-www-form-urlencoded;charset=UTF-8")
	    public ResponseEntity<?> captura( final NotificationRequest request ) {
			
	 		System.out.println(request.toString());
	 		
	 		final Map<String,String> header = new HashMap<>();
	 	
	 		header.put("Access-Control-Allow-Origin", "https://sandbox.pagseguro.uol.com.br");
	 		//header.put("Accept","application/x-www-form-urlencoded");
			
			return new ResponseEntity(header, HttpStatus.OK);
	 		
	 	}
}
