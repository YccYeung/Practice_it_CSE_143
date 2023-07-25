public void learnRemove(int index) {
    
    for (int i = index; i <= size - index; i++) {
        elementData[i] = elementData[i+1];
    }
    
    size -= 1;
}
