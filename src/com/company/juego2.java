import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// eL while permite romper el flujo y proseguir por el valor mal introducido.
// el for salta al siguiente valor al romper el flujo.

public class juego2
{
  public static void main(String[] args) throws IOException
  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int caras=6;

        System.out.println("Introduce el numero de dados");
        int dados = Integer.parseInt(br.readLine());

        int num =(int) (dados*(caras*Math.random()+1));

        int y =(int) (caras*Math.random()+1) * dados;
        int x =(int) ((dados*caras)*Math.random()+num);

        // Y = Es el valor de los dados que tira la IA
        // X = Es el valor que la IA cree que ganara

        System.out.println("---------------------------------");
        System.out.println("Tus dados suman "+num);
        System.out.println("---------------------------------");
        System.out.println("Introduce el numero por el que apostar contra la IA");
        int numero = Integer.parseInt(br.readLine());

        int win = num + y;
        int winUsser = Math.abs(numero - win);
        int winIA = Math.abs(x - win);

        System.out.println("La suma de los dados da "+win);
        System.out.println("El usuario apuesta por una diferencia de = "+winUsser);
        System.out.println("La IA apuesta por una diferencia de = "+winIA);

        if(winUsser > winIA)
        {
          System.out.println("GANA LA IA");
        }
          else if(winIA > winUsser)
          {
            System.out.println("FELICIDADES GANASTE A LA IA");
          }
            else
            {
            System.out.println("TABLAS");
            }
  }
}
