class Solution
{
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
        //Your code here
        if(head == null || head.next == null) return true;

        Node fast = head;
        Node slow = head;

        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        slow.next = reverse(slow.next);
        slow = slow.next;
        Node dummy = head;

        while(slow != null){
            if(dummy.data != slow.data) return false;
            dummy = dummy.next;
            slow = slow.next;
        }
        return true;
        
    }    
    static Node reverse(Node ptr) {
        Node pre=null;
        Node nex=null;
        while(ptr!=null) {
            nex = ptr.next;
            ptr.next = pre;
            pre=ptr;
            ptr=nex;
        }
        return pre;
    }
}
