import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class multiples
{
  public static void main(String[] args) throws IOException
  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce un numero entero");
        int num = Integer.parseInt(br.readLine());

        int x = 0;
        int y = 0;

        x = num % 2;
        y = num % 5;

        if (x == 0 && 0 == y)
        {
          System.out.println(num + " es multiple de 5 y de 2");
        }
          else
          {
            System.out.println(num + " no es multiple de 5 y de 2");
          }
  }
}
