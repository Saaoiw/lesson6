package com.brainacd.laboratorys6;

/**
 * Created by Work on 08.09.2016.
 */
public class Laboratory6_2 {
    public static void main(String[] args) {
        int[] m = new int[] { 10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14 };
        int min = m[0];
        int max = m[0];
        int sum = m[0];

        for (int i = 1; i < m.length; i++) {
            sum += m[i];
            if ( m[i] < min) min = m[i];
            if ( m[i] > max) max = m[i];
        }

        System.out.println("Maximum value = " + max);
        System.out.println("Minimum value = " + min);
        System.out.println("Average value = " + (double)sum/m.length);

    }
}
