package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int step = sc.nextInt();
        int j = 0; // 공백 개수를 제어하는 변수

        for (int line = step; line >= 1; line--) { // 입력 받은 수만큼 반복

            for (int n = 0; n <= j; n++){ // 공백 출력 반복문
                System.out.print(" ");
            }
            j++;

            for (int decNum = line; decNum >= 1; decNum--) { // 숫자 출력 반복문
                System.out.print(decNum + " ");
            }
            System.out.println(""); // 개행을 위한 출력
        }
    }
}