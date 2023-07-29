public void stutter(Stack<Integer> stack) {

    Queue<Integer> queue = new LinkedList<>();
    
    int length = stack.size() * 2;
    int count = 0;
    
    
    
    while (!stack.isEmpty()) {
        int n = stack.pop();
        queue.add(n);
        queue.add(n);
    }

    for (int i = 0; i < length; i++) {
        stack.push(queue.remove());
    }
    
    while (!stack.isEmpty()) {
        int n = stack.pop();
        queue.add(n);
    }
    
    for (int i = 0; i < length; i++) {
        stack.push(queue.remove());
    }
}
