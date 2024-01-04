import java.util.Scanner;

public class exerciseTwo {

    /*
    * Question 1:
    * Write a program to calculate the sum of the first 10 natural numbers*/
    int sumOfNaturalNumbers(){
        int sum = 0;
        for(int i= 1;i<11;i++){sum += i;}
        return sum;
    }
    /*
    * Question 2:
    * Write a program that prompts the user to input a positive integer. It should then print
    * the multiplication table of that number.
    */
    void multiplicationTable(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int input = scan.nextInt();
        int result = 0;
        for(int i= 1;i<11;i++){
            System.out.println(input*i);
        }
    }
    /*
    * Question 3:
    * Write a program to find the factorial value of any number entered through the keyboard
    */
    int factorialFinder(){
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int result = 1;
        for(int i= 1;i<=input;i++){
           result = result*i;
        }return result;
    }
    /*
    * Question 4:
    * Write a program that prompts the user to input an integer and then outputs the number with
    * the digits reversed. For example, if the input id 12345, the output should be 54321.
     */
    void integerReversed(){
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        String mystr = Integer.toString(input); // Integer.toString(), is used to convert the integer to a string format.
        for(int i = 1;i < mystr.length()+1; i++){
            System.out.print(mystr.charAt(mystr.length()-i)); // charAt aids us in find the characters based on the index.
        }
    }
    /*
    * Question 5:
    * Write a program to print Fibonacci series of n terms where n is input by the user.
    * eg: 0 1 1 2 3 5 8 13 24 */
    void fibonacciSequence(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of terms to generate: ");
        int input = scan.nextInt();
        int number1 = 0;
        int number2 = 1;
        int temp = 0;
        if(input ==1){ // If the user inputted value is 1
            System.out.println(0);
        }else if(input == 2){ // if the user inputted value is 2
            System.out.println(0);
            System.out.println(1);
        } else if(input > 2){
            System.out.println(0);
            System.out.println(1);
            for(int i = 0; i<input-2;i++){ //If the user inputted value is more than 3 then a for loop is used
                temp = number1;            // to calculate the Fibonacci sequence.
                number1 = number2;
                number2 += temp;
                System.out.println(number2);
            }
        }
    }
    /*The temp variable is loaded with the number1, then number1 is loaded with number2. This is done
    * to preserve the order of the sequence, if you inspect you will find that we are just replacing the values.
    * Later number2  is made the new number by adding it with the temp variable which is out old number1. */

}
