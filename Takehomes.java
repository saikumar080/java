import java.util.*;
public class Takehomes {

    //:::::   1. print the Average of # numbers     ::::
    public static int printAverage(int num1,int num2,int num3){
        int sum=num1+num2+num3;
        return sum/3;
    }

    ///:::::: 2. print sum of all Odd number from 1 to n   ::::::
    public static int SumOdd(int n){
        int sum=0;
        while(n>=1){
            if(n%2!=0){
                sum+=n;
            }
            n--;
        }
        return sum;
    }

    //:::::: 3. print Circumferences of Cirlce::::
    public static double printCircumfernece(int r){
        double Circumferences=2*Math.PI*r;
        return Circumferences;
    }


    //::::: 4. print Greastest Number of those 2 numbers::::
    public static int printGreatest(int n1, int n2){
        if(n1>n2){
            return n1;
        }else{
            return n2;
        }
    }



    //:::::: 5. Print Eglible tovote or not:-
    public static String checkEligibleToVote(int age){
        if(age>=18){
            return "Eligible to vote!!  :)";
        }else{
            return "Not Eligible to Vote!! :(";
        }
    }
    public static void main(String[] args) {
        System.out.println(":::::::     Takes Homes from overall Problems    ::::");
        Scanner sc=new Scanner(System.in);


//1.Average of Numbers:::----
    //     System.out.println("ENter the number1:::");
    //    int n1= sc.nextInt();
    //    System.out.println("Enter the number2::");
    //    int n2=sc.nextInt();
    //    System.out.println("Enter the Number 3::");
    //    int n3=sc.nextInt();
    //     int average=printAverage(n1, n2, n3);
    //     System.out.println("The Average of 3 Numbers is:::  "+average);

 //2. print sum of Odd::::-------

        // int odd=SumOdd(n3);
        // System.out.println("The sum of Odd Numbers is::"+odd);

 //3.Print Circumfernce of Circle:::::------
        // System.out.println("Enter the radius of Circle:::");
        // int radius=sc.nextInt();
        // double Circumfernce=printCircumfernece(radius);
        // System.out.println("The Circumfernce of Circle is :::: "+Circumfernce);

//4.print Greatest Number of 2 numbers::
        // int Greastest=printGreatest(n1, n2);
        // System.out.println("The Greatest Number is:::: "+Greastest);


//5. Check Eligible to Vote or not :::
        // System.out.println("Enter the Age of person To check Eligible to Vote :::  ");
        // int age=sc.nextInt();
        // String eligible=checkEligibleToVote(age);
        // System.out.println("The person is "+eligible);



//Infinite loop using do-while loop:-
        // int n=10;
        // do {
        //     System.out.println(n);
        //     n++;
        // }while(n>10);




    // COunt of Zereos, Postive numbers and Negative Numbers::::
            int PostiveCount=0;
            int negativeCount=0;
            int zeroCount=0;
            String choice;
            do{
                System.out.println("Enter the number: ");
                int number=sc.nextInt();
                if(number>0){
                    PostiveCount++;
                }else if(number==0){
                    zeroCount++;
                }else{
                    negativeCount++;
                }
                System.out.print("Do you want to enter another number ? (y/n): ");
                choice=sc.next();
            }while(choice.equalsIgnoreCase("y"));
            System.out.println("\n The count   of postive numbers from user:: "+ PostiveCount);
            System.out.println("The count of negative numbers from users:: "+negativeCount);
            System.out.println("The count of zereos entered by the user:: "+zeroCount);
            sc.close();

    }
}
