public int learnSize() {
    int count = 0;
    
    while (front != null) {
        count++;
        front = front.next;
    }
    
    return count;
}
