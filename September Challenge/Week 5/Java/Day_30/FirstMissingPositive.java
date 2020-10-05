//Problem : https://leetcode.com/problems/first-missing-positive/
//Solution:

class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<=0 || nums[i]>n){
                nums[i]=n+1;
            }
        }
        
        for(int i=0;i<n;i++){
            int val = Math.abs(nums[i]);
            if(val > n) continue;
            val--;
            if(nums[val]>0){
                nums[val]=-nums[val];
            }
        }
        
        for(int i=0;i<n;i++){
            if(nums[i]>=0) return i+1;
        }
        return n+1;
    }
}