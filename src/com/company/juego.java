import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class juego
{
  public static void main(String[] args) throws IOException

  {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  Scanner sc = new Scanner(System.in);
  System.out.println("Dime un numero entero: ");
    int num = Integer.parseInt(br.readLine());
  System.out.println("Se ha generado un numero aleatorio comprendido dentro de "+num);
    int x = (int) (num*Math.random()+1);

    int z = 0;

    while(z <= 0)
    {
      System.out.println("Introduce el numero que creas que se a generado:");
        int y = Integer.parseInt(br.readLine());
      if (y == -1)
      {
        System.out.println("CIERRE FORZADO");
        z++;
      }
        else if (y != x)
        {
          System.out.println("SIGUE INTENTANDOLO");
        }
          else
          {
            System.out.println("FELICIDADES LO HAS LOGRADO");
            z++;
          }
    }
  }
}
