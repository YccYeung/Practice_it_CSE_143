public Stack<Integer> copyStack(Stack<Integer> stack) {
    
    Stack<Integer> copy = new Stack<>();
    Queue<Integer> queue = new LinkedList<>();
    
    int length = stack.size();
    
    while (!stack.isEmpty()) {
        queue.add(stack.pop());
    }
    
    //example [1, 2, 3, 4]
    //stack []
    //copy  []
    //queue [4, 3, 2, 1]
    
    for (int i = 0; i < length; i++) {
        stack.push(queue.remove());
    }
    
    //stack [4, 3, 2, 1]
    //copy  []
    //queue []
    
    while (!stack.isEmpty()) {
        int n = stack.pop();
        queue.add(n);
        copy.push(n);
    }
    
    //stack []
    //copy  [1, 2, 3, 4]
    //queue [1, 2, 3, 4]
    
    for (int i = 0; i < length; i++) {
        stack.push(queue.remove());
    }
    
    //stack [1, 2, 3, 4]
    //copy  [1, 2, 3, 4]
    //queue []
    
    return copy;
}
