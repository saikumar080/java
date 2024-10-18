
    /*Inheritance:- In java, it's possible to inherit attributes and methods from one class to another.
    * Classified into 2 Categories:-
     * subclass(child)- the class that inherits from another class.
     * superClass(Parent)- the class being inherited from.
     * To inherit from a class , use the extends keyword.
     */
  //  class Grandparent{
  //   public void show(){
  //     System.out.println(" GrandParent class");
  //   }
  //  }
  //  class Parent extends Grandparent{
  //   public void Show1(){
  //     System.out.println("Parent Class");
  //   }
  //  }
  //  public class Inheritance extends Parent{
  //     public void show2(){
  //       System.out.println("Child Class");
  //     }
  //       public static void main(String [] args){
  //     Inheritance obj=new Inheritance();
  //     obj.show2();
  //     Parent obj1=new Parent();
  //     obj1.Show1();
  //     Grandparent obj2=new Grandparent();
  //     obj2.show();

  //   }
  //  }


  class Vehicle{
    protected String brand="Benz";
    public void honk(){
      System.out.println("Tutt,tutt!!!");
    }
  }
  class Car extends Vehicle{
    private String modelName="S-class";
    protected String modelDesigner="Finkie";
    public static void main(String [] args){
      Car obj=new Car();
      obj.honk();
      System.out.println("THis is car::");
      System.out.println(obj.brand + " " + obj.modelName);
    }
  }


  //-------->>>>>> DEVARA EXAMPLE    <<<<<<------------------
    class Devara{
      public void Bayamkaram(){
        System.out.println("Devara makes Red Sea!!");
      }
    }
    class Vara extends Devara{
      public void Romance(){
        System.out.println("He will fall love with Thangam!!!");
      }
    }





  class Inheritance{
    public static void main(String [] args){
      Car Vehicles=new Car();
      Vehicles.honk();
      System.out.println(Vehicles.brand + "  'S-class model designed by' " + Vehicles.modelDesigner);


      //----->>>>>     Devara Example  <<<<----------
      Vara NTR=new Vara();
      System.out.println("Vara Have fear along with that he have love on:: ");
      NTR.Romance();
      System.out.println("Vara get inherits from Devara:: ");
      NTR.Bayamkaram();
      
    }
  }

  
  // class Inheritance extends Vehicle{
  //   private String modelName="S-class";
  //   public static void main(String [] args){
  //     Inheritance obj=new Inheritance();
  //     obj.honk();
  //     System.out.println(obj.brand+ " "+obj.modelName);
  //   }
  // }