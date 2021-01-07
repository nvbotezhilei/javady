package TicketMachine;

import java.util.Scanner;
public class TicketMachine {
    private int price;
    private int balance;
    private int total;

    public void setPrice(int price) {
        this.price = price;
        System.out.println("您选择的是票额为 " + price + " 元的车票");
    }

    public void insertMoney( int money) {
        boolean flag = true;
        Scanner in = new Scanner(System.in);
        while (flag) {
            if (money >= 0) {
                balance += money;
                System.out.println("请稍后！");
                flag = false;
            }else {
                System.out.println("ERROR ,请重试！");
                money = in.nextInt();
            }
        }
    }

    public void getBalance() {
        System.out.println("您的余额为: " + balance );
    }

    public void printTicket(int piece) {
        boolean flag = true;
        int i = 0;
        Scanner in = new Scanner(System.in);
        while (flag && i < piece) {
            if(balance >= price) {
                System.out.println("--------------------");
                System.out.println("Your ticket is here");
                System.out.println("--------------------");
                i++;
                total += price;
                balance = balance - price;
            }else {
                System.out.println("余额不足，选择请投币或退出");
                switch (in.nextInt()) {
                    case 1 :
                        insertMoney(in.nextInt());
                        break;
                    case 4 :
                        flag = false;
                }
            }
        }
    }

    public void refund() {
        if(balance > 0) {
            System.out.println("Here you are : " + balance);
            System.out.println("谢谢惠顾！");
        }else {
            System.out.println("谢谢惠顾！");
        }

    }

    public void getTotal() {
        System.out.println("今天的营业总额：" + total);
        total = 0;
    }



}

