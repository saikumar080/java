/*----------------->>>>>>>>>>>Constructors<<<<<<<<<-----------------
 * A constructor in Java is a special method that is used to initialize objects. 
 * The constructor is called when an object of a class is created. 
 * It can be used to set initial values for object attributes:
 * Constructor name must MAtch the class name:
 * It can't have a return type(like void).
 * All Classes have Consructors by Default: (if u don't create a class constructor urself,java creates one for you.However, then you are not able to set initial values for object attributes.)
 */
public class Constructors {
    int x;//attribute
//----examples------------
    int modelYear;
    String modelName;



    //-------->>>>>>>     Creating a class constructor for the Constructor Class.    <<<<<<-------------
    public  Constructors(int y){
        x=y;//set the initial value for the attribute x;
    }


    //------Examples------------
    public Constructors(int Year, String name){
        modelName=name;
        modelYear=Year;
    }
    public static void main(String [] args){
        System.out.println("Learning About Constructors::: ");

        //------->>>>>   Example for X value Attribute    <<<<<<<<----
        Constructors myobj=new Constructors(5);
        System.out.println(myobj.x);



       //------Example for Constructors---------
       Constructors myExample=new Constructors(2024, "AI Era Model");
       System.out.println(myExample.modelYear + "is the year of "+myExample.modelName);
    }
}
