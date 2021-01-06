import java.util.Scanner;

public class Prob4 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter two characters:");

    String s = scan.nextLine();
    if (s.charAt(0) == 'M'){
      System.out.println("Mathmatics");

    else if (s.charAt(0) == 'C');
     System.out.println("Computer Science");

    else if (s.charAt(0) == 'I');
     System.out.println("Information technology");

    }

    String s = scan.nextLine();
    if (s.charAt(0) == '1'){
      System.out.println("freshmen");

    else if (s.charAt(0) == '2');
     System.out.println("sophmore");

    else if (s.charAt(0) == '3');
     System.out.println("Junior");

    else if (s.charAt(0) == '4');
     System.out.println("Senior");

    else System.out.println ("Thats incorrect");



    


  }
}