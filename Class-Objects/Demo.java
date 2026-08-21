import java.util.*;

 class Calculator
{
    public int addition(int num1, int num2)
    {
        return num1+num2;
    }

    public int subtraction(int num1, int num2){
        return num1-num2;
    }
    public int multiplication(int num1, int num2){
        return num1*num2;
    }
    public int division(int num1, int num2){
        if(num2==0){
            System.out.println("Cannot divide by zero");
            return 0;
        }
        return num1/ num2;
    }

    public int modulus(int num1, int num2){
        if(num2 ==0){
            System.out.println("Cannot perform  modulus by zero");
            return 0;
        }
        return num1%num2;
    }
    public int power(int num1, int num2){
        int result=1;
        if(num2 <0){
            System.out.println("Negative powers are not supported.");
            return 0;
        }
        while(num2>0){
            result*=num1;
            num2--;
        }
        return result;
    }
    public int factorial(int num){
        int ans=1;
        if(num <0) {
            System.out.println("Factorial is not  defined for  negative numbers..!!");
            return 0;
        }
        while(num >0){
            ans*=num;
            num--;
        }
        return ans;
    }

}

class InteractiveCalculator
{
   private Calculator calc= new Calculator();
   private Scanner sc= new Scanner(System.in);
    private final String[] operators={"Addition", "Subtraction", "Multiplication","Division","Modulus", "Power", "Factorial","Exit"};


   public void displayMenu(){
        System.out.println(" \n ====== Calculator =======");
        for(int i=0;i<operators.length;i++){
            System.out.println((i+1) + "." + operators[i]);
        }
   }

   public void start(){
        boolean running=true;

        while(running){
            displayMenu();
            System.out.print("Enter your Choice: ");
            if(!sc.hasNextInt()){
                System.out.println("Invalid input! please enter a number.");
                sc.next();
                continue;
            }
            int choice= sc.nextInt();

            if(choice==operators.length){
                System.out.println("Thank you for using Calculator...!!");
                running=false;
                continue;
            }

            int num1=0;
            int num2=0;
            if(choice==7){
                System.out.print("Enter Number 1: ");
                if(!sc.hasNextInt()){
                    System.out.println("please enter a valid integer.");
                    sc.next();
                    continue;
                }
                 num1= sc.nextInt();
            }else{
                System.out.print("Enter Number 1: ");
                if(!sc.hasNextInt()){
                    System.out.println("please enter a valid integer.");
                    sc.next();
                    continue;
                }
                 num1= sc.nextInt();
                System.out.print("Enter Number 2: ");
                if(!sc.hasNextInt()){
                    System.out.println("please enter a valid integer.");
                    sc.next();
                    continue;
                }
                 num2=sc.nextInt();
            }
                
            

            int result=0;

            switch (choice) {
                case 1:
                    result=calc.addition(num1, num2);
                    break;
                case 2:
                    result=calc.subtraction(num1, num2);
                    break;
                case 3:
                    result=calc.multiplication(num1, num2);
                    break;
                case 4:
                    result=calc.division(num1, num2);
                    break;
                case 5:
                    result=calc.modulus(num1, num2);
                    break;
                case 6:
                    result=calc.power(num1, num2);
                    break;
                case 7:
                    result=calc.factorial(num1);
                    break;
                default:
                    System.out.println("Choice the Valid Option above..!!!");
                    continue;
            }       
        
        System.out.println("Result= " + result);
        System.out.print("Do you want to  perform another Operation ? (Y/N):");
        char answer=sc.next().charAt(0);
        if(answer=='N' || answer=='n'){
            running=false;
            System.out.println("Thank you  for  using  my Calculator :)  need a help hit me..!!!");
        }
    }
    sc.close();

    }
}
    




public class Demo
{
    public static void main(String[] args) {
        System.out.println("Learning About  class && Objects...");
       

        /*__________creating an Object::::___________*/

            // Scanner sc= new Scanner(System.in);
            // System.out.println("Enter number1 : ");
            // int num1= sc.nextInt();
            // System.out.println("Enter number2: ");
            // int num2= sc.nextInt();




            // Calculator calc=new Calculator();
            // //  Addition:::
            // int addition= calc.addition(num1, num2);
            // System.out.println("Sum of Numbers: " + addition);
            // // Subtraction::
            // int subtraction=calc.subtraction(num1, num2);
            // System.out.println("Subtraction of Numbers: " + subtraction);
            // // Multiplication:::
            // int multiplication=calc.multiplication(num1, num2);
            // System.out.println("Multiplication of Numbers: " + multiplication);
            // // Division:::
            // int division=calc.division(num1, num2);
            // System.out.println("Division of Numbers :: " + division);
            // // Modulus:::
            // int modulus=calc.modulus(num1, num2);
            // System.out.println("Modulus of  Numbers: " + modulus);
            // // Power:::
            // int power=calc.power(num1, num2);
            // System.out.println("Power of the number::" + power);




        System.out.println("===== Object-Orient Calculator========");
        InteractiveCalculator calculator = new InteractiveCalculator();
        calculator.start();



        

    }
}