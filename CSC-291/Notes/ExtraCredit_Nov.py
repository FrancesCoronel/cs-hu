'''

Most Frequent Character in A String
FVCproductions

'''

# from collections library import Counter class

from collections import Counter

def frequentCharacter(string): # taking in string as input

	return Counter(string).most_common(1) 

	# using function already in Counter class called most_common, 
	# which literally just takes most common or most frequent character in whatever defined
	# in this case, we want the 1st most common/most frequent character in the string
	# which is why we put a 1 in most_common() and string in Counter

# our 3 test cases

print "Most frequent character in string 'bippity boppity boo': " + str(frequentCharacter('abacadraa')) + "\n"

print "Most frequent character in string 'Et tu, Brute?': " + str(frequentCharacter('Et tu, Brute?')) + "\n"

print "The red fox: " + str(frequentCharacter('The red fox')) + "\n"



'''

Substring Checker
FVCproductions

'''

def isSubString(longerString, shorterString): # taking in a longer and shorter string as input

	if len(shorterString) < len(longerString): # making sure shorter string is actually shorter and vice versa
		
		if shorterString in longerString: # if shorter is in longer, return true, else return false
			return True;
		
		else:
			return False;
	else: # if shorter not even shorter, then prints message to try again
		print "The shorter string is not actually shorter than the longer string - try again!"

# our 3 test cases

print "is bool in boolean algebra? " + str(isSubString("boolean algebra", "bool")) + "\n"

print "is carnage in carnivore? " + str(isSubString("carnivore", "carnage")) + "\n"

print "is coffee in cafe? " + str(isSubString("cafe", "coffee")) + "\n"
