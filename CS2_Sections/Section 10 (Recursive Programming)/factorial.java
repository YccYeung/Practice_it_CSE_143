public int factorial(int num) {
    
    int sum = 0;
    
    if (num < 0) {
        throw new IllegalArgumentException("n cannot be negative");
    } else if (num == 0 || num == 1) {
        return 1;
    } else {
        sum = num * factorial(num - 1);
    }
    
    return sum;
}
