package com.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class FoodMenu {

    private FoodManager fm = new FoodManager();
    Scanner sc = new Scanner(System.in);

    public void mainMenu(){
        mainMenu:
        while(true){
            System.out.println("======메뉴판======");
            System.out.println("1. 메뉴 추가 ");
            System.out.println("2. 메뉴 전체 조회 ");
            System.out.println("3. 정렬하여 조회 ");
            System.out.println("4. 음식명으로 검색 ");
            System.out.println("5. 평가로 검색 ");
            System.out.println("6. 메뉴 정보 수정 ");
            System.out.println("7. 메뉴 삭제 ");
            System.out.println("0. 프로그램 종료 ");

            System.out.print("메뉴판 선택 : ");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    addList();
                    break;
                case 2:
                    selectList();
                    break;
                case 3:
                    sortMenu();
                    break;
                case 4:
                    searchFoodName();
                    break;
                case 5:
                    searchGrade();
                    break;
                case 6:
                    updateFood();
                    break;
                case 7:
                    removeFood();
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    break mainMenu;
                default:
                    System.out.println("잘못 선택하셨습니다. 번호를 다시 입력해주세요.");
                    break;
            }
        }
    }

    public void addList(){
        System.out.println("====메뉴추가====");
        System.out.print("메뉴 입력 : ");
        String foodName = sc.nextLine();
        System.out.print("평가 입력 : ");
        String grade = sc.nextLine();

        fm.addList(new FoodDTO(foodName, grade));

    }
    public void selectList(){
        System.out.println("==메뉴 전체 조회==");
        List<FoodDTO> foodList = fm.selectList();

        if(!foodList.isEmpty()){
            for(FoodDTO food : foodList) {
                System.out.println(food);
            }
        }else{
            System.out.println("메뉴가 존재하지 않습니다.");
        }

    }

    public void sortMenu() {
        System.out.println("===== 정렬 메뉴 =====");
        System.out.println("1. 음식명 오름차순 정렬");
        System.out.println("2. 평가 오름차순 정렬");
        System.out.println("3. 음식명 내림차순 정렬");
        System.out.println("4. 평가 내림차순 정렬");
        System.out.print("메뉴 선택 : ");
        int menu = sc.nextInt();

        ascDesc(menu);
    }

    public void ascDesc(int menu){
        System.out.println("====정렬하여 조회=====");
        List<FoodDTO> foodList = fm.selectList();

        if(foodList.isEmpty()){
            System.out.println("목록이 존재하지 않습니다.");
            return;
        }
        List<FoodDTO> sortList = new ArrayList<>();
        sortList.addAll(foodList);

        if (menu == 1) {

            sortList.sort(new Comparator<FoodDTO>() {

                @Override
                public int compare(FoodDTO o1, FoodDTO o2) {
                    return o1.getfoodName().compareTo(o2.getGrade());
                }

            });
        } else if (menu == 2) {

            sortList.sort(new AscFoodName());
        } else if (menu == 3) {
            sortList.sort(new DescGrade());
        } else {
            sortList.sort(new DescFoodName());
        }

        for (int i = 0; i < sortList.size(); i++) {
            System.out.println(sortList.get(i));
        }

    }

    public void searchFoodName() {
        System.out.println("===== 음식명으로 검색 =====");
        System.out.print("음식명 입력 : ");
        List<FoodDTO> searchList = fm.searchFoodName(sc.nextLine());

        if (!searchList.isEmpty()) {
            for (int i = 0; i < searchList.size(); i++) {
                System.out.println(searchList.get(i));
            }
        } else {
            System.out.println("검색 결과가 없습니다.");
        }
    }

    public void searchGrade() {
        System.out.println("===== 평가로 검색 =====");
        System.out.print("평가 입력 : ");
        List<FoodDTO> searchList = fm.searchGrade(sc.nextLine());

        if (!searchList.isEmpty()) {
            for (int i = 0; i < searchList.size(); i++) {
                System.out.println(searchList.get(i));
            }
        } else {
            System.out.println("검색 결과가 없습니다.");
        }
    }


    public void updateFood() {
        System.out.println("===== 메뉴 정보 수정=====");
        System.out.print("수정할 메뉴의 id : ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("수정할 음식명 : ");
        String updateFoodName = sc.nextLine();
        System.out.print("수정할 평가 : ");
        String updateGrade = sc.nextLine();

        FoodDTO updateFood = new FoodDTO(id, updateFoodName, updateGrade );

        if (fm.updateFood(updateFood)){
            System.out.println("성공적으로 수정되었습니다.");
        } else {
            System.out.println("수정할 메뉴를 찾지 못했습니다.");
        }
    }

    public void removeFood() {
        System.out.println("===== 메뉴 =====");
        System.out.print("삭제할 메뉴의 id : ");
        if (fm.removerFood(sc.nextInt())) {
            System.out.println("성공적으로 삭제 되었습니다.");
        } else {
            System.out.println("삭제할 메뉴를 찾지 못했습니다.");
        }
        sc.nextLine();
    }







}

