package com.varsha.event_platform.dto;

import java.time.LocalDateTime;

public class EventResponse {

    private Long id;
    private String title;
    private String description;
    private String location;
    private LocalDateTime date;
    private int totalSeats;
    private int availableSeats;

    // getters and setters
}
