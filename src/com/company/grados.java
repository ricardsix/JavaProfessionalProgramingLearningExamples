import java.util.Scanner;

public class grados
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de ºC: ");
        float centigrados = sc.nextInt();

        System.out.println("El numero de ºC introducidos es: " + centigrados +"º");

        float x = centigrados /5 *9;
        float fahrenheit = x +32;
        System.out.println("El numero de ºF es: " + fahrenheit +"ºF");
    }
}
