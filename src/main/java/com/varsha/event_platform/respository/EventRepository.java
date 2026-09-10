package com.varsha.event_platform.respository;

import com.varsha.event_platform.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}