import java.util.*;;
public class patterns {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Entr  number of rows::: ");
        int row=sc.nextInt();
        System.out.println("Enter number of colums::: ");
        int column=sc.nextInt();


        //---------->>>>>> 1.Rectangle pattern   <<<<<<<-----------------
        System.out.println("Rectangle Pattern:::   ");
        for(int i=0;i<row;i++){
            // System.out.print("*");
            for(int j=0;j<column;j++){
                System.out.print(" *");
            }
            System.out.println();
            // System.out.print("\n");
        }





        // ----------------->>>>>>>>>>>>> 2.Hallow Rectangle    <<<<<<<<<<-------------
        //👉👉🌟 reminder🌟
        // System.out.println("The Hallow Rectangle pattern is :: ");
        // for(int i=0;i<row;i++){
        //     for(int j=0;j<column;j++){
        //         if(i==0 || j==0 || i==row-1 || j==column-1){
        //             System.out.print(" *");
        //         }else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }




            //------------->>>>>>>      3.Half Pyramid       <<<<<<-------------
            // System.out.println("The Half pyramid::::");
            // for(int i=0;i<row;i++){
            //     for(int j=0;j<=i;j++){
            //         System.out.print(" * ");
            //     }
            //     System.out.println();
            // } 




            //------------->>>>>>>     4.Invert Half Pyramid      <<<<<<---------------
            // System.out.println("The Inverted Pyramid:::");
            // for(int i=row-1;i>=0;i--){
            //     for(int j=0;j<=i;j++){
            //         System.out.print(" * ");
            //     }
            //     System.out.println();
            // } 



            //------->>>>>>> 5. Inverted Half Pyramid (rotatd by 180deg)     <<<<<<<---------------
            //-----🌟 Without space for its' printing inverted half Pyramid🌟
            //---🌟 With space for its' printing triangle🌟
            System.out.println("Inverted Half Pyramid:::  ");
            for(int i=0;i<row;i++){
                //inner loop -> space print
               for(int j=0;j<row-i;j++){
                System.out.print("  ");
               }

               for(int j=0;j<=i;j++){
                System.out.print(" *");
               }
               System.out.println();
            }





        // -------------->>>>>>>>>>>>>>>> 6.Half Pyamid with Numbers <<<<<<<<<<<<<----------
        // System.out.println("Inverted Pyramid with Numbers:::   ");
        // for(int i=1;i<=row;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }




        //---------->>>>>>>>>>>>>>7.Inverted Half Pyramid With Numbers      <<<<<<<<<<<------------------
        // System.out.println("Inverted Halft Pyramid with Numbers::::");
        // for(int i=row;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }


        //--------->>>>>>>>>8. Floyd's Triangle <<<<<<<<<<<-----------------------------
        //🌟THis sholud you learn again🌟
        // System.out.println("Floyd's Triangle :::::  ");
        // int number=1;
        // for(int i=0;i<row;i++){
        //     for(int j=0;j<=i;j++){
        //         System.out.print(number+ " ");
        //         number++;
        //     }
        //     System.out.println();
        // }





        //---------------->>>>>>>>>>>>>    9.0-1 Triangle    <<<<<<<<<<<------------------
        //🌟This should you remember to learn🌟
        //👉Sum of i +  j== even print 1;
        //👉sum of i+ j== odd print 0;
        //0-1 Traingle::::
        // 1
        // 0 1
        // 1 0 1
        // 0 1 0 1
        // 1 0 1 0 1
        // System.out.println("0-1 Traingle::::   ");
        // for(int i=0;i<row;i++){
        //     for(int j=0;j<=i;j++){
        //         int sum= i+j;
        //         if(sum % 2 ==0){
        //             System.out.print(1 + " ");
        //         }else{
        //             System.out.print(0 + " ");
        //         }
        //     }
        //     System.out.println();
        // }




        //----------->>>>>>>>>>>>>>> 10. Printing Equilateral triangle     <<<<<<<<<<-------------
         //🌟This should you remember to learn🌟
        // System.out.println("Printing Equilateral triangle");
        // for(int i=0;i<row;i++){
        //     //spacing
        //     for(int j=0;j<row-i;j++){
        //         System.out.print(" ");
        //     }
        //     //printing 
        //     for(int j=0;j<=i;j++){
        //         System.out.print("* ");

        //     }
        //     System.out.println();
        // }





    //------------>>>>>>>>>>>>>>>> Take Homes <<<<<<<<<<<<<<<-------------------------
        //----------->>>>>>>>>>1.Print a Solid rhombus   <<<<<<<<<<<<------------
        // System.out.println("Printing Solid Rhombus::::  ");
        // for(int i=0;i<row;i++){
        //     //spaces
        //     for(int j=0;j<row-i;j++){
        //         System.out.print("  ");
        //     }

        //     //printing stars
        //     for(int j=0;j<row;j++){
        //         System.out.print(" *");
        //     }
        //     System.out.println();
        // }





        //------->>>>>>>>>> 2.Print a Number Pyramid      <<<<<<<<<<<---------
        //  System.out.println("Print a Number Pyramid::::");
        // int number=1;
        // for(int i=1;i<=row;i++){
        //     //spacing
        //     for(int j=row;j>=i;j--){
        //         System.out.print(" ");
        //     }

        //     //printinng
        //     for(int j=1;j<=i;j++){
        //         System.out.print(number+ " ");
        //     }
        //     number++;
        //     System.out.println();
        // }
        //----------->>>>>Second Approach<<<<<<<<<-------------
        // int number2=1;
        // for(int i=0;i<row;i++){
        //     //---spacing----
        //     for(int j=0;j<=row-i;j++){
        //         System.out.print(" ");
        //     };
        //     //----printing starts-----
        //     for(int j=0;j<=i;j++){
        //         System.out.print(number2+" ");
        //     }
        //     number2++;
        //     System.out.println();
        // }

        
    //------->>>>>>>>>>>>   11. Butterfly Pattern      <<<<<<<<<------
    //👉reminder:- 1.upper   ==>>   1.left pattern
    //                      ✨ ==>>    2.spaces pattern== 2*(row-i);
    //                      ✨  ==>    3.right pattern
    //              2.lower ==> same but change outer loop inverse manner. 
        System.out.println("Butterfly Pattern::::   ");
         
        //-------upperhalf-------------
            for(int i=1;i<=row;i++){
                //-----left stars---
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                //---spacing----
                int spaces=2*(row-i);
                for(int j=1;j<=spaces;j++){
                    System.out.print(" ");
                }
                // ----right starts---
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }


            //---dowm part----
            for(int i=row;i>=1;i--){
                //-----left stars---
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                //---spacing----
                int spaces=2*(row-i);
                for(int j=1;j<=spaces;j++){
                    System.out.print(" ");
                }
                // ----right starts---
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }




    //------->>>>>>>    12. Palindromic Pattern    <<<<<--------
            //👉reminder:-1.spacing.
            //             ✨2.printing left part
            //             ✨3.printing right part(where j loop starts from 2)
            System.out.println("Palindromic Pattern:::::");
            for(int i=1;i<=row;i++){
                //===spacing===
                for(int j=1;j<=row-i;j++){
                    System.out.print(" ");
                }
                // printing left part
                for(int j=i;j>=1;j--){
                    System.out.print(j );
                }

                //printing right part
                for(int j=2;j<=i;j++){
                    System.out.print(j);
                }
                System.out.println();
            }
        


        //-----Diamond Pattern-------
            // 👉Reminder:- I.1. spacing
            //                ✨ 2.printing starts where as condition is (j<=2*i-1);
            //               ✨II.Reverse the outer loop.!!!
                System.out.println("Diamond Pattern:::");
                //upper pattern
                for(int i=1;i<=row;i++){
                    //====spacing====
                    for(int j=1;j<=row-i;j++){
                        System.out.print(" ");
                    }
                    //==printing stars====
                    int starts=2*i-1;
                    for(int j=1;j<=starts;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                //lower pattern
                for(int i=row;i>=1;i--){
                    //====spacing====
                    for(int j=1;j<=row-i;j++){
                        System.out.print(" ");
                    }
                    //==printing stars====
                    int starts=2*i-1;
                    for(int j=1;j<=starts;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
      

    }
}
