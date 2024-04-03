package com.ohgiraffers.section06.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Application5 {

	public static void main(String[] args) {

		/* 수업목표. time 패키지의 클래스들에 포매팅을 적용하여 출력할 수 있다. */
		String timeNow = "14:05:10";
		String dateNow = "2022-10-12";

		LocalTime localTime = LocalTime.parse(timeNow);
		LocalDate localDate = LocalDate.parse(dateNow);
		LocalDateTime localDateTime = LocalDateTime.parse(dateNow + "T" + timeNow);

		System.out.println(localTime); //14:05:10
		System.out.println(localDate); //2022-10-12
		System.out.println(localDateTime); //2022-10-12T14:05:10

		String timeNow2 = "14-05-10";
		String dateNow2 = "221005";

		LocalTime localTime2 = LocalTime.parse(timeNow2, DateTimeFormatter.ofPattern("HH-mm-ss"));
		LocalDate localDate2 = LocalDate.parse(dateNow2, DateTimeFormatter.ofPattern("yyMMdd"));

		System.out.println(localTime2); //14:05:10
		System.out.println(localDate2); //2022-10-05

		String dateFormat = localDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		String timeFormat = localTime.format(DateTimeFormatter.ofPattern("HH mm"));

		System.out.println(dateFormat); //2022-10-12
		System.out.println(timeFormat); //14 05
	}
}
