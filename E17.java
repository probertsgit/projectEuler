public class E17 {

	/**
	 * Count number of letters in written out numbers from 1 to 1000
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
												//   1, 2, 3, 4, 5, 6, 7. 8. 9
		final Integer ltrCnt1to9 [] = new Integer[] {3, 3, 5, 4, 4, 3, 5, 5, 4};
												//    11,12,13,14,15,16,17,18,19
		final Integer ltrCnt11to19 [] = new Integer[] {6, 6, 8, 8, 7, 7, 9, 8, 8};
												//    20,30,40,50,60,70,80,90
		final Integer ltrCnt20to90 [] = new Integer[] {6, 6, 5, 5, 5, 7, 6, 6};
		final int TEN = 3;
		final int HUNDRED = 7;
		final int ONETHOUSAND = 11;
		final int AND = 3;
		int answer = 0;
		
		// 1 to 10
		int oneToNine = 0;
		for (int i : ltrCnt1to9) {oneToNine += i;}
		answer += oneToNine;	//1 - 9
		System.out.println (answer);

		answer += TEN;	// 10
		
		// 11 to 19
		int elevenToNineteen = 0;
		for (int i = 0; i < ltrCnt11to19.length; i++) elevenToNineteen += ltrCnt11to19 [i];
		//for (int j : ltrCnt11to19) {answer += ltrCnt11to19 [j];}
		answer += elevenToNineteen;	//11 - 19
		System.out.println ("elevenToNineteen "+elevenToNineteen);
		

		// 20, 30, 40, 50, .. 90
		int twentyToNinety = 0;
		for (int i : ltrCnt20to90) {twentyToNinety += i;}
		System.out.println ("twentyToNinety "+twentyToNinety);
		int twentyTo99 = 0;
		// 20 to 99
		twentyTo99 += (twentyToNinety * 10);	// 'twenty' part of 'twenty-one' ...
		twentyTo99 += (oneToNine * 8);	// 'one' part of 'twenty-one'...
		answer += twentyTo99;	//20 - 99
		
		// 100, 101, 102, 103, .. 999
		//for (int i : ltrCnt20to90) {twentyToNinety += ltrCnt20to90 [i];}
		answer += oneToNine * 100;	// 'one' part of 'one hundred and twenty-three' ...
		answer += oneToNine * 9;	// 'two' part of 'one hundred and two' ...
		answer += TEN * 9;				// 'ten' part of 'one hundred and ten'
		answer += (elevenToNineteen * 9); // 'eleven' part of 'one hundred and eleven'...
		answer += twentyTo99 * 9;	// 'twenty three' part of one 'hundred and twenty-three' ...
		answer += HUNDRED * 100 * 9;	// 'hundred' part of 'one hundred and twenty-three' ...
		answer += AND * 99 * 9;	// 'and' part of 'one hundred and twenty-three' ... 
		
		answer += ONETHOUSAND;	// 1000
		
		System.out.println ("Answer = "+answer);
	}
}
