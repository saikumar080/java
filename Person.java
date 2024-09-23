public class Person {
    /*--------->>>>>> ENCAPSULATION   <<<<<<----------
     *  Encapsulation: is to make sure that "Sensitive" data is hidden from users.
     * Declare class variables/attributes as private
     * provide public get and set methods to access and update the value of a private variable.
     */
   private String name;//private=restricted access;
    private int number;

   //Getter ===get() is used to return the variable value;
   public String getName(){
    return name;
   }
   public int getNumber(){
    return number;
   }


   //Setter === set() is method is used to set the values.
   public void  setName(String newName,int number){
    this.name=newName;
    this.number=number;
   }
   public static void main(String [] arags){
    System.out.println("THis is file help to understand Encapsulation::");
    Person familyDetails=new Person();
    familyDetails.setName("saiku",2);
    System.out.println("name: "+ familyDetails.getName());
    System.out.println("name: "+ familyDetails.getNumber());
   } 
}
