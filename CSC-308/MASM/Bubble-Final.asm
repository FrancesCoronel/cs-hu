;
; Bubble Sort Program
;
.386
.model flat,stdcall
.STACK

include kernel32.inc
include masm32.inc
includelib kernel32.lib
includelib masm32.lib

.DATA
ExitMsg   byte	"Press any key to continue . . . ", 00dh, 00ah, 0

CRLF	byte	00dh, 00ah, 0 ; new line
;
;	defining variables
;
SPACE	byte	" ", 0
UnsrtMsg	byte	"Unsorted Array", 00dh, 00ah, 0
SrtdMsg	byte	"Sorted Array", 00dh, 00ah, 0
array	dword	34, 56, 4, 10, 77, 51, 93, 30, 5, 52
endarray	dword	0
arraysize	equ	endarray-array
	temp	dword	0

string	byte	10 dup (0)
continue	byte	0

debug  	byte	"DEBUG", 00dh, 00ah, 0
.CODE
main	proc
	invoke	StdOut,addr UnsrtMsg
;
;		Begin for loop
;
	mov	ebx,0			; starting value is 0
top1:
	cmp	ebx,arraysize				; compare the number in ebx to arraysize
	jge	exit1						; if the number is greater than or equal to arraysize, go to exit1 procedure
;
;		Print the number
;
	mov	eax,array[ebx]		; move the number in array indexed by ebx to eax
	push	ebx						; push ebx on the stack
	invoke 	dwtoa,eax,addr string	; convert the number in eax to an ASCII string
	invoke 	StdOut,addr string		; print the number
	invoke 	StdOut,addr SPACE		; print a SPACE
	pop	ebx							; pop ebx off the stack
;
;		Increment the loop variable and continue looping
;
	add	ebx,sizeof(dword)			; increment the number in ebx by 4
	jmp	top1					; loop back to the top of the loop
exit1:
	invoke 	StdOut,addr CRLF		; print a CR LF


;		BubbleSort
;
	mov	ebx,0						; Begin for loop
outterloop:
	cmp	ebx,arraysize-sizeof(dword)	;  compare the number in ebx to arraysize - 1
	jge	endoutter					;  if the number is greater than or equal to arraysize -1, end the outter loop
	mov	ecx,ebx					;
	add	ecx,sizeof(dword)			;  start ecx at ebx + 4 (j = i + 1;)
innerloop:
	cmp	ecx,arraysize			;  compare the number in ecx to arraysize
	jge	endinner					;  if the number is greater than or equal to arraysize, end the inner loop
;
;		check that array[j] is < array[i]

	mov	eax, array[ebx]			;	compare the number in ecx to arraysize
	cmp	eax, array[ecx]			;	compare array[i] to array[j]
	jle 	around				;	if array[i] <= array[j], go to around procedure

;
;		Exchange elements
;
	mov	temp, eax					;	temp= array[i]
	mov	eax, array[ecx]			;	get array[j] in eax
	mov 	array[ebx],eax			;	array[i] = array[j]
	mov	eax, temp				;	get temp in eax
	mov 	array[ecx], eax		;	array[j] = temp


around:
;
;		Define around procedure - Increment the inner loop variable and continue looping
;
	add	ecx,sizeof(dword)			; increment the number in ebx by 4
	jmp	innerloop			; loop back to the top of the loop
endinner:
;
;		Define endinner procedure - Increment the outter loop variable and continue looping
;
	add	ebx,sizeof(dword)			; increment the number in ebx by 4
	jmp	outterloop					; loop back to the top of the loop
endoutter:
	invoke 	StdOut,addr CRLF
	invoke	StdOut,addr SrtdMsg
;
;		for (i = 0;  i < arraysize;  i++)
;
	mov	ebx,0						; 	start the loop at 0
top2:
	cmp	ebx,arraysize				; 	compare the number in ebx to arraysize
	jge	exit2						; 	if the number is greater than or equal to arraysize, go to end exit2 procedure
;
;		Print the number
;
	mov	eax,array[ebx]		; 	move the number in array indexed by ebx to eax (array[i])
	push	ebx						; 	push ebx on the stack
	invoke 	dwtoa,eax,addr string	; 	convert the number in eax to an ASCII string
	invoke 	StdOut,addr string	; 	print the number
	invoke 	StdOut,addr SPACE		; 	print a SPACE
	pop	ebx							; 	pop ebx off the stack
;
;		Increment the loop variable and continue looping
;
	add	ebx,sizeof(dword)	; 	increment the number in ebx by 4 (i++)
	jmp	top2						; 	go to top2 procedure
exit2:
	invoke 	StdOut,addr CRLF	; 	print a new line

;		Print the exit message
;
	invoke 	StdOut,addr ExitMsg		;	print the exit message
	invoke 	StdIn,addr continue,1	; 	readin to keep console window open

	invoke 	ExitProcess,0	;	exit

main	endp				;	end the program
	end	main