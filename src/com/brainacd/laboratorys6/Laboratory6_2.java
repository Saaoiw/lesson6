package com.brainacd.laboratorys6;


import java.util.Arrays;

/**
 * Created by Work on 08.09.2016.
 */
public class Laboratory6_2 {
    public static void main(String[] args) {
        int[] m = new int[] { 10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14 };
        int min = Integer.MAX_VALUE, max = m[0];
        int sum = m[0];

        for (int i = 1; i < m.length; i++) {
            sum += m[i];
            if ( m[i] < min) min = m[i];
            if ( m[i] > max) max = m[i];
        }

        Arrays.sort(m);

        System.out.println("Maximum value = " + max);
        System.out.println("Minimum value = " + min);
        System.out.println("Average value = " + (double)sum/m.length);
        System.out.println("Mediane is = " + m[m.length/2] + " on position: m[" + m.length/2 + "]");

    }
}
