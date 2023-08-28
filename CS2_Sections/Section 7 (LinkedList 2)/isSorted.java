public boolean isSorted() {
    
    boolean toReturn = true;
    
    if (front == null) {
        return true;
    }
    
    for (ListNode current = front; current != null; current = current.next) {
        if (current.next != null && current.data > current.next.data) {
            return false;
        }
    }
    
    return toReturn;
}
