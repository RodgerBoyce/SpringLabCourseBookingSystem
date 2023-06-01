package SpringLab.CourseBookingSystem.CourseBookingSystem.controllers;
import SpringLab.CourseBookingSystem.CourseBookingSystem.models.Course;
import SpringLab.CourseBookingSystem.CourseBookingSystem.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/courses")
    public ResponseEntity<List<Course>> getAllCourses(){
        return new ResponseEntity<>(courseRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/courses/{id}")
    public ResponseEntity getCourse(@PathVariable Long id){
        return new ResponseEntity<>(courseRepository.findById(id), HttpStatus.OK);
    }

//    @PostMapping(value = "/ships")
//    public ResponseEntity<Ship> createShip(@RequestBody Ship ship){
//        shipRepository.save(ship);
//        return new ResponseEntity<>(ship, HttpStatus.CREATED);
//    }
}
