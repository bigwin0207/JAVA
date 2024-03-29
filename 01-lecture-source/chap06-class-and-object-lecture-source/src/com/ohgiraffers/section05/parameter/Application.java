package com.ohgiraffers.section05.parameter;

public class Application {
    public static void main(String[] args) {
        /* 메소드의 파라미터에 대해 이해하고 사용할 수 있다.*/

        /*
        * 매개변수(parameter)로 사용 가능한 자료형
        * 1. 기본자료형
        * 2. 기본자료형 배열
        * 3. 클래스자료형
        * 4. 클래스자료형 배열
        * 5. 가변인자
        * */

        /*인스턴스 생성*/
        ParameterTest pt = new ParameterTest();

        /* 1. 기본자료형을 매개변수로 전달받는 메소드 호출확인 */
        int num = 10;
        pt.testPrimaryType(num);

        /* 2. 기본자료형 배열을 매개변수로 전달받는 메소드 호출 확인*/

        int[] iarr = new int[] {1, 2, 3, 3, 5};

        System.out.println("인자로 전달하는 값=" + iarr);
        pt.testPrimaryTypeArray(iarr);

        System.out.print("변경된 원본 배열의 값 출력 : ");
        for(int i = 0; i<iarr.length; i++){
            System.out.print(iarr[i] + " ");
        }
        System.out.println();

    }
}
