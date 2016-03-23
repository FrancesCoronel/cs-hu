;
; Print Array
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

SPACE	byte	" ", 0

array	dword	34, 56, 4, 10, 77, 51, 93, 30, 5, 52
endarray	dword	0
arraysize	equ	endarray-array

string	byte	10 dup (0)
continue	byte	0

.CODE
main	proc
;
;		for (i = 0;  i < arraysize;  i++)
;
	mov	ebx,0			; start the loop at 0 (i = 0;)
top:
	cmp	ebx,arraysize			; compare the number in ebx to arraysize (i < arraysize;)
	jge	exit			; jump if the number is greater than or equal to arraysize
;
;		Print the number
;
	mov	eax,array[ebx]			; move the number in array indexed by ebx to eax (array[i]) 
	push	ebx			; push ebx on the stack
	invoke 	dwtoa,eax,addr string		; convert the number in eax to an ASCII string
	invoke 	StdOut,addr string		; print the number			
	invoke 	StdOut,addr SPACE		; print a SPACE
	pop	ebx			; pop ebx off the stack
;
;		Increment the loop variable and continue looping
;	
	add	ebx,sizeof(dword)		; increment the number in ebx by 4 (i++)
	jmp	top			; loop back to the top of the loop
exit:
	invoke 	StdOut,addr CRLF		; print a CR LF
;
;		Print the exit message
;
	invoke 	StdOut,addr ExitMsg		; print the exit message
	invoke 	StdIn,addr continue,1		; read to keep console window open

	invoke 	ExitProcess,0			; exit

main	endp
	end	main