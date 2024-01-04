import java.lang.Math.*;
import java.util.Scanner;

public class exerciseOne {

    /*
     * Question 1:
     * Write a Java program to convert temperature from Fahrenheit to Celsius degree.
     * To solve this problem the most optimal way, we make use of the formula converting
     * Fahrenheit (F) to Celsius (C).
     * C = 5/9 x (F-32)
     */
    double fahrenheitToCelsius(double fahrenheit) {
        return (double) 5 / 9 * (fahrenheit - 32);
    }
    /*
     *(double) is used here to prevent integer division error.
     * This is known as casting, we perform it here to gain precision over integer division and
     * to prevent absolute errors.
     * For example, dividing 301 by 2 gives the integer 150, whereas the exact answer is 150 1/2.
     */

    /*
     * Question 2:
     * Write a java program to convert minutes into a number of years and days
     * Here are some facts:
     * 1 calendar year = 525600 minutes
     * 1 calendar month = 43800 minutes
     * 1 week = 10080 minutes
     * 1 day  = 1440 minutes
     */
    String minutesToYearsAndDays(int minutes){
        int years;
        int days;
        int extraMinutes;
        if(minutes > 525600){
            years = minutes/525600;
            days = years/1440;
            return "Number of years: "+ years + " \nNumber of days: " + days;
        }else{
            days = minutes/1440;
            extraMinutes = minutes%1440; //%, Modulus, Returns the division remainder
            return "Number of days: "+ days + "\nNumber of minutes: "+ extraMinutes;
        }
    }
    /*
     * Question 3:
     * Body Mas Index or BMI is a simple calculation using a person's height and weight.
     * To keep things simple we will be performing the calculations in imperial system.
     * The formula for BMI is weight in pounds (lbs) divided by inches squared (in2). The total is
     * then multiplied by 703.*/
    float computeBodyMassIndex(float weightInPounds,float heightInInches){
        return 703*(weightInPounds/(float)Math.pow(heightInInches, 2));
    }
    /* Math.pow(number, power), Number is taken as the first input and then the power comes second.
     * The answer has a default return type of double but since our method here has a return type of float,
     * we use (float) to cast.*/

    /*
     * Question 4:
     * Write a Java program to break an integer into a sequence of individual digits.
     * For example:
     * input = 1234
     * Output = 1 2 3 4
     */
    String integerBreaker(int input) {
        String digits = Integer.toString(input);
        String mystr = "";
        for (int i = 0; i < digits.length(); i++) {
            mystr += digits.charAt(i)+ " ";
        }return mystr;
    }
    /*
     * Question 5:
     * Write a java program that accepts two integers from the user and then prints the sum, the difference,
     * the product, the average, the distance(the difference between integer), the maximum, the minimum.
     */
    String integerOperations(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first Integer: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter second Integer: ");
        int number2 = scanner.nextInt();
        return "Sum of two integers: " + (number1+ number2) +"\nDifference of two integers: "+
                (number1 - number2)+"\nProduct of two integers: "+ (number1*number2) +
                "\nAverage of two integer: "+ ((float)(number1+number2)/2) + "\nDistance of two integers: "
                + (Math.abs(number1 - number2)+ "\nMax Integer: "+ (Math.max(number1, number2))+ "\nMin Integer: "
                + Math.min(number1, number2));
    }
    /*
     * As discussed earlier we are casting the result of average into float to prevent any absolute error
     * that may occur. The distance between two numbers will always be positive hence we use Math.abs to make
     * that our answer will always stay positive.
     * For more information, refer to the official Oracle documentation:
     * https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html*/
}