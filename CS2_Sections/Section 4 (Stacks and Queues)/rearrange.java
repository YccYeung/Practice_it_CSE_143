public void rearrange(Queue<Integer> queue) {
    
    Stack<Integer> stack = new Stack<>();
    
    //initialize original queue length since it will change during different loops
    int queueLength = queue.size();
    
    //even number before odd number
    //order must be the same
    
    //original 
    //queue [3, 5, 4, 17, 6, 83, 1, 84, 16, 37]
    //stack []
    
    //loop through queue 
    //transfer odd number from queue to stack
    
    for (int i = 0; i < queueLength; i++) {
        int n = queue.remove();
        if (n % 2 != 0) {
            stack.push(n);
        } else {
            queue.add(n);
        }
    }
    
    //queue [4, 6, 84, 16]
    //stack [3, 5, 17, 83, 1, 37] 
    
    //put odd numbers into queue 
    //keep track of stack.size()
    
    int stackLength = stack.size();
    
    while (!stack.isEmpty()) {
        queue.add(stack.pop());
    }
    
    //queue [4,·6,·84,·16,·37,·1,·83,·17,·5,·3]
    //stack []
    
    //loop through the queue again like the first time
    for (int i = 0; i < queueLength; i++) {
        int n = queue.remove();
          if (n % 2 != 0) {
            stack.push(n);
        } else {
            queue.add(n);
        }
    }
    
    //queue [4,·6,·84,·16]
    //stack [37, 1, 83, 17, 5, 3]
    
    //put odd numbers from stack to queue
    
    while (!stack.isEmpty()) {
        queue.add(stack.pop());
    }
}
