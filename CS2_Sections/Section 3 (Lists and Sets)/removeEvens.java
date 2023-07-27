public Set<Integer> removeEvens(Set<Integer> set1) {

    //1. remove even number in original set
    //2. return new set with those removed numbers + sorted in order
    
    Set<Integer> set2 = new HashSet<Integer>();
    
    Iterator<Integer> iterator = set1.iterator();
    
    while(iterator.hasNext()) {
        int even = iterator.next();
        if (even % 2 == 0) {
            iterator.remove();
            set2.add(even);
        }
    }
    
    return set2;
}
