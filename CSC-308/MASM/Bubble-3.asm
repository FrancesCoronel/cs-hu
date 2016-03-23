# Troy Mohl
# CS 216
# 10.11.99
# Bubblesort Array

# This program will bubble sort an array of up to 20 ints
# using 3 functions:
#			1. Input Integers
#			2. Bubble Sort Integers
#			3. Print Integers

# The user is to input integers, terminating with 20 or
# by typing in -1

# The program then bubble sorts the array.

# Then the array is printed to the screen.

.data
array: .space 80
prompt: .asciiz "Please type in up to 20 integers, -1 to end\n"
prmptint: .asciiz "Type an integer : "
nl: .asciiz "\n"
space: .asciiz "  "

.text
.globl main


#************** Main Function ********************
main: 	#prompt
      	li $v0, 4
      	la $a0, prompt
      	syscall

      	#init vars
      	la $s7, array		#give array register s6
  

      	#Read Integers
	move $a1, $s7
	jal readint
	move $s0, $v0		#s0 num of ints
     	
	#Sort Array
	move $a0, $s0
	move $a1, $s7
	jal sortarr

	#Print Array
	move $a0, $s0
	move $a1, $s7
	jal printarr

	#End Program
      	li $v0, 10			
      	syscall
#************** End Main Function ****************


#************** Read Int Function ****************     
readint:	#read integers
		#init loop var
		move $t7, $a1		#t7 is base addr of array
		move $t6, $zero		#t6 is count of ints read
loopint:       	#prompt
      		li $v0, 4
      		la $a0, prmptint
      		syscall
		
		#Get int
		li $v0, 5
                syscall

		#Check Value read
		move $t0, $v0			#t0 is current int
     		slt $t1, $t0, $zero
      		bne $t1, $zero, doneread 	#case negative
      		sw $t0, 0($t7)
      		add $t6, $t6, 1
      		add $t7, $t7, 4 
      		add $t2, $zero, 20
      		beq $t6, $t2, doneread   	#case got 20
      		j loopint
         
doneread: 	#return number of ints read
		move $v0, $t6
		jr $ra
#************** End Read Int Function ************ 


#************** Sort Arr Function **************** 
sortarr:	#sort the array
		#init fcn vars
		move $t4, $a1			#t4 array base
		move $t6, $a0			#t6 is num of ints 
		move $t0, $t6
		mul $t0, $t0, 4
		add $t0, $t0, $t7		#t0 is top pos

outloop:      	beq $t0, $t4, donesort  	#loop until hits first element
		move $t7, $t4			#t7 is array base that is mod
		#init loop vars
		move $t2, $zero			#reset start pos to 0
		sub $t3, $t6, 1			#so dont go out of array
inloop:		beq $t2, $t3, donein
      		
		#get elements
		lw $a0, 0($t7)
                lw $a1, 4($t7) 
      		
		#swap if needed
      		slt $t5, $a0, $a1
     		bne $t5, $zero, noswap
		
		#needs swap
      		add $t5, $zero, $a0
     		add $a0, $zero, $a1
     		add $a1, $zero, $t5
		
		#store switch in array
		sw $a0, 0($t7)
		sw $a1, 4($t7)

noswap:		#no swap/continue
		add $t2, $t2, 1
		add $t7, $t7, 4
                j inloop

donein:		#Large element in place, sort remaining
		sub $t0, $t0, 4
		j outloop     

donesort:      	#return to main
		jr $ra
#************** End Sort Arr Function ************


#************** Print Arr Function *************** 		
printarr:	#Print the array
		#init fcn vars
		move $t7, $a1			#t7 array base
		move $t6, $a0			#t6 is num of ints 
		move $t0, $t6
		mul $t0, $t0, 4
		add $t0, $t0, $t7		#t0 is top pos
		

		#print out the sorted array
prntloop: 	beq $t7, $t0, eprntloop		#loop to last position
      		
		#load element
		lw $t1, 0($t7)   
      
      		#printing syscalls
     		move $a0, $t1   
      		li $v0, 1
      		syscall
      		li $v0, 4
      		la $a0, nl
      		syscall

		#goto next element
      		add $t7, $t7, 4
      		j prntloop
      
eprntloop:	#return to main
		jr $ra
#************** End Print Arr Function ***********

