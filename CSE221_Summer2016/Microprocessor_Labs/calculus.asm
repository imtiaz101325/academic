include 'emu8086.inc'

.model small
.stack 100h
.data

   se db "x dx$"

.code
  mov ax,@data
  mov ds,ax
main proc

    mov ah,2
    mov dl,09h
    int 21h
    mov dl,0F4h
    int 21h
    mov dl,0dh
    int 21h
    mov dl,0ah
    int 21h
    mov dl,09h
    int 21h
    mov dl,0F5h
    int 21h
    lea dx,se
    mov ah,9
    int 21h
    
endp main
DEFINE_SCAN_NUM
DEFINE_PRINT_STRING
DEFINE_PRINT_NUM
DEFINE_PRINT_NUM_UNS
DEFINE_PTHIS
