public class SelectionSort2 {

	//private int [] nums;
	//private int temp;
	private Integer [] nums;
	private Integer temp;
	
//	public SelectionSort (int [] nums)
	public SelectionSort2 (Integer [] nums)
	{
		this.nums = nums;
	}
	
	public void print ()
	{
		for (int i=0; i<nums.length; i++)
		{
			System.out.print (nums [i]);
			System.out.print (" ");
		}
		System.out.println();
	}
		
	public void selection_sort (Integer [] inNums)
	{
		nums = inNums.clone();
		for (int i=0; i < nums.length; i++)
		{
			for (int j=i; j < nums.length; j++)
			{
				if (nums [j].compareTo (nums [i]) < 0)
				{
					temp = nums [i];
					nums [i] = nums [j];
					nums [j] = temp;		
				}
			}
		}
	}
	
//	public void insertionSort (int [] inNums)
	public void insertionSort (Integer [] inNums)
	{
		nums = inNums.clone();
		for (int i=0; i<nums.length; i++)
		{
			for (int j=i; j>0; j--)
			{
				//System.out.println ("i="+i+"; j="+j);
				print ();
				//if (nums[j] < nums[j-1])
				if (nums[j].compareTo (nums[j-1]) < 0)
				{
					temp = nums[j-1];
					nums [j-1] = nums[j];
					nums[j]=temp;
				}
				else break;
			}
		}
	}

	public void shellSort (Integer [] inNums)
	{
		nums = inNums.clone();

		int h = 1;
		//finds first shell sort num
		while (h < nums.length/3)  // 1, 4, 13, 40, ...
			h = 3*h +1; 

		
		while (h >= 1) 	//h sort the array
		{
			for (int i=h; i<nums.length; i++)
			{ 
				for (int j=i; j>=h && nums[j] < nums[j-h]; j=j-h)
				{
					//System.out.println ("i="+i+"; j="+j);
					print ();
					//if (nums[j] < nums[j-1])
					if (nums[j].compareTo (nums[j-h]) < 0)
					{
						temp = nums[j-h];
						nums [j-h] = nums[j];
						nums[j]=temp;
					}
				}
			}
			h = h/3;
		}
	}
		
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println ("Starting SelectionSort2...");
//		int [] inNums = new int [args.length];  
		Integer [] inNums = new Integer [args.length];  
		for (int i = 0; i < args.length; i++)
		{
//			inNums [i] = Integer.parseInt(args[i]);
			inNums [i] = Integer.valueOf(args[i]);
		}
		
	
		SelectionSort2 ss =  new SelectionSort2 (inNums);
		ss.print();
		
		//ss.selection_sort (inNums);
		//ss.print();
		
		//ss.insertionSort (inNums);
		//ss.print();
		ss.shellSort (inNums);
		ss.print();

		System.out.print("DONE");
	}
}
