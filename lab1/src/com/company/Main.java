package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Scanner in = new Scanner(System.in);
        System.out.print("Input a : ");
        int a = in.nextInt();
        System.out.print("Input b : ");
        int b = in.nextInt();
        System.out.print("Input n : ");
        int n = in.nextInt();
        System.out.print("Input m : ");
        int m = in.nextInt();
        float S = 0;
        int c = 1;

        if (a <= c && c <= n || b <= 0 && m >= 0) {
            System.out.println("Division by Zero :(");
            return;
        }

        for (char i = (char) a; i <= n; i++) {
            for (char j = (char) b; j <= m; j++) {
                S += (float) (i % j) / (i - c);
            }
        }
        System.out.println("S=" + S);

    }
}
