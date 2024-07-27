class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        int profit[]=new int[n];

        for(int i=0;i<n;i++)
        {
            profit[i]=gas[i]-cost[i];
        }

        int index=0;
        int ans=0;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            ans+=profit[i];
            sum+=profit[i];
            if(ans<0)
            {
                index=i+1;
                ans=0;
            }
        }

        if(index==n+1 || sum<0)
        return -1;

        else
        return index;
    }
}
