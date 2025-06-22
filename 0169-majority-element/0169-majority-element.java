class Solution {
    public int majorityElement(int[] arr) {
        int n =arr.length;
        for(int i =1;i<n;i++){
            for(int j =i;j>=1;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else break;
            }
            
        }
        return arr[arr.length/2];
        
    }
}