class Solution {
    public int[][] matrixReshape(int[][] arr, int r, int c) {
        int m=arr.length;
        int n =arr[0].length;
        int[][] ans=new int[r][c];
        int x=0;
        int y=0;


        if(m*n!=r*c) return arr;

        for(int i =0;i<m;i++){
            for(int  j=0;j<n;j++){
                ans[x][y]=arr[i][j];
                y++;
                if(y==c){
                    y=0;
                    x++;

                }
            }
        }
        return ans;

    }
}