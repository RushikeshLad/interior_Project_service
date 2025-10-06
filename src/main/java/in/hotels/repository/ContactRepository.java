package in.hotels.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.hotels.model.ContactMessage;

public interface ContactRepository extends JpaRepository<ContactMessage, Long>{

}
