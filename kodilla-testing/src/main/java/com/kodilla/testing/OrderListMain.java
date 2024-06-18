package com.kodilla.testing;

import java.util.LinkedHashSet;
import java.util.Set;

public class OrderListMain {

    public static void main(String[] args) {

        Set<Integer> ordersList = new LinkedHashSet<Integer>();
        int checkingList = 5;

        ordersList.add(1);
        ordersList.add(2);
        ordersList.add(3);
        ordersList.add(4);
        ordersList.add(3);

        System.out.println("Orders list: " + ordersList);

        if (ordersList.contains(checkingList)) {
            System.out.println("Order number: " + checkingList + " is on the list");
        } else{
            System.out.println("Order number: " + checkingList + " not found");
        }
    }
}
