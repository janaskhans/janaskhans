import java.util.Scanner;
class Admissionportal
{
  public static void main(String args[])
  {  
   String correctUsername = "user123";
        String correctPassword = "pass123";

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Get username from user
        System.out.print("Enter your username: ");
        String enteredUsername = scanner.nextLine();

        // Get password from user
        System.out.print("Enter your password: ");
        String enteredPassword = scanner.nextLine();

        // Check if entered username and password are correct
        if (correctUsername.equals(enteredUsername) && correctPassword.equals(enteredPassword)) {
            System.out.println("Login successful! Welcome, " + enteredUsername + ".");
  
 
  //Scanner sc=new Scanner(System.in);
  System.out.println("The university want to check your age, Metric percentage and FSC percentage");
  System.out.println(" ");
    
  // Finding age
    
  System.out.println("Plz enter your date of birth:");
  int DateOfBirth=scanner.nextInt();
  System.out.println("Plz enter current year:");
  int CurrentYear=scanner.nextInt();
  int age=CurrentYear-DateOfBirth;
  System.out.println("Your age is:"+age);
  int a=age*365;
  System.out.println("Your age in days:"+a);
      
          newOne(age,scanner);    
           } else {
    
            System.out.println("Invalid username or password. Login failed.");
          }
    }
    public static void newOne(int age,Scanner scanner) {
      
    
    // finding percentage
    System.out.println("Enter your metric perc");
    int Metric=scanner.nextInt();
    System.out.println("Enter FSC perc");
    int FSC=scanner.nextInt();
    
    if (age>18 && Metric>50 && FSC>60) {
    System.out.println("Congratulations! You are allow to take admission in uni");
      
    } // end of if
    else {
      System.out.println("Sorry! You are not allow to take admission in uni");
     // end of if-else
      

    }  
  }
}