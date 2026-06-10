class Solution {
    public int evalRPN(String[] tokens) {
        int n=tokens.length;
        
        int op1,op2;
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<n;i++){
            if(tokens[i].equals("+")||tokens[i].equals("-")||tokens[i].equals("*")||tokens[i].equals("/")){
                op2=st.pop();
                op1=st.pop();
                if(tokens[i].equals("+")){
                    st.push(op1+op2);
                }
                else if(tokens[i].equals("-")){
                    st.push(op1-op2);
                }
                else if(tokens[i].equals("*")){
                    st.push(op1*op2);
                }else{
                    st.push(op1/op2);
                }
            }else{
                st.push(Integer.parseInt(tokens[i]));
            }
        }
        return st.pop();
        
    }
}
