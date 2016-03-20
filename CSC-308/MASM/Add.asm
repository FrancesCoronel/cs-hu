;
; Add Two Numbers
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

CRLF	byte	00dh, 00ah, 0

FirstMsg 	db	"Enter the first number", 00dh, 00ah, 0 
SecondMsg 	db	"Enter the second number", 00dh, 00ah, 0 
SumMsg 	db	"The sum is ", 0 

number1	byte	10 dup (0)
number2	byte	10 dup (0)
result	byte	10 dup (0)
continue	byte	0

.CODE
main	proc
;
;		Get the first number	
;
	invoke	StdOut,addr FirstMsg		; prompt for the first number
	invoke	StdIn,addr number1,10		; length returned in eax
	invoke	StripLF,addr number1		; strip newline character       		
	invoke	atodw,addr number1		; convert ASCII string to decimal number returned in eax
	mov	ebx,eax			; move first number from eax to ebx
;
;		Get the second number
;	
	push	ebx			; push ebx to the stack
	invoke	StdOut,addr SecondMsg		; prompt for the second number
	invoke	StdIn,addr number2,10		; length returned in eax
	invoke	StripLF,addr number2		; strip newline character
	invoke	atodw,addr number2		; convert ASCII string to decimal number returned in eax
	pop	ebx			; pop ebx off the stack
;
;		Add the two numbers
;
	add	eax,ebx			; add first number in ebx to second number in eax
;
;		Convert the decimal number to an ASCII string
;	          
	invoke	dwtoa,eax,addr result		; convert the decimal number in eax to an ASCII string
;
;		Print the results
;
	invoke	StdOut,addr SumMsg		; print sum message
	invoke 	StdOut,addr result		; print the number			
	invoke 	StdOut,addr CRLF		; print CR LF
;
;		Print the exit message
;
	invoke 	StdOut,addr ExitMsg		; print the exit message
	invoke 	StdIn,addr continue,1		; read to keep console window open

	invoke 	ExitProcess,0			; exit

main	endp
	end	main
