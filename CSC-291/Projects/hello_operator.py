'''
FVCproductions
September 18, 2014
Python
CSC291_Project2
'''

# This is a comment.  A line beginning with a # symbol is a comment.
# Comments are not executed by the python interpreter.

# Make sure you read all of the comments in this file carefully!

# This project will test your understanding of variables and operators.
# Operators (General Definition):
#       http://en.wikipedia.org/wiki/Operator_(computer_programming)

# You will be given a series of mathematical and logical tasks.  Implement these
# ONLY using variables and operators.  No loops, conditionals, functions or data
# structures should be used.  You will only be working with the basic data
# types: Integer, Float, String, and Boolean.

# Operators that you can use:
#       +, -, *, /, %, **, //,
#       ==, !=, <>, >, <, >=, <=,
#       =, +=, -=, *=, /=, %=, **=, //=,
#       and, or, not,
#       &, |, ^, ~, <<, >>

# Format for each problem: (READ THIS CAREFULLY)
#   # Problem <problem number>:
#   # Value -  <how many points this problem is worth for your grade>
#   <input variables for the problem>
#   # Task: <description of the problem>
#   # Solution:
#   # Replace this code with your solution.

# Code Example:
#   # Problem 1:
#   # Value -  5
#   a = 1
#   b = 1
#   # Task: Add 'a' and 'b' and store the result in a variable named output.
#   # Solution:
#   # Replace this comment with your solution.

# A Correct Solution:
#   output = a + b

# A WRONG Solution:
#   output = 2
# Note how output would be wrong a = 5  and b = 1.

# Grading Rubric:
#   Problems: 80pts
#      - For each problem you solve correctly you will get the points assigned
#        to it.
#   Problem Efficiency: 10pts
#      - Many problems can be solved many ways.  You will be graded on the
#        number of variables and operators used. The fewer the better!
#   Readability and Style: 10pts
#      - You code should be readable and concise

# Notes
#   - The variable values provided below for testing will not be the same ones
#     used for grading.
#   - This is an individual project.  You must complete all work on your own.
#   - Good Luck!!!

# --- End of Instructions ---

# Problem 1:
# Value - 5
a = 5
# Task: Cube 'a' and store the result in a variable named output.
#       Example: if  a = 3 then output should be 27
# Solution:
output = a*a*a

# Problem 2:
# Value - 5
a = 5
b = 7
# Task: Implement xor (abbreviation for 'exclusive or'). Xor should be true if a
#       and b are not the same. Store the value of a xor b in a variable named
#       output.
#       Example: 2 xor 9 = True
# Solution:
output = a != b


# Problem 3:
# Value - 5
a = 'one'
b = 'two'
c = 'three'
# Task: Combine a, b, and c to form a sentence. Any sentence will do! Remember
#       during grading a, b and c will be different than above.
#
# Solution:
output = a + " little pig " + b + " little pigs and " + c + " little piggies came out to play"


# Problem 4:
# Value - 5
value1 = 'one'
value2 = 'two'
# Task: Swap value1 and value2. Given value1 and value2 above make sure that you
#       swap value1 to be value2, and value2 to be value1.
#
#       Hint: Make sure you preserve both values during the swap.
#       Example:
#              Before Swapping: value1 = 'f' and value2 = 'g'
#              After Swapping: value1 = 'g' and value2 = 'f'
# Solution:
value3 = ""
value3 = value1
value1 = value2
value2 = value3


# Problem 5:
# Value - 5
a = 1
b = 2
c = 3
# Task: Check to see if a is between b and c.  Make a variable output that is
#       True if a is between b and c, but False otherwise.
#
# Solution:
output = (b < a < c) or (c < a < b)

# Problem 6:
# Value - 5
time = 17
# Task: Convert time from military to standard time and store it back in the
#       time variable.
#       Example: If time = 22 then once converted time should be 10.
# Solution:
time = ((time + 11) % 12 + 1)`
    

# Problem 7:
# Value - 5
#a = 18473
a = 123456
# Task: Store the thousandth digit in a in a variable named output.
#       Example: If a = 123456 then output should be 3.
# Solution:
output = a / 1000 % 10


# Problem 8:
# Value - 10
a = 381972
n = 3
# Task: Store the nth digit in a in a variable named output.
#       (The first digit is at n=1)
#       Example: If a = 7654321 and n = 3 then output should be 3.
# Solution:
output = (a / 10**(n-1)) % 10


# Problem 9:
# Value - 10
num = 4
# Task: Store num rounded to the nearest multiple of 10 in output.
#
# Solution:

# my first attempt: output = num - (num % 10) + 10 
# output = 37 - (37 % 10) + 10
# output = 37 - 7 + 10 
# output = 40
# first attempt failed - only works with numbers on higher end

# second attempt outlined
# needs to work with higher and lower end numbers
# output = 37 - (37 % 10) + ((37 % 5 >= 5 or 37 == 0) and 10)
# output = 37 - (7) + ((7 >= 5 or 37 == 0) and 10)
# output = 37 - (7) + ((True or False) and 10)
# output = 37 - (7) + ((True) and 10)

output = num - (num % 10) + ((num % 10 >= 5 or False) and 10)

# Problem 10:
# Value - 10
x1 = 0
y1 = 0
x2 = 0
y2 = 0
# Task: Calculate the distance between two points (x1, y1) and (x2, y2) and
#       store it in output.
#
# Solution:
output = ((x2-x1)**2+(y2-y1)**2)**.5


# Problem 11:
# Value - 15
a1 = 0
a2 = 3
b1 = 2
b2 = 4
# Task:  Given two ranges a1-a2 and b1-b2 determine it the two ranges overlap.
#        Store a boolean  representing the outcome in a variable named output.
# Example: Given two ranges 0-3 and 2-4 there is an overlap of 2-3 so output
#          would be True.
#
# Hint:  Remember number lines from math class!  Draw number lines to help you
#        visualize the problem.  Also think about your all the edge cases.
#
# Solution:
output = not((a2<b1) or (b2<a1))

   
# Problem BONUS:
# Value - 10
a = 33
# Task: Using only bit operators multiply a by 2 and store it in a variable
#       named output.
#
# Solution:
# Replace this code with your solution.\
output = a << 2 >> 1