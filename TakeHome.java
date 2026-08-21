import java.util.ArrayList;

public class TakeHome {
    
    public static void main(String[] args) {
        int  arr[]={1,2,3,4,5};
        int n=arr.length;
        
        System.out.println("Orginal Array:: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    //APPROACH::::1. Creating an ArrayList 
    //T.C :-O(N) 
    //S.C:-O(N) creating an array 
            // ArrayList<Integer> res=new ArrayList<>();
            //     for(int i=n-1;i>=0;i--){
            //         res.add(arr[i]); 
            //     }
            //     System.out.println("\n Reservered Array:: ");
            //     System.out.println(res);
            
       

    //APPROACH::::-2. swapping number without creating new space to store:-
    //T.C :-O(N)
    //S.C:-O(1)
        // int p1=0, p2=n-1;
        // System.out.println("\n Reservered Array:: ");
        // while(p1<p2){
        //     int temp=arr[p1];
        //     arr[p1]=arr[p2];
        //     arr[p2]=temp;
        //     p1++;
        //     p2--;
        // }
        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i]+" ");
        // }


    //APPROACH :::3 Recursive Approach:-
            int start=0, end=n-1;
            while(start<end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;

            }
    

    }
}
