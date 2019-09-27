package com.company;

import java.util.Arrays;

public class Tablica {
    public static void main (String [] args)    {
        int [] table = new int [10];

        for (int i = 0; i <table.length; i++){

            if (i % 2 == 1) {
                table[i] = i;
            }else {
                table [i] = i + 1;
            }
        }
        System.out.println(Arrays.toString(table));
    }
}
