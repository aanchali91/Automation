package JavaInterviewPrograms;

import java.util.HashMap;
import java.util.Map;


public class UniqueElementProgram 
{
	public static void main(String[] args)
	{
		Map<Character, Integer> hm= new HashMap<Character, Integer>();
		String a= "abcdefghijabcd";
		  for(char i:a.toCharArray())
		  {
			  if(hm.containsKey(i))
			  {
				  hm.put(i, hm.get(i)+1);			  
			  }
			  else
			  {
				  hm.put(i, 1)  ;
			  }
		  }
		  for(char ab:hm.keySet())
		  {
			  System.out.println( ab + ", " +hm.get(ab));
		  }  
	}	
}
