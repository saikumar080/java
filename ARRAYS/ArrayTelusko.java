import java.util.Arrays;
class Student{
    int rollno;
    String name;
    String Branch;
    int marks;
}
public class ArrayTelusko {
    public static void main(String[] args) {
        System.out.println(":::::::::     Arrays      :::::::");
        //===========   Static Array     =============
            System.out.println("Static Way:::");
            int nums[]={1,2,3,4};
            // //--- printing the values of array by default it print string value to void it we need to use toString():-
            System.out.println(Arrays.toString(nums));
           
            //--printing based on index
            System.out.println("Value of 0th Index:::");
            System.out.println(nums[0]);
            //---changing the value of array based on index::
            nums[1]=6;
            System.out.println("The value of 1st Index changes:::");
            System.out.println(nums[1]);
        //==========    Dynamic Array    +===========
            System.out.println(":::::::::::    Dynamic Array    :::::::::");
            int num[]=new int[4];
            num[0]=1;
            num[1]=5;
            num[2]=9;
            num[3]=10;
            //looping for an array:-
            for(int i=0;i<num.length;i++){
                System.out.println(num[i]);
            }
            System.out.println(num.length);


        //=============   Multi Dimensional Array   ==============
        System.out.println(":::::::::    Multi Dimensional Array   ::::::::");
        int valuess[][]=new int[3][4];
            
            for(int i=0;i<valuess.length;i++){
                for(int j=0;j<4;j++){
                    valuess[i][j]=(int)(Math.random()*10);
                    System.out.print(valuess[i][j] + " ");
                }
                System.out.println();
            }

        //Enhands for Lop:-
        for(int n[]:valuess){
            for(int m:n){
                System.out.print(m+" ");
            }
            System.out.println();
        }
        //Jagged Arrays: where there is no equal length of internal array:
       int jaagged[][]=new int[3][];
       jaagged[0]=new int[3];
       jaagged[1]=new int[2];
       jaagged[2]=new int[1];

       //looping for jagged arrays:-
       for(int i=0;i<jaagged.length;i++){
        for(int j=0;j<jaagged[i].length;j++){
            System.out.print(jaagged[i][j]);
        }
        System.out.println();
       }


       //setting objects in arrays:
       Student s1=new Student();
       s1.Branch="CSE";
       s1.marks=88;
       s1.name="VArshini";
       s1.rollno=23;
       Student s2=new Student();
       s2.Branch="CSD";
       s2.marks=88;
       s2.name="Saikumar";
       s2.rollno=42;
       Student s3=new Student();
       s3.Branch="CSE";
       s3.marks=90;
       s3.name="dtharun";
       s3.rollno=73;
       Student students[]=new Student[3];
       students[0]=s1;
       students[1]=s2;
       students[2]=s3;
       for(int i=0;i<students.length;i++){
        System.out.println(students[i].name+" : "+students[i].Branch);
       }
    }
}
