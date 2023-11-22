class Tree {
     public ArrayList<Integer> diagonal(Node root) {
         ArrayList<Integer> result = new ArrayList<>();
          if (root == null) {
              return result;
          }
          Queue<Node> queue = new LinkedList<>();
          queue.add(root);
          while (!queue.isEmpty()) {
              Node currentNode = queue.poll();
              while (currentNode != null) {
                  result.add(currentNode.data);
                  if (currentNode.left != null) {
                      queue.add(currentNode.left);
                  }
                  currentNode = currentNode.right;
              }
          }
          return result;
     }
}


