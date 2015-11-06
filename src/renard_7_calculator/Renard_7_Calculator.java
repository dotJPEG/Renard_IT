package renard_7_calculator;
import java.math.*;
import java.util.*;
/* @author dotJPEG 
** @author Bob Renard
*/
public class Renard_7_Calculator {
static Scanner operation = new Scanner(System.in);
static Scanner number = new Scanner(System.in);
static boolean tryAgain = true;
    public static void main(String[] args) {
        System.out.println("Welcome to Bob's 4 function double calculator...");
    while(tryAgain){
        System.out.println("What operation would you like? [+ - * / ^ E]");
            String operate = operation.nextLine();      
            if(operate.equals("+")){
                System.out.println("First number?");
                    double what = number.nextDouble();
                System.out.println("Second number?");
                    double by = number.nextDouble();
                    double a = what+by;
                System.out.println("The answer is " + a);
            }else
            if(operate.equals("-")){
                System.out.println("First number?");
                    double what = number.nextDouble();
                System.out.println("Second number?");
                    double by = number.nextDouble();
                    double a = what-by;
                System.out.println("The answer is " + a);
            }else
            if(operate.equals("*")){
                System.out.println("First number?");
                    double what = number.nextDouble();
                System.out.println("Second number?");
                    double by = number.nextDouble();
                    double a = what*by;
                System.out.println("The answer is " + a);
            }else
            if(operate.equals("/")){
                System.out.println("First number?");
                    double what = number.nextDouble();
                System.out.println("Second number?");
                    double by = number.nextDouble();
                    double a = what/by;
                System.out.println("The answer is " + a);          
            }else
            if(operate.equals("^")){
                System.out.println("First Number?");
                    double what = number.nextDouble();
                System.out.println("To the power of?");
                    double by = number.nextDouble();
                    double a = Math.pow(what, by);
                System.out.println("The answer is " + a);
            }else
            if(operate.equals("E") || operate.equals("e")){
                System.out.println("First number?");
                    double what = number.nextDouble();
                System.out.println("Times 10 to the power of?");
                    double by = number.nextDouble();
                    double E = Math.pow(10, by);
                    double a = what*E;
                System.out.println("The answer is " + a);
            }else{
                System.out.println("hey maybe you could not do that, that would be nice");
            }
            System.out.println("Would you like to calculate something else? [Y/N]");
            String YN = operation.nextLine();
            if(YN.equals("Y")){
                tryAgain=true;
            }else if(YN.equals("N")){
                tryAgain=false;
            }else{
                System.out.println("Not a valid answer, I'll take that as a yes.");                
            }}   
}}