import java.util.*;
public class ArraysTwo {
    public static void main(String args[]) {
        System.out.println("Arrays");
        Scanner sc=new Scanner(System.in);
        
        // Arrays can store same data types only:-
        // way to write array in java:-
        // 1. Dynamic way to write:-
        // Datatype [] nameOfTheArray=  new(keyword) data type [no.of items];
        int[] marks= new int[3];
        marks[0]=97;//phy
        marks[1]=98;//chem
        marks[2]=95;//eng
        System.out.println(marks);//prints gradage value


        //----to print marks in arrays:-
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        //---optimal approach to values in Arrays:-
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        //2. static way:-
        long[] markss={90,1999999996};
        for(int i=0;i<markss.length;i++){
            System.out.println(markss[i]);
        }


        //--------   examle taking input from user
            // int size=sc.nextInt();
            // int numbers[]=new int[size];
            // for(int i=0;i<numbers.length;i++){
            //     System.out.println(numbers[i]);
            // }
            // //input:-
            // for(int i=0;i<numbers.length;i++){
            //     System.out.println("::::::Input::::::");
            //     numbers[i]=sc.nextInt();
                
            // }
            // //output:-
            // for(int i=0;i<numbers.length;i++){
            //     System.out.println(":output::::");
            //     System.out.println(numbers[i]);
            // }





// ========== Questions: Take an array input from user search for x value print the index of the value:-
            // System.out.println("Enter the size of Array:::");            
            // int userValue=sc.nextInt();            
            // int value[]=new int[userValue];
            // //input:-
            // for(int i=0;i<value.length;i++){
            //     System.out.println("::::::Enter the input values:::");
            //     value[i]=sc.nextInt();

            // }
            // System.out.println("Enter the x value::::");
            // int x=sc.nextInt();
            // //output:-
            // for(int i=0;i<value.length;i++){
            //     if(value[i]==x){
            //         System.out.println("The index of the number is:: "+i);
            //     }
            // }






//=====           Take Homes    (3 questions)         ==============
            
            //1. Take an array of names as input from the user to print them on the screen.
            // System.out.println("Enter the number of names::::: ");
            // int stringSize=sc.nextInt();
            // String [] companies=new String[stringSize];
            // //input:-
            // for(int i=0;i<companies.length;i++){
            //     companies[i]=sc.next();
            // }
            // //output:-
            // for(int i=0;i<companies.length;i++){
            //     System.out.println("The "+(i+1)+"company name is:"+companies[i]);
            // }




            //2.Find the maximum & minimum number in an array of integers:-
            // System.out.println("Enter the size of numbers::");
            // int size=sc.nextInt();
            // int max=Integer.MIN_VALUE;
            // int min=Integer.MAX_VALUE;
            // int numbers[]=new int[size];
            // // input:-
            // for(int i=0;i<size;i++){
            //     System.out.println("Enter the Input:::"+i);
            //     numbers[i]=sc.nextInt();
            // }
            // for(int i=0;i<numbers.length;i++){
            //     if(max<numbers[i]){
            //         max=numbers[i];
            //     }
            //     if(min>numbers[i]){
            //         min=numbers[i];
            //     }
            // }
            // System.out.println("Maximum value is::"+max);
            // System.out.println("Minimum Value::"+min);







            //3.Take an array of numbers as input and check if it is an array sorted in ascending order.
                // Eg:{1,2,4,7}is sorted in ascending order.
                //      {3,4,6,2} is unsorted in ascending order.
                System.out.println("Enter the size of Array::");
                int size=sc.nextInt();
                int numbers[]=new int[size];
                boolean isAscending=true;
                //input:-
                for(int i=0;i<size;i++){
                    System.out.println("the "+(i+1)+" input is::");
                    numbers[i]=sc.nextInt();
                }
                //output:-
                for(int i=0;i<numbers.length-1;i++){
                    if(numbers[i]>numbers[i+1]){
                        isAscending=false;
                    }
                }
                if(isAscending==false){
                    System.out.println("The Array in not sorted in ascending order");
                }else{
                    System.out.println("the array is sorted in ascending order");
                }

            sc.close();
    }
}
