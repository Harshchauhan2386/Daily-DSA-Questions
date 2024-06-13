public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result=0;
        for(int i=0;i<32;i++)
        {
            int left=n & 1;
            int reverse = left << (31-i);
            result= result | reverse; 
            n=n>>1;
        }
        return result;
    }
}
