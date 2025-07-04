class Solution {
    public boolean isPossible(int c , int[] arr,int d){
        int n =arr.length;
        int load=0;
        int days=1;
        for (int i=0;i<n;i++){
            if(load+arr[i]<=c) load+=arr[i];
            else{
                load=arr[i];
                days++;
            }
        }
        if(days>d)return false;
        else return true;
    }
    public int shipWithinDays(int[] arr, int d) {
        int n =arr.length;
        int sum=0;
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            mx=Math.max(mx,arr[i]);
            sum+=arr[i];
        }
        int low=mx;
        int high=sum;
        int minC=sum;

        while(low<=high){
            int mid=low+(high-low)/2;
            if(isPossible(mid,arr,d)==true){
                minC=mid;
                high=mid-1;
            }
            else low =mid +1;
        }
        return minC;
    }
}