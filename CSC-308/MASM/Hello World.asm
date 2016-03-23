;
; Hello World!
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

HelloMsg	byte	"Hello World!", 0
CRLF  	byte	00dh, 00ah, 0

continue	byte	0

.CODE
main	proc
;
;	Print Hello World!
;
	invoke StdOut, addr HelloMsg		; print "Hello World!"
 	invoke StdOut, addr CRLF			; print CR LF
 ;
 ;	Print the exit message
 ;	
	invoke 	StdOut,addr ExitMsg		; print the exit message
	invoke 	StdIn,addr continue,1		; read to keep console window open
		 
 	invoke ExitProcess, 0			; exit
main	endp
	end	main