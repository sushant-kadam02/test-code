package com.sample.interview;

public class DivideAndConquersSum {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int start = 0, end = arr.length -1;
        int total = sumArray(arr, start, end);
        System.out.println("Sum of array is : "+total);
    }

    private static int sumArray(int[] arr, int start, int end) {
        // base condition
        if (start > end ) {
            return 0;
        }

        if (start == end ) {
            return arr[start];
        }
        // divide
        int mid = start + ( end - start ) / 2;

        int fistHalf = sumArray(arr, start, mid);
        int secondHalf = sumArray(arr, mid+1, end);

        // conquers output
        return fistHalf + secondHalf;
    }

}
