/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.company.genericsgreaternumber;

/**
 *
 * @author kamau
 */
public class GenericsGreaterNumber {

    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;

    }

    public static void main(String[] args) {
        System.out.printf("Max of %d, %d and %d is %d\n\n" ,
                2,3,4, maximum(2,3,4));
        System.out.printf("Max of %.1f,%.1f and %.1f is %.1f\n\n" ,
                0.1,0.3,0.2, maximum(0.1,0.3,0.2));
        
        

    }
}
