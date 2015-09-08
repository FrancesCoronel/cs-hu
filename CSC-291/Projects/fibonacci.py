'''
FVCproductions
October 10, 2014
Fibbonaci Sequence Algorithm
'''

def fib(n):

	if n == 0 or n == 1:
		return 1
	if n > 1:
		return fib(n-1)+fib(n-2)

element = 14
print "Fibbonaci sequence of " + str(element) + ": " +  str(fib(element))