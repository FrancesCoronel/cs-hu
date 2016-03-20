;
; Compare Two Numbers
;
.386
.model flat,stdcall
.STACK

include kernel32.inc
include masm32.inc
includelib kernel32.lib
includelib masm32.lib

.DATA
ExitMsg  	byte	"Press any key to continue . . . ", 00dh, 00ah, 0

PromptMsg 	byte	"Enter the Number   ", 00dh, 00ah, 0 

SizeMsg	byte	" is the larger number ", 00dh, 00ah, 0

number1	byte	10 dup (0)
number2	byte	10 dup (0)
larger	byte	10 dup (0)
continue	byte	0

.CODE
main	proc
;
;		Get the first number	
;
	invoke	StdOut,addr PromptMsg		; prompt for the first number
	invoke	StdIn,addr number1,10		; length returned in eax
	invoke	StripLF,addr number1		; strip newline character       		
	invoke	atodw,addr number1		; convert ASCII string to decimal number
	mov	ebx,eax			; move first number from eax to ebx
;
;		Get the second number
;	
	push 	ebx			; push ebx to the stack
	invoke	StdOut,addr PromptMsg		; prompt for the second number
	invoke	StdIn,addr number2,10		; length returned in eax
	invoke	StripLF,addr number2		; strip newline character
	invoke	atodw,addr number2		; convert ASCII string to decimal number
	pop	ebx			; pop ebx off the stack
;
;		Compare the two numbers
;
	cmp	eax,ebx			; compare first number in ebx to second number in eax
	jge	second			; second number is larger
first:
	invoke 	dwtoa,ebx,addr larger		; convert the first number in ebx to an ASCII string
	jmp	around
second:
	invoke	dwtoa,eax,addr larger		; convert the second number in eax to an ASCII string
around:
;
;		Print the result
;
	invoke 	StdOut,addr larger		; print the number			
	invoke 	StdOut,addr SizeMsg		; print "is the larger number" CR LF
;
;		Print the exit message
;
	invoke 	StdOut,addr ExitMsg		; print the exit message
	invoke 	StdIn,addr continue,1		; read to keep console window open

	invoke 	ExitProcess,0

main	endp
	end	main