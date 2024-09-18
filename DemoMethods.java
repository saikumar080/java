public class DemoMethods {
   

    public static void main(String []args){
        System.out.println("I am Learning About Java Methods:::");
        // myMethod();
        // myMethod();
        // myMethod();


        // greetings("saikumar", 23);
        // greetings("fruti", 16);


        // voterID("Malaysian", 56);
        // voterID("Indian", 18);
        // voterID("Indian",23 );
        // voterID("chianese", 40);


        // int vaue=add(5,3);
        // System.out.println("Return from Add() using return keyword:: "+vaue);


        // int calculationValue=calculation(3, 4,"+");
        // System.out.println("This method is running based on int parameter: "+ calculationValue);
        // System.out.println("This method is running based on int parameter: "+ calculation(3,4,"-"));
        // System.out.println("This method is running based on int parameter: "+ calculation(3,4,"*"));
        // System.out.println("This method is running based on int parameter: "+ calculation(3, 4,"/"));
        // double calculationValue1=calculation(3.2,4.8,"+");
        // System.out.println("This is the method coming from double parameter:: "+calculationValue1);




        //-------------Here we are calling the change double parameter with same method:::---------------------
        // System.out.println("This method is running based on double parameter: "+ calculation(3.2,4.8,"-"));
        // System.out.println("This method is running based on double parameter: "+ calculation(3.2,4.8,"*"));
        // System.out.println("This method is running based on double parameter: "+ calculation(3.2, 4.8,"/"));




        System.out.println(methodScope(100));
        System.out.println(methodScope(200));

        //----------->>>>>>>> sumOfRange()  !!!! is Recursion Method  !!!  <<<<-------------
        System.out.println("This is value of Recursion method :: "+sumOfRange(10));
        //-------->>>>>>sumRecursion() !!!! is Recursion checking for base condition !!!! <<<<-----
        System.out.println("This is SumRecursion() method::: "+sumRecursion(5,10));
        System.out.println("This is SumRecursion() method::: "+sumRecursion(15,10));
        System.out.println("OM Ganeshiah Namaha!!!!!");
 
    }


    //-------NOn-Parameter method-------------
    // static void myMethod(){
    //     System.out.println("I just got excuted to learn Methods in java!!!");
    // }



    //-----------parameter methods-----------
    // static void greetings(String name,int age){
    //     System.out.println("Welocme to java Programming "+name + " as per our records your age is "+ age);
    // }




    //--------------Example for voter Id application------------;
    // static void voterID(String citizen,int age){
    //     if(citizen=="Indian")
    //         if(age>18){
    //             System.out.println("you are eligible to get vote :) !!");
    //         }else if( age ==18){
    //             System.out.println("Get ready to voter, Choose your vote in right way ;)!!");
    //         }else{
    //             System.out.println("You are too young to apply the vote!!!");
    //         }
    //     else
    //         System.out.println("You are not Indian citizen to vote :( :(!!");

    //     };


    //--------->>>>>>>> Return values  <<<<<<<-------------------
            // static int add(int num1,int num2){
            //     return num1 + num2;
            // };


    //.........>>>>>>>  Method Oveloading  <<<<<<-----------------
            static  int calculation(int x, int y,String Symbol){
                if(Symbol == "+"){
                    return x +y;
                }else if(Symbol == "-"){
                    return x -y;
                }else if(Symbol == "*"){
                    return x*y;
                }else{
                    return x/y;
                }
            };


            //here we are calling same method with different parameters:
            static  double calculation(double x, double y,String Symbol){
                if(Symbol == "+"){
                    return x +y;
                }else if(Symbol == "-"){
                    return x -y;
                }else if(Symbol == "*"){
                    return x*y;
                }else{
                    return x/y;
                }
            }

            // ------------------->>>>>>>>>>>   JAVA SCOPE    <<<<<<<<<-----------------
            static int methodScope(int x){
                int num=100;
               
                return num + x;
            }


    //------------------------>>>>>>>>>>>>>>>>>>   Recursion    <<<<-------------------
    static int sumOfRange(int x){
        if(x >0){
            return x + sumOfRange(x-1);
        }else{
            return 0;
        }
    } 
 


    //---------->>>>>>>> adding  numbers using recursion  <<<<<<-----
    public static int sumRecursion(int start,int end){
        if(end >start){
            return end + sumRecursion(start,end-1);
        }else{
            return end;
        }
    }







    
}
