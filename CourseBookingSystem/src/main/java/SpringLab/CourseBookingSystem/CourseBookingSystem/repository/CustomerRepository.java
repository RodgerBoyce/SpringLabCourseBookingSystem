package SpringLab.CourseBookingSystem.CourseBookingSystem.repository;

import SpringLab.CourseBookingSystem.CourseBookingSystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
//    List<Customer> findByAgeGreaterThan(int age);
//
//    List<Customer> findByRaidsId(long id);
}
