package JavaInterviewPrograms;

public class Countnonrepeatablecharacter 
{
	public static void main(String[] args) 
	{
		String s="abcdesfaass";
		int count=0,j;
		char[] c=s.toCharArray();
	

		for(int i=1;i<c.length;i++)
		{
			for(j=1;j<c.length;j++)
			{
				if(i==j) 
					continue;
				
				if(c[i]==c[j])
				{
					System.out.println("Repeatable: "+c[i]);
				}
				
			}
				System.out.println("Non-Repeatable " + c[i]);
			
			if(count==1)
			{
				System.out.println("Non-Repeatable");
				
			}
		//	System.out.println(c[i]+count);
		}
	}
}
