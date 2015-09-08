'''
FVCproductions
Can I Spend Function

1. data structures? input?
2. example
3. how would i do it?

'''

def canISpend(money, prices):
	for price2 in prices: # for each price, try adding it to each price
		for price in prices:
			price_sum = price + price2
			if price_sum == money: # is that sum the same as my money? if yes, true
				return True;
	return False; # if i can't find anything, return false

money = 6
prices = [5,4,3,2,1]

print(canISpend(money, prices))

'''

Reverse a Sentence Function

1. split all letters of string with a space
2. initialize that split word to a variable
3. take that array of words that you just split
4. put the last position of array first and the first position last

'''

def reverseSentence(myString):
	for i in myString:
		word = myString.split(" ")
	r = " "
	reversed_word = r.join(reversed(word))
	return reversed_word

hello = "FVCproductions the is best Yoda,"
print reverseSentence(hello)

