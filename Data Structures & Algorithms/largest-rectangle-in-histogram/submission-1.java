class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st=new Stack<>();
        st.push(-1);
        //st.push(heights[0]);
        int top,newTop,topIndex,width;
        int n=heights.length;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
             top=st.peek();
            while(top!=-1 && heights[top]>heights[i]){
                st.pop();
                width=(i-st.peek())-1;
                arr[top]=heights[top]*width;
                top=st.peek();

            }st.push(i);
             
            
        }
        if(!st.isEmpty()){
            int high=n;
            while(st.peek()!=-1){
                topIndex=st.pop();
                width=(high-st.peek())-1;
                arr[topIndex]=heights[topIndex]*width;

            }
        }
        return Arrays.stream(arr).max().getAsInt();
    }
}
