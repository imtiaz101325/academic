;CSE341: Assembly project - Compression Library
;Author: Sk. Imtiaz Ahmed
;ID:     15101054

; using multi-segment executable file template.


include 'emu8086.inc' ;Library of common functions
                      ;see help>part 5: library of common functions - emu8086.inc

data segment
    raw_data db 'aaaaaabbbbbb',0
    var_size = $ - raw_data ;get size of array  + 1(for zeor at the end)
    compressed db var_size dup(?)

ends

stack segment

ends

code segment
start:
    ; set segment registers:
        mov ax, data
        mov ds, ax
        mov es, ax

        ;code starts here
        lea di, raw_data
        lea si, compressed

        mov cx, var_size  ;load size
        dec cx            ;correct the extra

        mov dx, 0
        mov dl, [di]
        inc di
        dec cx            ;load first letter

        mov ax, 0
        mov bl, 1         ;initialize
        iterate:
            mov al, [di]
            cmp al, 0h    ;check end of sting
            je end_iteration
            cmp dl, al
            jne miss
            inc bx
            inc di
            loop iterate

        miss:
            mov [si], bx
            inc si
            mov [si], dl
            inc si         ;store run length

            mov dl, [di]   ;set new char
            inc di
            mov bx, 1
            loop iterate


        end_iteration:

          lea si, compressed
          mov cx, var_size

          mov ah, 2
          print_loop:
            mov dl, [si]
            add dl, 30h
            int 21h
            inc si
            dec cx

            mov dl, [si]
            int 21h
            inc si
            dec cx
            loop print_loop


        ; wait for any key....
        mov ah, 1
        int 21h

        mov ax, 4c00h ; exit to operating system.
        int 21h
    ends

end start ; set entry point and stop the assembler.
