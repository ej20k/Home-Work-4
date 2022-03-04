package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String currentAnswer = "";
        String userWords = "";
        int tracker = 0;

        while (!currentAnswer.equals("stop")){
            currentAnswer = s.nextLine();
            userWords += currentAnswer + " ";

            if (tracker % 2 != 0) {
                userWords += "stop";
            }


        }

        System.out.println(userWords);
    }
}
