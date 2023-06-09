package SpringLab.CourseBookingSystem.CourseBookingSystem.controllers;

import SpringLab.CourseBookingSystem.CourseBookingSystem.models.Customer;
import SpringLab.CourseBookingSystem.CourseBookingSystem.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    CustomerRepository customerRepository;


    @GetMapping(value = "/customers")
    public ResponseEntity<List<Customer>> getAllCustomers(){
        return new ResponseEntity<>(customerRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/customers/{id}")
    public ResponseEntity getCustomer(@PathVariable Long id){
        return new ResponseEntity<>(customerRepository.findById(id), HttpStatus.OK);
    }

//    @PostMapping(value = "/customers")
//    public ResponseEntity<Customer> postPirate(@RequestBody Customer customer){
//        customerRepository.save(customer);
//        return new ResponseEntity<>(customer, HttpStatus.CREATED);
//    }

}
