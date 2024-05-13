package com.github.aastrandemma.data;

import com.github.aastrandemma.model.Meeting;

import java.util.Collection;
import java.util.Optional;

public interface MeetingDao {
    Meeting createMeeting(Meeting meeting);
    Optional<Meeting> findMeetingById(int meetingId);
    Collection<Meeting> findAllMeetingsByCalendarId(int calendarId);
    boolean deleteMeeting(int meetingId);
}