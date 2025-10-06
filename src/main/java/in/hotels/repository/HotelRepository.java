package in.hotels.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.hotels.model.Hotels;
public interface HotelRepository extends JpaRepository<Hotels,Long>{
	List<Hotels> findByLocation(String location);
	List<Hotels> findByLocationContainingIgnoreCase(String location);
	List<Hotels> findByNameContainingIgnoreCaseAndLocationContainingIgnoreCaseAndPriceLessThanEqual(
	        String name, String location, double price
	    );
}
