import java.util.*;
public class HashMaps {
    public static void main(String[] args) {
        System.out.println(":::::::::::: HASHMAPS  :::::::::");
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the size of the array::");
         int n=sc.nextInt();
         int arr[]=new int[n];
         for(int i=0;i<n;i++){
            System.out.println("Enter the element of the array::");
             arr[i]=sc.nextInt();
         }

         //preCompute:
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<n;i++){
                int key=arr[i];
                int freq=0;
                if(map.containsKey(key)){
                    freq=map.get(key);
                }
                freq++;
                map.put(key,freq);
            }

            //output:
            int q;
            q=sc.nextInt();

            for(int i=0;i<q;i++){
                int key=sc.nextInt();
                if(map.containsKey(key)){
                    System.out.println("The frequency of "+key+" is::");
                    System.out.println(map.get(key));
                }else{
                    System.out.println("Not Found");
                }
            }
    }
}