package JavaInterviewPrograms;

public class ReverseSubstring 
{
	public static void main(String[] args) 
	{	
		String str="I am a Geek";
		String sub[]= str.split(" ");
	 	
		System.out.println("Main string's length : "+ str.length()); // Use length() function for String's length 
		System.out.println("Sub string : "+ sub.length); // Use length to get String array's length
		
		String reverse ="";  // Do not initialize String with NUll. It will take first character as null.
		
		for(int i=0;i<sub.length;i++)
		{
			String a=sub[i];	
			for(int j=a.length()-1; j>=0; j--) 
			{
				reverse = reverse + a.charAt(j);
			}
			reverse= reverse + " ";
		}
		System.out.println(reverse);
	}
}

//Check the difference btw "" (blank) and null for string