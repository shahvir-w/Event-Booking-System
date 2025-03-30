package com.shahvir.booking_service.service;

import com.shahvir.booking_service.client.InventoryServiceClient;
import com.shahvir.booking_service.entity.Customer;
import com.shahvir.booking_service.repository.CustomerRepository;
import com.shahvir.booking_service.request.BookingRequest;
import com.shahvir.booking_service.response.BookingResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

    private final CustomerRepository customerRepository;

    @Autowired
    public BookingService(final CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public BookingResponse createBooking(final BookingRequest request) {
        // check if user exists
        final Customer customer = customerRepository.findById(request.getUserId()).orElse(null);
        if (customer == null) {
            throw new RuntimeException("User not found");
        }

        // check if there is enough tickets
        // -- get event information to get venue info
        // create booking
        // send booking to Order Service on a Kafka Topic
        return BookingResponse.builder().build();
    }
}
