#
# Print Array
#
array = [34, 56, 4, 10, 77, 51, 93, 30, 5, 52 ]

print("The typical way to print in Python is")
print(array)

print("\nBut to make it look like the other languages you must do this")
buffer = ""

for i in range(len(array)):
    buffer = buffer + " " + str(array[i])
print(buffer)
                          
input('Press any key to continue . . .')
