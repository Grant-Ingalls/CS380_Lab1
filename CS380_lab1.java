package packagelab1;

public class CS380_lab1 {
	
	public static void main(String args[]) {
		
		//starting int
		int test = 12345; 
		
		//method call
		int testR = reverseInt(test); 
		
		//print result to console
		System.out.println("The starting int was: " + test); 
		System.out.println("The flipped int is: " + testR); 
		
	}
	
	
	//will take an integer and reverse the order of the inputs digits
	public static int reverseInt(int n) {
		
		//create char to hold single digits in reversal loop
		char temp; 
		//Empty string to hold reversed number
		String tempStr = "";
		
		//convert integer to string for ease of reversal
		String r = String.valueOf(n); 
		
		//Use a loop to reverse string
		for(int i = 0; i < r.length(); i++) {
			
			//reverse digit by digit 
			temp = r.charAt(i); 
			tempStr = temp + tempStr; 
			
		}
		
		//cast string to int for return
		int ret = Integer.parseInt(tempStr);
		
		//return
		return ret; 
		
	}

}
