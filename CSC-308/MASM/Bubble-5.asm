TITLE BubbleSort					(main.asm)
INCLUDE Irvine32.inc

.data
	arr db 10 dup(?)
.code
main PROC
	Call Randomize
	Call Clrscr
	Call ClearRegs
	Call populateArray
	Call printArray
	
	call SortArray
	call printarray
main ENDP

ClearRegs proc

	mov eax,0
	mov ebx,0
	mov ecx,0
	mov edx,0
	mov esi,0
	mov edi,0

	ret
ClearRegs ENDP

SortArray proc
	mov ecx,100	; O(n^2)
	mov esi, offset arr
	L1:
		push ecx
		mov ecx,9
		L3:
			mov al,[esi]
			mov bl,[esi+1]

			cmp al,bl
			jg aGreaterThanB
			jle exitproc

			aGreaterThanB:
				xchg al,bl
				mov [esi],al
				mov [esi+1],bl
				jmp exitproc

			exitproc:
				inc esi
		loop l3
		mov esi,offset arr
		pop ecx
			
	loop L1

	

ret
SortArray ENDP

populateArray proc
	mov esi, offset arr
	mov ecx,10

	populateArr:
			mov eax,25
			Call RandomRange
			mov [esi],al
			inc esi
	loop populateArr
	
ret
populateArray ENDP

printArray proc
	mov ecx,10
	mov esi,offset arr
	L2:
		mov al,[esi]

		Call WriteInt
		mov al,09h
		Call WriteChar

		inc esi
	loop L2
	ret
printArray ENDP



END main