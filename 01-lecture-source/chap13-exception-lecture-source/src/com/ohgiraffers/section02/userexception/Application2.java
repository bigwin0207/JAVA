package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application2 {
    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();
        /* 멀티 블럭 */
        try {
            et.checkEnoughMoney(20000,30000);
            //et.checkEnoughMoney(-30000,50000);
            //et.checkEnoughMoney(50000,-60000);
            //et.checkEnoughMoney(50000,30000);
            System.out.println("정상동작 확인...");
        } catch (NotEnoughMoneyException e) {
            System.out.println("NotEnoughMoneyException 발생!!!");
            System.out.println(e.getMessage());
            throw new RuntimeException(e);

        }catch (PriceNegativeException e) {
            System.out.println("PriceNegativeException 발생!!!");
            System.out.println(e.getMessage());
            e.printStackTrace();

        } catch (MoneyNegativeException e) {
            System.out.println("MoneyNegativeException 발생!!!");
            System.out.println(e.getMessage());
            throw new RuntimeException(e);

        } finally{
            /* 예외 발생 여부와 상관없이 실행 */
            System.out.println("finally 블럭 내용이 동작함.");
        }

        System.out.println("프로그램을 종료합니다.");
    }
}
