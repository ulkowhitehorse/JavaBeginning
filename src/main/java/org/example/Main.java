package org.example;

import org.example.chapter3.*;

import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        int[] numbers = {0, -1, 4, 9, 5, 0, -1};
        Bubble2 bub = new Bubble2(numbers);

        System.out.print("Исходный массив: ");
        for(int i=0; i < numbers.length; i++) {
            if (i == numbers.length - 1) {
                System.out.print(numbers[i]);
                continue;
            }
            System.out.print(numbers[i] + ", ");
        }
        System.out.println("\n");

        int[] sortMass = bub.sortUp();
        System.out.print("Отсортированный массив: ");
        for(int i=0; i < sortMass.length; i++) {
            if (i == sortMass.length - 1) {
                System.out.print(sortMass[i]);
                continue;
            }
            System.out.print(sortMass[i] + ", ");
        }
        System.out.println("\n");
    }
}

class Bubble2 {
    private int[] num;

    public Bubble2(int[] numbers) {
        num = numbers;
    }

    public int[] getNum() {
        return num;
    }

    public int[] sortUp() {
        for(int i=0; i < num.length; i++) {
            for (int j=0; j < num.length - 1; j++) {
                int t = num[j];
                if(num[j+1] < t) {
                    num[j] = num[j+1];
                    num[j+1] = t;
                }
            }

        }

        return num;
    }

}