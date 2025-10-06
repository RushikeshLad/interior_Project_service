package in.hotels.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.hotels.model.Booking;
import in.hotels.repository.BookingRepository;

@Service
public class BookingService {
	@Autowired
    private final BookingRepository repo;

    public BookingService(BookingRepository repo) {
        this.repo = repo;
    }

    public Booking save(Booking booking) {
        return repo.save(booking);
    }

    public List<Booking> findAll() {
        return repo.findAll();
    }

    public Booking update(Long id, Booking booking) {
        booking.setId(id);
        return repo.save(booking);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
