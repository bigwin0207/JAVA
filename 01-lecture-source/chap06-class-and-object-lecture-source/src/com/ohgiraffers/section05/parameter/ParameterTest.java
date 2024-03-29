package com.ohgiraffers.section05.parameter;

public class ParameterTest {
    
    public void testPrimaryType(int num){
        System.out.println("매개변수로 전달 받은 값 = " + num);
        
    }

    public void testPrimaryTypeArray(int[] iarr){

        System.out.println("매개변수로 전달 받은 값 = " + iarr);

        System.out.print("배열의 값 출력 : ");
        for(int i = 0; i<iarr.length; i++){
            System.out.print(iarr[i] + " ");
        }
        System.out.println();

        iarr[0] = 99;

        System.out.print("변경된 배열의 값 출력 : ");
        for(int i = 0; i<iarr.length; i++){
            System.out.print(iarr[i] + " ");
        }
        System.out.println();

    }


    
    
}
