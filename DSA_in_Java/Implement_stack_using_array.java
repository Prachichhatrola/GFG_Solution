class MyStack
{
    int top;
int arr[] = new int[1000];
 
    MyStack()
{
top = -1;
}
 
//Function to push an integer into the stack.
    void push(int a)
{
    // Your code here
    if(top==arr.length){
        return;
    }
    top++;
    arr[top]=a;
} 
 
    //Function to remove an item from top of the stack.
int pop()
{
        // Your code here
        if(top==-1){
            return -1;
        }
        int t=arr[top];
        top--;
        return t;
}
}
