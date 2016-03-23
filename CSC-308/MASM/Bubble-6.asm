; This is a recursive implementation of printArray and bubbleSort

%INCLUDE "csci224.inc"

SEGMENT .data
arr:	DD	2, 5, 3, 7, 4, 3, 1, 9, 4, 2, 7, 6
len:	EQU 	($ - arr) / 4		; array length

SEGMENT .text
main:
	push	arr		; pass param by reference
	push	dword len	; pass param by value
	call	printArray	; print array before sorting

	push    arr             ; pass param by reference
        push    dword len       ; pass param by value
        call 	bubbleSort

        push    arr             ; pass param by reference
        push    dword len       ; pass param by value
        call    printArray      ; print array after sorting
   
	ret

;-----------------------------------------------------------
bubbleSort:
        cmp     [esp], dword .L2; first call?
        je      .L0		; NO  - proceed as usual

        push    dword [esp]     ; YES - copy ret address
        mov     [esp+4], dword 0 ; and insert initial value of ind

.L0	push 	ebp	
	mov	ebp, esp	; compose stack frame
	
	push	eax		; save used regs
	push	ecx
	push	esi
	push	edi

	mov	esi, [ebp+8]	; ind
	mov	edi, [ebp+16]	; edi = array address (of a[0])
	mov	ecx, [ebp+12]	; ecx = array.len
	dec	ecx		; ecx = array.len -1

.L1:	cmp	esi, ecx	; while (i < arr.len-1)
	jge	.L2	

	mov	eax, [edi + esi*4] ; eax = a[i]
	cmp	eax, [4 + edi + esi*4] ; if (a[i] > a[i+1])
	jle	.L3
	
	xchg	eax, [4 + edi + esi*4]
	xchg	eax, [edi + esi*4]
	mov	esi, 0		; i = 0
	jmp	.L4

.L3:	inc	esi		; i++

.L4     push    dword [ebp+16]	; passing parameters
        push    dword [ebp+12]
        push    esi
        call    bubbleSort	; recursive call

.L2:	pop	edi		; restore used regs
	pop	esi
	pop	ecx	
	pop	eax
	pop	ebp
	ret	12

;-----------------------------------------------------------
printArray:
	cmp	[esp], dword .L2; first call?
	je	.L0		; NO  - proceed as usual

	push	dword [esp]	; YES - copy ret address
	mov	[esp+4], dword 0 ; insert init value of index

.L0	push	ebp
	mov	ebp, esp	; compose stack frame

	push	eax		; save used regs
	push	esi

	mov	eax, [ebp+8]	; eax = ind
	cmp	eax, [ebp+12]	; termination condition
	jl	.L1		; return
	call	Crlf
	jmp	.L2	

.L1:	mov	esi, [ebp+16]	; set up array pointer
	mov	eax, [esi+eax*4]; eax = arr[i]
	call	WriteInt	; print it out
	mov	al, ' '		; print a space
	call	WriteChar

	push 	dword [ebp+16]	; passing params to recursion
	push	dword [ebp+12]
	push	dword [ebp+8]	
	inc	dword [esp]	; ind++
	call	printArray	; recursive call

.L2:	pop	esi		; restore used regs
	pop	eax
	pop	ebp

	ret	12		; get rid of 3 dwords in stack

