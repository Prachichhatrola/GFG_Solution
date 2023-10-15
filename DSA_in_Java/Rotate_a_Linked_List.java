class Solution{
    //Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        // add code here
        if(k==0) return head;
        Node node = head;
        while(k>1){
            k-=1;
            node = node.next;
        }
        Node last = node;
        while(last.next != null){
            last = last.next;
        }
        last.next = head;
        head = node.next;
        node.next = null;
        return head;
    }
}
