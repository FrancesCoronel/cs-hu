# import everything

from pylab import *

# import time

from datetime import datetime

# binary function

def bsearch(blist, element):
    low = 0
    high = len(blist)-1
    while low <= high:  
        mid = (low+high)/2
        test = blist[mid]
        if element == test:
            return mid
        elif element < test:
            high = mid -1
        else:
            low = mid +1
    return -1

# plotting

x = []
y = []

xlabel('time (seconds)')
ylabel('number of elements in sorted list')
title('plot of binary search timer')
grid(True)

for length in range(1000):
	sortedList = range(length)
	start_time = datetime.now()
	bsearch(sortedList, 3);
	finish_time = datetime.now()
	difference_time = finish_time - start_time
	btime = (difference_time.microseconds)/(1000)
	x += len(sortedList)
	y += btime

plot(x, y)

show()