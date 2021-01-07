package Products;

import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

public class Product {
    private int number;
    private int stock;
    private String name;
    public Product(int number, int stock, String name) {
        this.number = number;
        this.stock = stock;
        this.name = name;
    }
    public void sellOne() {
        stock--;
    }
    public void increaseQuantity(int count) {
        stock += count;
    }
    public int getNumber() {
        return number;
    }
    public String getName() {
        return name;
    }
    public int getStock() {
        return stock;
    }
    public void toStringAll() {
        System.out.println("ID :" + number);
        System.out.println("产品名 :" + name);
        System.out.println("当前库存 :" + stock);
    }
}

