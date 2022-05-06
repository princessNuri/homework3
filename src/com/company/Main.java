package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] numbers = {1.5,6.7,-9.0,-3.7,12.4,4.75,2.55,8.12,5.5,6.12,7.3,1.95,9.34,7.88,3.33};
        double counter = 0;
        double quantityCounter = 0;
        for (double item:numbers) {
            counter+=item;
            quantityCounter++;
            if (item<=0){
                counter=0;
                quantityCounter=0;
                continue;
            }
        }
        System.out.println(counter/ quantityCounter);
        int [] myArray= {2,5,3,1,4};
        System.out.println("//////////////");
        selectionSort(myArray);
    }
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            System.out.println("----------------------");
            int minimumElement = array[i];
            int indexOfMinimumElement = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < minimumElement) {
                    minimumElement = array[j];
                    indexOfMinimumElement = j;
                }
            }
            int temporary = array[i];
            array[i] = minimumElement;
            array[indexOfMinimumElement] = temporary;
        }
        System.out.println("====================");
        System.out.println(Arrays.toString(array));
    }
}
