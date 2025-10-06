package in.hotels.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import in.hotels.model.Hotels;
import in.hotels.service.HotelService;

@RestController
@RequestMapping("/hotels")
@CrossOrigin(origins = "http://localhost:4200")
public class HotelController {
	@Autowired
	private final HotelService service;

    public HotelController(HotelService service) {
        this.service = service;
    }

    @GetMapping
    public List<Hotels> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Hotels getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public Hotels addHotel(@RequestBody Hotels hotel) {
        return service.save(hotel);
    }

    @PutMapping("/{id}")
    public Hotels updateHotel(@PathVariable Long id, @RequestBody Hotels hotel) {
        return service.update(id, hotel);
    }

    @DeleteMapping("/{id}")
    public void deleteHotel(@PathVariable Long id) {
        service.delete(id);
    }
    
    @GetMapping("/locations")
    public List<String> getAllLocations() {
        return service.getAllHotels()
                .stream()
                .map(Hotels::getLocation)
                .distinct()
                .collect(Collectors.toList());
    }
    @GetMapping("/search")
    public List<Hotels> searchHotels(@RequestParam String destination) {
        return service.searchHotels(destination);
    }
}
