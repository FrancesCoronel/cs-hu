;
; Nested Loops
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
;		Nested Loops
;
	mov	ebx,0			;  for (i = 0; i < arraysize - 1; i++)
outterloop:
	cmp	ebx,arraysize-sizeof(dword)		; compare the number in ebx to arraysize - 1 (i < arraysize - 1;)
	jge	endoutter			; jump if the number is greater than or equal to arraysize -1

	mov	ecx,ebx			;  for (j = i + 1; j < arraysize; j++)
	add	ecx,sizeof(dword)		; start ecx at ebx + 4 (j = i + 1;)
innerloop:
	cmp	ecx,arraysize			; compare the number in ecx to arraysize (j < arraysize;)
	jge	endinner			; jump if the number is greater than or equal to arraysize
;
;		Print indices i and j
;
	push	ebx			; save ebx
	push	ecx			; save ecx
	
	mov 	eax,ebx			; i is in ebx, move it to eax for printing
	invoke 	dwtoa,eax,addr string		; convert the number to an ASCII string
	invoke 	StdOut,addr string		; print the number			
	invoke 	StdOut,addr SPACE		; print a SPACE

	pop	ecx			; restore ecx
	push	ecx			; save ecx
		
	mov 	eax,ecx			; j is in ecx, move it to eax for printing
	invoke 	dwtoa,eax,addr string		; convert the number to an ASCII string
	invoke 	StdOut,addr string		; print the number			
	invoke 	StdOut,addr SPACE		; print a SPACE		

	invoke 	StdOut,addr CRLF		; print a CR LF	

	pop	ecx			; restore ecx
	pop	ebx			; restore ebx
;
;		End printing indices i and j
;
around:	
;
;		Increment the inner loop variable and continue looping
;	
	add	ecx,sizeof(dword)		; increment the number in ebx by 4 (j++)
	jmp	innerloop			; loop back to the top of the loop
endinner:
;
;		Increment the outter loop variable and continue looping
;	
	add	ebx,sizeof(dword)		; increment the number in ebx by 4 (i++)
	jmp	outterloop			; loop back to the top of the loop
endoutter:
;
;		Print the exit message
;
	invoke 	StdOut,addr ExitMsg		; print the exit message
	invoke 	StdIn,addr continue,1		; read to keep console window open

	invoke 	ExitProcess,0			; exit

main	endp
	end	main