class Solution {
    public boolean canBeIncreasing(int[] nums) {
        int count =0;
        int idx = 0;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]>=nums[i+1]){
                count++;
                idx=i;
            }
       }
       if(count>1){
           return false;
       }
       else{
           if(idx ==0 || idx == nums.length-2){
               return true;
           }
           else if(nums[idx+1]>nums[idx-1] || nums[idx+2] > nums[idx])
           {
               return true;
           }
           else{
               return false;
           }
       }
        
    }
}
