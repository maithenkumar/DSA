package questions;

// Java program for the above approach
import java.util.*;
public class Main
{
	static HashSet<String> se = new HashSet<String>();
	static String tiles;
	
	// Recursive function which will
	// calculate all the possibilities
	// recursively
	static void recur(Vector<Boolean> vis, String ans)
	{
	
		// Check that the string
		// is already there or not
		if(ans.length()>0)
		{
			if(se.contains(ans))
			{
				return;
			}
			
			// Else put in set
			se.add(ans);
		}
		
		// Run for all the
		// possibilities
		for(int i = 0; i < tiles.length(); i++)
		{
			// If already taken
			// then don't do anything
			if (vis.get(i))
				continue;
			vis.set(i, true);
			
			// Else take it and
			//call recur function
			recur(vis, ans + tiles.charAt(i));
			vis.set(i, false);
		}
	}
	
	public static void main(String[] args) 
	{
		tiles = "dd";
		String curr = "";
		
		Vector<Boolean> vis = new Vector<Boolean>();
		for(int i = 0; i < tiles.length(); i++)
		{
			vis.add(false);
		}
		
		recur(vis, curr);
		System.out.println(se.size());
	}
}

// This code is contributed by rameshtravel07.
