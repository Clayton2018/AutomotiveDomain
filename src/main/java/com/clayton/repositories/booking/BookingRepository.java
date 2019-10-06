package com.clayton.repositories.booking;


import com.clayton.domain.booking.Booking;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends CrudRepository<Booking, Integer> {

    //Set<Booking> getAll();

}
