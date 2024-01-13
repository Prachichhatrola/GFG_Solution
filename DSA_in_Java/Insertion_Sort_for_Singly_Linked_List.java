class Solution
{
    public static Node insertionSort(Node head)
    {
       ArrayList<Integer> arr = new ArrayList<>();
       Node temp1= head;
       while(temp1!= null)
       {
          arr.add(temp1.data);
          temp1 = temp1.next;
       }
       
       Collections.sort(arr);
       
      
       Node dummy = new Node(0);
       Node temp =new Node(0);
       
        temp =dummy;
       
       for(int i=0;i<arr.size();i++)
       {    Node newNode= new Node(arr.get(i));
            temp.next= newNode;
            temp= temp.next;
       }
       return dummy.next;
      }
}
