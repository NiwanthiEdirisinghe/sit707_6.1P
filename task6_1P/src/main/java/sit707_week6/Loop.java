package sit707_week6;

public class Loop {
	
	 public static int sumOfNumbers(int n) {
	        int sum = 0;
	        for (int i = 1; i <= n; i++) {
	            sum += i;
	        }
	        return sum;
	    }
	    
	    
	    public static int countEvenNumbers(int[] numbers) {
	        int count = 0;
	        for (int num : numbers) {
	            if (num % 2 == 0) {
	                count++;
	            }
	        }
	        return count;
	    }
}
