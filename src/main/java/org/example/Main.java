package org.example;

import org.example.chapter3.*;

import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        int x = 10;
        int y;
//        if (x < 0) y = 10;
//        else y = 20;
        y = x < 0 ? 10: 20;

        System.out.println("y = " + y);
    }
}