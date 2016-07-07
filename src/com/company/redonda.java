import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class redonda
{
  public static void main(String[] args)
  {
      Scanner sc = new Scanner(System.in);
      System.out.println("Introduce el R: ");
      double radio = sc.nextDouble();

      System.out.println("El radio introducidos es: " + radio +"cm");

      double l = radio *Math.PI *2;
      double a = Math.pow(radio,2) *Math.PI;
      System.out.println("La longitud de la redonda es: " + l +"cm");
      System.out.println("La area de la redonda es: " + a +"cm^2");
  }
}
