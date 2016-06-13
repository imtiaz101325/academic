include 'emu8086.inc'

.model small

.stack 100h   

.data

AA DB 2
  BB DB 9
  CC DB ?

.code
  mov ax,@data
  mov ds,ax
main proc
    
    MOV BX, AA
  START:
    MOV AX, AA
    AND AX, 0001B
    CMP AX, 0001B
    JE TRUE
  RETURN:
    INC AA
    MOV DX,AA
    CMP BX,DX
    JGE START
    JL END

  TRUE:
    MOV CX,CC
    MOV DX, AA
    ADD CX, DX
    MOV CC, CX
    JMP RETURN

  END:

    MOV AX,CC
    
endp main
DEFINE_SCAN_NUM
DEFINE_PRINT_STRING
DEFINE_PRINT_NUM
DEFINE_PRINT_NUM_UNS
DEFINE_PTHIS