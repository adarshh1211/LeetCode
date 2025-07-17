class Solution {
    static List<String> ans;
    public List<String> generateParenthesis(int n) {
        ans = new ArrayList<>();
        printparenthesis(0,0,n,"");
        return ans;
    }
    public void printparenthesis(int open, int close, int n, String s) {
        if (s.length() == 2 * n) {
            ans.add(s);
            return;
        }
        if (open < n) {
            printparenthesis(open + 1, close, n, s + "(");
        }
        if (close < open) {
            printparenthesis(open, close + 1, n, s + ")");
        }
}
}