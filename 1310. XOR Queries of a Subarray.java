class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int len = arr.length;
        int[] prefixXOR = new int[len];
        int xor = 0;
        for(int i=0;i<len;i++)
        {
            xor = xor ^ arr[i];
            prefixXOR[i] = xor;
        }

        int len2=queries.length;
        int[] ans = new int[len2];
        for(int i=0;i<len2;i++)
        {
            int l = queries[i][0];
            int r= queries[i][1];
            ans[i] = (l > 0) ? prefixXOR[r] ^ prefixXOR[l - 1] : prefixXOR[r];
        }
        return ans;
    }
}
