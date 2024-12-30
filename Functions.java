import java.util.*;;
public class Functions {
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
       myName(name);
       sc.close();
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





      
    }
         //1.Print a given name in a function:::
         public static  void  myName(String name){
            System.out.println("My name is "+name);
            // return;
          }
}
