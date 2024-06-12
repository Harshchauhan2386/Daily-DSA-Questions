class Solution {
    public boolean isPalindrome(int x) {
        int original=x;
        int res=0;
        while(x>0)
        {
            int right=x%10;
            res = res*10+right;
            x=x/10;
        } 
        if(res == original)
            {
                return true;
            }
        return false;
    }
}
