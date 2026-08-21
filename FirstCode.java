class FirstCode {
    public static void main(String[] args){
        System.out.println("saikumar");
        /* ------------------------------------->>>>>>>>>>>>INTEGER<<<<<<<<<<<<-------------------------------------------
        >> while working with long keep l at the end of the value;
         * int num1=20;
       int num2=60;
       int result=num1 + num2;
       byte numByte=127;
        short numShort=-12345;
        int numInt=12345678;
        long numLong=1234567890l;
       System.out.println("this is the sum of the number: "+ result);
       System.out.println("this is value of byte: "+ numByte);
       System.out.println("this is the value of short : "+ numShort);
       System.out.println("this is the value of int : "+ numInt);
       System.out.println("this is the value of numLong: "+ numLong);
 */






/*----------------------------->>>>>>>>>>FLOAT<<<<<<<<-------------------------------------------
         * By default we can use double because of scentific calculations.
         *  float value1=126.54123490876f;
       double value2=126.54123490876;
       System.out.println(" this is the value of float: "+value1);
       System.out.println("this is the value of double: "+value2);
*/



/*----------------------------->>>>>>>CHARACTER<<<<<<<<<<-----------------------------------
 * > We can assign a single character [a-z],[A-Z],[0-9],all the Ascii values:
 * char value='+';
System.out.println(value);
 */




 /*--------------------------------------->>>>>>>BOOLEAN<<<<<<<<<<<<<<<<<------------------------------------------- 
  * >boolean which return either true or false.
  boolean value=true;
System.out.println(!value);
 */



/*------------------------>>>>>>>>>LITERALS<<<<<<<<<<<<<<<<<<<<----------------------------- 
 * int bin= 0b11111;//working with binary number;
System.out.println("this is the value of binary number: "+bin);
int hex=0x7E;//working with hexa decimal number;
System.out.println("this the value of hexa decimal number: "+hex);
char c='a';
c++;
System.out.println(c);
*/







/*--------------------------->>>>>>>>>>>>Type Conversion and Casting<<<<<<<<<<<<<------------------
 * >>>>>Casting:-
 *  byte b=127;
        int a=257;
        byte k=(byte)a;//here it's taking the modules of value a with range of(bytes)b which means(-128 to 127)256
        //the above code is called casting;
        int c=b;
        System.out.println(k);//257%256==1;
        System.out.println(c);
        
        // example with float converting to integer:
        float f=123.45f;
        int nt=(int)f;
        float ft=nt;
        System.out.println(nt);
        System.out.println(ft);
        long lg=123L;
        System.out.println(lg);


    >>>Type Promotion:which can convert from smaller to bigger data type:-
       byte bt1=12,bt2=80;
        int res=bt1 * bt2;
        System.out.println(res);
 * 
 */
     /*--------------------->>>>>>>>>>>>ASSIGNMENT OPERATORS<<<<<<<<<<<<<<<<<<<<<<------------------- 
      *   int num1=5;
      int num2=7;
      // int result=num1 + num2;
      num2+=9;
      System.out.println(num1 - num2);
      System.out.println(num1+2);
      System.out.println(num2);


        // ------->>>>  &=     <<<<<---------
    // when &= means check when both are 1 only in binary system.

    int num=5;
    num&=3;
    System.out.println(num);

    //--------->>>>>>>    |=      <<<<<<-------------
    //when |= means its check either one of binary number is 1 . if yes it's calculate::
    int num2=5;
    num2|=3;
    System.out.println(num2);     
    
//--------->>>>>>>>> ^=    <<<<<<<-------------
//^= when one binary structure is 1 and another binary number is 0; then only it calculate::
    int num3=5;
    num3^=3;
    System.out.println(num3);



    // =====================Right Shif============================
    //it indicate with :: >>; it means remove the n.of digits from right side:::
    int num4=5;
    num4>>=2;
    System.out.println(num4);



    //==================Left Shift==============================
    //it indicate with :: << ; it;s means the add no of zeros at the end and calculate the value;
    int num5=5;
    num5<<=2;
    System.out.println(num5);



     */
  


     /*--------------------------->>>>>>>>>>>>>>>>>>>RELATIONAL OPERATORS<<<<<<<<<<<<<<<<<<------------------------ 
      * int num1=5;
     int num2=5;
     boolean result=num1<=num2;
     System.out.println(result);
     */



     /*-------------------->>>>>>>>>>>>>> LOGICAL OPERATORS<<<<<<<<<<<<<--------------------------- 
      * int x=12,y=13,num1=8,num2=19;
     boolean res=!(x<y || num1<num2);
     boolean res1=x<y && num1<num2;
     System.out.println(res);

     System.out.println(res1);
     */
     


     /*-------------------------------->>>>>>>>>>>>>>>>>>>CONDTIONAL STATEMENTS<<<<<<<<<<<<<<<<<<<<---------------
      * int x=12,y=13,num1=8,num2=19;
     if(x<y && num1<num2){
      System.out.println("excuting if statement::");
     }else{
      System.out.println("Excuting the else statement::");
     }
     if(x>20)
          System.out.println("hello");
    else
        System.out.println("Bye");

    
    // example for greatest value:-
    if(x>y)
      System.out.println("X is the greater then Y value is :: "+x);
    else
      System.out.println("Y is the greater then X value is :: "+y);


      // using of if,else, else if statement in Telsa cars:
      int speed=120;
      if(speed > 120){
        System.out.println("You are driving your vechile in over speed!!!");
      }else if(speed ==120){
        System.out.println("You are driving your vechile in maximum Speed!!!");
      }else{
        System.out.println("Your are driving in Economy!!!");
      }

      //Eample for tricky questions::-
        int a=3,b=6;
       int result=(~a & b) |(a & ~b);
       System.out.println(result);



      */
     



      /*--------------------------->>>>>>>>>>>>>>>Ternary Operator<<<<<<<<<<<<<<------------------------
       * int num=4,res;
      res=num%2 == 0 ? 10 : 20;
      System.out.println(res);
      //example for tricky question:-
          int x=5,y=10,z;
     z=(x++ >5 && y-- <10) ? x--:y;
     System.out.print(z);
     System.out.print(x);
     System.out.println(y);
       */

      

      /*----------------------->>>>>>>>>>>>>>Switch Cases<<<<<<<<<<<<<<<<<<<---------------------------- 
       * int day=8;
      switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.print("this is day is not consider as week");
      }
      */



      /*------------->>>>>>>>>>>>>>>While Loop<<<<<<<<<<<<<----------------------------
       *  int n=5,factorial=1;
      while(n>=1){
        factorial*=n;
        n--;
      }
      System.out.println("Factorial of number :: "+factorial);

      // example for tricky question:-
        int i,j;
       i=100;
       j=300;
       while(++i < --j){
        System.out.println(i);
       }
       */



       /*----------------->>>>>>>>>>>>>>>> DO While Loop<<<<<<<<<<<<<<<<<<<<<<<<<<<-------------------------- 
        * Even you want to output for the false condition ,We can use do while loop:
          int n=5;
     do{
        System.out.println("Hey:: "+ n );
         n++;
       }  while(n<=4);
       System.out.println("Factorial of number :: "+n);
       */

       /*----------------->>>>>>>>>>>>>>>>>For Loop<<<<<<<<<<<<<<<<<<------------------- 
        * int sum=0;
       String str="Sai";
       for(int i=0;i<str.length();i++){
            sum+=i;
       }
       System.out.println(sum);
       */
       
     
       
    
       

    /*--------------------->>>>>>>>>>>>>>>>>>>>>>>>>>>    STRING          <<<<<<<<<<<<<<<<<<<<<<<<<---------------------------- 
     *  //   String txt="this Book author is 'DR.JoSEPH MURTHY'";
  //   System.out.println(txt);
  //   System.out.println(txt.toUpperCase());//for all  characterstics in UpperCase ;

  //   System.out.println(txt.toLowerCase());//for all characterstics in lower case;

  //   System.out.println(txt.indexOf("Book"));// Finding a Character in a String;

  //   System.out.println(txt.charAt(5));// returns the character at the particular index;
    
  //  int result=txt.codePointAt(3);//returns the unicode value of character for the particular index;
  //  System.out.println(result);

  //  int result1=txt.codePointBefore(4);//simpler to codePointAt()but returns one character before it.
  //  System.out.println(result1);

  
    
  //  String firstName="saikumar ",lastName="Pillalamarri";
  //  System.out.println(firstName.concat(lastName));//concatinating of two strings appends at end;

  //   System.out.println(firstName.contains("sai"));//check if the character are present or not && it's returns boolean value;

  //     //------->>>>>    copyValueOf()        <<<<<<<---------
  //     //which returns copy of characters from an array and return string::
  //     char[] myStr1={'H','e','l','l','o'};
  //     String myStr2="";
  //     myStr2=myStr2.copyValueOf(myStr1, 0,5);
  //     System.out.println(myStr2);
  //     System.out.println(myStr1);

    // String str="Hello, World";
  //   System.out.println(str.endsWith("orld"));//returns boolean value if the characters are present at end of the string;

  //   String str2="Hey, world";
  //   System.out.println(str.equals(str2));//returns boolean value if both string characters are same;


      // String  formats="Hello %s!! Welcome to Amazon with salary of %,d thousand per month";
      // String result=String.format(formats, "Saikumar",30,000);
      // System.out.println(result);//we can add few characters, numbers with %s(or)S==>string;


      // String strs="";
      // System.out.println(strs.isEmpty());//returns boolean if string is empty return true;


// //------------->>>>>>>>>>>>    join()      <<<<<<-------------
//       String fruits=String.join(" ","Orange","Apple","Mango");
//       System.out.println(fruits);
//       String law="Newton 3 laws are created by the Newton!!";
//       System.out.println(law.lastIndexOf("Newton"));//return lastIndex of the character;


//       System.out.println(str.length());//return lenght of the string;


//       System.out.println(str.replace('l', 'p'));//replace a single character with another character;

//       String regex="(?!)Hello ";
//      String answer=str.replaceAll(regex, "Hey");
//      System.out.println(answer);
      

  */
      






      /*--------------------------->>>>>>>>>>>>>>>>>>>>>>>   MATH OPERATIONS    <<<<<<<<<<<<<<<<<<-------------------------------------- 
       *       System.out.println("The maximum number ::: "+Math.max(5,10));
      System.out.println("The minimum number is ::: "+Math.min(5,10));
      System.out.println("The Sqrt of the value is ::: "+Math.sqrt(64));
      System.out.println("This abs remove negative value:: "+Math.abs(-8.90));
      System.out.println("This will take value of random number ::: "+Math.random());
      */





      /*----------->>>>>>>>>>>>>>>>    FOR EACH LOOP   <<<<<<<---------------------*/
      String [] cars={"volvo","Benz","BMW","Thar","Tata"};
      for(String i: cars){
        System.out.println("items of cars:: "+i);
      };
      //while working with array we should .length for length of array.
      for(int i=0; i<cars.length; i++){
        System.out.println("items od cars in for loop:: "+cars[i]);
      }
      //------------BREAk Statement----------------
      for(int i=0;i<5;i++){
        if(i==4){
          System.out.println("Hey, I am breaking statement");
          break;
        }
        System.out.println("checking for break statement:: "+i);
      }

      //----------------Skip the statement--------------------
       for(int i=0;i<5;i++){
        if(i==2){
          System.out.println("Hey, I am Skipping statement");
          continue;
        }
        System.out.println("checking for break statement:: "+i);
      }


  }
    
}
