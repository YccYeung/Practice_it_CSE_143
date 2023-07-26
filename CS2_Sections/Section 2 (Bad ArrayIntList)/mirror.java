public void mirror() {

    int newIndex = size;
    int totalLength = size * 2;
    
    size*=2;
    ensureCapacity(size);
    
    for (int i = 0; i < totalLength-newIndex; i++) {
        elementData[newIndex+i] = elementData[newIndex-i-1];
    }
}
