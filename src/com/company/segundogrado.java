import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class segundogrado
{
  public static void main(String[] args) throws IOException
  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el termino de segundo grado");
        double a = sc.nextDouble();
        System.out.println("Introduce el termino de primer grado");
        double b = sc.nextDouble();
        System.out.println("Introduce el termino independiente");
        double c = sc.nextDouble();

        double x1 = 0;
        double x2 = 0;

        x1= ((-b + Math.sqrt(Math.pow(b,2)-4*a*c))/2*a);
        x2= ((-b - Math.sqrt(Math.pow(b,2)-4*a*c))/2*a);

        System.out.println("El resultado de x es: x1="+x1+" x2="+x2);
  }
}
