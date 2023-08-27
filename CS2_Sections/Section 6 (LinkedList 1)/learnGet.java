public int learnGet(int index) {
    
    //Loop through the whole LinkedList 
    //Return value of the specific node
    
    int output = 0;
    //since index is int and current is ListNode,
    //I need to create another int object to keep track of index
    int pointer = 0;
    
    for (ListNode current = front; current != null; current = current.next) {
        if (pointer == index) {
            output = current.data;
        }
        pointer++;
    }
    return output;
    
}
