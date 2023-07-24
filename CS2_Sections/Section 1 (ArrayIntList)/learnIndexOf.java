 public int learnIndexOf(int value) {
     for (int i = 0; i < size; i++) {
         if (elementData[i] == value) {
             return i;
         }
     }
     return -1;
 }
