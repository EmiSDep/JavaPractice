package com.emisdep;

import java.util.*;

public class UtopianTree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        for(int i = 0; i < cases; i++) {
            int height = 1;
            int cycles = scanner.nextInt();
            for(int j = 1; j <= cycles; j++) {
                if(j % 2 == 1){
                    height *= 2;
                } else {
                    height++;
                }
            }
            System.out.println(height);


        }

    }
}