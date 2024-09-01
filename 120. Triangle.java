class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int height = triangle.size();
        int[][] ans = new int[height+1][height+1];

        for(int i=height-1; i>=0;i--)
        {
            for(int j=0;j<=i;j++)
            {
                ans[i][j] = triangle.get(i).get(j)+ Math.min(ans[i+1][j],ans[i+1][j+1]);
            }
        }
        return ans[0][0];
    }

}
