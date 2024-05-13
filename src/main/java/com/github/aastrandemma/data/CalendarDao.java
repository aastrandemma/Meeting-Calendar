package com.github.aastrandemma.data;

import com.github.aastrandemma.model.Calendar;

import java.util.Collection;
import java.util.Optional;

public interface CalendarDao { // CRUD Operation
    // Each user can have multiply calendars
    Calendar createCalendar(String username, String title);
    Optional<Calendar> findCalendarById(int calendarId); // Use optional because id is unique, if not exist, then return null
    Collection<Calendar> findCalendarByUsername(String username);
    Optional<Calendar> findCalendarByTitle(String title);
    boolean deleteCalendar(int calendarId);
}