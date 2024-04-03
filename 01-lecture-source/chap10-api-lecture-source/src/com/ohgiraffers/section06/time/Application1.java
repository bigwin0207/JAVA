package com.ohgiraffers.section06.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Application1 {

	public static void main(String[] args) {

		/* 수업목표. time 패키지에서 제공하는 클래스들의 사용 용법을 이해할 수 있다. */
		/*
		 *  time 패키지는 JDK 1.8에서 추가된 기능이다.
		 *  Date, Calendar가 가지고 있는 단점을 해소하기 위해서 탄생되었다.
		 *  time 패키지의 하위 패키지
		 *  java.time
		 *   ㄴjava.time.chrono : ISO-8601에 정의된 달력 시스템을 위한 클래스들을 제공한다.
		 *   ㄴjava.time.format : 날짜와 시간 파싱과 형식에 대한 클래스 제공
		 *   ㄴjava.time.temporal : 날짜와 시간 필드와 단위 관련 클래스 제공
		 *   ㄴjava.time.zone : 시간대에 관련된 기능 제공
		 *   LocalTime, LocalDate, LocalDateTime, ZonedDateTime 클래스들이 있다.
		 * */

		LocalTime timeNow = LocalTime.now();
		LocalTime timeOf = LocalTime.of(18, 30, 0);
		
		System.out.println("timeNow : " + timeNow); //현재시간 출력
		System.out.println("timeOf : " + timeOf); // 위에서 18,30,0 으로 대입했기 때문에 18:30 출력
		
		LocalDate dateNow = LocalDate.now();
		LocalDate dateOf = LocalDate.of(2023, 1, 19);
		
		System.out.println("dateNow : " + dateNow); // 오늘 날짜 출력
		System.out.println("dateOf : " + dateOf); // 위에서 2023,1,19 로 대입했기 때문에 2023-01-19 출력
		
		LocalDateTime dateTimeNow = LocalDateTime.now();
		LocalDateTime dateTimeOf = LocalDateTime.of(dateNow, timeNow);
		
		System.out.println("dateTimeNow : " + dateTimeNow); // 현재날짜와 시간이  'YYYY-MM-DDTHH:mm:ss.sss' 형식으로 출력 sss는  나노초
		System.out.println("dateTimeOf : " + dateTimeOf); // 위와 같다.
		
		ZonedDateTime zonedDateTimeNow = ZonedDateTime.now();
		ZonedDateTime zonedDateTimeOf = ZonedDateTime.of(dateOf, timeOf, ZoneId.of("Asia/Seoul"));
		
		System.out.println("zonedDateTimeNow : " + zonedDateTimeNow); //2024-04-03T16:45:53.044991200+09:00[Asia/Seoul] 시차와 지역까지 호출
		System.out.println("zonedDateTimeOf : " + zonedDateTimeOf); // (dateOf, timeOf, ZoneId.of("Asia/Seoul")); 설정값대로 나노초 빼고 호출된다.
	}
}
