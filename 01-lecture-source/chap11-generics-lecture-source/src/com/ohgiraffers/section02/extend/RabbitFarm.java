package com.ohgiraffers.section02.extend;
//public class RabbitFarm <T implements Animal>{} // 에러발생
//public class RabbitFarm <T extends Animal>{ //정상}

//public class RabbitFarm <T extends Rabbit>{
//public class RabbitFarm <T extends Rabbit & Animal>{ // 클래스 & 인터페이스 (클래스가 무조건 앞으로 와야한다.)
//public class RabbitFarm <T extends Rabbit & Animal>{ // 클래스 & 클래스는 불가능
//public class RabbitFarm <T extends Rabbit , Animal>{ // 클래스,클래스는 가능하지만 타입변수로 본다.
public class RabbitFarm <T extends Rabbit> {

    private T animal;

    public RabbitFarm(){}

    public RabbitFarm(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}
