import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// eL while permite romper el flujo y proseguir por el valor mal introducido.
// el for salta al siguiente valor al romper el flujo.

public class bucle
{
  public static void main(String[] args)
  {
        Scanner sc = new Scanner(System.in);

        int contAprovats=0;
        int contCondicionats=0;
        int contSuspesos=0;

        int i = 1; // No es necesario para for

        while(i <= 6) // for(int i = 1 ; i <= 6 ; i++)
        {
          System.out.println("Introduce la nota " +i);
          double nota = sc.nextDouble();

          int clas = (int) nota;
          switch (clas)
          {
            case 0:  System.out.println("Classificada como: H");
                     break;
            case 1:  System.out.println("Classificada como: G");
                     break;
            case 2:  System.out.println("Classificada como: FF");
                     break;
            case 3:  System.out.println("Classificada como: F");
                     break;
            case 4:  System.out.println("Classificada como: E");
                     break;
            case 5:  System.out.println("Classificada como: D");
                     break;
            case 6:  System.out.println("Classificada como: C");
                     break;
            case 7:  System.out.println("Classificada como: B");
                     break;
            case 8:  System.out.println("Classificada como: A");
                     break;
            case 9:  System.out.println("Classificada como: A+");
                     break;
            case 10: System.out.println("Classificada como: A++");
                     break;
          }

          if(nota < 0 || nota > 10)
          {
            System.out.println("Valor Incorrecto");
            continue; //rompe el flujo de ejecución y permite saltar a la siguiente
          }

          if(nota >= 5)
          {
            contAprovats++;
          }
            else if(nota >= 4)
            {
              contCondicionats++;
            }
              else
              {
                contSuspesos++;
              }
          i++;
        }
        System.out.println("---------------------------------");
        System.out.println("El numero de aprovados es: "+contAprovats);
        System.out.println("El numero de condicionados es: "+contCondicionats);
        System.out.println("El numero de suspendidos es: "+contSuspesos);
  }
}
