class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int [] arr=new int[n];
        int top;
        Stack<Integer>st=new Stack<>();
        st.push(-1);
        for(int i=0;i<n;i++){
            top=st.peek();
            while(top!=-1 && temperatures[i]>temperatures[top]){
                arr[top]=i-top;
                st.pop();
                top=st.peek();
            }
            st.push(i);
        }
        return arr;
    }
}
