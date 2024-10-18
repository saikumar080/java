public class Objects{
    int x=8,y;//class attribute.
    final int z=40;//Don't want the ability to override exisiting values


    //------>>>>>>>>    Examples for Attributes    <<<<<<---------

    String fname="john";
    String lname="Doe";
    int age=24;



//------------>>>>>>>>>>>>>>>>    JAVA Class Methods       <<<<<<<<<<<-------------------------------
/*
 * 1.Static:-Static methods can call without creating objects
 * 2.Public:-Public methods can be called by creating objects
 */

 
//----->>>>>Static class Methods<<<<<<<---------
static void  myStaticMethod(){
    System.out.println("Static methods can call without creating objects");
}
static void carOwnnedBy(String carName){
    System.out.println("This car is owned by :: "+ carName);
}

//-------->>>>>>Public class Methods <<<<<<<-------
public void myPublicMethod(){
    System.out.println("Public methods can be called by creating objects");
}

public void carNames(String Car){
    System.out.println("this is my cars:: " + Car);
}


//---->>>>>>>>    Accesss PublicMEthods with an Object      <<<<<<-----------
public void carColor(){
    System.out.println("The car color is Red::");
}
public void carModel(String model){
    System.out.println("The model of car is :: " +model );
}
public int carMaxSpeed(int speed){
    return speed;
}

    public static void main(String[] args) {
        
        // ------>>>>>>>>   creating an Object <<<<<---------
        Objects myObj= new Objects();
        System.out.println(myObj.x);//accessing attributes(.)
        System.out.println(myObj);



        //--------->>>>>>>>>>> Creating a Multiple Objects   <<<<<<<----------
        Objects myobj1=new Objects();
        Objects myobj2=new Objects();
        myobj2.x=2;// overide the value
        System.out.println("Creating Mutliple Objects:::");
        System.out.println(myobj1.x);
        System.out.println(myobj2.x);
    



        //------->>>>>>>>   Modify Attributes    <<<<<<---------

        System.out.println("Modifying the values of Class Attributes::  ");
        myObj.y=6;//modify;
        System.out.println("the value Y attributes from class:: "+ myObj.y);
        myObj.x=23;//overirde
        System.out.println("the value of X attributes from class:: "+myObj.x);





        //------>>>>>>> final Key Word     <<<<<<<-------
        // 1.If you don't want the ability to override existing values:
        // => declare the attribute as final:
        System.out.println( "This is the keyword of final:: "+ myObj.z);



       
       // ------->>>>>>>>>>>>  Examples for Mutiple Attributes    <<<<<<<<<-----------

        Objects Details=new Objects();
        System.out.println("Name: " + Details.fname + " " + Details.lname);
        System.out.println("Age: " + Details.age);




//------------------->>>>>>>>>>>>>>>          JAVA Class Methods            <<<<<<<<<<<<<<<----------------------------------------
        System.out.println("Java Class Methods::: ");
        myStaticMethod();
        Objects.myStaticMethod();
        Objects publicMethod=new Objects();

        publicMethod.myPublicMethod();

        publicMethod.myStaticMethod();//we call static void class method also with objects.



        //----->>>>>>Accesss PublicMEthods with an Object <<<<<<<--------
        Objects myCar=new Objects();
        myCar.carColor();
        myCar.carModel("THAR 4*4");
        System.out.println("The MAximum speed of the car is :: "+myCar.carMaxSpeed(220));
        myCar.carNames("Saikumar");
        myCar.carOwnnedBy("Pillalamarri");
    }
};



// ----------->>>>>>>>    Creating Multiple Classes  go to Second.java  <<<<<<---------
