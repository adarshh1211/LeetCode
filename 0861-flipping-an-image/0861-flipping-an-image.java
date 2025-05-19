class Solution {
    public int[][] flipAndInvertImage(int[][] arr) {
        int m=arr.length;
        int n= arr[0].length;

        for(int i=0;i<m;i++){
            int left =0;
            int right =m-1;

            while(left<right){
                int temp=arr[i][left];
                arr[i][left]=arr[i][right];
                arr[i][right]=temp;
                left++;
                right--;
            }
        }
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                arr[i][j]=arr[i][j]^1;
            }
        }
        return arr;
    }
}