class Solution
{
    int getMiddle(Node head)
    {
         // Your code here.
         Node curr = head;
         int count = 0;
         while(curr!=null)
         {
             count++;
             curr = curr.next;
         }
         if(count==1)
         return head.data;
         curr = head;
         int n = count/2 + 1;
         for(int i=1;i<n-1;i++)
         {
             curr = curr.next;
         }
         return curr.next.data;
    }
}
