class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<n;i++){
            char t=s.charAt(i);
             if(t == '(' || t == '{' || t == '[') {
                st.push(t);
            } 
            else{
                if(st.isEmpty())return false;
                char d=st.pop();
                if((t==')'&&d!='(')||(t=='}'&&d!='{')||(t==']'&&d!='[')){
                    return false;
                }
                
            }
        }return st.isEmpty();
        
    }
}
