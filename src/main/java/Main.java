package main.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        findPerfectCap();
        findPerfectNumbers();
    }

    public static int findPerfectCap() {
        System.out.println("Perfect Numbers between 1 and 200");
        for (int num =1; num <= 200; num++) {
            int sum = 0;
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }
            if (sum == num) {
                System.out.println(num + " is a perfect number");
            }
        }
        return 0;
    }

    public static int findPerfectNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to find perfect numbers up to that number");
        int num = scanner.nextInt();
        if (num < 1) {
            System.out.println("Invalid number");
            return 0;
        }
        System.out.println("Perfect Numbers between 1 and " + num);
        for (int i = 1; i <= num; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i) {
                System.out.println(i);
            }
            scanner.close();
        }
        return 0;
    }
}
