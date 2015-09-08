'''
Goal
We are implementing a very simple, small hash map. We are dealing with collisions in a somewhat naive, simple way.

Method

Make a list of 10 elements (start it off as 10 Nones)

Make a function called hash that takes in a string, and returns an integer between 0 and 9. 
It should return the same integer if I give it the same string twice. 
If I give it two different strings, it should return two different integers with high probability.

Make a function called store that takes in a key and value; 
It should hash the key (using your hash function!) 
and then store both the key and the value (as a tuple) at the index of the list that you get out of the hash function.
If there is already something there, it should return an error (for now)

Make a function called retrieve that takes in a key and finds the appropriate value in the list:
The function should hash the key and then look at the hashed index. 
If there is nothing there, return None. If there is something there, check whether the key matches. 
If it matches, return the value. if it does not match, return None.

Modify store and retrieve so that they deal with collisions better: 
if there is a collision, at that index, store a list of tuples instead of just a tuple 
you may want to change the structure altogether so that everythings a list of tuples instead of a tuple to start with 
When retrieving, go through the list of tuples, and find the right one based on the key.
'''

myList = [ [],[],[],[],[],[],[],[],[],[] ] # 10 empty lists within 1 list

def hash(string): # hash function that takes in string
	value = len(string) % 9
	print "hash: " + string + " -> " + str(value)
	return value
 
def store(key, value): # store function that takes in key and value
	index = hash(key)
	if myList[index] != []:
		return "error" 
	else:
		myList[index] = [key,value]
		return "store: '" + str(value) + "' at list[" + str(key) + "]"

'''
Make a function called retrieve that takes in a key and finds the appropriate value in the list:
The function should hash the key and then look at the hashed index. 
If there is nothing there, return None. If there is something there, check whether the key matches. 
If it matches, return the value. if it does not match, return None.
'''

def retrieve(key): # retrieve function that takes in key
	index = hash(key)
	if myList[index] == []:
		return None
	
	else:	
		for i in myList[index]:
			if i == key: # check whether key matches
				return myList[index]
		return None

hash("meep")
print store("lol", 4)
print "list: " + str(myList)
print retrieve("lol")
