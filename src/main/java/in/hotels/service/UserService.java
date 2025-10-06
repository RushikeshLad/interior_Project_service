package in.hotels.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.hotels.model.User;
import in.hotels.repository.UserRepository;

@Service
public class UserService {
	@Autowired private UserRepository repo;

    public User register(User u){
        if(repo.findByEmail(u.getEmail()).isPresent()){
            throw new RuntimeException("User already exists");
        }
        u.setRole("USER");
        return repo.save(u);
    }

    public User login(String email, String password){
        return repo.findByEmail(email)
                   .filter(u -> u.getPassword().equals(password))
                   .orElseThrow(() -> new RuntimeException("Invalid credentials"));
    }

    public List<User> getAllUsers(){ return repo.findAll(); }
    public void deleteUser(Long id){ repo.deleteById(id); }
    public User changeRole(Long id, String role){
        User u = repo.findById(id).orElseThrow();
        u.setRole(role);
        return repo.save(u);
    }
}
