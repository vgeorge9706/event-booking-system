package com.varsha.event_platform.services;
import com.varsha.event_platform.entity.Event;

import java.util.List;

public interface EventService {

    List<Event> getAllEvents();
}