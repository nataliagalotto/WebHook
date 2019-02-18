package com.example.webhook.resources;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebhookResource {
	
	
	 	@PostMapping(path="/captura", consumes="application/x-www-form-urlencoded;charset=UTF-8")
	    public ResponseEntity<?> captura( final NotificationRequest request ) {
			
	 		System.out.println(request.toString());
	 		
	 		final MultiValueMap<String,String> header = new LinkedMultiValueMap<>();
	 	 	
	 		header.add("Access-Control-Allow-Origin", "https://sandbox.pagseguro.uol.com.br");
	 		//header.put("Accept","application/x-www-form-urlencoded");

	 		ResponseEntity<?> response = new ResponseEntity(header, HttpStatus.OK);
	 		
	 		
			
			return response ;
	 		
	 	}
}
