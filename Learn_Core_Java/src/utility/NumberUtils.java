package utility;

public class NumberUtils {

	public int squareOfNum(int number) {
		
		int square = number * number;
		
		return square;
		
	}
	
	public int cubeOfNum(int number) {
		
		int cube = number * number * number;
		
		return cube;
		
	}
	
	public int sumOfDigits(int number) {
		
		int sum = 0;
		
		while(number > 0) {
			
			int rem = number % 10;
			
			sum += rem;
			
			number /= 10;
			
		}
		
		return sum;
		
	}
	
	public int productOfDigits(int number) {
		
		int product = 1;
		
		while(number > 0) {
			
			int rem = number % 10;
			
			product *= rem;
			
			number /= 10;
			
		}
		
		return product;
		
	}
	
	public int reverseNumber(int number) {
		
		int reversed = 0;

        while(number != 0) {
            
        	int rem = number % 10;
            
        	reversed = reversed * 10 + rem;
            
        	number /= 10;
        	
        }

		return reversed;
		
	}
	
	public int sumOfSquareOfDigits(int number) {
		
		int sum = 0;

        while(number != 0) {
            
        	int rem = number % 10;
            
        	sum += (rem * rem);
            
        	number /= 10;
        	
        }

		return sum;
		
	}
	
	public int sumOfCubeOfDigits(int number) {
		
		int sum = 0;

        while(number != 0) {
            
        	int rem = number % 10;
            
        	sum += (rem * rem * rem);
            
        	number /= 10;
        	
        }

		return sum;
		
	}
	
	public boolean isPrime(int number) {
		
		boolean flag = true;
		
		if (number == 1) {
			
			flag = false;
			
		} else {
			
			for(int i = 2; i <= number/2; ++i){
	            
				// condition for non-prime number
	            if(number % i == 0){
	                
	            	flag = false;
	                
	            	break;
	                
	            }
	            
	        }
			
		}

		return flag;
		
	}
	
	public boolean isPerfectSquare(int number) {
	
		boolean flag = false;
		
		int x = (int) Math.sqrt(number);
        
		double y = Math.sqrt(number);
        
        if(x == y) {
        	
        	flag = true;
        	
        }
        
		return flag;
		
	}
	
	public boolean isPerfectCube(int number) {
		
		boolean flag = false;
		
		int x = (int) Math.cbrt(number);
        double y = Math.cbrt(number);
        
        if(x == y) {
        	
        	flag = true;
        	
        }
        
		return flag;
		
	}
	
	public boolean isPalindromeNumber(int number) {
		
		boolean flag = false;
		
		int revNum = reverseNumber(number);
		
		if(number == revNum)
			flag = true;
		
		return flag;
		
	}
	
	public int hcfOfTwoNumbers(int number1, int number2) {
		
		int hcf = 1;
		
		for(int i = 1; i <= number1 && i <= number2; ++i){
            // Checks if i is factor of both integers
            if(number1 % i==0 && number2 % i==0)
                hcf = i;
        }
		
		return hcf;
		
	}
	
	public int lcmOfTwoNumbers(int number1, int number2) {
		
		int hcf = 1;
		
		for(int i = 1; i <= number1 && i <= number2; ++i){
            // Checks if i is factor of both integers
            if(number1 % i==0 && number2 % i==0)
                hcf = i;
        }
		
		int lcm = (number1 * number2) / hcf;
		
		return lcm;
		
	}
	
	public int sumOfAllFactors(int number) {
		
		int sum = 0;
		
		for(int i = 1; i <= number; i++) {
			
			if(number % i == 0) {
				sum += i;
			}
			
		}
		
		return sum;
		
	}
	
	public int numOfDigits(int number) {
		
		int count = 0;
		
		while(number != 0) {
			
			number /= 10;
			
			count++;
			
		}
		
		return count;
		
	}
	
	// Recursive function factorial
	public long factorial(int number) {
		
		if(number == 0)
			return 1;
		else
			return (number * factorial(number-1));
		
	}
	
	public int sumOfFactorialOfDigits(int number) {
		
		int sum = 0;

        while(number != 0) {
            
        	int rem = number % 10;
            
        	sum += factorial(rem);
            
        	number /= 10;
        	
        }

		return sum;
		
	}
	
}
