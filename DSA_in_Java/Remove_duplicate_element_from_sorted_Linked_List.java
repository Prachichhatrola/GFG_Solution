class GfG
{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {

// find the length 
        int length = 0 ;
        Node temp = head ;
        while(temp!=null){
            length++ ;
            temp = temp.next ;
        }
        int i = 1 ;

// initialize 2 nodes : prev and current 
        Node curr = head.next ;
        Node prev = head ;


        // traverse the linked list 
        while(i<length && curr!=null){

// if equal skip the node and connect the 1st and 3rd node together
            if(curr.data==prev.data){
                prev.next = curr.next ;
                curr = curr.next ;
            }

// no need to do anything now just keep the check of previous node
            else {
                prev = curr ;
                curr = curr.next ;
            }
            i++ ;
        }
        return head ;
    }
}
