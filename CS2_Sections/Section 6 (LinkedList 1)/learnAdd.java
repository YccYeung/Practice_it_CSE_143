public void learnAdd(int index, int value) {

    int pointer = 0;

    if (index == 0) {
       front = new ListNode(value, front);
    } else {
        for (ListNode current = front; current != null; current = current.next) {
            if (index - 1 == pointer) {
                ListNode previous = current;
                ListNode after = current.next;
                ListNode temp = new ListNode(value, after);
                previous.next = temp;
            }
                
            pointer++;
        }
    }  
}
