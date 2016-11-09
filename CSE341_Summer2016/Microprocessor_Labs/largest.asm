; Sk. Imtiaz Ahmed
; 15101054
; CSE341: Microprocessor Lab
; A program to print the largest and smallest of 3 numbers

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

  ; prompting user
  lea dx,prompt
  mov ah,9
  int 21h
  ; taking input
  mov ah,1
  int 21h
  ; moving input to free register
  mov cl,al

  ; newline
  mov ah,2
  mov dl,0dh
  int 21h
  mov dl,0ah
  int 21h

  ; prompting user
  lea dx,prompt
  mov ah,9
  int 21h
  ; taking input
  mov ah,1
  int 21h
  ; moving input to free register
  mov ch,al

  ; newline
  mov ah,2
  mov dl,0dh
  int 21h
  mov dl,0ah
  int 21h

  ; prompting user
  lea dx,prompt
  mov ah,9
  int 21h
  ; taking input
  mov ah,1
  int 21h
  ; moving input to free register
  mov bl,al

  ; newline
  mov ah,2
  mov dl,0dh
  int 21h
  mov dl,0ah
  int 21h

  ; compare first two numbers
  cmp cl,ch
  jg first
  jl second

  ; first number is bigger in initial comparison
  first:
  cmp cl,bl
  jg firstBigger
  jl thirdBigger

  ; first is largest
  firstBigger:
  ; print message
  lea dx,firstBig
  mov ah,9
  int 21h
  ; print number
  mov dl,cl
  mov ah,2
  int 21h
  ; newline
  mov dl,0dh
  int 21h
  mov dl,0ah
  int 21h
  ; compare rest
  cmp ch,bl
  jg thirdSmaller
  jl secondSmaller

  ; second number is bigger in initial comparison
  second:
  cmp ch,bl
  jg secondBigger
  jl thirdBigger

  ; second number is largest
  secondBigger:
  ; print message
  lea dx,secondBig
  mov ah,9
  int 21h
  ; print number
  mov dl,ch
  mov ah,2
  int 21h
  ; newline
  mov dl,0dh
  int 21h
  mov dl,0ah
  int 21h
  ; compare rest
  cmp cl,bl
  jg thirdSmaller
  jl firstSmaller

  ; third number is largest
  thirdBigger:
  ; print message
  lea dx,thirdBig
  mov ah,9
  int 21h
  ; print number
  mov dl,bl
  mov ah,2
  int 21h
  ; newline
  mov dl,0dh
  int 21h
  mov dl,0ah
  int 21h
  ; compare rest
  cmp cl,ch
  jg secondSmaller
  jl firstSmaller

  ; first number is smallest
  firstSmaller:
  ; print message
  lea dx,firstSmall
  mov ah,9
  int 21h
  ; print number
  mov dl,cl
  mov ah,2
  int 21h
  ; newline
  mov dl,0dh
  int 21h
  mov dl,0ah
  int 21h
  jmp end

  ; second number is smallest
  secondSmaller:
  ; print message
  lea dx,secondSmall
  mov ah,9
  int 21h
  ; print number
  mov dl,ch
  mov ah,2
  int 21h
  ; newline
  mov dl,0dh
  int 21h
  mov dl,0ah
  int 21h
  jmp end

  ; third number is smallest
  thirdSmaller:
  ; print message
  lea dx,thirdSmall
  mov ah,9
  int 21h
  ; print number
  mov dl,bl
  mov ah,2
  int 21h
  ; newline
  mov dl,0dh
  int 21h
  mov dl,0ah
  int 21h
  jmp end

  end:
endp main
DEFINE_SCAN_NUM
DEFINE_PRINT_STRING
DEFINE_PRINT_NUM
DEFINE_PRINT_NUM_UNS
DEFINE_PTHIS
