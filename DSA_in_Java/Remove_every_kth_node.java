class Solution
{
    Node delete(Node head, int k)
    {
// Your code here
    int sz=0; //CALCULATE THE SIZE 
    Node temp=head;
    while(temp!=null){
        sz++;
        temp=temp.next;
    }
    if(k>sz){  // IN THIS CASE NO NODE WILL DELETE 
        return head;
    }
    if(k==1){ //IN THIS CASE ALL NODE GET DELETED 
        return null;
    }
    temp=head;
    int n=k;
    k=k-1; //NOW WE ARE SKIPING K-1 TIMES TILL THE VALUE OF K==1
    while(temp!=null && temp.next!=null){
        if(k==1){
            temp.next=temp.next.next; //WHEN K==1 WE SKIP OUR NODE
            k=n;
        }
        temp=temp.next;
        k--; //SKIPING ELEMENT
    }
    return head;
    }
}

