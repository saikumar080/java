public class Modifiers {
 
    /*----------->>>>>>>>>           Modifiers          <<<<<<<<<<---------------------------
     * 1.Access Modifiers:controls the access level.
     * =>Public,Default;
     * 2.Non-Access Modifiers: don't control access level, but provides other functionality;
     * =>Attributes,methods,constructors;
     */

   /*  ------------>>>>> Access ==={Public}<<<<<<<<<<------
    *  1.The Code can access any where.
    *  -----it can be accessed in Second.java file
    */
     public String fname="Saikumar";
     public String lname="Pillalamarri";
     public String email="saikumarpsrl@gmail.com";
     public int age=23;




    /*---------------->>>>>>>>>>>> Access ===={private}<<<<<<<<<<<-------------
    * The code is only accessible within the declared class.
    */
    private String Ename="Harshini";
    private String CompamyName="Genpact";
    private String role="Senior Assiocate";
    private String salary="4.2lpa";




    /*------------->>>>>>>>Access======{Protected}<<<<<<<<<----------- 
    * The code is accessible in the same package and subclasses{Inheritance}
    */
    protected String fatherName="Rajababu";
    protected String motherName="Savitha";
    protected int children=2;



    /*----------->>>>>>>>>>>>           NON-Access for classes u can use either final or abstract               <<<<<<<<--------------
     * 1.Final:-The class can't inherited by ohter classes
     * ===>>> knowing them better in Inheritance
     * 2.abstract:-The class cannot be used to create objects (To access an abstract class, it must be inherited from another class.
     * ===>>>Knowing them better in Inheritance and Abstraction
     */



     /*------------>>>>>>       NON-Access for attributs and methods    <<<<<<<<<<---------------
      * 1.final:-Attributes and methods can't be overriden/modified.
      2.static:-Attributes and methods belongs to the class,rather than an object.
      3.abstract:-	Can only be used in an abstract class, and can only be used on methods. The method does not have a body, for example abstract void run();. The body is provided by the subclass (inherited from)
      4.transient:-	Attributes and methods are skipped when serializing the object containing them.
      5.synchronized:-Methods can only be accessed by one thread at a time.
      6.Volatile:- The value of an attribute is not cached thread-locally, and is always read from the "main memory".
      */

      //---------->>>>>> FInal Attribute <<<<<<------
      final int e=10;
      final double PI=3.14;
    public static void main(String [] args){
        System.out.println("Access Modifiers for Classes::  ");
        
//         /* -------->>>>>>>>>> Access Modifiers for classes    <<<<<<-------------
//          * 1.Public: THe Class is accessible by any other class.
//          * 2.Default:The class is only accessible when you don't specify a modifier.
//         */;
        System.out.println("Access Modifiers For Attributes,methods and Constructors::");
        //------Accessing of non-access modifiers of public modifers:
        Modifiers myModifiers=new Modifiers();
        System.out.println("THis is code executing using of public Modifiers class:: ");
        System.out.println("Name: "+myModifiers.fname+ " "+ myModifiers.lname);
        System.out.println("Email: "+ myModifiers.email);
        System.out.println("Age: "+ myModifiers.age);

//         //----------Accessing of non-access modifiers of private modifers
        Modifiers EmployeeDetails=new Modifiers();
        System.out.println("This code is executing using of private Modifiers class::  ");
        System.out.println(" Employee Name: "+ EmployeeDetails.Ename);
        System.out.println("Company Name: "+EmployeeDetails.CompamyName);
        System.out.println("Role: "+ EmployeeDetails.role);
        System.out.println("salary: " +EmployeeDetails.salary);



        //--------------Accessing of  non-access modifers of protected modifiers------------------
        Modifiers familyDetails=new Modifiers();
        System.out.println("This code is executing using of protected Modifiers Class:: ");
        System.out.println("Father Name:: "+ familyDetails.fatherName);
        System.out.println("Mother NAme:: "+ familyDetails.motherName);
        System.out.println("No. of Childrens:: "+ familyDetails.children);

        //----NON-Acces for final attribute;
        Modifiers finalValue= new Modifiers();
        System.out.println("THis will throw an error::");
        System.out.println(finalValue.PI);
        
        
    }
 }
// class Childrens extends Modifiers{
//    private int marriageYear=1996;
//    public static void main(String[] args){
//     Childrens parents=new Childrens();
//     System.out.println("Father's Name : "+ parents.marriageYear);
//    }
   
// }
