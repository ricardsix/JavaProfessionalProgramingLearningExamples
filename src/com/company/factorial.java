import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class factorial
{
    public static void main(String[] args) throws IOException
    {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Introduce un numero");
      int num = Integer.parseInt(br.readLine());
        System.out.println(factorial(num));
    }
     public static int factorial(int n)
     {
        int resultado = 1;
        for (int i = 1; i <= n; i++)
        {
            resultado *= i;
        }
        return resultado;
    }
}
