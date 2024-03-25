import java.util.*;//using wild card import

public class ComputeAverage {
    public static void main(String[] args) {
            //create scanner object
        Scanner input = new Scanner(System.in);
        //prompt user to enter three numbers
        System.out.println("Enter three numbers");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();
        // Compute the average
        double average = (number1 + number2 + number3) /3;
        // display the results
        System.out.println("The average of " + number1 + ", " + number2 + " and " + number3 + " is " + average);



    }
    

    

    

    
}
