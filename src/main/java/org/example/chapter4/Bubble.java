package org.example.chapter4;

import org.w3c.dom.ls.LSOutput;

public class Bubble {

    public void printMass(int[] mas) {
        System.out.println("Вывод массива: ");
        for(int i = 0; i < mas.length; i++) {
            System.out.print(" " + mas[i]);
        }
        System.out.println();
    }

    public void printMass(String[] mas) {
        System.out.println("Вывод массива: ");
        for(int i=0; i < mas.length; i++) {
            if(i != (mas.length - 1)) System.out.print(mas[i] + ", ");
            else System.out.print(mas[i]);
        }
        System.out.println();
    }



    public int[] sortMath(int[] mas) {
        // Реализовать алгоритм пузырьковой сортировки
        int t;
        for (int a = 1; a < mas.length; a++){
            for (int b = mas.length-1; b >= a; b--) {
                if (mas[b-1] > mas[b]) {
                    t = mas[b-1];
                    mas[b-1] = mas[b];
                    mas[b] = t;
                }
            }
        }
        return mas;
    }

    public String[] sortMath(String[] mas) {
        String t;

        for (int a = 1; a < mas.length; a++){
            for (int b = mas.length-1; b >= a; b--) {
                char ch_b_previos = mas[b-1].charAt(0);
                char ch_b = mas[b].charAt(0);


                if (ch_b_previos > ch_b){
                    t = mas[b-1];
                    mas[b-1] = mas[b];
                    mas[b] = t;
                } else if(ch_b_previos == ch_b) {
                    int minSymbolseInElement = mas[b-1].length() < mas[b].length() ? mas[b-1].length() : mas[b].length();
                    for(int i = 1; i < minSymbolseInElement; i++) {
                        ch_b_previos = mas[b-1].charAt(i);
                        ch_b = mas[b].charAt(i);
                        if (ch_b_previos > ch_b){
                            t = mas[b-1];
                            mas[b-1] = mas[b];
                            mas[b] = t;
                            break;
                        } else if (ch_b_previos < ch_b) {
                            break;
                        } else {
                            continue;
                        }

                    }
                }
            }
        }
        return mas;
    }

    public static void main(String args[]) {
        int[] nums = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49 };
        int[] sortNums = new int[nums.length];
        String[] stringMas = {"test", "sort", "glass", "wear", "weara", "lesly"};
        String[] sortStringMas = new String[stringMas.length];

        // Отобразить исходный массив
        Bubble bubbleMass = new Bubble();
        bubbleMass.printMass(nums);

        System.out.print("Отсортированный массив Int: ");
        sortNums = bubbleMass.sortMath(nums);
        bubbleMass.printMass(sortNums);

        // Массив строк
        bubbleMass.printMass(stringMas);
        sortStringMas = bubbleMass.sortMath(stringMas);
        System.out.println();
        System.out.print("Отсортированный массив String: ");
        bubbleMass.printMass(sortStringMas);
    }
}
