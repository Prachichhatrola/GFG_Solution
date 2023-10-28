class StackQueue
{
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();
 
    //Function to push an element in queue by using 2 stacks.
    void Push(int x)
    {
   s1.push(x);
    }
 
    
    //Function to pop an element from queue by using 2 stacks.
    int Pop()
    {
        int i=-1;
        int count=s1.size()-1;
   while(count>0){
       s2.push(s1.pop());
       count--;
   }
   if (!s1.isEmpty()){
   i=s1.peek();
   }
   if (!s1.isEmpty()){
   s1.pop();
   }
   while(!s2.isEmpty()){
       s1.push(s2.pop());
   }
   return i;
    }
}
 
