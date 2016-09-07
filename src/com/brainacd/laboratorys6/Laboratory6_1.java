package com.brainacd.laboratorys6;



/**
 * Created by Таня on 06.09.2016.
 */
public class Laboratory6_1 {
    public static void main(String[] args) {
        int arr[] = new int[16];
        int start = 2;
        for (int i = 0 ; i <= 30; i++) {
            arr[i] = start;
            System.out.println(arr[i]);
            start += 2;
            if (start > 30) break;
        }

    }
}

