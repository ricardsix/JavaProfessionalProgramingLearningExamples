import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class cadenas
{
  public static void main(String[] args) throws IOException
  {
    Scanner sc = new Scanner(System.in);

    System.out.println("Hola. Introduce una palabra");
    String palabra = sc.next();

    System.out.println("La palabra es: "+palabra);

    int longitud = palabra.length();

    boolean palindromo = true;
    int pos=0;
    for(int i=0; i<(longitud/2); i++)
    {
      if (palabra.charAt(i) != palabra.charAt((longitud-i)-1))
      {
        palindromo = false;
        pos = i; //pos indica la posicion en la que se produce la finalizacion del proceso
        break;
      }
    }
    if (palindromo)
    {
      System.out.println("La plalabra introducida es un palindromo");
    }
    else
    {
      System.out.println("La palabra introducida NO es una palindromo, ");
    }

    System.out.println("La longitud es: "+longitud);
    char primeraLetra = palabra.charAt(0); //posicion de la primera letra es 0

    System.out.println("La primera letra es: "+primeraLetra);
  }
}
