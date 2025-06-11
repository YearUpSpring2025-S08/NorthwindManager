package com.pluralsight.ui;

import com.pluralsight.models.Employee;

public class UserInterface {

    private Employee currentEmployee;
    private Console console;

    public UserInterface(){
        this.console = new Console();
    }


    public  void display(){
        System.out.println("Welcome to the Northwind Manager!");
        currentEmployee = loginUser();
        System.out.println("Welcome, " + this.currentEmployee.getFirstName() + "!");


        showHomeMenu();
    }


    private Employee loginUser(){
        String s = console.promptForString("Just hit enter to login as Matt", true);
        Employee e = new Employee(1, "Matt", "Christenson");
        return e;
    }

    private void showHomeMenu(){
        System.out.println("Home Menu here");
    }
}
