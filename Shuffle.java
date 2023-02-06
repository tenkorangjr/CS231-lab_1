/*
 * Author: Michael Tenkorang
 * 
 * CS 231 Lab
 */

import java.util.Random;
import java.util.ArrayList;

public class Shuffle {

    public static void main(String[] args) {
        ArrayList<Integer> arr0 = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            int randomNumber = rand.nextInt(100);
            arr0.add(randomNumber);
        }

        System.out.println(arr0);

        ArrayList<Integer> arr1 = new ArrayList<>();
        for (int i = 0; i < arr0.size(); i++) {
            arr1.add(arr0.get(i));
        }

        ArrayList<Integer> arr2 = arr0;

        // for (int val : arr0) {
        // System.out.println(val);
        // }
        // for (int val : arr1) {
        // System.out.println(val);
        // }
        // for (int val : arr2) {
        // System.out.println(val);
        // }

        System.out.println("arr0 == arr1: " + (arr0 == arr1) + "\narr1 == arr2: " +
                (arr1 == arr2) + "\narr2 == arr0: "
                + (arr2 == arr0));

        System.out.println("arr0.equals(arr1): " + (arr0.equals(arr1)) +
                "\narr1.equals(arr2): " + (arr1.equals(arr2))
                + "\narr2.equals(arr0): " + (arr2.equals(arr0)));

        int sentinel = arr0.size();

        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < sentinel; i++) {
            int newRand = rand.nextInt(arr0.size());
            res.add(arr0.get(newRand));
            arr0.remove(newRand);
        }

        System.out.println(arr0.isEmpty());
        System.out.println(res);

    }
}
