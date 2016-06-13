include 'emu8086.inc'

.model small

.stack 100h   

.data

.code
  mov ax,@data
  mov ds,ax
main proc
        
    mov bl,1h
    mov cx,0h
    mov dx,0h
    start:
    cmp cl,2h
    jge end
    mov ah,1    
    int 21h
    sub al,30h
    mul bl
    add dx,ax
    mov al,bl
    mov bl,10h
    mul bl
    mov bx,ax
    inc cl
    jmp start
    end: 
    
    
    ;mov ah,1
;    int 21h
;    mov bx,ax
;    sub bx,30h
;    int 21h
;    mov cx,ax
;    sub cx,30h
    
    
    ;mov ah,1
;    int 21h   
;    mov ah,2
;    mov dl,13
;    int 21h
;    mov dl,10
;    int 21h
;    mov dl,34h
;    int 21h

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