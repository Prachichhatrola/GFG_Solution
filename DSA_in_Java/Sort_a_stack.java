class GfG{
  public Stack<Integer> sort(Stack<Integer> s)
    {
        //add code here.
        Stack<Integer> ans = new Stack<>();
        Stack<Integer> temp = new Stack<>();
        while(!s.isEmpty()){
            int popped = s.pop();
            
            while(!ans.isEmpty() && ans.peek() > popped){
                temp.add(ans.pop());
            }
            
            ans.push(popped);
            
            while(!temp.isEmpty()){
                ans.add(temp.pop());
            }
        }
        
        return ans;   
    }
}
