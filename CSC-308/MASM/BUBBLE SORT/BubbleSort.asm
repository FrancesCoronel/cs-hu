;
; Bubble Sort Program
; Frances Coronel
; CSC 308
;

.386
.model flat,stdcall
.STACK

include kernel32.inc
include masm32.inc
includelib kernel32.lib
includelib masm32.lib

.DATA

; exit message
ExitMsg   byte	"Press any key to continue . . . ", 00dh, 00ah, 0

; new line
CRLF	byte	00dh, 00ah, 0

; defining variables
SPACE		byte	" ", 0
array		dword	34, 56, 4, 10, 77, 51, 93, 30, 5, 52
endarray	dword	0
arraysize	equ	endarray-array
temp		dword	0
string	byte	10 dup (0)
continue	byte	0

; unsorted and sorted array messages
UnsrtMsg	byte	"Unsorted Array", 00dh, 00ah, 0
SrtdMsg		byte	"Sorted Array", 00dh, 00ah, 0

.CODE
main	proc
	invoke	StdOut,addr UnsrtMsg

	; starting value is at 0 in for loop
	mov	ebx, 0

top1:

	; compare number in ebx to array size
	cmp	ebx, arraysize

	; if number is greater than or equal to array size
		; go to exit1 procedure
	jge	exit1

	; move number in array indexed by ebx to eax
	mov	eax, array[ebx]

	; push ebx on the stack
	push	ebx

	; convert number in eax to an ASCII string
	invoke 	dwtoa,eax,addr string

	; print out number
	invoke 	StdOut, addr string

	; print a SPACE
	invoke 	StdOut, addr SPACE

	; pop ebx off stack
	pop	ebx

	; increment number in ebx by 4
	add	ebx, sizeof(dword)

	; loop back to top of loop
	jmp	top1

exit1:

	; print new line
	invoke 	StdOut, addr CRLF

	; bubble sort
	; begin for loop
	mov	ebx, 0

outterloop:

	; compare number in ebx to arraysize - 1
	cmp	ebx, arraysize-sizeof(dword)

	; if number >= arraysize - 1
		; then end outer loop
	jge	endoutter
	mov	ecx, ebx

	; start ecx at ebx + 4 (j = i + 1)
	add	ecx, sizeof(dword)

innerloop:

	; compare number in ecx to array size
	cmp	ecx, arraysize

	; if number >= array size
		; then end inner loop
	jge	endinner

	; check if array[j] > array[i]
	; compare number in ecx to array size
	mov	eax, array[ebx]

	; compare array[i] to array[j]
	cmp	eax, array[ecx]

	; if array[i] <= array[j], go to around procedure
	jle 	around

	; exchange elements
	; temp = array[i]
	mov	temp, eax

	; move array[j] in eax
	mov	eax, array[ecx]

	; array[i] = array[j]
	mov 	array[ebx], eax

	; get temp in eax
	mov	eax, temp

	; array[j] = temp
	mov 	array[ecx], eax

around:

	;	define around procedure
	; increment inner loop variable and continue looping
	; increment number in ebx by 4
	add	ecx, sizeof(dword)

	; loop back to top of loop
	jmp	innerloop

endinner:

	; define end inner procedure
	; increment the outer loop variable and continue looping
	; increment number in ebx by 4
	add	ebx, sizeof(dword)

	; loop back to top of loop
	jmp	outterloop

endoutter:

	invoke 	StdOut, addr CRLF
	invoke	StdOut, addr SrtdMsg

	; for (i = 0; i < arraysize; i++)
	; start loop at 0
	mov	ebx, 0

top2:

	; compare number in ebx to array size
	cmp	ebx, arraysize

	; if number if greater than or equal to array size
		; go to end of exit2 procedure
	jge	exit2

	; print out number
	; move number in array indexed by ebx to eax (array[i])
	mov	eax, array[ebx]

	; push ebx on stack
	push	ebx

	; convert number in eax to ASCII string
	invoke 	dwtoa, eax, addr string

	; print number from array
	invoke 	StdOut, addr string

	; print space
	invoke 	StdOut, addr SPACE

	; pop ebx off stack
	pop	ebx

	; increment loop variable and continue looping
	; increment number in ebx by 4 (i++)
	add	ebx, sizeof(dword)

	; go to top2 procedure
	jmp	top2

exit2:

	; print out new line
	invoke 	StdOut, addr CRLF

	;	print out exit message
	invoke 	StdOut, addr ExitMsg

	; read in to keep console window open
	invoke 	StdIn, addr continue, 1

	; exit
	invoke 	ExitProcess, 0

; end program
main	endp
	end	main