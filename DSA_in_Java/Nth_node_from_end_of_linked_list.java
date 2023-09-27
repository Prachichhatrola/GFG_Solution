class Solution
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
    	// Your code here
    	int count = 0;
        Node curr = head;
        while(curr!=null){
            curr = curr.next;
            count ++;
        }
        if(n > count){
            return -1;
        }
        
        curr= head;
        int k = count - n +1;
        int i=0,data=-1;
        while(i<k){
           data = curr.data;
           curr= curr.next;
            i++;
        }
        return data;
    }
}
