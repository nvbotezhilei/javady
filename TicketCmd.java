package TicketMachine;

import java.util.Scanner;

public class TicketCmd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TicketMachine ticketMachine = new TicketMachine();
        boolean flag1 = true;
        boolean flag2 = true;
        while (flag1) {
            if (flag2) {
                System.out.println("欢迎使用本自动售票机");
            }
            System.out.println("请选择服务：");
            System.out.println("1 投币");
            System.out.println("2 选择车票");
            System.out.println("3 打印车票");
            System.out.println("4 退出");
            System.out.println("5 重启");
            flag2 = false;
            switch (in.nextInt()) {
                case 1 :
                    ticketMachine.insertMoney(in.nextInt());
                    ticketMachine.getBalance();
                    break;
                case 2 :
                    ticketMachine.setPrice(in.nextInt());break;
                case 3 :
                    System.out.println("请输入票数");
                    ticketMachine.printTicket(in.nextInt());
                    ticketMachine.getBalance();
                    break;
                case 4 : ticketMachine.refund();
                    System.out.println("==================================");
                    flag2 = true;
                    break;
                case 5 :
                    ticketMachine.getTotal();flag1 = false;in.close();break;
            }


        }
    }
}
