package com.fju;

public class Customer {
    public static void main(String[] args) {
        Homework[] homework = {
                new Homework("0013", 490, 0),
                new Homework("0052", 1000, 100),
                new Homework("0081", 290, 0),
                new Homework("2122", 2000, 200)
        };
        System.out.println("id/sales price/discount/total ");
        for (int i = 0; i < homework.length; i++) {
            homework[i].print();
        }
    }
}
