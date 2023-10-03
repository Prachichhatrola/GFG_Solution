class Solution {
    // Function to sort the given linked list using Merge Sort.
    static Node mergeSort(Node head) {
        // Create an ArrayList to store the linked list elements.
        ArrayList<Integer> list = new ArrayList<>();
        Node temp = head;
        
        // Traverse the linked list and add elements to the ArrayList.
        while (temp != null) {
            list.add(temp.data);
            temp = temp.next;
        }
        
        // Sort the ArrayList in ascending order.
        Collections.sort(list);
        
        // Initialize dummy and ptr nodes for the sorted linked list.
        Node dummy = null;
        Node ptr = dummy;
        
        // Traverse the sorted ArrayList to create the sorted linked list.
        for (int i : list) {
            if (dummy == null) {
                // If the dummy node is null, create it and initialize ptr.
                dummy = new Node(i);
                ptr = dummy;
            } else {
                // Otherwise, attach the new node to ptr.next and update ptr.
                ptr.next = new Node(i);
                ptr = ptr.next;
            }
        }
        
        // Return the sorted linked list.
        return dummy;
    }
}


