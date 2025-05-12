class Solution {
    public int fib(int n) {
         if(n==0) {
            return 0;
         }
        int first=0;
        int second=1;

        //if(n==0) return 1;

        for(int i=1;i<n;i++)
        {
            int next =first+second;
            first=second;
            second=next;
        }
        return second;
    }
}