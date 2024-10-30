package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String file = "/home/prog/Desktop/parsing.xlsx";
        int in = scanner.nextInt();

        Exc t = new Exc();
        t.Excel(file,in);
    }
}