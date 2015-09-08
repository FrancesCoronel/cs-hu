'''
FVCproductions
CS291_1
'''

correct = 7

number = int(raw_input("Guess what number I'm thinking of... "))

if number > correct:
    print "Sorry, not quite there. Your number is too big."
elif number < correct:        
    print "Sorry, not quite there. Your number is too small."
elif number == correct:
    print "Congrats! You guessed the correct number."
