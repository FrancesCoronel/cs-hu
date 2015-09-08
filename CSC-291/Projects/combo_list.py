'''
FVCproductions
September 29, 2014
Combining Two Lists in Python

Extra Credit
'''

'''
Here I'm using the slicing method: 
I'm creating a new list called list_3 
and then making the even index values of list_3 equal to all the list_1 values
then I will make all the odd index values of list_3 equal to all the list_2 values.
This way when list_3 is printed it will treat all the list_1 values as the even index values
and treat all the list_2 values as the odd index values. It will alternate between the odd and even values automatically!

e.g. if there are 4 values in total for both list_1 and list_2 then our list_3 (our final result) will look like this first:

original list_1: [1,4]
original list_2: [2,3]

before function implemented: [0,0,0,0]

# but after we implement the function combo_list, we'll be placing list_1 in all the odd indexes of list_3 and list_2 in all the even indexes of list_3
# booyah!!

after function implemented: [1, 2, 4, 3]

''' 

# defining list_1 with values given on board

list_1 = [1,3,"hello"]

# defining list_2 again with values given on board

list_2 = [5,10, 3.5]

def combo_list(list_1, list_2):

	# defined a list 3 as a list of the correct length using the list_1 and list_2 that were just defined
	# ergo, the list will be able to alternate between the even and odd indexes

	# what's going on here is that I'm making list_3 the sum of the lengths of both list_1 and list_2 and multiplying it by 0
	# so right now my list_3 looks like [0,0,0,0,0,0]
	# it has 6 values which is the sum of the length of list_1 and list_2 in this instance but it has 0 as it's placeholder

	list_3 = [0]*(len(list_1)+len(list_2))

	# using the slicing method (e.g.List[start:end]) to get all the even index values and push them into list_1
	# for reference, slicing works by taking a List = range(10) - so all numbers 1 through 10
	# List[::2] would output [2,4,6,8] because they are the even index values in the given range and in this case even numbers themselves

	list_3[::2] = list_1

	# using the splicing method all the odd index values
	# again, for reference, slicing works by taking a List = range(10) - so all numbers 1 through 10
	# List[1::2] would output [1,3,5,7,9] because they are the odd index values in the given range and in this case odd numbers themselves

	list_3[1::2] = list_2

	# printing the final reuslt which is the list_3 - the list combining both list_1 and list_2

	print "Alternating List 1 and List 2: " + str(list_3)

combo_list(list_1, list_2)