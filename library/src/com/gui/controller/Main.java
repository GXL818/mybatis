package com.gui.controller;
 

public class Main {
    public static void main(String[] args) {
        //一个银行and多个客户
        Bank bank = new Bank();
        int time = 10;
        int money = 100;
        //这个客户存钱
        Customer c1 = new Customer(bank, Customer.TYPE_ADD, time, money);
        //这个客户取钱
        Customer c2 = new Customer(bank, Customer.TYPE_REDUCE, time, money);
 
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        t1.start();
        t2.start();
    }
}