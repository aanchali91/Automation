package JavaInterviewPrograms;
public class ReverseString 
{
	public static void main(String[] args) 
	{
		String s= "This is a worrying part";
		char[] a= s.toCharArray();
		StringBuffer buffer= new StringBuffer();
		for(int i=a.length-1;i>=0;i--)
		{
			buffer.append(a[i]);
		}
		System.out.println("Reversed String: "+ buffer);
	}
}
