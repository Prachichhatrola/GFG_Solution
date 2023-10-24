class GfG{
    public void push(int a,Stack<Integer> s)
    {
       s.add(a);
    }
    public int pop(Stack<Integer> s)
        {
            return s.get(s.size()-1);
    }
    public int min(Stack<Integer> s)
        {
           int min=Integer.MAX_VALUE;
           for(int i=0;i<s.size();i++){
               min=Math.min(min,s.get(i));
           }
           return min;
    }
    public boolean isFull(Stack<Integer>s, int n)
        {
           if(s.size()==n) return true;
           return false;
    }
    public boolean isEmpty(Stack<Integer>s)
        {
           return s.size()==0;
    }
}
