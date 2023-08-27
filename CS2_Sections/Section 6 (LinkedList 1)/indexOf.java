public int indexOf(int value) {

    int pointer = 0;
    int toReturnIndex = -1;
    
    //loop through the whole LinkedList with the pointer
    //if current.data = value, we return pointer
    //return index of the first occurrence of the value (return only one index)
    //return -1 if nothing is found

    
    for (ListNode current = front; current != null; current = current.next) {
        if (current.data == value) {
            toReturnIndex = pointer;
            //break once it found the specific index so that the loop won't keep going to look for other index
            break;
        }   
        pointer++;
    }
    
    return toReturnIndex;
}
