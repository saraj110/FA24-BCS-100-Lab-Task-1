import java.util.Scanner;

public class UserInfo{
  
              static String userName="hala";
	      static String password="kl45";




  
	public static void main(String args[]){

           Scanner input=new Scanner(System.in);


        System.out.print("Enter username: ");
        String userN = input.nextLine(); 
        
        System.out.print("Enter password: ");
        String userPass = input.nextLine(); 
        
       
        input.close(); 

     if (userN.equals(UserInfo.userName)){
	System.out.print("\nUsername is a match");
	}
	else{
	System.out.print("\nIncorrect Username");
	}
	 if (userPass.equals(UserInfo.password)) {
	System.out.print("\nPassword is a match");
	}
	else{
	System.out.print("\nIncorrect password");
	}
    }

	

}