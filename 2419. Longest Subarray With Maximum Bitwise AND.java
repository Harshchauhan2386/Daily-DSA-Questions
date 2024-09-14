class Solution {
    public int longestSubarray(int[] nums) {
        int maximum=0;
        for(int i=0;i<nums.length;i++)
        {
            maximum=Math.max(nums[i],maximum);
        }
        int count=0;
        int ans=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==maximum)
            {
                count++;
            }
            else{
                count=0;
            }
            ans = Math.max(count,ans);
        }
        
        return ans;
    }
}
