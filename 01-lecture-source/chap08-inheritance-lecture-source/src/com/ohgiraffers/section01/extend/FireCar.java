package com.ohgiraffers.section01.extend;

public class FireCar extends Car{

    public FireCar(){

        super(); // 생략이 가능하지만 명시적으로 작성해야되는 규칙이 있다.

        System.out.println("FireCar 클래스의 기본 생성장 호출됨");
    }

    @Override
    public void soundHorn() {
        if(isRunning()){

            System.out.println("빠ㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏ빠ㅏㅏㅏㅏㅏ앙");

        }else{
            System.out.println("소방차가 앞으로 갈 수없습니다 비키세요~~~~~~!");
        }
    }

    public void sprayWater(){

        System.out.println("불난 곳을 발견했습니다 물을 뿌립니다. _____---=============");

    }
}
