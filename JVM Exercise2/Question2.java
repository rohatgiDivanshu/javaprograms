package com.exercise.second;

public class Question2 {


    public static void sortString(String inputString) {

        char[] chArray = inputString.toCharArray();
        char temp = 0;

        for (int i = 0; i < chArray.length; i++) {

            for (int j = 0; j < chArray.length; j++) {

                if (chArray[j] > chArray[i]) {

                    temp = chArray[i];
                    chArray[i] = chArray[j];
                    chArray[j] = temp;
                }
            }
        }

        for (int k = 0; k < chArray.length; k++) {
            System.out.println(chArray[k]);
        }

    }

    public static void main(String[] args) {

        sortString("bcdae");

    }
}
