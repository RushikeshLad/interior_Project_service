package in.hotels.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.hotels.model.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long>{

}
