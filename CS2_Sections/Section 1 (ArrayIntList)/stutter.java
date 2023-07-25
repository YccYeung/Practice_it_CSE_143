public void stutter() {
    
    for (int i = size-1; i >= 0; i--) { 
        elementData[2*i+1] = elementData[i];
        elementData[2*i] = elementData[i];
    }
    size *=2;
}
