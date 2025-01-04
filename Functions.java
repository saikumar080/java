import java.util.*;
 class Multiplication{
    public  void  printTable(int num){
        for(int i=1;i<=10;i++){
    
            System.out.println(num+" * "+i+" = "+ num*i);
        }
    }
}
public class Functions {
     //1.Print a given name in a function:::
         public static  void  myName(String name){
            System.out.println("My name is "+name);
            // return;
          }


    // 2.Make a function to add 2 numbers and return the sum
    public static int Sum(int a,int b){
        return a+b;
    }


    //3.Make a function to  mutliply 2 numbers and return product:-
    public static int mutliply(int a, int b){
        return a*b;
    }


    //4.Find the factorial of a number:-
        public static int factorial(int num){
            if(num<0){
                return Integer.MIN_VALUE;
            }
            int value=1;
            while(num>1){
                value*=num;
                num--;
            }
            return value;
        }


        //check if a number is prime or not:-
        
        public static void checkPrime(int num){
            int cnt=0;
            for(int i=1;i*i<=num;i++){
                if(num%i ==0){
                   cnt=cnt+1;

                   if(num/i !=i){
                    cnt=cnt+1;
                }
                }
                
            }
            if(cnt!=2){
                System.out.println("Not Prime");
            }else{
                System.out.println("Prime");
            }
        }



        //check Given number is event or not:-
        public static String checkEvenOrOdd(int num){
            
            if(num%2==0){
                return "Even";
            }else{
                return "Odd";
            }
        }


        //---- >>>>>>>>>>     Main Method      <<<<<<<<<<------------
            public static void main(String[] args) {
        System.out.println(":::::::::   Functions::::::::");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number 1::");
            int num1=sc.nextInt();
            System.out.println("Enter number 2:: ");
            int num2=sc.nextInt();
        //1.print name
        System.out.println("Enter String name:: ");
        sc.nextLine();
        String name=sc.nextLine();
       sc.close();
       //1. print name of person:-
        //    myName(name);


    //2.print add 2 numbers
    //    int sumValue=Sum(num1,num2);
    //    System.out.println(sumValue);



        //3.print multiply 2 numbers:-
        // int multiplication=mutliply(num1, num2);
        // System.out.println(multiplication);


        //4.factorial of a number:-
        // int factorialValue=factorial(num2);
        // System.out.println(factorialValue);

        //check prime:-
        // checkPrime(num2);
        // System.out.println(factorial(num2));


        //Check Number is Even or Odd:-
        String checkEvenorOddNumber=checkEvenOrOdd(num2);
        System.out.println(checkEvenorOddNumber);


        //print Tables:-
        Multiplication tableClass=new Multiplication();
        tableClass.printTable(num2);




      
    }
        
}
