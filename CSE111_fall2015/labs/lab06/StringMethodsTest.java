import static java.lang.System.*;
import java.util.*;

public class StringMethodsTest {
    String s;
    /*This is the construstor
     */
    
    public StringMethodsTest(String s) {
        this.s=s;
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(in);
        
        out.println("Enter a string: ");
        StringMethodsTest s1 = new StringMethodsTest(input.nextLine());
        
        // out.println("Lenght of the string is: "+s1.length());
        
        // out.print("Enter a position: ");
        // out.println("Character at that position is: "+s1.charAt(input.nextInt()));
        
        // out.println("Enter a prefix: ");
        // input.nextLine();
        // out.println("String starts with prefix: "+s1.startsWith(input.nextLine()));

        // out.print("Enter a suffix: ");
        // out.println("String ends with suffix: "+s1.endsWith(input.nextLine()));

        // out.print("Enter a character to replace: ");
        // char temp = input.nextLine().charAt(0);
        // out.print("Enter the character to replace with: ");
        // out.println("String with first occurrence replaced: "+s1.replaceFirst(temp, input.nextLine().charAt(0)));
        
        // out.print("Enter a character to replace: ");
        // temp = input.nextLine().charAt(0);
        // out.print("Enter the character to replace with: ");
        // out.println("String with first occurrence replaced: "+s1.replaceAll(temp, input.nextLine().charAt(0)));
        
        // out.print("Enter a character to replace: ");
        // temp = input.nextLine().charAt(0);
        // out.print("Enter the character to replace with: ");
        // out.println("String with first occurrence replaced: "+s1.replaceLast(temp, input.nextLine().charAt(0)));
        
        // out.println("String in uppercase: "+s1.toUpperCase());
        // out.println("String in lowercase: "+s1.toLowerCase());

        // out.print("Enter string to check equality: ");
        // out.println("Equlas: "+s1.equals(input.nextLine()));

        // out.print("Enter string to check equality ignoring case: ");
        // out.println("Equlas: "+s1.equalsIgnoreCase(input.nextLine()));

        // out.print("Enter a string to compare to the original: ");
        // out.println("Compares to: "+s1.compareTo(input.nextLine()));

        // out.print("Enter a string to compare to the original ignoring case: ");
        // out.println("Compares to: "+s1.compareToIgnoreCase(input.nextLine()));

        // out.print("Enter a positon to substing: ");
        // out.println("substring: "+s1.substring(input.nextInt()));
        
        // out.println("Enter positons to substing: ");
        // out.print("Start: ");
        // int start = input.nextInt();
        // out.print("End: ");
        // out.println("substring: "+s1.substring(start, input.nextInt()));

        // out.print("Enter character to find index of: ");
        // out.println("Index : "+s1.indexOf(input.nextLine().charAt(0)));

        // out.print("Enter character to find index of: ");
        // char temp = input.nextLine().charAt(0);
        // out.print("Enter starting position: ");
        // out.println("Index : "+s1.indexOf(temp, input.nextInt()));

        // out.print("Enter character to find index of: ");
        // out.println("Index : "+s1.lastIndexOf(input.nextLine().charAt(0)));

        // out.print("Enter character to find index of: ");
        // char temp = input.nextLine().charAt(0);
        // out.print("Enter starting position: ");
        // out.println("Index : "+s1.lastIndexOf(temp, input.nextInt()));
    }
    
    public int length() {
        
        return s.toCharArray().length;
    }
    
    public char charAt(int i) {
        
        return s.toCharArray()[i];
    }
    
    public boolean startsWith(String pref) {
        
        char[] charredString = s.toCharArray();
        char[] charredPref = pref.toCharArray();
        
        boolean status = true;
        
        if(charredString.length < charredPref.length) {

            status = false;
        }else {

            for(int i=0; i<charredPref.length; i++) {
            
                if(charredString[i] != charredPref[i]) {
                    
                    status = false;
                }
            }
        }
        
        return status;
        
    }

    public boolean endsWith(String suf) {
        
        char[] charredString = s.toCharArray();
        char[] charredSuf = suf.toCharArray();
        
        boolean status = true;

        if(charredString.length < charredSuf.length) {

            status = false;
        }else {

            for(int i=charredSuf.length-1, j=charredString.length-1; i>-1; i--, j--) {

                if(charredString[j] != charredSuf[i]) {
                   
                    status = false;
                }
            } 
        }  
        
        return status;
        
    }

    public String replaceFirst(char oldChar, char newChar) {
        
        char[] charredString = s.toCharArray();
                
        for(int i=0; i<charredString.length; i++) {

            if(charredString[i] == oldChar) {
               
               charredString[i] = newChar;
               break;
            }
        }

        String tempString = new String(charredString);
        
        return tempString;
        
    }

    public String replaceAll(char oldChar, char newChar) {
        
        char[] charredString = s.toCharArray();
                
        for(int i=0; i<charredString.length; i++) {

            if(charredString[i] == oldChar) {
               
               charredString[i] = newChar;
               
            }
        }

        String tempString = new String(charredString);
        
        return tempString;
        
    }

    public String replaceLast(char oldChar, char newChar) {
        
        char[] charredString = s.toCharArray();
                
        for(int i=charredString.length-1; i>-1; i--) {

            if(charredString[i] == oldChar) {
               
               charredString[i] = newChar;
               break;
            }
        }

        String tempString = new String(charredString);
        
        return tempString;
        
    }

    public String toUpperCase() {

        char[] charredString = s.toCharArray();

        for(int i=0; i<charredString.length; i++) {

            if(charredString[i] >= ((int)'a') && charredString[i] <= ((int)'z')) {

                charredString[i] = (char)(charredString[i] + ('A'-'a'));
            }
        }

        String tempString = new String(charredString);
        
        return tempString;
    }

    public String toLowerCase() {

        char[] charredString = s.toCharArray();

        for(int i=0; i<charredString.length; i++) {

            if(charredString[i] >= ((int)'A') && charredString[i] <= ((int)'Z')) {

                charredString[i] = (char)(charredString[i] - ('A'-'a'));
            }
        }

        String tempString = new String(charredString);
        
        return tempString;
    }

    public boolean equals(String comp) {
        
        char[] charredString = s.toCharArray();
        char[] charredComp = comp.toCharArray();
        
        boolean status = true;

        if(charredString.length == charredComp.length) {

            for(int i=0; i<charredString.length; i++) {

                if(charredString[i] != charredComp[i]) {
                   
                    status = false;
                }
            } 
        }else {

            status = false;
        }
        
        return status;
        
    }

    public boolean equalsIgnoreCase(String comp) {
        
        char[] charredString = s.toCharArray();

        for(int i=0; i<charredString.length; i++) {

            if(charredString[i] >= ((int)'A') && charredString[i] <= ((int)'Z')) {

                charredString[i] = (char)(charredString[i] - ('A'-'a'));
            }
        }

        char[] charredComp = comp.toCharArray();

        for(int i=0; i<charredComp.length; i++) {

            if(charredComp[i] >= ((int)'A') && charredComp[i] <= ((int)'Z')) {

                charredComp[i] = (char)(charredComp[i] - ('A'-'a'));
            }
        }
        
        boolean status = true;

        if(charredString.length == charredComp.length) {

            for(int i=0; i<charredString.length; i++) {

                if(charredString[i] != charredComp[i]) {
                   
                    status = false;
                }
            } 
        }else {

            status = false;
        }
        
        return status;
        
    }

    public int compareTo(String comp) {
        
        char[] charredString = s.toCharArray();

        char[] charredComp = comp.toCharArray();
        
        int diff = 0;

        if(charredComp.length == charredString.length) {

            for(int i=0; i<charredString.length; i++) {

                if(charredString[i] != charredComp[i]) {

                    diff = charredString[i]-charredComp[i];
                    break;
                }
            }
        }else {

            diff = charredString.length-charredComp.length;
            
        }
        
        
        return diff;
        
    }

    public int compareToIgnoreCase(String comp) {
        
        char[] charredString = s.toCharArray();

        for(int i=0; i<charredString.length; i++) {

            if(charredString[i] >= ((int)'A') && charredString[i] <= ((int)'Z')) {

                charredString[i] = (char)(charredString[i] - ('A'-'a'));
            }
        }

        char[] charredComp = comp.toCharArray();

        for(int i=0; i<charredComp.length; i++) {

            if(charredComp[i] >= ((int)'A') && charredComp[i] <= ((int)'Z')) {

                charredComp[i] = (char)(charredComp[i] - ('A'-'a'));
            }
        }
        
        int diff = 0;

        if(charredComp.length == charredString.length) {

            for(int i=0; i<charredString.length; i++) {

                if(charredString[i] != charredComp[i]) {

                    diff = charredString[i]-charredComp[i];
                    break;
                }
            }
        }else {

            diff = charredString.length-charredComp.length;
            
        }
        
        
        return diff;
        
    }

    public String substring(int position) {

        char[] charredString = s.toCharArray();

        char[] temp = charredString;

        if(position < charredString.length && position > -1) {

            temp = new char[charredString.length];

            for(int i=position,j=0; i<charredString.length; i++,j++) {

                temp[j] = charredString[i];
            }
        }

        String tempString = new String(temp);
        
        return tempString;
    }

    public String substring(int start, int end) {

        char[] charredString = s.toCharArray();

        char[] temp = charredString;

        if(start > -1 && start < end && end < charredString.length) {

            temp = new char[charredString.length];

            for(int i=start,j=0; i<end; i++,j++) {

                temp[j] = charredString[i];
            }
        }

        String tempString = new String(temp);
        
        return tempString;
    }

    public int indexOf(char find) {
        
        char[] charredString = s.toCharArray();

        int position = -1;
        
        for(int i=0; i<charredString.length; i++) {
            
            if(charredString[i] == find) {
                
                position = i;
                break;
            }
        }
        
        return position;
        
    }

    public int lastIndexOf(char find) {
        
        char[] charredString = s.toCharArray();

        int position = -1;
        
        for(int i=charredString.length-1; i>-1; i--) {
            
            if(charredString[i] == find) {
                
                position = i;
                break;
            }
        }
        
        return position;
        
    }

    public int indexOf(char find, int start) {
        
        char[] charredString = s.toCharArray();

        int position = -1;
        
        for(int i=start; i<charredString.length; i++) {
            
            if(charredString[i] == find) {
                
                position = i;
                break;
            }
        }
        
        return position;
        
    }

    public int lastIndexOf(char find, int start) {
        
        char[] charredString = s.toCharArray();

        int position = -1;
        
        for(int i=charredString.length-1; i>start-1; i--) {
            
            if(charredString[i] == find) {
                
                position = i;
                break;
            }
        }
        
        return position;
        
    }

    public String concat(String other) {

        char[] charredString = s.toCharArray();
        char[] charredOther = other.toCharArray();

        char[] newCharArray = new char[charredString.length+charredOther.length];

        String together = new String(newCharArray);

        return together;
    }

}