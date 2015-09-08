'''
FVCproductions
CS 291_2
Setember 10, 2014
'''

my_number = 7
input_number = 0

while my_number != input_number:
	
	input_number = int(raw_input("Give me a number: "))
	
	if my_number == input_number:
		print "Correct!"
	elif my_number < input_number:
		print "Too big!"
	elif my_number > input_number:
		print "Too small"
	
print "Thanks for for playing!"

names = ['violet', 'damien', 'cruella']

print "\n"

for n in names:
	print "hello " + n