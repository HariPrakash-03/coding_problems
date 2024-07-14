package Coding_Problems;
import java.util.*;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int idx=0;idx<n;idx++)
        {
            nums1[m+idx]=nums2[idx];
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}
