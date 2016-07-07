import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class suma
{
  public static void main(String[] args) throws IOException
  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce el primer número");
        int uno = Integer.parseInt(br.readLine());

        int numero = uno + 20;

        System.out.println("El numero introducido es : " + numero);
  }
}
