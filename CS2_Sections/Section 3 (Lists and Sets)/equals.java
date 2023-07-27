public boolean equals(Set<Integer> set1, Set<Integer> set2) {
    

    int count = 0;
    
    if (set1.size() != set2.size()) {
        return false;
    }
    
    for (int i : set1) {
        if (set2.contains(i)) {
            count++;
        }
    }
    
    if (count == set2.size() && count > 0) {
        return true;
    }
    
    return false;
}
