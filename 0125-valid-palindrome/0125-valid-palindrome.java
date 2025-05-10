class Solution {
    public boolean isPalindrome(String s) {
       String cleaned = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

    int c =cleaned.length();

    for(int i =0;i<c/2;i++){
        if(cleaned.charAt(i)!=cleaned.charAt(c-i-1))
        {
            return false;
        }
    }
    return true;
    }
}