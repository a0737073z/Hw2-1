package com.example.hw2new.service;

import com.example.hw2new.model.Meal;

import java.util.ArrayList;
import java.util.List;

public class MealList {
    List<Meal> mealList;
    public MealList(){
        this.mealList = new ArrayList<>();
        mealList.add(new Meal("Joe",10,"帥哥"));
        mealList.add(new Meal("Joe1",20,"還是帥哥"));
    }
}
