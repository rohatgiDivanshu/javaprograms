package com.bootcamp.demo;

public class Question6 {


    static int numberOccuringOnce(int arr[] , int arr_size){

        int result = arr[0];
        for(int i = 1; i < arr_size; i++){
            result = result ^ arr[i];
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr_num = new int[]{3,5,2,4,2,3,4};
        int sizeOfArr = arr_num.length;

        System.out.println("Number occuring twice is :"+numberOccuringOnce(arr_num,sizeOfArr));

    }

}
