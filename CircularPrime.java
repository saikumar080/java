import java.util.*;
public class CircularPrime {

    static boolean isPrime(int num){
        int count=0;
        for(int i=1;i*i<=num ;i++){
            if(num%i==0){
                count+=1;
            }
            if(num/i!=i){
                count+=1;
            }
        }
        if(count==2){
            return true;
        }
        else{
            return false;
        }
    }

    static  boolean rotateNumber(int num){
        int count;
        while(num>0){
            int lastDit=num%10;
            num=num/10;
            while(count!=0){
                lastDit=lastDit*10;
                count--;
            }
        }
    }
    static void  nthCircularPrime(int num){
       List<Integer> list=new ArrayList<>();
         for(int i=2;i<=num;i++){
              if(isPrime(i) && rotateNumber(i)){
                list.add(i);
                
              }
            }
            System.out.println("Circular Prime numbers:"+list);

    }
    public static void main(String[] args) {
        System.out.println("======================CIRCULAR PRIME===============");

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int number=sc.nextInt();
        System.out.println("Circular Prime Numbers are:");
        nthCircularPrime(number);
        sc.close();
       

        
    }
     
}
