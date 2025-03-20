package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int next = 1;
        int now = 0;
        int temp;

        for(int i = 0; i < 10; i++){
            System.out.println(now);
            temp = now;
            now = now + next;
            next = temp;
        }
    }
}