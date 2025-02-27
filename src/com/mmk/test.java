package com.mmk;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {


        int[] arr = { 10, 5, 4, 3, 48, 6, 2, 33, 53, 10 };
        int N = arr.length;
        int K = 4;

        // Function call
        System.out.println( K + "th Smallest Element is: " + kthSmallest(arr, N, K));


        
    }

    private static int kthSmallest(int[] arr, int n, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> b-a); //max heap = b-a; min heap = a-b;

        for (int i = 0 ; (i < n) ; i++){
            pq.offer(arr[i]);
            if(pq.size() > k){
                pq.poll(); // remove the largest element
            }
        }

        return pq.peek();
    }
}
