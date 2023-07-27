public void retainAll(Set<Integer> set1, Set<Integer> set2) {

    Iterator<Integer> iterator = set1.iterator();
    
    while (iterator.hasNext()) {
        int value = iterator.next();
        
        if (!set2.contains(value)) {
            iterator.remove();
        }
    }
}
