public void splitStack(Stack<Integer> stack) {

    Queue<Integer> queue = new LinkedList<>();
    
    for (int i : stack) {
        if (i < 0) {
            queue.add(i);
        }
    }
    
    for (int j : stack) {
        if (j >= 0) {
            queue.add(j);
        }
    }
    
    for (int i = 0; i < queue.size(); i++) {
       stack.pop();
    }
    
    for (int k : queue) {
        stack.push(k);
    }
}
