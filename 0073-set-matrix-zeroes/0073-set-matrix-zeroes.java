class Solution {
    public void setZeroes(int[][] arr) {
        int m =arr.length;
        int n = arr[0].length;

        int[][] ans=new int[m][n];
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                ans[i][j]=arr[i][j];


            }
        }
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
            if(arr[i][j]==0){
                for(int p=0;p<n;p++){
                    ans[i][p]=0;
                }
                for(int q=0;q<m;q++){
                    ans[q][j]=0;
                }
            }
            }
        }

            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    arr[i][j]=ans[i][j];
                }
            }
            
    }
}