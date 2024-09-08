public class Arrays {
    public static void main(String[] args){
        System.out.println("Learning about Array and its properties::");
        /*----------->>>>>>> ARRAYS<<<<<<<<<<<<<<<<------------ 
         * declare by [];
         * to store String value::{ "stringvalue1","stringValue2"....};
         * to store integers value::{1,2,123,234......};
         * 
         * 
         *  
        //-----Strings in Arrays------
        String[] laptops={"Asus","HP","Lenovo","Acer","Mac Book"};
        System.out.println("The value of Zero index:: "+laptops[0]);
        laptops[0]="Gamer laptop!!";//update(change element)
        System.out.println("The updated value of 0th index:: "+laptops[0]);
        System.out.println("The value of length of Array[Laptops]::"+laptops.length);//the value of length of array;

        for(int i=0;i<laptops.length;i++){
            System.out.println("The elements inside the laptops:: "+laptops[i]);
        }
        for(String i:laptops){
            System.out.println("The elements inside the laptops using the for-Each loop:: "+i);
        }



        //----------Integers in Arrays---------------
        int[] Numbers={1,12,32,234,-90};
        System.out.println("The value of integer at 0th index:: "+Numbers[0]);
        for(int i=0;i<Numbers.length;i++){//loop through Array
            System.out.println("The value of Number:: "+Numbers[i]);
        }
        for(int i:Numbers){//loop through Array with For-Each
            System.out.println("The value of Numbers using for Each loop:: "+i);
        }




        //========Real Life Examples===================
        int ages[]={20,22,18,35,48,87,70,26};
        double avg,sum=0;
        for(int i=0;i<ages.length;i++){
            sum+=ages[i];
        }
        avg=sum/ages.length;
        System.out.println("The average age of the persons is:: "+avg);
        //-----young age among them -----
        int young=ages[0],older=ages[0];
        for(int i=0;i<ages.length;i++){
            if(ages[i]<young){
                young=ages[i];
            }
            if(older<ages[i])
                older=ages[i];
        }
        System.out.println("Younger age person is:: "+young);
        System.out.println("older age person is:: "+older);
        */


        //-----------Multi-Dimensional Arrays---------------
        int myNumbers[][]={{1,2,3,4,5},{7,8,9},{10,11,12}};
       System.out.println("Access Elements from Multi-Dimensional Array:: "+myNumbers[1][0]);
       myNumbers[1][0]=6;
       System.out.println("The modified Element value in an Array:: "+myNumbers[1][0]);

       //------------------Loop through Multi-Dimensional Array---------
       for(int i=0;i<myNumbers.length;i++){
        int value=i;
        System.out.println("this is the i loop:: "+i);
            for(int j=0;j<myNumbers[i].length;j++){
            System.out.println("This is the J loop::");
            System.out.println(value+"---"+myNumbers[i][j]);

            }
       };



       //------For-each loop for Multi-Dimensional Arrays---------
       for(int row[] : myNumbers){

            for(int i : row){
                System.out.println(i);
            }
       }

    }
}
