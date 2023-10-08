class Solution
{
public static Node sortedInsert(Node head,int data)
         {
            Node newNode = new Node(data);
            
            // find tail
            Node tail = head;
            while(tail.next != head) tail = tail.next;
            
            // insert data
            //at begin
            if(data < head.data) {
              newNode.next = head;
              head = newNode;
              tail.next = newNode;
                
            } // at end
            else if(data > tail.data) {
              tail.next = newNode; 
              newNode.next = head;
                
            } // at middle
            else {
                Node temp = head;
                while(temp.next.data < data) {
                    temp = temp.next;
                }
                
                Node store = temp.next;
                newNode.next = store;
                temp.next = newNode;
            }
            
            return head;
         }
}
