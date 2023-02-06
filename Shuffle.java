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

        for (int val : arr0) {
            System.out.println(val);
        }

        ArrayList<Integer> arr1 = new ArrayList<>();
        for (int i = 0; i < arr0.size(); i++) {
            arr1.add(arr0.get(i));
        }

        ArrayList<Integer> arr2 = arr1;

        System.out.println("arr0 == arr1: " + (arr0 == arr1) + "\narr1 == arr2: " + (arr1 == arr2) + "\narr2 == arr0: "
                + (arr2 == arr0));

        System.out.println("arr0.equals(arr1): " + (arr0.equals(arr1)) + "\narr1.equals(arr2): " + (arr1.equals(arr2))
                + "\narr2.equals(arr0): " + (arr2.equals(arr0)));
    }
}
