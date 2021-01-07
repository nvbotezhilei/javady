package Notebooks;

import Shape.Circle2;

import java.util.Scanner;

public class Notebooks {
    private String[] notebooks = new String[200];
    private int count = 0;
    public int getCount() {
        return count;
    }
    public void addElement(String elm) {
        notebooks[count+1] = elm;
        count++;
    }
    public void addElement(String elm, int index) {
        for (int i = count + 1; i >= index; i-- ) {
            notebooks[i+1] = notebooks[i];
        }
        notebooks[index] = elm;
        count++;
    }

    public String getElement(int index) {
        return notebooks[index];
    }
    public void remove(int index) {
        for(int i = index; i < count; i++) {
            notebooks[i] = notebooks[i+1];
        }
        count--;
    }
    public void show() {
        for(int i = 0; i <= count; i++ ) {
            System.out.println(notebooks[i]);
        }
    }

    public static void main(String[] args) {

    }
}
