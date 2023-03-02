package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Logger logger = Logger.getInstance();

        Scanner sc = new Scanner(System.in);

        logger.log("Download the program...");
        logger.log("We ask the user to enter the input data.");
        System.out.println("Input the size of the list and press \"enter\"");
        int n = sc.nextInt();
        System.out.println("Input the threshold for the values and press \"enter\"");
        int m = sc.nextInt();
        logger.log("Creating the list...");

        ArrayList<Integer> myList = createList(n, m);
        System.out.println("Our list is " + myList);
        logger.log("We ask the user to enter the input data for filtering");
        System.out.println("Input the threshold for the filter and press \"enter\"");
        Filter filter = new Filter(sc.nextInt());

        System.out.println("Our filtered list is " + filter.filterOut(myList));
        logger.log("Program is over");

        sc.close();
    }

    private static ArrayList<Integer> createList(int n, int m) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(m));
        }
        return list;
    }
}
