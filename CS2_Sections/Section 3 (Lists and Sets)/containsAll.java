public boolean containsAll(Set<Integer> set1, Set<Integer> set2) {
    
    //cannot call containsAll()
    //no other data structure
    int count = 0;
    
    for (int i : set1) {
        if (set2.contains(i)) {
            count++;
        }
    }
    
    if (count == set2.size() && count > 0) {
        return true;
    }
    
    return false;
}
