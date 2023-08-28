public boolean hasTwoConsecutive() {
    
    //loop through the whole list
    
    boolean toReturn = false;
    
    for (ListNode current = front; current != null; current = current.next) {
        
        if (current.next != null && current.data == current.next.data - 1) {
            return true;
        }
    }
    
    return toReturn; 
}
