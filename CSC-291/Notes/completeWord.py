'''

completeWord function

--- takes 2 inputs ---

'''

# completeWord function
def completeWord(aString, aList):
	for each in aList:
		if len(aString) == len(each):
			print "Before: " + aString + "  After: " + each

# calling function

completeWord("h.llo", ["hello", "halo", "cat"])

completeWord("l.d.a", ["lydia", "likewise", "lyria", "lynda"])