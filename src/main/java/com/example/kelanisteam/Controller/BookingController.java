package com.example.kelanisteam.controller;
import java.text.SimpleDateFormat;
import com.example.kelanisteam.model.Booking;
import com.example.kelanisteam.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Date;

@RestController
@RequestMapping("/bookings")
@CrossOrigin(origins = "http://localhost:3000")
public class BookingController {

    private final BookingService bookingService;

    @Autowired
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping("/createBooking")
    public ResponseEntity<Booking> createBooking(@RequestBody Booking booking) {
        // Get the current date and time
        Date currentDate = new Date();

        // Format the date to "yyyy-MM-dd HH:mm:ss"
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = formatter.format(currentDate);

        // Set the bookingDate property
        booking.setBookingDate(formattedDate);

        Booking savedBooking = bookingService.createBooking(booking);
        return new ResponseEntity<>(savedBooking, HttpStatus.CREATED);
    }


    @GetMapping("/getAllBookings")
    public ResponseEntity<List<Booking>> getAllBookings() {
        List<Booking> allBookings = bookingService.getAllBookings();

        if (!allBookings.isEmpty()) {
            return ResponseEntity.ok(allBookings);
        } else {
            return ResponseEntity.noContent().build();
        }
    }

//    @GetMapping("/getBookingById/{id}")
//    public ResponseEntity<Booking> getBookingById(@PathVariable String id) {
//        Booking booking = bookingService.getBookingById(id);
//
//        if (booking != null) {
//            return ResponseEntity.ok(booking);
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
}
