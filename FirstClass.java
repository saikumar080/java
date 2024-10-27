import java.util.*;;
class FirstClass{
    public static void main(String args[]){
        // System.out.print("Hello Wolrd\n guru garu!!!");
        // System.out.print("\nHello guur");

        //-------printing stars in one line--------------
        // System.out.println("*\n**\n***\n****");


        //--------adding sum of integers-----------
        // int a=10;
        // int b=5;
        // int ans=(a*b)/(a-b);
        // System.out.println(ans);
        Scanner sc=new Scanner(System.in);


        //-------User input------------------------
        // System.out.println("Enter Val1::");
        // int val1=sc.nextInt();
        
        // System.out.println("Enter Value val2::");
        // int val2=sc.nextInt();
        // int sum=val1 + val2;8
        
        // System.out.println(sum); 



        //----Area of Cirlce-----------------
        // System.out.println("Enter the Radius4:: ");
        // double radius=sc.nextDouble();
        // System.out.println(Math.PI * Math.pow(radius,2));


        //-----------printing Tables----------------
        System.out.println("Enter Number:: ");
        int number=sc.nextInt();
        int i=1;
        while(i<=10){
            int res=number * i;
           System.out.println(number + " * " + i + " = " + res);
           i++;
        }
        
    }
}
