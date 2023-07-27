public void stutter(List<Integer> list) {
    
    int size2 = list.size() * 2;

    for (int i = 0; i < size2; i+=2) {
        list.add(i+1, list.get(i));
    }   
}
