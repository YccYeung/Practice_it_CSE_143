public boolean isPairwiseSorted() {
    
    int length = size - 1;
    
    if (size == 0 || size == 1) {
        return true;
    }
    
    if (size % 2 == 1) {
        length--;
    }
    
    for (int i = length; i >= 1; i-=2) {
        int first = elementData[i-1];
        int second = elementData[i];
        
        if (first > second) {
            return false;
        }
    }
    
    return true;
}
