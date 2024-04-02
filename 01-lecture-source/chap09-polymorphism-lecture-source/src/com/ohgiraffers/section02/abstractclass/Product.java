package com.ohgiraffers.section02.abstractclass;

public abstract class Product {
    private int nonStaticField;
    private static int staticField;

    public Product(){} // 기본생성자를 가질 수는 있지만 인스턴스를 생성 할 수는 없다.

    public void nonStaticMethod(){
        System.out.println("Product 클래스의 nonStaticMethod 호출함...");
    }
    public static void staticMethod(){
        System.out.println("Product 클래스의 staticMethod 호출함...");
    }
    public abstract void absMethod();
}
