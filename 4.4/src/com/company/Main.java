package com.company;



import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        while (!s.nextLine().equals("stop")){
            list.add(s.nextLine());
        }
        list.sort(String::compareTo);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
