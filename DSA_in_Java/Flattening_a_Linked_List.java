class GfG{
    Node flatten(Node root){
     List<Integer> storedset = new ArrayList<>();
              for(Node top = root; top != null; top= top.next){
                    for(Node cur = top ; cur != null; cur=cur.bottom){
                          storedset.add(cur.data);
                    }
              }
              Collections.sort(storedset);
             Node head = null; Node tail = null;    
          for(int ele : storedset){
              
              if(head == null){
                  head = new Node(ele);
                  tail = head;
              }
              else{
                    tail.bottom = new Node(ele);
                    tail = tail.bottom;
              }
          }       
        return head;
    }
    
}
