;
; Loop
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

i	byte	10 dup (0)
continue	byte	0

.CODE
main	proc
;
;		for (i = 1;  i < 10;  i++)
;
	mov	ebx,1			; start the loop at 1 (i = 1;)
top:
	cmp	ebx,10			; compare the number in ebx to 10 (i < 10;)
	jg	exit			; jump if the number is greater than 10
;
;		Print i
;
	mov	eax,ebx			; move the number in ebx to eax 
	push	ebx			; push ebx to the stack
	invoke 	dwtoa,eax,addr i		; convert the number to ASCII string
	invoke 	StdOut,addr i			; print the number			
	invoke 	StdOut,addr CRLF		; print CR LF
	pop	ebx			; pop ebx off the stack
;
;		Increment the loop variable and continue looping
;	
	add	ebx,1			; increment the number in ebx by 1 (i++)
	jmp	top			; loop back to the top
exit:
;
;		Print the exit message
;
	invoke 	StdOut,addr ExitMsg		; print the exit message
	invoke 	StdIn,addr continue,1		; read to keep console window open

	invoke 	ExitProcess,0			; exit

main	endp
	end	main