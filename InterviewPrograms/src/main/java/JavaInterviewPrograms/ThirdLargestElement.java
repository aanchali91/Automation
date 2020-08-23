package JavaInterviewPrograms;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;


public class ThirdLargestElement 
{
	public static void main(String[] args)
	{			
	    Map<Integer,String> hmap= new HashMap<Integer,String>();
		hmap.put(1, "ABC");
	    System.out.println(hmap.get(1));
		int k=1; 
		boolean hp1 =hmap.containsKey(k);        //looks for a key id
		boolean hp2 =hmap.containsValue("ABC"); //looks for value
		// size(): returns size of the map
		// Collection values(): returns a collection of values of the map
		// remove(object key): removes the key value pair
		System.out.println(hp1);		
		System.out.println(hp2);
		//Iterate a hashmap
	/*	for(Map.Entry m:hmap.entrySet())
		{
			
		}
    */			
		 int[] a= {5,1,2,2,3,9};
	     Arrays.sort(a);
	     System.out.println(Arrays.toString(a));
	     System.out.println(a.length);  //length function for getting array length
	    
	     int  n=a.length; int j;

	     for(int i=0;i<n;i++)
	     {
	    	 for( j=0;j<i;j++)
	    	 if(a[i]==a[j])
	    		 break;
	    	 if(i==j)
	    		 System.out.println("Unique sorted array is:"+a[i]);
	     }
	     System.out.println("Third largest element in array"+a[a.length-3]); 
	     
	   
	   //Program to get Unique elements using hash set
	     HashSet<Integer> set= new HashSet<Integer>();
	     Integer S[]= {1,2,2,3};
	    for(int x:S)
	    {
	    	set.add(x);
	    }
	    Iterator<Integer> it= set.iterator();
	     while(it.hasNext())
	     {
	    	System.out.println(it.next());
	     }
	}
}