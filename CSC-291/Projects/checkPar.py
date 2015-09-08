from collections import Counter

def checkPar(string):
	
	yes = []
	no = []
	
	for letter in string:
		if letter == '(' or '[':
			yes.append(letter)
		else:
			no.append(letter)
	
	if Counter(yes) == Counter(no):
		return True
	
	return False

print checkPar("()")
print checkPar(")")