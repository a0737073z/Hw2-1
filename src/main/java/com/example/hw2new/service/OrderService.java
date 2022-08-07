package com.example.hw2new.service;

import com.example.hw2new.model.Meal;
import com.example.hw2new.model.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    private List<Order> orderList;
    public OrderService(){
        List<Meal> mealList = new ArrayList<>();
        mealList.add(new Meal("Joe",10,"帥哥"));
        mealList.add(new Meal("Joe1",20,"還是帥哥"));
        List<Meal> mealList1 = new ArrayList<>();
        mealList1.add(new Meal("Joe",10,"帥哥"));
        mealList1.add(new Meal("Joe1",20,"還是帥哥"));

        this.orderList = new ArrayList<>();
        this.orderList.add(new Order(1,100,"so rich",mealList));
        this.orderList.add(new Order(2,200,"very rich",mealList1));


    }
    public List<Order> getAllUsers() {

        return this.orderList;
    }

    public Order getOrderMyId(int seq) {
        for(Order order : this.orderList){
            if(seq == order.getSeq()){
                return order;
            }
        }
        return null;
    }

    public Order createOrder(Order order) {
        this.orderList.add(order);
        return order;
    }

    public Order updateOrder(int seq, Order order) {
        for(Order updateOrder : this.orderList){
            if(seq == updateOrder.getSeq()){
                updateOrder.setTotalPrice(order.getTotalPrice());
                updateOrder.setWaiter(order.getWaiter());
                updateOrder.setMealList(order.getMealList());
                return updateOrder;
            }
        }
        return null;
    }

    public Order deleteOrder(int seq) {
        for(Order deleteOrder : this.orderList){
            if(seq == deleteOrder.getSeq()){
                this.orderList.remove(deleteOrder);
                return deleteOrder;
            }
        }
        return null;
    }

}
