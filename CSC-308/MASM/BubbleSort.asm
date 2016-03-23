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