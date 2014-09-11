import java.math.BigInteger;
import java.util.*;

public class E13 {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int answer = 0;
		String temp = BigInteger.valueOf(2).pow(1000).toString(10);
		ArrayList<Integer> al = new ArrayList<Integer> ();
		for (int i=0; i<temp.length (); i++)
		{
			al.add (Integer.parseInt(Character.toString(temp.charAt(i))));
		}
		
		for (Integer i: al)
		{
			answer += i; 
		}

		System.out.println ("Answer="+answer);
	}
}

	
	
