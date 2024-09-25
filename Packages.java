/**
 * Packages:-In java it's used to group related classes.
 * 2 types of packages:-
 * 1.Built-in-Packages(packages from the Java API).
 * 2.User-defined Packages(create ur on packages)
 */


 /**Built-in Packages
  * Divided into packages and classes.
  *classes :-u need to last mention with (.class)
  *Packaages:-u need to last mention with (.*);
  */

  //----->>>> IMPORT a CLASS    <<<<------
//   import java.util.Scanner;
  //here java.util is the package,while Scanner is a class of the java.util package.


  //--------->>>>>>>> Import a Packages    <<<<<<-------------
    import java.util.*;

    public class Packages {
        public static void main(String [] args){
            Scanner myobj=new Scanner(System.in);
            System.out.println("Enter user name:: ");
            String userName=myobj.nextLine();
            System.out.println("Username is:: "+ userName);
            System.out.println("user age is :: ");
            int age=myobj.nextInt();
            System.out.println("user age is: "+age);
            System.out.println("Enter user surname::");
            String surname=myobj.next();
            System.out.println("user surname :: "+surname);

        }
        
    }


    /**User-defined Packages:-
     * |__root
     *      |__mypack
     *          |__MypackageClass.java
     * more deatils in MyPackageClass.java file:::
     */
  

