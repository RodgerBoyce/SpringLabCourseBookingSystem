package SpringLab.CourseBookingSystem.CourseBookingSystem.repository;

import SpringLab.CourseBookingSystem.CourseBookingSystem.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {
//    List<Raid> findRaidByLocation(String location);
//    List<Raid> findByPiratesShip(Ship ship);
}
