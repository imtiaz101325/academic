include 'emu8086.inc'

.model
  small
.stack
  100h
.data

.code
  mov ax,@data
  mov ds,ax
main proc
    mov ah,1
    int 21h   
    mov ah,2
    mov dl,13
    int 21h
    mov dl,10
    int 21h
    mov dl,34h
    int 21h

;mov dx,0
;mov ax,10000
;mov bx,7
;div bx
endp main
DEFINE_SCAN_NUM
DEFINE_PRINT_STRING
DEFINE_PRINT_NUM
DEFINE_PRINT_NUM_UNS
DEFINE_PTHIS
