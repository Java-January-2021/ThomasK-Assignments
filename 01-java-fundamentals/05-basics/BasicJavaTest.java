public class BasicJavaTest {
	public static void main(String[] args){
		BasicJava basicJava = new BasicJava();

		basicJava.printNum();

        basicJava.printOdd();

        basicJava.printSum();

        int[] myArray1 = new int[] {1,3,5,7,9,13};
        basicJava.iterateArray(myArray1);

        int[] maxArray = new int[] {0, -4, 7, -9};
        basicJava.findMax(maxArray);

        int[] avgArray = new int[] {2, 3, 10, 15};
        basicJava.getAverage(avgArray);

        basicJava.arrayOddNum();

        int[] countArray = new int[] {1, 3, 5, 7};
        int y = 2;
        basicJava.arrayY(countArray, y);

        int[] arraySq = new int[] {1,5,10,-2};
        basicJava.squareValues(arraySq);

        int [] arrayNoNeg = new int[] {1,-3,5,10,-2};
        basicJava.elimNegs(arrayNoNeg);

        int[] arrayMMA = new int[] {1,5,10,-2};
        basicJava.minMaxAvg(arrayMMA);

        int[] arrayShiftValues = new int[] {1,5,10,7,-2};
        basicJava.arrayShiftV(arrayShiftValues);
    }
}