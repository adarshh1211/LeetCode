class Solution {
    public String reverseWords(String s) {
        String[] scal= s.trim().split("\\s+");

        StringBuilder reversed = new StringBuilder();
        for(int i=scal.length-1;i>=0;i--)
        {
            reversed.append(scal[i]);
            if(i!=0) {
                reversed.append(" ");
            }
        } 
        return reversed.toString();
    }
}