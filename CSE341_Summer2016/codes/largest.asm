include 'emu8086.inc'

.model small
.stack 100h
.data
  prompt db "Enter a number within the range 0-9: $"
  firstBig db "First number is biggest: $"
  secondBig db "Second number is biggest: $"
  thirdBig db "Third number is biggest: $"
  firstSmall db "First number is smallest: $"
  secondSmall db "Second number is smallest: $"
  thirdSmall db "Third number is smallest: $"
.code
  mov ax,@data
  mov ds,ax
main proc
  lea dx,prompt
  mov ah,9
  int 21h

  mov ah,1
  int 21h

  mov cl,al
  mov dl,0dh
  mov ah,2
  int 21h
  mov dl,0ah
  mov ah,2
  int 21h

  lea dx,prompt
  mov ah,9
  int 21h

  mov ah,1
  int 21h

  mov ch,al
  mov dl,0dh
  mov ah,2
  int 21h
  mov dl,0ah
  mov ah,2
  int 21h

  lea dx,prompt
  mov ah,9
  int 21h

  mov ah,1
  int 21h

  mov bl,al
  mov dl,0dh
  mov ah,2
  int 21h
  mov dl,0ah
  mov ah,2
  int 21h

  cmp cl,ch
  jg first
  jl second
  ;jmp end

  first:
  cmp cl,bl
  jg firstBigger
  jl thirdBigger
  ;jmp end

  firstBigger:
  lea dx,firstBig
  mov ah,9
  int 21h
  mov dl,cl
  mov ah,2
  int 21h
  mov dl,0dh
  mov ah,2
  int 21h
  mov dl,0ah
  mov ah,2
  int 21h
  cmp ch,bl
  jg thirdSmaller
  jl secondSmaller
  ;jmp end

  second:
  cmp ch,bl
  jg secondBigger
  jl thirdBigger

  secondBigger:
  lea dx,secondBig
  mov ah,9
  int 21h
  mov dl,ch
  mov ah,2
  int 21h
  mov dl,0dh
  mov ah,2
  int 21h
  mov dl,0ah
  mov ah,2
  int 21h
  cmp cl,bl
  jg thirdSmaller
  jl firstSmaller

  thirdBigger:
  lea dx,thirdBig
  mov ah,9
  int 21h
  mov dl,bl
  mov ah,2
  int 21h
  mov dl,0dh
  mov ah,2
  int 21h
  mov dl,0ah
  mov ah,2
  int 21h
  cmp cl,ch
  jg secondSmaller
  jl firstSmaller

  firstSmaller:
  lea dx,firstSmall
  mov ah,9
  int 21h
  mov dl,cl
  mov ah,2
  int 21h
  mov dl,0dh
  mov ah,2
  int 21h
  mov dl,0ah
  mov ah,2
  int 21h
  jmp end

  secondSmaller:
  lea dx,secondSmall
  mov ah,9
  int 21h
  mov dl,ch
  mov ah,2
  int 21h
  mov dl,0dh
  mov ah,2
  int 21h
  mov dl,0ah
  mov ah,2
  int 21h
  jmp end

  thirdSmaller:
  lea dx,thirdSmall
  mov ah,9
  int 21h
  mov dl,bl
  mov ah,2
  int 21h
  mov dl,0dh
  mov ah,2
  int 21h
  mov dl,0ah
  mov ah,2
  int 21h
  jmp end

  end:
  ; lea dx,
  ; mov ah,9
  ; int 21h
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