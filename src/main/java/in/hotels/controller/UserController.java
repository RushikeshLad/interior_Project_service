package in.hotels.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.hotels.model.User;
import in.hotels.service.UserService;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = {
	    "http://localhost:4200",
	    "https://fionastudiointerior.netlify.app"
	})
public class UserController {      
	 @Autowired private UserService service;

	    @GetMapping 
	    public List<User> allUsers(){
	    	return service.getAllUsers(); 
	    }
	    @DeleteMapping("/{id}")
	    public void delete(@PathVariable Long id){
	    	service.deleteUser(id); 
	    }
	    @PutMapping("/{id}/role")
	    public User changeRole(@PathVariable Long id,@RequestBody Map<String,String> role){
	        return service.changeRole(id, role.get("role"));
	    }
}
