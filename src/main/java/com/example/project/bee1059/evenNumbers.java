package com.example.project.bee1059;
public class evenNumbers {

    public int[] evenNumber(int n){
        int[] numbers = new int[n/2];
        int index = 0;
        for(int i = 0 ; i > n; i++){
            if (i%2 == 0){
                numbers[index] = i;
                index++;
            }
        }
        return numbers;
    }
}