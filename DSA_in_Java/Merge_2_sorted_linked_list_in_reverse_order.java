class GfG
{
    Node mergeResult(Node node1, Node node2)
    {
// Your code here
Node res = new Node(0);
Node temp = res;
Node curr1 = node1;
Node curr2 = node2;
 
while(curr1 != null && curr2 != null){
    if(curr1.data < curr2.data){
        Node newNode = new Node(curr1.data);
        newNode.next = temp.next;
        temp.next = newNode;
        curr1 = curr1.next;
    }else{
        Node newNode = new Node(curr2.data);
        newNode.next = temp.next;
        temp.next = newNode;
        curr2 = curr2.next;
    }
}
while(curr1 != null){
    Node newNode = new Node(curr1.data);
    newNode.next = temp.next;
    temp.next = newNode;
    curr1 = curr1.next;
}
while(curr2 != null){
    Node newNode = new Node(curr2.data);
    newNode.next = temp.next;
    temp.next = newNode;
    curr2 = curr2.next;
}
return res.next;
    }
}
