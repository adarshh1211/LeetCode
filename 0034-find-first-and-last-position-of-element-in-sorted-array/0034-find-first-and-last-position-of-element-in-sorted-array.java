class Solution {
    public int[] searchRange(int[] arr, int target) {
        int n =arr.length;
        int[] ans=new int[2];
        int low=0;
        int high=n-1;
        int fp=-1;

        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                if(mid>0 && arr[mid]==arr[mid-1]) high =mid-1;
                else{
                    fp=mid;
                    break;
                }
            }
            else if(arr[mid]>target) high =mid-1;
            else if(arr[mid]<target) low =mid+1;      
              }

        int up=-1; low=0; high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                if(mid+1<n && arr[mid]==arr[mid+1]) low =mid+1;
                else{
                    up=mid;
                    break;
                }
            }
            else if(arr[mid]>target) high =mid-1;
            else if(arr[mid]<target) low =mid+1;  
        }
        ans[0]=fp;
        ans[1]=up;
        return ans;
    }
}