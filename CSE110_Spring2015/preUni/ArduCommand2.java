import static java.lang.System.*;
import java.util.*;

public class ArduCommand2
{
	public static void main(String[] args)
	{
		for(int i=0; i<46; i++)
		{
			out.printf("  lcd.write(byte(%d));\n",i);
		}
	}
}
