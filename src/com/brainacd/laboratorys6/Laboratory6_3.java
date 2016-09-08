package com.brainacd.laboratorys6;

/**
 * Created by Work on 08.09.2016.
 */
public class Laboratory6_3 {
    public static void main(String[] args) {
        int[][] m = new int [4][4];

        for (int i = 0; i < m.length; i++) {
            int feel = i+1;
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = feel;
                System.out.print(m[i][j] + " ");
                feel +=4;
            }
            System.out.println();
        }

    }
}
