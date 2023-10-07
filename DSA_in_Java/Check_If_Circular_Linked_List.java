class GfG
{
    boolean isCircular(Node head)
    {
        if(head==null || head.next==null) return false;
        Node temp=head.next;
        while(temp!=null){
            if(temp==head) return true;
            temp=temp.next;
        }
        return false;
    }
}
