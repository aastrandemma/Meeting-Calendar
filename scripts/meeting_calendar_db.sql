CREATE DATABASE meeting_calendar_db;

USE meeting_calendar_db;

CREATE TABLE _user (
username VARCHAR(50) NOT NULL PRIMARY KEY,
_password VARCHAR(50) NOT NULL,
expired TINYINT DEFAULT 0,
create_date DATETIME DEFAULT NOW()
);

CREATE TABLE calendar (
calendar_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
calendar_title VARCHAR(50) NOT NULL,
username VARCHAR(50) NOT NULL, 
FOREIGN KEY(username) REFERENCES _user(username)
);

CREATE TABLE meeting (
meeting_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
title VARCHAR(50) NOT NULL,
start_time DATETIME NOT NULL,
end_time DATETIME NOT NULL,
_description VARCHAR(1000),
calendar_id INT, 
FOREIGN KEY(calendar_id) REFERENCES calendar(calendar_id)
);

CREATE TABLE calendars_meetings (
calendar_meeting_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
calendar_id INT NOT NULL,
meeting_id INT NOT NULL,
FOREIGN KEY(calendar_id) REFERENCES calendar(calendar_id),
FOREIGN KEY(meeting_id) REFERENCES meeting(meeting_id)
);