package com.ohgiraffers.section02.extend;

public class WildCardFarm {
    /* 매개변수로 전달받는 토끼농장을 구현할 때 사용한 타입 변수에 대해 제한할 수 있다.*/

    public void anyType(RabbitFarm<?> farm){ // 토끼농장에 있는 토끼가 어느 타입이든 상관없다.
        farm.getAnimal().cry();
    }

    public void extendsType(RabbitFarm<? extends Bunny> farm){
        farm.getAnimal().cry();
    }

    public void superType(RabbitFarm<? super Bunny> farm){

        farm.getAnimal().cry();
    }

}
