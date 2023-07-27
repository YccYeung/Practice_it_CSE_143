public void switchPairs(List<String> list) {
    
    int index = list.size() - 1;
    
    if (list.size() % 2 == 1) {
        index--;
    }
    
    for (int i = index; i > 0; i-=2) {
        String temp2 = list.get(i);
        String temp1 = list.get(i-1);
        list.set(i, temp1);
        list.set(i-1, temp2);
    }
}
