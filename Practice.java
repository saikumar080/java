import java.util.*;
class Calculator{
    public static int calcus(int x, int y, String symbol){
        switch (symbol){
            case "+":
                return x+y;
            case "-":
                return x-y;
            case "*":
                return x*y;
            case "/":
                return x/y;
            case "%":
                return x%y;
            default:
                return 0;
        }
    }
}
public class Practice {
    public static void main(String[] args) {
        System.out.println("::::----This file for methods and Objects----::::");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first Number::");
        int num1=sc.nextInt();
        System.out.println("Enter the second Number::");
        int num2=sc.nextInt();
        System.out.println("Enter the Operator::");
        sc.nextLine();
        String operator=sc.nextLine();
        // Calculator calc=new Calculator();
    //   int result= calc.calcus(num1,num2,operator);
        int result=Calculator.calcus(num1, num2, operator);
      System.out.println("The result value is "+result);
        sc.close();
    }
}

