package com.github.aastrandemma.model;

import java.util.ArrayList;
import java.util.List;

public class Calendar {
    private int id;
    private String title;
    private List<Meeting> meetings;
    private String username;

    // Constructor for findByTitle()
    public Calendar(String title) {
        this.title = title;
    }

    // Constructor for creating calendar
    public Calendar(String username, String title) {
        this(title);
        this.username = username;
    }

    // Constructor for fetching calendar data
    public Calendar(int id, String title, List<Meeting> meetings, String username) {
        this(title, username);
        this.id = id;
        this.meetings = meetings;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public List<Meeting> getMeetings() {
        return meetings;
    }

    public String getUsername() {
        return username;
    }

    public void addMeeting(Meeting meeting) {
        if (meeting == null) throw new IllegalArgumentException("Meeting data is null.");
        if (meetings == null) meetings = new ArrayList<>();
        meetings.add(meeting);
    }

    public void removeMeeting(Meeting meeting) {
        if (meetings == null) throw new IllegalArgumentException("Meeting list is null.");
        if (meeting == null) throw new IllegalArgumentException("Meeting data is null.");
        meetings.remove(meeting);
    }

    public String calendarInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Calendar info: ").append("\n");
        stringBuilder.append("Id: ").append(id).append("\n");
        stringBuilder.append("Title: ").append(title).append("\n");
        stringBuilder.append("Username: ").append(username).append("\n");
        return stringBuilder.toString();
    }
}