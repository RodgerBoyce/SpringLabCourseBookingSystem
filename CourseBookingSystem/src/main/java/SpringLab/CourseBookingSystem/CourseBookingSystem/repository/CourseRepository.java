package SpringLab.CourseBookingSystem.CourseBookingSystem.repository;

import SpringLab.CourseBookingSystem.CourseBookingSystem.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>  {
//    List<Ship> findByPiratesFirstName(String firstName);
}
