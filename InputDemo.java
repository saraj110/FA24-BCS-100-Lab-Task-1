import java.util.Scanner;


public class InputDemo{
                    
     public static void main(String args[]){

            Scanner input= new Scanner(System.in);



             System.out.println("This is demo code");
          
//integer types
             byte b=1;
             short s=123;
             int i=1000;
             long l=345665;
           System.out.print("Enter byte value : ");
           b= input.nextByte();
           System.out.print("Enter integer value : ");
           i= input.nextInt();
          

//decimal types
             float f=10.0f;   // to consider it floating point for the compiler  //4 bytes
             double d=1000000.00;        //15 decimal places and 8 bytes
            System.out.print("Enter float value : ");
           f=input.nextFloat();
// character types
             char c='a'; // for null character we use \n
             
            
//binary type
             boolean bool=true; // for boolean it is either false or true
          System.out.print("Enter boolean value: ");
         bool=input.nextBoolean();

          System.out.printf("Value in byte: %d \n  ",b);
          System.out.printf("Value in short: %d \n  ",s);
          System.out.printf("Value in int: %d  \n ",i);
          System.out.printf("Value in long: %d \n  ",l);   
          System.out.printf("Value in float: %.2f \n  ",f);
          System.out.printf("Value in double: %,.1f\n   ",d);
          System.out.printf("Value in character: %c \n  ",c);
          System.out.printf("Value in boolean: %b  \n ",bool);
        
     System.out.print("Enter string : ");
     String str=input.next();
           System.out.printf("For string: %s",str);
       
}




}