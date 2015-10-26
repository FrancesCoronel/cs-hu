     .arch armv6
     .section     .rodata
     .align 2
.data
.LC0:
     .text
     .align 2
     .global main
     .type main, %function
main:
			@ System Call #59 Hello World
      mov r7, #59
      svc #0
            @ System Call #1 Exit
      mov r7, #1
      mov r0, #0
      svc #0
.L3:
     .align 3
.L2:
     .size main, .-main
     .ident "GCC: (Debian 4.6.3-14+rpi1) 4.6.3"
     .section    .note.GNU-stack,"",%progbits
