{
  int i;
  int j;
  int[10] array;
  int n;
  int temp;
  array[0] = 34;
  array[1] = 56;
  array[2] = 4;
  array[3] = 10;
  array[4] = 77;
  array[5] = 51;
  array[6] = 93;
  array[7] = 30;
  array[8] = 5;
  array[9] = 52;
  n = 10;
  i = 0;
  j = i + 1;
  while( true ) {
    while( array[i] < n-1) {
      i = i + 1;
      while( array[j] < n) {
        j = j + 1;
        if (array[i] > array[j]) {
          temp = array[i];
          array[i] = array[j];
          array[j] = temp;
        }
      }
    }
  }
}