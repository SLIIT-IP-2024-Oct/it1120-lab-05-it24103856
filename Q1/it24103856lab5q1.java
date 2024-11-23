import java.util.Scanner;

public class it24103856lab5q1 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the keyboard
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter three integers
        System.out.print("Enter num1: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter num2: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter num3: ");
        int num3 = scanner.nextInt();

        // Print the numbers entered by the user
        System.out.println("User entered numbers: " + num1 + " " + num2 + " "+ num3 );
 

	//smallest number 							        int smallest = num1;
        if (num2<smallest) {
   smallest=num2;
   }
  if (num3<smallest) {
 smallest = num3;
}

    // lagest number
  int largest = num1;
 if (num2 > largest) {
 largest=num2;
}
    if(num3 > largest) {
 largest=num3;
 }
    

    System.out.println("smallest num is :" + smallest);
System.out.println("lagest num is :" + largest);

  

       
       

    }
}
