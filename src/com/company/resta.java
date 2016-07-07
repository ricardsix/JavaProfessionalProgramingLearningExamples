import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class resta
{
  public static void main(String[] args) throws IOException
  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce el año actual");
        int actual = Integer.parseInt(br.readLine());
        System.out.println("Inroduce el año en que nacieste");
        int nacer = Integer.parseInt(br.readLine());

        int calculo = actual - nacer;

        System.out.println("Tienes " + calculo + " años");
  }
}
