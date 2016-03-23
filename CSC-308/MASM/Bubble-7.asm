#   Print array example
##  Original author:      William D. McQuain -- 01/22/06
##  Register usage:
##     $t1     - array pointer
##     $t2     - value at array pointer
##     $t3     - limit on # of values in array
##     $v0     - syscall parameter / return value
##     $a0     - syscall parameters

	.data
list2:  .word   19, 13, 2, 7, 11, 5, 23, 29, 17, 3
size:   .word   10
lbl:    .asciiz "Comparing "
nl:     .asciiz "\n"
sp:     .asciiz " "

        .globl main

	.text
########################################################### main
main:
	la      $a0, list2
	li      $a1, 10
	jal     bubble_sort
	
	la      $a1, list2
	lw      $a0, size
	jal     print_integer_list
	
exit:
	li	$v0, 10
	syscall


bubble_sort:
########################################################### bubble_sort
        move    $t0, $a0
	addi    $s3, $a1, -1      # initialize outer loop limit

outer:                                  # outer bubble-sort loop
        bge     $zero, $s3, outer_end
        li      $s0, 0                  # initialize inner loop counter
	move    $s7, $t0      # put address of first elem in temp register
	addi    $s4, $s7, 4   # put address of next elem in temp register
inner:                                  # inner bubble-sort loop
        bge     $s0, $s3, inner_end
	
	lw      $t7, 0($s7)             # get value at current index
	lw      $t8, 0($s4)             # get value at "next" index
	
#	li      $v0, 4
#	la      $a0, lbl
#	syscall
#	
#	li      $v0, 1	# system call code for print_int
#	move    $a0, $t7	# integer to print
#	syscall		# print it
#
#	li      $v0, 4
#	la      $a0, sp
#	syscall
#	
#	li      $v0, 1	# system call code for print_int
#	move    $a0, $t8	# integer to print
#	syscall		# print it
#
#	li      $v0, 4
#	la      $a0, nl
#	syscall
		
	ble     $t7, $t8, no_swap
	sw      $t8, 0($s7)
	sw      $t7, 0($s4)
no_swap:	
	addi    $s0, $s0, 1                  # increment inner loop counter
	addi    $s7, $s7, 4
	addi    $s4, $s4, 4
	j       inner
inner_end:
        add     $s3, $s3, -1            # decrement outer loop limit
        j       outer
outer_end:
	jr      $ra


print_integer_list:
	.data
sep:    .asciiz " "
        .text
########################################################### print_integer_list
#  $a0 = size of list
#  $a1 = address of list
#
	move    $t1, $a1      # put address of list in temp register
	li      $t2, 0        # initialize loop counter
	move    $t3, $a0      # put size of list in temp register
print_loop:
	beq     $t2, $t3, print_loop_end     # stop after last elem is printed
	
	lw	     $a0, ($t1)              # print the value at the array pointer
	li	     $v0, 1
	syscall
	la	     $a0, sep                # print a separator value
	li	     $v0, 4
	syscall
	
	addi    $t2, $t2, 1                  # increment the loop counter
	addi    $t1, $t1, 4                  # step to the next array elem
	j       print_loop           # repeat the loop
print_loop_end:
        jr      $ra

# END OF PROGRAM
