'''

Problem 4

given a tuple (acts the same way as list, but immutable; uses () instead of [] ) of two numbers (call them M and N), 

print out an M by N rectangle of .

given a tuple of two numbers (M and N) as above, and an additional tuple of two numbers (call them X and Y), 

print out an M by N rectangle of ., EXCEPT at column X and row Y, instead of a ., print a *

Given a tuple of M and N as above, and a list of tuples of numbers (Xi, Yi), print out a rectangle of ., 
except print * whenever the column/row combination is in the list.

''' 

# m acts as rows
# n acts as columns

M = 5
N = 3

X = 2
Y = 3

tuple1 = (M, N)
tuple2 = (X, Y)

def makeRectangle(theTuple):

	for row in range(theTuple[0]):
		for col in range(theTuple[1]):
			print ".",
		print ""

makeRectangle(tuple1)

def replaceRectangle(theTuple, anotherTuple):

	for row in range(theTuple[0]):
		for col in range(theTuple[1]):
			[anotherTuple[0]][anotherTuple[1]] = "*"
			print ".",
		print ""

replaceRectangle(tuple1, tuple2)
