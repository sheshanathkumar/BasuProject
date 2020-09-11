package com.basu.jumpstart.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.basu.jumpstart.response.ModelViewResonse;

@RestController
@RequestMapping("/api")
@CrossOrigin( maxAge = 3600)
public class JumpstartController {

	
	//@Autowired HttpRequest request;
	
	
	@GetMapping("/test")
	public String getTest () {
		return "Hello from JUMPSTART";
	}
	
	@CrossOrigin("http://localhost:3000/")
	@PostMapping("/client-login")
	public ResponseEntity<ModelViewResonse> getClientLogin (@RequestParam("username") String username, @RequestParam("password") String password) {
		
		if (username != null && password != null) {
			try {
				if (username.equalsIgnoreCase("Shesho") && password.equalsIgnoreCase("12345")) {
					
					
					return new ResponseEntity<ModelViewResonse>(new ModelViewResonse(""+HttpStatus.OK, "Login Success", "SUCCESS"), HttpStatus.OK);
				} else {
					return new ResponseEntity<ModelViewResonse>(HttpStatus.BAD_REQUEST);
				}
			}catch (Exception e) {
				return new ResponseEntity<ModelViewResonse>(HttpStatus.BAD_REQUEST);
			}
		}
		return new ResponseEntity<ModelViewResonse>(HttpStatus.NOT_IMPLEMENTED);
	}
	
	@GetMapping("/admin-login")
	public ResponseEntity<ModelViewResonse> getAdminLogin (@RequestParam("username") String username, @RequestParam("password") String password) {
		
		if (username != null && password != null) {
		
			try {
				
				
				return new ResponseEntity<ModelViewResonse>(HttpStatus.OK);
			}catch (Exception e) {
				return new ResponseEntity<ModelViewResonse>(HttpStatus.BAD_REQUEST);
			}
		}
		return new ResponseEntity<ModelViewResonse>(HttpStatus.NOT_IMPLEMENTED);
	}
	
	@GetMapping("/mentor-login")
	public ResponseEntity<ModelViewResonse> getMentorLogin (@RequestParam("username") String username, @RequestParam("password") String password) {
		
		if (username != null && password != null) {
		
			try {
				
				
				return new ResponseEntity<ModelViewResonse>(HttpStatus.OK);
			}catch (Exception e) {
				return new ResponseEntity<ModelViewResonse>(HttpStatus.BAD_REQUEST);
			}
		}
		return new ResponseEntity<ModelViewResonse>(HttpStatus.NOT_IMPLEMENTED);
	}
	
	
}
