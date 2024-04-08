package com.test;

import java.util.ArrayList;
import java.util.List;

public class FoodManager {

    private List<FoodDTO> foodList = new ArrayList<>();

    public void addList(FoodDTO food){
        foodList.add(food);
    }

    public List<FoodDTO> selectList(){
        return foodList;
    }

    public List<FoodDTO> searchFoodName(String foodName){
        List<FoodDTO> searchList = new ArrayList<>();

        for(FoodDTO food : foodList){
            if(food.getfoodName().contains(foodName)){
                searchList.add(food);
            }
        }
        return foodList;
    }

    public List<FoodDTO> searchGrade(String grade){
        List<FoodDTO> searchList = new ArrayList<>();

        for (FoodDTO food : foodList){
            if(food.getGrade().contains(grade)){
                searchList.add(food);
            }
        }
        return foodList;
    }

    public boolean updateFood(FoodDTO updateFood){
        FoodDTO old = null;
        for(int i = 0; i < foodList.size(); i++){
            if(foodList.get(i).getId() == updateFood.getId()){
                old = foodList.set(i,updateFood);
            }
        }
        return old != null;
    }

    public boolean removerFood(int id){
        FoodDTO old = null;
        for(int i = 0; i < foodList.size(); i++){
            if(foodList.get(i).getId() == id){
                old = foodList.remove(i);
            }
        }
        return old != null;
    }


}
