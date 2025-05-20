class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        int m =arr.length;
        int n =arr[0].length;

        int minr=0;
        int maxr=m-1;
        int minc=0;
        int maxc =n-1;
        List<Integer> result = new ArrayList<>();
        if (arr == null || arr.length == 0) return result;

    //left to right
    while(minr<=maxr && minc<=maxc){
        for(int j=minc;j<=maxc;j++){

            result.add(arr[minr][j]);
        }
        minr++;


    //top to bottom
    for(int i=minr;i<=maxr;i++){
        result.add(arr[i][maxc]);
    }
    maxc--;

    //right to left
    if (minr <= maxr) {
    for(int j=maxc;j>=minc;j--){
        result.add(arr[maxr][j]);
    }
    maxr--;
    }


    //bottom to top
    if (minc <= maxc) {
    for(int i=maxr;i>=minr;i--){
        result.add(arr[i][minc]);
    }
    minc++;
    }
    }
    
    return result;
    }
}