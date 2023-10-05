class Solution{
    //Function to find the length of a loop in the linked list.
    static int countNodesinLoop(Node head){
        Node slow=head;
        Node fast=head;
        if(fast.next==null){
            return 0;
        }
        do{
            slow=slow.next;
            if(fast==null || fast.next==null ){
                return 0;
            }
            fast=fast.next.next;
        }while(slow!=fast);
        slow=head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        int len=1;
        slow=slow.next;
        while(slow!=fast){
            slow=slow.next;
            len++;
        }
        return len;
    }
}
