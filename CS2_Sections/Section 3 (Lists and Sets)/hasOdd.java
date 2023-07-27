public boolean hasOdd(Set<Integer> set) {
    
    for (int i : set) {
        if (i % 2 == 1) {
            return true;
        }
    }
    return false;
}
