class Second{
    public static void main(String[] args){
        //---------->>>>>>>> This is code is excuting from Objects.java File
        // Objects myObj=new Objects();
        // System.out.println(myObj.x);
        // Objects myCar=new Objects();
        // myCar.carColor();
        // myCar.carModel("Benz s-class");
        // System.out.println("The Maximum speed of the car is :: "+220);


        //---------->>>>>>>>>>   This code is exiciting from the Modifiers.java File (Public Modifiers)  <<<<<<<<<<<<---------------
        Modifiers myPublic =new Modifiers();
        System.out.println("Name: "+ myPublic.fname + " " + myPublic.lname);
        System.out.println("Email: "+ myPublic.email);
        System.out.println("Age: "+ myPublic.age);
        Modifiers familyDetails=new Modifiers();
        System.out.println("This code is Exectuing from Protected Modifiers:: ");
        System.out.println("Father's Name:: "+familyDetails.fatherName);
        System.out.println("Mother's Name:: "+ familyDetails.motherName);
        System.out.println("No.of CHildrens::  "+ familyDetails.children);
       
    }
}