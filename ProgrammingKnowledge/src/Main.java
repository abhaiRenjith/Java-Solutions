/*
 * This Java program contains multiple methods that can help one in learning Java.
 * All the exercises seen here are sourced from @ProgrammingKnowledge
 * Link to the video -> https://www.youtube.com/watch?v=ioPagXHCRjc
 */


public class Main {


    //A simple function that is utilized to print a string of asterisk marking the end of an operation
    public static void lineBreaker(){
        for(int i=0;i<20;i++){System.out.print("*");}
        System.out.print("\n"); //breaks the current line, and places the cursor on the next line
    }

    public static void main(String[] args) {
        exerciseOne test1 = new exerciseOne();
        System.out.println(test1.fahrenheitToCelsius(212.0));
        lineBreaker();
        System.out.println(test1.minutesToYearsAndDays(3456789));
        lineBreaker();
        System.out.println(test1.computeBodyMassIndex(452, 72));
        lineBreaker();
        System.out.println(test1.integerBreaker(123456));
        lineBreaker();
        System.out.println(test1.integerOperations());
        lineBreaker();
    }
}
