package com.ohgiraffers.section06.time;

import java.time.LocalDateTime;

public class Application3 {

	public static void main(String[] args) {

		/* 수업목표. time 패키지의 클래스의 불변 특성을 이해할 수 있다. */
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime); //현재날짜와 시간 24시 기준시간 나노초까지 출력
		System.out.println(localDateTime.hashCode()); // 현재시간이 계속 변해가므로 주소값도 계속 변한다.
		
		LocalDateTime localDateTime2 = localDateTime.plusMinutes(30);
		System.out.println(localDateTime2); // 현재시간에서 30분을 더한 시간을 DateTime과 같은 식으로 호출된다.
		System.out.println(localDateTime2.hashCode()); // 현재시간이 계속 변해가므로 주소값도 계속 변한다.
		
		System.out.println(localDateTime == localDateTime2); // 30분이 차이나므로 둘의 주소값은 틀리다.
		
		LocalDateTime localDateTime3 = localDateTime.minusHours(3);
		System.out.println(localDateTime3); // 현재시간에서 3시간을 뺸 시간이 호출된다. (나노초까지)
	}
}
