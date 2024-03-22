public class Conversion {
    
    /** Convert from feet to meters */
    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }
    
    /** Convert from meters to feet */
    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }
    
    public static void main(String[] args) {
        
        System.out.println("Feet       Meters     |     Meters     Feet");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -");
        for (double feet = 1; feet <= 10; feet++) {
            double meters = footToMeter(feet);
            double convertedFeet = meterToFoot(meters);
            
            System.out.printf("%-10.1f %-10.3f |      %-10.1f %-10.3f%n", 
                    feet, meters, meters, convertedFeet);
        }
    }
}
