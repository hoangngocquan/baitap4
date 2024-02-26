package com.hq;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        // Xuất giá trị mảng
        //  Sử dụng vòng lặp for
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Giá trị min: " + min);
        System.out.println("Giá trị max: " + max);

        // tim so nguyen to


    }
}
