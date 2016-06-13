
DATA SEGMENT
    
    AA DB 47H
    
    BB DB 34H
    
DATA ENDS

CODE SEGMENT
    
    START:
       
       MOV AX , 1
       
       CMP AX , 1
       
       JMP KOT
       
    KOT:
     
      MOV AL , AA
      
      MOV BL , BB
      
      SUB AL , BL
      
CODE ENDS
 
    END KOT
    
    END START