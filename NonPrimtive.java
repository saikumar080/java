class Calculator
{
    public int add(int Num1,int Num2)
    {
        // System.out.println("Add Method");
        int res=Num1 + Num2;
        return res;
    }
};
class Subtraction{
    public int minus(int n1,int n2)
    {
        return n1 - n2;
    }
};
class Multiplication{
    public int multiply(int n1,int n2){
        return n1*n2;
    }
}

public class NonPrimtive {
    public static void main(String[] args){
        System.out.println("This is non-primitive data types::");
        Calculator calc=new Calculator();
       int res= calc.add(3,5);
       System.out.println("this is method comping from the Calculator:: "+res);

       Subtraction subc=new Subtraction();
       System.out.println("this is object coming from the Subtraction class:: "+subc.minus(10,2));
       Multiplication mult=new Multiplication();
       System.out.println("this is the method coming the Multiplication method:: "+mult.multiply(2,10));


    }
}
  