class Queues
{
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    
    //Function to push an element into stack using two queues.
    void push(int a)
    {
        // Your code here
        q1.add(a);
        int size=q1.size();
        if(size==1)
            return;
        while(size>1){
            q1.add(q1.remove());
            size--;
        }
     
    }
    
    //Function to pop an element from stack using two queues. 
    int pop()
    {
        // Your code here
        if(q1.isEmpty())
            return -1;
        return q1.remove();
    }
    
}
