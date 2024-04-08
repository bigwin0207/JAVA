package com.test;

import java.util.Comparator;

public class DescFoodName implements Comparator<FoodDTO> {

    @Override
    public int compare(FoodDTO o1, FoodDTO o2) {
        return o2.getfoodName().compareTo(o1.getGrade());
    }
}
