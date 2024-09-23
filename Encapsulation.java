/**
 * Encapsulation
 */
public class Encapsulation {

    public static void main(String [] arge){
        System.out.println("I am Going to learn Encapsulation:::  ");
        Person personDetails=new Person();
        personDetails.setName("Saikumar",8);//here we need to set name(or) change the parameters;
        personDetails.setName("pillalamarri",14);
        String name=personDetails.getName();
        System.out.println("The name of the person is ::: "+name);
    }
}