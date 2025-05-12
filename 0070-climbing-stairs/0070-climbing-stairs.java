class Solution {
    public int climbStairs(int n) {
        int first=1;
        int second =2;

        if(n<=2) return n; 

        for(int i=3;i<=n;i++)
        {
            int next=first +second;
            first=second;
            second =next;

        }
        return second;

    }
}