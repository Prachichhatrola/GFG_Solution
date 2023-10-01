class Solution
{
    public static Node reverse(Node head, int k)
    
    {   Node Head=null;
        Node t=head;
        int n=0;
        while(t!=null){
            t=t.next;
            n++;
        }
        int cnt=0;
        Node pptemp=head;
        Node prev=null;
        Node curr=head;
        Node next=null;
       
        Node temp=null;
        Node header=null;
        int size=k;
        int u=0;
        
        while(n!=0){
            
            while(size>0){
                if(curr.next!=null){
                next=curr.next;
                }
                curr.next=prev;
                prev=curr;
                curr=next;
                size--;
                n--;
                cnt++;
                u++;
                //System.out.println(curr.data +" "+next.data+" "+ prev.data);
           }
           
            
            if(u==k){
                header=prev;
                temp=curr;
            }
            // System.out.println(header.data);
             if(n>=k){
            size=k;
             }
            if(cnt==2*k){
                pptemp.next=prev;
                pptemp=temp;
                temp=curr;
                cnt=cnt-k;
            }
             if(n!=0 && n<k){
                 // System.out.println(size);
                size=n;
                Head=curr;
                while(size>0){
                      if(curr.next!=null){
                next=curr.next;
                }
                curr.next=prev;
                prev=curr;
                curr=next;
                size--;
                n--;
              // System.out.println(size+" "+curr.data+" "+prev.data+" "+next.data);
                    
                }
                pptemp.next=prev;
                //curr.next=null;
                pptemp=Head;
                
            }
        }
        pptemp.next=null;
            
            
            //System.out.println(header.data);
            
    return header;
        
     
    }
}
