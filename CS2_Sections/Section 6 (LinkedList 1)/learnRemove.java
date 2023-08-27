public void learnRemove(int index) {

    int pointer = 0;
    
    if (index == 0) {
        front = front.next;
    } else {
        for (ListNode current = front; current != null; current = current.next) {
            if (pointer == index - 1) {
                current.next = current.next.next;
            }
            pointer++;
        }
    }
}
