class Solution {
    Node deleteMid(Node head) {
        Node slow = head;
        Node fast = head;
        fast = fast.next.next;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
        
        
    }
}
