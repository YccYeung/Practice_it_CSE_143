public static void reverse3(ArrayList<Integer> list) {

    int index = list.size() - 1;
       
    if (list.size() % 3 != 0) {
        index-=list.size() % 3;
    }
    
    for (int i = index; i > 0; i-=3) {
        int temp3 = list.get(i);
        int temp1 = list.get(i-2);
        list.set(i, temp1);
        list.set(i-2, temp3);
    }
}
