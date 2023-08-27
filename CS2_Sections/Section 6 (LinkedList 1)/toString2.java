public String toString2() {
    
    String output = "[";
    
    //loop through the whole LinkedList
    //convert int value to String value
    //+= to output
    //+= "]" at the end of the program
    
    
    for (ListNode current = front; current != null; current = current.next) {
        
        String temp =  String.valueOf(current.data);
        output += temp + ", ";  
    }
    
    //deal with edge case: the last printed item
    
    int stringLength = output.length();
    
    //deal with empty LinkedList
    
    if (stringLength == 1) {
        return "[]";
    }
    
    String toReturn = output.substring(0, stringLength - 2);
    toReturn += "]";
    
    
    return toReturn;
    
}
