class Intersect
{
    //Function to find intersection point in Y shaped Linked Lists.
	int intersectPoint(Node head1, Node head2)
    {
         // code here
         HashSet<Node> set = new HashSet<Node>();
         
        Node temp1 = head1;
        Node temp2 = head2;
        
        while(temp1 != null){
            set.add(temp1);
            temp1 = temp1.next;
        }
        
        while(temp2 != null){
            if(set.contains(temp2))
                return temp2.data;
            temp2 = temp2.next;
        }
        return -1;
    }
}


