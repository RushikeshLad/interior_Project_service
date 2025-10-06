package in.hotels.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.hotels.model.Hotels;
import in.hotels.repository.HotelRepository;

@Service
public class HotelService {
	@Autowired
	private final HotelRepository repo;

    public HotelService(HotelRepository repo) {
        this.repo = repo;
    }

    public List<Hotels> getAll() {
        return repo.findAll();
    }

    public Hotels getById(Long id) {
        return repo.findById(id).orElseThrow();
    }

    public Hotels save(Hotels hotel) {
    	if (hotel.getId() == null) {
        return repo.save(hotel);
    	}else {
    		return repo.save(hotel); 
    	}
    }

    public Hotels update(Long id, Hotels updated) {
        Hotels hotel = repo.findById(id).orElseThrow();
        hotel.setName(updated.getName());
        hotel.setLocation(updated.getLocation());
        hotel.setImageUrl(updated.getImageUrl());
        hotel.setPrice(updated.getPrice());
        hotel.setOldPrice(updated.getPrice());
        hotel.setRating(updated.getRating());
        hotel.setReviews(updated.getReviews());
        hotel.setTags(updated.getTags());
        hotel.setOffers(updated.getOffers());
        return repo.save(hotel);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
    
    public List<Hotels> getAllHotels() {
        return repo.findAll();
    }
    public List<Hotels> searchHotels(String destination) {
        return repo.findByLocationContainingIgnoreCase(destination);
    }

}
