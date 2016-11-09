include 'emu8086.inc'

.model small
.stack 100h
.data
.code
  mov ax,@data
  mov ds,ax
main proc


    mov ah,2
    mov dl,30h
    start:
    cmp dl,39h
    jg end
    int 21h
    mov cl,dl
    mov dl,0ah
    int 21h
    mov dl,0dh
    int 21h
    mov dl,cl
    inc dl
    jmp start
    end:


endp main
DEFINE_SCAN_NUM
DEFINE_PRINT_STRING
DEFINE_PRINT_NUM
DEFINE_PRINT_NUM_UNS
DEFINE_PTHIS
