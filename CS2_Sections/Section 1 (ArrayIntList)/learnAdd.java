public void learnAdd(int index, int value) {
    
    size++;
    
    for (int i = size; i >= 0; i--) {
        if (i == index) {
            elementData[i] = value;
            break;
        }
        elementData[i] = elementData[i-1];
    }
}
