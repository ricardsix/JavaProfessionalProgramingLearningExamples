import java.util.Scanner;

public class segundos
{
    public static void main(String[] args)
    {
        System.out.println("Hello World!");

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de segundos: ");
        int segundos = sc.nextInt();

        System.out.println("El numero de segundos introducidos es: " + segundos);

        int horas = segundos / 3600;
        System.out.println("El numero de horas es: " + horas);
        int h = horas;

        int residuoH = segundos % 3600;
        int minutos = residuoH / 60;
        System.out.println("El numero de minutos es: " + minutos);
        int m = minutos;

        int segundosR = residuoH % 60;
        System.out.println("El numero de segundos es: " + segundosR);
        int s = segundosR;

        System.out.println("El tiempo total es: "+ h+"h" + m+"m" + s+"s");
    }
}
