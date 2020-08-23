package JavaInterviewPrograms;

public class ReverseStringWOReversingwords 
{
	public static void main(String[] args) 
	{
	String s="I am a Geek";
	String[] si=s.split(" ");
	String reverse= " ";

			for(int j=(si.length)-1 ; j>=0;j--)
			{
				reverse = reverse + si[j];
				reverse = reverse + " ";
			}			
		System.out.println(reverse);
	}
}
