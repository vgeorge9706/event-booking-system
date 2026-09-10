package com.varsha.event_platform.respository;

import com.varsha.event_platform.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}