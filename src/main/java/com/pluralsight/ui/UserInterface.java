package com.pluralsight.ui;

import com.pluralsight.models.Employee;

public class UserInterface {

    private Employee currentEmployee;

    public  void display(){
        System.out.println("Welcome to the Northwind Manager!");
        currentEmployee = loginUser();

    }


    private Employee loginUser(){

    }
}
