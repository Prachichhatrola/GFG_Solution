class Tree
{
     // Recursive function to print right view of a binary tree.
     ArrayList<Integer> Kdistance(Node root, int k)
     {
          // Your code here
          ArrayList<Integer> list = new ArrayList<>();
          if(root == null || k < 0){
              return list;
          }
          if(k == 0){
            System.out.print(root.data +" ");
            //list.add(root.data);
          }
          
          Kdistance(root.left, k-1);
          Kdistance(root.right,k-1);
          
          return list;
     }
}
