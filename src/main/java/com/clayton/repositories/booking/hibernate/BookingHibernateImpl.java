package com.clayton.repositories.booking.hibernate;


import com.clayton.domain.booking.Booking;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingHibernateImpl extends CrudRepository<Booking, Integer> {

}
