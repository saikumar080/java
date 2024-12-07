import java.util.Arrays;
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
        System.out.println(":::::::::::    Dynamic Array    :::::::::");
        int num[]=new int[4];
        System.out.println(num.length);
       
    }
}
