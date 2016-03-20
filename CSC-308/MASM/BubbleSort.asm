Write a Bubble Sort program in the Macro Assembler Programming Language that sorts the array below in ascending order.  You should determine the size of the array by placing a label at the end of the array and using an equ statement, i.e., the program should be able to work with any size of array.  For example,

 array    dword 34, 56, 4, 10, 77, 51, 93, 30, 5, 52
endarray  dword 0
arraysize equ endarray-array


 In order to make comparisons between the various programming languages easier we will keep the variable name array, however we will not need the variables i, j, and temp, as these values will be held in registers.

  Array to be sorted is 34, 56, 4, 10, 77, 51, 93, 30, 5, 52

 The program should:

Print the unsorted array.
Use the Bubble Sort Algorithm to sort the array in ascending order.
Print the sorted array.

 The output should look like the following:

;
; Bubble Sort Program
;
.386
model flat, stdcall
.STACK

include kernel32.inc
include masm32.inc
includelib kernel32.lib
includelib masm32.lib

.DATA
ExitMsg   byte  "Press any key to continue . . . ", 00dh, 00ah, 0

array    dword 34, 56, 4, 10, 77, 51, 93, 30, 5, 52
endarray  dword 0
arraysize equ endarray-array

.CODE
main proc

;
; Print Unsorted Array Message
;
  invoke StdOut, addr UnsortedArray ; print "Unsorted Array: "
  ;
  ; for (i = 0; i < arraysize; i++)
  ;
  mov ebx, 0 ; start loop at 0 (i = 0)
top:
  cmp ebx, arraysize  ; compare # in ebx variable to array size (i < arraysize)
  jge exit  ; variable to
;
; Print Sorted Array Message
;
  invoke StdOut, addr SortedArray ; print "Sorted Array: "


;
; invoke CRLF
;
  exit:
    invoke StdOut, addr CRLF ; print CR LF

;
; Print exit message
;
  invoke StdOut, addr ExitMsg ; print exit message
  invoke StdIn, addr continue, 1 ; read to keep console window open after exit message

  invoke ExitProcess, 0 ; exit

main endp
  end main