class Solution {
    public int compress(char[] arr) {
        String ans = "";
        int i = 0;
        int j = 0;
        while (j < arr.length) {
            if (arr[i] == arr[j])
                j++;
            else {
                ans += arr[i];
                int len = j - i;
                if (len > 1)
                    ans += len;
                i = j;
            }
        }
        ans += arr[i];
        int len = j - i;
        if (len > 1)
        ans += len;

        for(i=0;i<ans.length();i++){
            arr[i]=ans.charAt(i);
        }
        return ans.length();
    }
}