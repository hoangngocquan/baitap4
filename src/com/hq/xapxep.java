package com.hq;

public class xapxep {
    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 6, 1, 3};

        // Sắp xếp mảng theo thứ tự tăng dần bằng thuật toán sắp xếp nổi bọt
        bubbleSort(arr);

        // In ra mảng đã sắp xếp
        for (int num : arr) {
            System.out.println(num);
        }
    }

    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
