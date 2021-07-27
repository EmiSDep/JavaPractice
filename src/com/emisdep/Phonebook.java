package com.emisdep;

import java.util.HashMap;
import java.util.Scanner;
import java.util.;
import java.io.;

public class Phonebook{


    class Solution{
        public void main(String []argh){
            HashMap<String, Integer> phonebookMap = new HashMap<>();

            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            for(int i = 0; i < n; i++){
                String name = in.next();
                int phone = in.nextInt();
                phonebookMap.put(name, phone);

                // Write code here
            }
            while(in.hasNext()){
                String s = in.next();
                // Write code here
                if(phonebookMap.containsKey(s)) {
                    System.out.println(s + "=" + phonebookMap.get(s));
                } else {
                    System.out.println("Not found");
                }
            }
            in.close();
        }
    }
}
