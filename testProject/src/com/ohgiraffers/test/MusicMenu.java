package com.ohgiraffers.test;

import java.util.Scanner;

public class MusicMenu {

    private MusicManager musicManager = new MusicManager();
    Scanner sc = new Scanner(System.in);
    public void mainMenu() {

        mainMenu:
        while (true) {
            System.out.println("====메뉴=====");
            System.out.println("1. 곡 추가 ");
            System.out.println("2. 곡 조회");
            System.out.println("3. 가수명으로 검색");
            System.out.println("4. 제목으로 검색");
            System.out.println("5. 곡정보 수정");
            System.out.println("6. 곡 삭제");
            System.out.println("0. 프로그램 종료");

            System.out.print("메뉴 선택 : ");
            int menu = sc.nextInt();
            sc.nextInt();

        }


    }
}
