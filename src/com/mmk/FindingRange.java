package com.mmk;

import java.util.Arrays;

public class FindingRange {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 7, 7, 8, 8, 10};
        int target = 7;
        int[] ans = range(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] range(int[] nums, int target) {
        int ans[] = {-1, -1};

        int startindex = BS(nums, target, true);
        int endindex = BS(nums, target, false);
        ans [0] = startindex;
        ans [1] = endindex;
        return ans;
    }

    public static int BS(int[] nums, int target, boolean firstindex) {

        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (firstindex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return ans;


    }

}
