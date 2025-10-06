package in.hotels.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import in.hotels.model.User;

public interface UserRepository extends JpaRepository<User,Long>{
	Optional<User>findByEmail(String email);
}
