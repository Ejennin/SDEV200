import java.util.Scanner;

public class CreditCardValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter a credit card number
        System.out.print("Enter a credit card number as a long integer: ");
        long cardNumber = scanner.nextLong();
        
        // Check if the card number is valid
        if (isValid(cardNumber)) {
            System.out.println(cardNumber + " is valid");
        } else {
            System.out.println(cardNumber + " is invalid");
        }
    }
    
    /** Return true if the card number is valid */
    public static boolean isValid(long number) {
    	int sum1 = sumOfDoubleEvenPlace(number);
    	int sum2 = sumOfOddPlace(number);
    	
    	if ((sum1 + sum2) % 10 == 0 && prefixMatched(number, 1)) {
    		return true;
    	} else {
    		return false;
    	}
    }

    /** Get the result from Step 2 */
    public static int sumOfDoubleEvenPlace(long number) {
       int sum = 0;
       String numString = Long.toString(number); // Convert to string for easier manipulation
       
       for(int i=numString.length()-2; i>=0; i-=2){
           int doubledDigit = getDigit(Character.getNumericValue(numString.charAt(i))*2);
           sum += doubledDigit;
       }
       
       return sum;  
   }

   /** Return this number if it is a single digit, otherwise,
    * return the sum of the two digits */
   public static int getDigit(int number) {
	   if (number < 9) { 
		   return number;
	   } else { 
		   return (number / 10 + number % 10); 
	   }
   }

   /** Return sum of odd-place digits in number */
   public static int sumOfOddPlace(long number){
	   int sum=0;
	   String numString=Long.toString(number); // Convert to string for easier manipulation

	   for(int i=numString.length()-1;i>=0;i-=2){
	       int oddDigit=Character.getNumericValue(numString.charAt(i));
	       sum+=oddDigit;
	   }
	   
	   return sum;   
   }

   /** Return true if the digit d is a prefix for the given length of a given credit card */
   public static boolean prefixMatched(long number, int d){
       String numString=Long.toString(number); // Convert to string for easier manipulation
       
       switch(d){
           case(4): 
               return numString.startsWith("4");
               
           case(5): 
               return numString.startsWith("5");
               
           case(37): 
               return numString.startsWith("37");

           case(6): 
               return numString.startsWith("6");
           
           default: 
               break;
         }  
         
         return false;   
      }

      /** Return the count of digits in d */  
      public static int getSize(long d){         
          return Long.toString(d).length();     
      }


      /** Get first k number of digits from number. left in d. If length of d < k, then return n number*/     
      public static long getPrefix(long n,int k){         
          String s=""+n;
          k=s.length();
            
          if (getSize(n) > k); {             

          s=s.substring(0,k);

	      long p=Long.parseLong(s);
            }
	     	return n;      
	    }
}
