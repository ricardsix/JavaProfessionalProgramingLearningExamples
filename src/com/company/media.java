import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class media
{
  public static void main(String[] args) throws IOException
  {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Introduce el primer numero");
    int uno = Integer.parseInt(br.readLine());

    System.out.println("Introduce el segundo numero");
    int dos = Integer.parseInt(br.readLine());

    System.out.println("Introduce el tercer numero");
    int tres = Integer.parseInt(br.readLine());

    double media = ((double)uno + (double)dos + (double)tres) /3;

    System.out.println("El resultado de la media es:" +media);
  }
}
