
DATA SEGMENT

     PSTRING DB "The Given Number is a Prime$"
     NPSTRING DB "The Given Number is not a Prime$"
     VALUE DB ?

DATA ENDS

CODE SEGMENT

     ASSUME CS: CODE, DS: DATA

START:
  MOV CX, 0
  MOV BH, 0

INPUT:
  MOV AH, 1
  INT 21H
  MOV BL, AL
  MOV AL, 10
  MUL CX
  MOV CX, AX
  SUB BL, 30H
  ADD CX, BX
  INC BH
  CMP BH, 02H
  JE FINISH
  JMP INPUT

FINISH:
  MOV VALUE, CL
  MOV BL,02H

LOOP:
  MOV AL,VALUE
  MOV AH,00H
  DIV BL
  CMP AH,00H
  JE NPRIME
  INC BL
  CMP BL,VALUE
  JGE PRIME
  JMP LOOP

NPRIME:
  MOV AH,09
  LEA DX,NPSTRING
  INT 21H
  JMP EXIT

PRIME:
  MOV AH,09
  LEA DX,PSTRING
  INT 21H
  JMP EXIT


EXIT:

CODE ENDS
END START
