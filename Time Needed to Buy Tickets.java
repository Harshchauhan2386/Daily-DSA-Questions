class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0; 
        while (true) {
            for (int i = 0; i < tickets.length; i++) {
                if (tickets[i] > 0) { 
                    tickets[i] -= 1;  
                    time++;  
                }
                if (i == k && tickets[i] == 0)
                    return time; 
            }
        }
    }
}
