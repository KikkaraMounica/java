package com.wipro.java.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjusters;

public class DateTime {
	public static void checkDateAdjusters() {
		// to get Current Date
		LocalDate date = LocalDate.now();
		System.out.println("the Current Date is:" + date);
		// to get Current Date and Time
		LocalDateTime dateAndTime = LocalDateTime.now();
		System.out.println("the Current Date and Time:" + dateAndTime);
		// Get the current time
		LocalTime currentTime = LocalTime.now();

		// Print the current time
		System.out.println("Current time: " + currentTime);
		// to get the firstDay of Next Month
		LocalDate dayOfNextMonth = date.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("firstDayofNextMonth :" + dayOfNextMonth);
		// Get the name of the day (e.g., "Monday", "Tuesday")
		String dayOfWeek = date.getDayOfWeek().toString();
		System.out.println(dayOfWeek);
	}

	public static void main(String[] args) {
		DateTime.checkDateAdjusters();

	}
}