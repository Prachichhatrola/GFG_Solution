class Solution {
    Node deleteMid(Node head) {
        // This is method only submission.
        // You only need to complete the method.
        int i=0;
        Node temp=head;
        if(head==null){
            return head;
        }
        if(head.next==null){
            return null;
        }
        while(temp!=null){
            i++;
            temp=temp.next;
        }
        i=(i/2)+1;
        int j=1;
        temp=head;
        Node p=temp;
        while(temp!=null && j<i){
            j++;
            p=temp;
            temp=temp.next;
        }
        p.next=temp.next;
        return head;
    }
}
