package SpringLab.CourseBookingSystem.CourseBookingSystem.controllers;

import SpringLab.CourseBookingSystem.CourseBookingSystem.models.Booking;
import SpringLab.CourseBookingSystem.CourseBookingSystem.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookingController {

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping(value = "/bookings")
    public ResponseEntity<List<Booking>> getAllBookings(){
//        if (location !=null) {
//            return new ResponseEntity<>(bookingRepository.findRaidByLocation(location), HttpStatus.OK);
//        }
        return new ResponseEntity<>(bookingRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/bookings/{id}")
    public ResponseEntity getBooking(@PathVariable Long id){
        return new ResponseEntity<>(bookingRepository.findById(id), HttpStatus.OK);
    }

//    @PostMapping(value = "/bookings")
//    public ResponseEntity<Booking> createBooking(@RequestBody Booking booking){
//        bookingRepository.save(booking);
//        return new ResponseEntity<>(booking, HttpStatus.CREATED);
//    }

}
