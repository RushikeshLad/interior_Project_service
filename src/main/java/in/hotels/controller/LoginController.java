package in.hotels.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.hotels.model.User;
import in.hotels.service.UserService;


@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = {
	    "http://localhost:4200",
	    "https://fionastudiointerior.netlify.app"
	})
public class LoginController {
	 @Autowired private UserService userService;

	    @PostMapping("/register")
	    public User register(@RequestBody User u){ return userService.register(u); }

	    @PostMapping("/login")
	    public User login(@RequestBody Map<String,String> credentials){
	        return userService.login(credentials.get("email"), credentials.get("password"));
	    }
}
