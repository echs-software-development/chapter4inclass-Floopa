import java.util.Scanner;

public class Prob2{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.ln);


    System.out.println("enter two integers");

    int num1 = scan.nextInt();
    int num2 = scan.nextInt();

    int num3 = Math.abs(num1 - num2);
    System.out.println(num3);

  }
}