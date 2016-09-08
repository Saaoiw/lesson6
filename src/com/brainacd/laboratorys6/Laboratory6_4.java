package com.brainacd.laboratorys6;

import java.util.Arrays;

/**
 * Created by Work on 08.09.2016.
 */
public class Laboratory6_4 {
    public static void main(String[] args) {

        int[] m = { 10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14 };

        Arrays.sort(m);

        System.out.println(Arrays.toString(m));

        System.out.println(Arrays.binarySearch(m, 10));
    }
}
