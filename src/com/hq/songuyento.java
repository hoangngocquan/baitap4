package com.hq;

public class songuyento {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 6, 5, 4, 7, 10, 9, 8};
        int[] primeNumbers = new int[arr.length];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                primeNumbers[count++] = arr[i];
            }
        }

        // In ra các số nguyên tố
        for (int i = 0; i < count; i++) {
            System.out.println(primeNumbers[i]);
        }
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
