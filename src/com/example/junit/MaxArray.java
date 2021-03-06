package com.example.junit;

public class MaxArray {
    public static void main(String[] args){
        int[] arr = {5,5,3,4,5};
        int reqLength = 3;
        System.out.println("最大子数组和为："+maxArr(arr,reqLength));
    }
    static int maxArr(int[] arr, int reqLength){
        int arrLength = arr.length;
        int count,count2,currSum=0,nextSum=0;

        for (count=0;count<arrLength;count++){
            for (count2 = 0;count2<reqLength;count2++){
                if (count==0){
                    currSum += arr[count+count2];
                }
                nextSum += arr[(count+count2+1)%arrLength];
            }
            if (currSum <= nextSum){
                currSum = nextSum;
            }
            nextSum = 0;
        }
        return currSum;
    }
}
