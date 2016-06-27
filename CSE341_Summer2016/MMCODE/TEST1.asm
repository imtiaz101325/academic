DATA SEGMENT

     AA DB ?
     BB DB 'INPUT(2-9): $'
     CC DB 'OUTPUT: $'
     
DATA ENDS

CODE SEGMENT                 

     ASSUME CS: CODE, DS: DATA

START:
     MOV AX, DATA
     MOV DS,AX
          
     MOV AH, 9
     LEA DX, BB
     INT 21H
     
     MOV AH, 1
     INT 21H 
     SUB AL, 30H 
     
     MOV AA, AL  
     SUB AA, 2
          
     MOV AH, 2     
     MOV DL, 0AH
     INT 21H
     
     MOV DL, 0DH
     INT 21H

     MOV AH, 9
     LEA DX, CC
     INT 21H              
     
     MOV AH, 2          
     MOV DL, AA
     ADD DL, 30H
     INT 21H


CODE ENDS

     END START