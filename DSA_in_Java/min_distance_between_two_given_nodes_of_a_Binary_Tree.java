class GfG {
    Node LCA(Node root,int n1,int n2){
        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }
        Node la = LCA(root.left,n1,n2);
        Node ra = LCA(root.right,n1,n2);
        if(la == null){
            return ra;
        }
        if(ra == null){
            return la;
        }
        return root;
    }
    int Distance(Node root,int n){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
       int ld =  Distance(root.left,n);
       int rd =  Distance(root.right,n);
       if(ld == -1 && rd == -1){
           return -1;
       }else if(ld == -1){
           return rd+1;
       }else{
           return ld+1;
       }
    }
    int findDist(Node root, int a, int b) {
        // Your code here
        Node lca = LCA(root,a,b);
        int h1 = Distance(lca,a);
        int h2 = Distance(lca,b);
        return h1+h2;
    }
}
