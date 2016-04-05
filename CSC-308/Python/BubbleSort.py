# FVCproductions
# Python Bubble Sort Program
# CSC 308

def BubbleSort(array):
  # print unsorted array
  print("Unsorted Array")
  buffer = ""
  for i in range(len(array)):
    buffer = buffer + str(array[i]) + " "
  print(buffer)
  # bubble sort
  for i in range(len(array)-1, 0, -1):
    for j in range(i):
      if array[j] > array[j+1]:
        array[j], array[j + 1] = array[j + 1], array[j]
  # print sorted array
  print("\nSorted Array")
  buffer = ""
  for i in range(len(array)):
    buffer = buffer + str(array[i]) + " "
  print(buffer)
  # input message
  input("\nPress any key to continue . . .")

# calling BubbleSort function with given numbers
BubbleSort([ 34, 56, 4, 10, 77, 51, 93, 30, 5, 52 ])