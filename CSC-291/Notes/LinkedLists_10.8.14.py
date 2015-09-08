'''
FVCproductions
LinkedLists_10.8.14.py
October 8, 2014
'''

# declaring linked list x and assinging some numbers to it

x = [3, 4, 5, 6, 98, 0] 

y = [x, 5, 90]

print "x: " + str(x) + "\n"
print "y: " + str(y) + "\n"

node1 = (5, None)
node2 = (3, node1) 
node3 = (7, node2)
node4 = (32, node3)

print "node 1: " + str(node1) + "\n"
print "node 2: " + str(node2) + "\n"
print "node 3: " + str(node3) + "\n"
print "node 4: " + str(node4) + "\n"


def printList(headNode):

	print headNode[0]
	restOfList = headNode[1]
	if restOfList == None:
		pass
	else:
		printList(restOfList)

print "printList function: \n"
printList(node4)

'''

recursion
=========

1. base case - stopping point
2. recursive case
3. what do you actually do every time through?


output
======

x: [3, 4, 5, 6, 98, 0]

y: [[3, 4, 5, 6, 98, 0], 5, 90]

node 1: (5, None)

node 2: (3, (5, None))

node 3: (7, (3, (5, None)))

node 4: (32, (7, (3, (5, None))))

printList function: 

32
7
3
5

'''

node2 = (3, None)
node1 = (5, node2)

def insert(head, toInsert):
	'''
	insert toInsert into the linked list
	directly after head
	'''
	secondNode = head[1]
	toInsert[1] = secondNode
	head[1] = toInsert
	return head

print node1

newNode = [10,None]
insert(node1, newNode)

print node1

def makeUserList():
	'''
	asks user for numbers and appends them to
	list until user enters -1
	'''

def printLinkedList(headNode):
  print headNode["data"]
  nxt = headNode["nextNode"]
  if headNode["nextNode"] is not None:
    printLinkedList(nxt)

def insertAfterNode(headNode, toInsert):
  '''
  insert a new node, toInsert, into the linked list that starts at headNode, directly after headNode
  '''
  nxt = headNode["nextNode"]
  toInsert["nextNode"] = nxt
  headNode["nextNode"] = toInsert

# Make a list:
tail = {"data":2, "nextNode":None}
node3 = {"data":67, "nextNode":tail}
node2 = {"data":3, "nextNode":node3}
head = {"data":5, "nextNode":node2} # this is the head, even though we added it last

# Print out the list:
print "original linked list:"
printLinkedList(head)

# add a new node directly after the head (first node):
newNode = {"data":75, "nextNode":None}
insertAfterNode(head, newNode)

# Print out again, there is now a 75 after the 5:
print "\nAfter first insertion:"
printLinkedList(head)

# Add yet another new node, this time directly after the tail (last node):
anotherNewNode = {"data":38, "nextNode":None}
insertAfterNode(tail, anotherNewNode)

# Print out one more time, there is now a 38 as the very last element:
print "\nAfter second insertion:"
printLinkedList(head)
