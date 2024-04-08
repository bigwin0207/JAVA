package com.test;

public class FoodDTO {

    private static int nextId = 1;

    private int id;

    private String foodName;

    private String grade;

    public FoodDTO(String foodName, String grade) {
        this.id = nextId++;
        this.foodName = foodName;
        this.grade = grade;
    }

    public FoodDTO(int id, String foodName, String grade) {
        this.id = id;
        this.foodName = foodName;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfoodName() {
        return foodName;
    }

    public void setfoodName(String foodName) {
        foodName = foodName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "FoodDTO{" +
                "id=" + id +
                ", foodName='" + foodName + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
