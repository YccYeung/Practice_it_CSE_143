public ArrayIntList fromCounts() {
    
    ArrayIntList list = new ArrayIntList();
    int listSize = 0;
    
    for (int i = 0; i < size; i+=2) {
        for (int j = 0; j < elementData[i]; j++) {
            list.elementData[listSize] = elementData[i+1];
            listSize++;
        }
    }
    
    list.size = listSize;
    return list;
}
