import java.util.Scanner;

public class it24103856Q52{

  public static void main(String[] args){

   Scanner input=new Scanner(System.in);

  System.out.println("Enter number:" );
    int number=input.nextInt();

  switch (number) {

 case 0:
System.out.print("no prize");
  break;
    
  case 1:
System.out.println("Prize is a:pen " );
  break;
  
  case 2:
System.out.println("Prize is a:umbrella");
  break;

 case 3:
System.out.println("Prize is a:bag");
 break;

 case 4:
System.out.println("Prize is a:Travelling chair");
break;


  default:System.out.println("Prize is a:Headphone");
}

  
 }
}