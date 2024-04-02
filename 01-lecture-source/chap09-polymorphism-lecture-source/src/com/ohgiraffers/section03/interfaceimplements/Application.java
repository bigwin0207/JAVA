package com.ohgiraffers.section03.interfaceimplements;

public class Application {
    public static void main(String[] args) {
        /* 인터페이스(interface)에 대해 이해할 수 있다. */
        /*
        * 인터페이스
        * 여기서 다루게 되는 인터페이스는 자바의 클래스와 유사한 형태지만
        * 추상메소드와 상수 필드만 가질 수 있는 클래스의 변형체를 말한다.
        * */
        //추상클래스와 인터페이스의 차이점 *면접 단골질문
        /*
        * 인터페이스의 사용목적
        * 1. 추상클래스와 비슷하게 필요한 기능들을 공통화해서 강제성을 부여할 목적으로 사용한다.(표준화)
        * 2. 자바의 단일상속의 단점을 극복할 수 있다.(다중 상속 가능)
        * */

        // InterProduct interProduct = new InterProduct(); // 인터페이스는 인스턴스 생성 불가 에러발생

        InterProduct interProduct = new Product();

        interProduct.nonStaticMethod();
        interProduct.absMethod();
        // interProduct.defaultMethod(); //overriding을 안하면 인터페이스의 default 메소드로 호출됨
        InterProduct.staticMethod();

        System.out.println(InterProduct.MAX_NUM);
        System.out.println(InterProduct.MIN_NUM);
    }
}
