package com.ohgiraffers.section02.String;

public class Application2 {
    public static void main(String[] args) {
        /* 문자열 객체를 만드는 다양한 방법을 숙지하고 인스턴스가 생성되는 방식을 이해할 수 있다.
        * 문자열 객체를 만드는 방법
        * "" 리터럴 형태 : 동일한 값을 가지는 인스턴스를 단일 인스턴스로 관리한다.(singleton)
        * new String("문자열") : 매번 새로운 인스턴스를 생성합니다.
        * */

        // 출력 예시
        String str1 = "java";
        String str2 = "java";
        String str3 = new String("java");
        String str4 = new String("java");

        System.out.println("str1 == str2 : " + (str1 == str2)); // 주소값이 같다.

        System.out.println("str2 == str3 : " + (str2 == str3)); // 주소값이 다르다.

        System.out.println("str3 == str4 : " + (str3 == str4)); // 주소값이 다르다.

        /*
        * 동일한 문자열은 동일한 hashCode 를 반환한다.
        * */

        // 출력 예시 (주소값은 다르지만 문자열 값이 똑같기 때문에 동일한 hashCode 를 반환한다.)
        System.out.println("str1.hashCode() = " + str1.hashCode()); //3254818
        System.out.println("str2.hashCode() = " + str2.hashCode()); //3254818
        System.out.println("str3.hashCode() = " + str3.hashCode()); //3254818
        System.out.println("str4.hashCode() = " + str4.hashCode()); //3254818

        // 동일한 인스턴스였지만 문자열 값을 추가해줌으로써 주소값이 달라졌다.
        str1 += "oracle";
        System.out.println("str1 == str2 : " + (str1 == str2)); // 주소값이 다르다.

        System.out.println("문자열 추가해준 str1 = " + str1.hashCode()); //87819808
        /*
        * equals() : String 클래스의 equals()메소드는 인스턴스의 비교가 아니라 문자열 값을 비교하여
        * 동일한 값을 가지면 true, 다른 값을 가지면 false를 가지도록 Object의 equals()메소드를
        * 재정의 해주었다.
        * 따라서 문자열 인스턴스 생성 방식과 상관없이 동일한 문자열을 비교하기 위해서는 == 연산 대신
        * equals() 메소드를 사용해야한다.
        * */

        // 출력예시 (문자열 값을 비교하기 때문에 값이 같으면 true)
        // 문자열 비교를 할 때는 equals() 을 사용한다.
        System.out.println("str2.equals(str3)" + str2.equals(str3)); // true
        System.out.println("str2.equals(str4)" + str2.equals(str4)); // true





    }
}
