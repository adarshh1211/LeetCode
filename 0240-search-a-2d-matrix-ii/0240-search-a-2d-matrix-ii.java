class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        // int m =arr.length;
        // int n = arr[0].length;
        // for(int i =0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         if(arr[i][j]==target) return true;
        //     }
        // }
        // return false;

        int m =arr.length;
        int n =arr[0].length;
        int i=0;
        int j=n-1;
        while(i<m && j>=0){
            if(arr[i][j]==target) {
                return true;
            }
            else if(arr[i][j]>target){
                j--;
            }
            else{
                i++;
            }
        }
        return false;

    }
}