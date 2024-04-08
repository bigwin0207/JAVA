package com.ohgiraffers.section01.file;

import java.io.File;
import java.io.IOException;

public class Application {
    public static void main(String[] args) {


        /*
         * JDK 1.0부터 지원하는 API로 파일 처리를 수행하는 대표적인 클래스이다.
         * 대상 파일에 대한 정보로 인스턴스를 생성하고 파일의 생성, 삭제 등등의
         * 처리를 수행하는 기능을 제공하고 있다.
         * */

        File file = new File("src/com/ohgiraffers/section01/file/text.txt");


        /* 파일 생성 */
        {
            try {
                boolean createSuccess = file.createNewFile(); //생성 시에만 true가 나오고 그 뒤에 실행시 false가 나온다.

                System.out.println("createSuccess = " + createSuccess);
            } catch (IOException e) {

                e.printStackTrace();
            }
        }
        System.out.println("파일의 크기는? : " + file.length() + "byte");
        System.out.println("파일의 경로는? : " + file.getPath()); // getPath 경로확인
        System.out.println("현재 파일의 상위 경로는? : " + file.getParent()); // 상위 경로
        System.out.println("파일의 절대 경로 : " + file.getAbsolutePath()); // 절대 경로

        /* 파일 삭제 */
        boolean deleteSuccess = file.delete();

        System.out.println("deleteSuccess = " + deleteSuccess);



    }


}
