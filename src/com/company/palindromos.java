// Dice si una palabra es palindromo o no

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class palindromos {

	public static void main(String[] args) throws IOException {

    Scanner sc = new Scanner(System.in);
    System.out.println("Escribe una palabra");
    String palabra = sc.nextLine();

    int longitud = palabra.length();

    boolean palindromo = true;
    int pos=0;

		int stop=0;

    if ((longitud % 2)==0)
    {
				stop=longitud/2;
		}

		else
		{
			stop= (longitud-1)/2;
		}

		for(int i=0; i<stop; i++)
    {
        if (palabra.charAt(i) != palabra.charAt((longitud-1)-i))
          {
            palindromo = false;
            pos = i+1; // pos indica la posicion en la que se produce el error
            break;
          }
    }


      if(palindromo)
      {
      System.out.println("La palabra introducida es un palindromo");
      }

      else
      {
      System.out.println("La palabra introducida NO es un palindromo, el error se ha producido en la posicion: "+pos);
      }


  }

}
