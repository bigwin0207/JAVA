package com.test;

import java.util.Comparator;

public class DescGrade implements Comparator<FoodDTO> {

    @Override
    public int compare(FoodDTO o1, FoodDTO o2) {
        return o2.getfoodName().compareTo(o2.getGrade());
    }
}
