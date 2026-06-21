class Solution {
    List<String> ans=new ArrayList<>();
    public void backtrack(StringBuilder cur,int open,int close,int n){
        if(cur.length()==2*n){
            ans.add(cur.toString());
            return;
        }
        if(open<n){
            cur.append('(');
            backtrack(cur,open+1,close,n);
            cur.deleteCharAt(cur.length()-1);
        }
        if(close<open){
           cur.append(')'); 
           backtrack(cur,open,close+1,n);
           cur.deleteCharAt(cur.length()-1);
        }
    }
    public List<String> generateParenthesis(int n) {
        backtrack(new StringBuilder(),0,0,n);
        return ans;
    }
}
