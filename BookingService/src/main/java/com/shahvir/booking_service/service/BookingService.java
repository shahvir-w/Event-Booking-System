package com.shahvir.booking_service.service;

import com.shahvir.booking_service.client.InventoryServiceClient;
import com.shahvir.booking_service.entity.Customer;
import com.shahvir.booking_service.repository.CustomerRepository;
import com.shahvir.booking_service.request.BookingRequest;
import com.shahvir.booking_service.response.BookingResponse;
import com.shahvir.booking_service.response.InventoryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

    private final CustomerRepository customerRepository;
    private final InventoryServiceClient inventoryServiceClient;

    @Autowired
    public BookingService(final CustomerRepository customerRepository, final InventoryServiceClient inventoryServiceClient) {
        this.customerRepository = customerRepository;
        this.inventoryServiceClient = inventoryServiceClient;
    }

    public BookingResponse createBooking(final BookingRequest request) {
        // check if user exists
        final Customer customer = customerRepository.findById(request.getUserId()).orElse(null);
        if (customer == null) {
            throw new RuntimeException("User not found");
        }

        // check if there is enough tickets
        final InventoryResponse inventoryResponse = inventoryServiceClient.getInventory(request.getEventId());
        // -- get event information to get venue info
        // create booking
        // send booking to Order Service on a Kafka Topic
        return BookingResponse.builder().build();
    }
}
