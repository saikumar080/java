/**
 * Encapsulation
 */
public class Encapsulation {
   

    public static void main(String [] arge){
        System.out.println("I am Going to learn Encapsulation:::  ");
        Person personDetails=new Person();
        personDetails.setName("Saikumar",8);//here we need to set name(or) change the parameters;
        System.out.println(personDetails.getName());
        personDetails.setName("pillalamarri",14);
        String name=personDetails.getName();
        System.out.println("The name of the person is ::: "+name);



        //------------>>>>>>>>>>>   this code is exectuing from Details.java File   <<<<<<<<<<--------
        Details myObj=new Details();
        myObj.setName("Saikumar s/o Rajababu");
        System.out.println(myObj.getName());
        myObj.setName("Fruti");
        System.out.println(myObj.getName());
    }
}