import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class porcentual
{
  public static void main(String[] args)
  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el iporte");
        double imp = sc.nextDouble();
        System.out.println("Inroduce el porcentage aplicado");
        double porcentage = sc.nextDouble();

        double impost = imp /100 *porcentage;
        double total = imp + impost;

        System.out.println("Se le aplicaran unos cargos de "+impost+"€");
        System.out.println("Debe pagar un total de "+total+"€");
  }
}
