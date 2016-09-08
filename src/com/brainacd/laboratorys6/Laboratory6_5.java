package com.brainacd.laboratorys6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Work on 08.09.2016.
 */
public class Laboratory6_5 {
    public static void main(String[] args) throws Exception {
        int[][] arr = { { 1, 1, 1, 3, 4 },
                        { 2, 1, 3, 1, 2 },
                        { 2, 2, 3, 4, 1 },
                        { 3, 3, 3, 1, 4 } };

        System.out.println("What we are finding:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == num) {
                    System.out.println("[" + i + ", " + j + "]");
                    x++;
                }
            }
        }
    }
}
