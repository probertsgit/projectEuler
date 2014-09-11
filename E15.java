import java.util.*;

public class E15 {

	/**
	 * @param args
	 */
	static final int DIM = 20; 
	static long grid [] [] = new long [DIM+1] [DIM+1];
	static HashMap <String, Long> dict = new HashMap<String, Long>(); 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println ("Start");

		System.out.println ("Answer="+computePaths());
		System.out.println ("Answer="+computePathsRecursive(DIM, DIM));
		System.out.println ("End");
	}

	private static long computePathsRecursive (int m, int n)
	{
		if (n==0 || m == 0)
		{
			//long one = 1;
			return 1;
		}

		String s = m+","+n;
		if (dict.containsKey(s)) return (Long) dict.get(s); 

		dict.put(s, computePathsRecursive (m, n-1) +  computePathsRecursive (m-1, n));
		return (Long) dict.get(s);
		//return computePathsRecursive (m, n-1) +  computePathsRecursive (m-1, n);
	}
	
	private static long computePaths ()
	{
		for (int i=0; i <DIM+1; i++)
			grid [i] [0] = 1;
		for (int j=0; j <DIM+1; j++)
			grid [0] [j] = 1;
		
		for (int i=1; i <DIM +1; i++)
			for (int j=1; j <DIM +1; j++) {
				grid [i] [j] = grid [i-1][j] + grid[i][j-1];
				//printGrid ();
			}
		return grid [DIM][DIM];
	}
	
	private static void printGrid ()
	{
		for (int i=0; i <DIM + 1; i++) {
			System.out.println (" ");
			for (int j=0; j <DIM + 1; j++) {
				System.out.print (" "+grid [i][j]+" ");
			}
		}
		System.out.println (" ");
	}
}
