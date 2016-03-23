# FVCproductions
# March 23, 2016
# Bubble Sort Program
#!/usr/bin/ruby

# define array

array = [ 34, 56, 4, 10, 77, 51, 93, 30, 5, 52 ]

# print out unsorted array

print "Unsorted Array \n"

for i in 0..(array.length - 2)
  print array[i], " "
end

# bubble sort algo

for i in 0..(array.length - 2)
  for j in i + 1..(array.length - 1)
    # swap method described in class
    if array[i] > array[j]
      array[i], array[j] = array[j], array[i]
    end
  end
end

# print sorted array

print "\n\nSorted Array\n"

for i in 0..array.length-2
  print array[i], " "
end

# press any key to continue

print "\n\nPress any key to continue . . ."
gets


