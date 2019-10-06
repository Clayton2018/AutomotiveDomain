package com.clayton.service.booking;


import com.clayton.domain.booking.Booking;
import javafx.concurrent.Service;

import java.util.Set;

public interface BookingService extends Service<Booking, Integer> {


    Set<Booking> getAll();

}
