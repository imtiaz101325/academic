include 'emu8086.inc'

.model small
.stack 100h

.data

m1 db "hello world$"
equal db "Two numbers are equal$"
big db "First number is greater$"
small db "Second number is smaller$"
prompt db "Enter a number$"

.code

mov ax,@data
mov ds,ax

main proc

;mov ah,1
;    int 21h
;    mov cl,al
;
;    mov ah,2
;mov dl,0Dh
;    int 21h
;mov dl,0Ah
;    int 21h
;
;    mov ah,2
;    mov dl,cl
;    int 21h


;LEA DX,m1
;    mov AH,9
;    int 21h
;
;mov dx,0
;mov ax,10000
;mov bx,7
;div bx
;

LEA DX,prompt
mov AH,9
int 21h
mov ah,2
mov dl,0Dh
int 21h
mov dl,0Ah
int 21h

mov ah,1
int 21h
mov cl,al
mov ah,2
mov dl,0Dh
int 21h
mov dl,0Ah
int 21h

LEA DX,prompt
mov AH,9
int 21h
mov ah,2
mov dl,0Dh
int 21h
mov dl,0Ah
int 21h

mov ah,1
int 21h
mov dl,al
mov ah,2
mov dl,0Dh
int 21h
mov dl,0Ah
int 21h

cmp cl, bl
je li1
jg li2
jl li3

li1:
LEA DX,equal
mov AH,9
int 21h
jmp end

li2:
LEA DX,big
mov AH,9
int 21h
jmp end

li3:
LEA DX,small
mov AH,9
int 21h
jmp end

end:

endp main


DEFINE_SCAN_NUM
DEFINE_PRINT_STRING
DEFINE_PRINT_NUM
DEFINE_PRINT_NUM_UNS
DEFINE_PTHIS







; [SOURCE]: C:\Users\15101054\Desktop\imti\mycode.asm
