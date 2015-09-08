'''
FVCproductions
September 18, 2014
Python
CSC291_Project3
'''

# Binary Search: (20 pts)
#   Implement binary search, submit it to the course website. You must write a
#   function bsearch that takes and list and an element to search for.  This
#   function should return the index of the element if found and -1 otherwise.
#
#   Note: Pay attention to the order of the paremeters specified above.
#
#   Challenge (not mandatory): Learn about recursion and also write a function bsearchRecursive that
#                              uses recursion to find the index of the value.

sortedList = [1,2,3,4,5] #sorted list

target = 3 #element to search for

print "sorted list: " + str(sortedList)

print "\nelement to search for: " + str(target)

# challenge bit

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

recursive_output = bsearch(sortedList, target)

print "\nbsearch recursive - index of element: " + str(recursive_output)
    