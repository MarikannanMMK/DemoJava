package com.mmk;

public class Ceiling {
    public static void main(String[] args) {
        int [] nums = {2,4,7,9,11,13};
        int target = 10;
        int ans = ceiling(nums, target);
        System.out.println(ans);
    }

    public static int ceiling(int [] num , int target){

        int start = 0;
        int end = num.length -1 ;



        while(start <= end){
            int mid = start + (end -start)/2;
            if( target > num[mid]){
                start = mid+1;
            }
            else if( target < num[mid]){
                end = mid-1;
            }
            else{
                return  mid;
            }

        }

        return start;
    }
}
