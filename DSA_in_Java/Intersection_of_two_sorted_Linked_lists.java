class Sol
{
   public static Node findIntersection(Node head1, Node head2)
    {
        // code here.
        if(head1 == null) return head2;
        if(head2 == null) return head1;
        
        Node head = null;
        Node prev = head;
        
        while(head1 != null && head2 != null){
            if(head1.data == head2.data){
                Node newNode = new Node(head1.data);
                if(head == null){
                    head = newNode;
                }
                else{
                    prev.next = newNode;
                }
                prev = newNode;
                head1 = head1.next;
                head2 = head2.next;
            }
            else if(head1.data < head2.data){
                head1=head1.next;
            }
            else{
                head2 = head2.next;
            }
        }
        
        return head;
        
    }
}
