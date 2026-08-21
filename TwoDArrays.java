import java.util.*;
public class TwoDArrays {
    public static void main(String[] args) {
        System.out.println(":::::::::::: 2D ARRAYS  :::::::::");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Rows::");
        int rows=sc.nextInt();
        System.out.println("Enter the Number of Columns:::");
        int col=sc.nextInt();
        // int [][]numbers=new int[rows][col];
        // //input:-
        // for(int i=0;i<rows;i++){
        //     for(int j=0;j<col;j++){
        //         System.out.println("input of "+ i +" and "+j+"is::");
        //         numbers[i][j]=sc.nextInt();
        //     }
        // }
        // //output:-
        // System.out.println("The output of code is:::");
        // for(int i=0;i<rows;i++){
        //     for(int j=0;j<col;j++){
        //         System.out.print(numbers[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        


    //===Question::: Take a matrix as input from the user. Search for a given number x and print the indices at which it occurs:::
        // int matrix[][]=new int[rows][col];
        // int x=sc.nextInt();
        // //input:
        // for(int i=0;i<rows;i++){
        //     for(int j=0;j<col;j++){
        //         System.out.println("input of i is "+i+" and j is "+j);
        //         matrix[i][j]=sc.nextInt();
        //     }
        // }
        // //output:-
        // for(int i=0;i<rows;i++){
        //     for(int j=0;j<col;j++){
        //         if(matrix[i][j]==x){
        //             System.out.println("Indicate row is "+ i+" the columns is "+j);
        //         }
        //     }
        // }


    //Take Home:-   
            //================== Print the spiral order matrix as output for a given matrix of numbers:-
            // int sprialMatrix[][]=new int[rows][col];
            // //input:-
            // for(int i=0;i<rows;i++){
            //     for(int j=0;j<col;j++){
            //         System.out.println("Enter the input of row "+ i+ " and column "+j);
            //         sprialMatrix[i][j]=sc.nextInt();
            //     }
            // }

            // int rowStart=0;
            // int rowEnd=rows-1;
            // int colStart=0;
            // int colEnd=col-1;
            // System.out.println("The spiral Matrix is:::");
            // while(rowStart<=rowEnd || colStart<=colEnd){
            //     //print 1 row:-
            //     for(int i=colStart;i<=colEnd;i++){
            //         System.out.print(sprialMatrix[rowStart][i]+" ");
            //     }
            //     rowStart++;
            //     // print last cloumn from top to bottom:-
            //     for(int i=rowStart;i<=rowEnd;i++){
            //         System.out.print(sprialMatrix[i][colEnd]+" ");
            //     }
            //     colEnd--;
            //     //print last row from end to start:-
            //     for(int i=colEnd;i>=colStart;i--){
            //         System.out.print(sprialMatrix[rowEnd][i]+" ");
            //     }
            //     rowEnd--;
            //     // print fisrt column from bottom to top:-
            //     for(int i=rowEnd;i>=rowStart;i--){
            //         System.out.print(sprialMatrix[i][colStart]+" ");
            //     }
            //     colStart++;
            //     System.out.println();
            // }







            //2. For a given matrix of N x M, print its transpose.
            int matrix[][] = new int [rows][col];
                //input:-
                for(int i=0;i<rows;i++){
                    for(int j=0;j<col;j++){
                        System.out.println("Enter the "+i+" value and "+j+"value is::");
                        matrix[i][j]=sc.nextInt();

                    }
                }
                //transpore of matrix:-
                System.out.println("The trnaspore matrix is::::");
                for(int j=0;j<col;j++){
                    for(int i=0;i<rows;i++){
                        System.out.print(matrix[i][j]+" ");
                    }
                    System.out.println();
                }
            




    }
}
