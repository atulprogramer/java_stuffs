package com.adanave.collections;

import java.util.*;
import java.io.*;

public class Solution {

    public static void main(String[] argh) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            // formula a+ b
            // int c = a;
            for (int j = 0; j < n; j++) {
                a = (int) (a + Math.pow(2, j) * b);
                System.out.printf("%s ", a);
            }
            System.out.println();
        }


        in.close();
    }
}
