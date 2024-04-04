package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.*;

public class Application1 {
    public static void main(String[] args) {
        /* 수업목표 extends 키워드를 이용하여 특정한 타입만을 사용하도록 제네릭 범위를 제한할 수 있다. */

       // RabbitFarm<Animal> farm1 = new RabbitFarm<Animal>(); // 더 상위에 있는 것은 받을 수 없다.
       // RabbitFarm<Mammal> farm2 = new RabbitFarm<Mammal>(); //
       // RabbitFarm<Snake> farm3 = new RabbitFarm<Snake>();

        RabbitFarm<Rabbit> farm4 = new RabbitFarm<>();
        RabbitFarm<Bunny> farm5 = new RabbitFarm<>();
        RabbitFarm<DrunkenBunny> farm6 = new RabbitFarm<>();

       // farm4.setAnimal(new Snake()); // 올바른 타입의 인스턴스를 전달하지 않았기 때문에 오류 발생

        farm4.setAnimal(new Rabbit());
        ((Rabbit)farm4.getAnimal()).cry();
        farm4.getAnimal().cry(); // 형변환 생략 가능하다.

        farm5.setAnimal(new Bunny());
        farm5.getAnimal().cry();

        farm6.setAnimal(new DrunkenBunny());
        farm6.getAnimal().cry();

    }
}
