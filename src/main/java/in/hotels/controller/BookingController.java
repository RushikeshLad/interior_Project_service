package in.hotels.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import in.hotels.model.Booking;
import org.springframework.web.bind.annotation.GetMapping;
import in.hotels.service.BookingService;


@CrossOrigin(origins = {
	    "http://localhost:4200",
	    "https://fionastudiointerior.netlify.app"
	})

@RestController
@RequestMapping("/api/bookings")
public class BookingController {
	@Autowired
    private final BookingService service;

    public BookingController(BookingService service) {
        this.service = service;
    }

    @PostMapping
    public Booking create(@RequestBody Booking booking) {
        return service.save(booking);
    }

    @GetMapping
    public List<Booking> getAll() {
        return service.findAll();
    }

    @PutMapping("/{id}")
    public Booking update(@PathVariable Long id, @RequestBody Booking booking) {
        return service.update(id, booking);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
