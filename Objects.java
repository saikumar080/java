public class Objects{
    int x=8,y;//class attribute.
    final int z=40;//Don't want the ability to override exisiting values



    //------>>>>>>>>    Examples for Attributes    <<<<<<---------

    String fname="john";
    String lname="Doe";
    int age=24;
    public static void main(String[] args) {
        int p=90;
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
        myObj.y=6;//modify;
        System.out.println(myObj.y);
        myObj.x=23;//overirde
        System.out.println(myObj.x);

        //------>>>>>>> final Key Word     <<<<<<<-------
        System.out.println( "This is the keyword of final:: "+ myObj.z);
       
       // ------->>>>>>>>>>>>  Examples for Mutiple Attributes    <<<<<<<<<-----------

        Objects Details=new Objects();
        System.out.println("Name: " + Details.fname + " " + Details.lname);
        System.out.println("Age: " + Details.age);

    }
};



// ----------->>>>>>>>    Creating Multiple Classes  go to Second.java  <<<<<<---------
