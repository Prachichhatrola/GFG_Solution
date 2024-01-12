class GfG {
    // Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        // add code here.
        Queue<Integer> qu=new LinkedList<Integer>();
        Stack<Integer> st=new Stack<Integer>();
        for(int i=0;i<k;i++)
        {
            st.push(q.remove());
        }
        while(st.size()>0)
        qu.add(st.pop());
        while(q.size()>0)
        qu.add(q.remove());
        return qu;
    }
}
