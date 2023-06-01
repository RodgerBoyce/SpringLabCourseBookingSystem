package SpringLab.CourseBookingSystem.CourseBookingSystem.components;

import SpringLab.CourseBookingSystem.CourseBookingSystem.models.Booking;
import SpringLab.CourseBookingSystem.CourseBookingSystem.models.Course;
import SpringLab.CourseBookingSystem.CourseBookingSystem.models.Customer;
import SpringLab.CourseBookingSystem.CourseBookingSystem.repository.BookingRepository;
import SpringLab.CourseBookingSystem.CourseBookingSystem.repository.CourseRepository;
import SpringLab.CourseBookingSystem.CourseBookingSystem.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test")
@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;


    public DataLoader() {

    }

    public void run(ApplicationArguments args) {

        Course web = new Course("Web Development", "Edinburgh", 2);
        courseRepository.save(web);
        Course psd = new Course("Software Development", "Glasgow", 5);
        courseRepository.save(psd);
        Course data = new Course("Data Engineering", "Dundee", 4);
        courseRepository.save(data);

        Customer toby = new Customer("Toby", "Edinburgh", 25);
        customerRepository.save(toby);
        Customer rodger = new Customer("Rodger", "Edinburgh", 10);
        customerRepository.save(rodger);
        Customer geri = new Customer("Geri", "Rogerville", 98);
        customerRepository.save(geri);

        Booking booking1 = new Booking("01/06/2023", rodger, psd);
        bookingRepository.save(booking1);
        Booking booking2 = new Booking("01/06/1995", toby, data);
        bookingRepository.save(booking2);
        Booking booking3 = new Booking("01/06/2100", geri, psd);
        bookingRepository.save(booking3);
//
//
//        jack.addRaid(raid1);
//        jack.addRaid(raid2);
//        pirateRepository.save(jack);
//
//        raid2.addPirate(john);
//        raidRepository.save(raid2);
//
//        raid3.addPirate(pugwash);
//        raid3.addPirate(maggie);
//        raidRepository.save(raid3);
//
//        raid4.addPirate(pugwash);
//        raid3.addPirate(jack);
//        raidRepository.save(raid4);
//
//        blackbeard.addRaid(raid5);
//        blackbeard.addRaid(raid6);
//        pirateRepository.save(blackbeard);
//
//        raid5.addPirate(william);
//        raidRepository.save(raid5);
//
//        raid6.addPirate(henry);
//        raidRepository.save(raid6);

    }
}