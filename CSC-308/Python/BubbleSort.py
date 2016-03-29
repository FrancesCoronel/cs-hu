def BubbleSort(array):
  print("Unsorted Array")
  print(array)
  for i in range(len(array)-1, 0, -1):
    for j in range(i):
      if array[j] > array[j+1]:
        array[j], array[j + 1] = array[j + 1], array[j]
  print("Sorted Array")
  print(array)


BubbleSort([ 34, 56, 4, 10, 77, 51, 93, 30, 5, 52 ])