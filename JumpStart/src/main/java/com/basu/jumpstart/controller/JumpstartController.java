package com.basu.jumpstart.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.basu.jumpstart.response.ModelViewResonse;

@RestController
@RequestMapping("/api")
public class JumpstartController {

	
	//@Autowired HttpRequest request;
	
	@GetMapping("/client-login")
	public ResponseEntity<ModelViewResonse> getClientLogin (@RequestParam("username") String username, @RequestParam("password") String password) {
		
		if (username != null && password != null) {
		
			try {
				
				
				return new ResponseEntity<ModelViewResonse>(HttpStatus.OK);
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
