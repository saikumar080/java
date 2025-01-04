import java.util.*;

//1. Instance Method
class InstanceMethod{
    public int add(int a, int b){
        return a+b;
    }
}


//2. static Method:-
class staticMethod{
    public static int add(int a, int b){
        return a+b;
    }
}

//3. Abstract Methods:-
abstract class Animal {
    //Abstract method (no body)
    public abstract void sound();
    
}
class Dog extends Animal{
    //implementing Abstact .method
    public void sound(){
        System.out.println("Woof");
    }
}
public class Methods {
    public static void main(String[] args) {
        System.out.println("::::  Types of Methods   ::::");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number 1:: ");
         int num1=sc.nextInt();
        System.out.println("Enter the number 2:: ");
        int num2=sc.nextInt();

//-------->>>>>>>>>>      1.Instance Method:-    <<<<<<<<<<--------
        //create an Object:-
        InstanceMethod method=new InstanceMethod();
        //--calling instance method
       int res1  = method.add(num1, num2);
       System.out.println("::::::========  Instance Method  ========::::");
        System.out.println(res1);


//--------->>>>>>>>>>>    2. Static Method    <<<<<<----------
        //don't need to create an Object:-
        int res2= staticMethod.add(num2,num1);
        System.out.println(":::::::=======   Static Method  ======:::::::");
        System.out.println(res2);


//---------->>>>>>>>>>   3. Abstract Method    <<<<<<<<----------
        Dog dog=new Dog();
        System.out.println(":::::::=======   Abstract Method  ======:::::::");
        dog.sound();
    }
}
