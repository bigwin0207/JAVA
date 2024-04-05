package com.ohgiraffers.section04.override;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SubClass extends SuperClass{

    /*@Override
    public void method(){} *///예외 없이 오버라이딩 가능

    /* 같은 예외를 던져주는 구문으로 오버라이딩 해야한다. */
    /*@Override
     public void method() throws IOException{}*/


    /* 부모의 예외처리 클래스보다 상위 예외를 오버라이딩 할 수 없다. */ // Exception{}은 IOException{} 보다 상위
    /*@Override
    public void method() throws Exception{}*/


    /* 부모의 예외처리보다 하위 예외인 경우 오버라이딩 할 수 있다.*/
    @Override
    public void method() throws FileNotFoundException {}

}
