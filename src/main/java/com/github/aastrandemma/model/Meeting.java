package com.github.aastrandemma.model;

import java.time.LocalDateTime;

public class Meeting {
    private int id;
    private String title;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String description;
    private Calendar calendar;

    // Constructor for creation of a meeting by user
    public Meeting(String title, LocalDateTime startTime, LocalDateTime endTime, String description) {
        this.title = title;
        this.startTime = startTime;
        this.endTime = endTime;
        this.description = description;
    }

    // Constructor for persisting data to the database
    public Meeting(String title, LocalDateTime startTime, LocalDateTime endTime, String description, Calendar calendar) {
        this(title, startTime, endTime, description);
        this.calendar = calendar;
    }

    // Constructor for fetching meeting data
    public Meeting(int id, String title, LocalDateTime startTime, LocalDateTime endTime, String description, Calendar calendar) {
        this(title, startTime, endTime, description, calendar);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public String getDescription() {
        return description;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public String meetingInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Meeting info: ").append("\n");
        stringBuilder.append("Id: ").append(id).append("\n");
        stringBuilder.append("Title: ").append(title).append("\n");
        stringBuilder.append("Start time: ").append(startTime).append("\n");
        stringBuilder.append("End time: ").append(endTime).append("\n");
        stringBuilder.append("Description: ").append(description).append("\n");
        return stringBuilder.toString();
    }

    private void timeValidation() {
        if (this.endTime.isBefore(this.startTime)) throw new IllegalArgumentException("End time must be after the start time.");
        if (this.startTime.isBefore(LocalDateTime.now())) throw new IllegalArgumentException("Start time must be after current time.");
    }
}