import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class mayor_menor
{
  public static void main(String[] args) throws IOException
  {
    short peque;
          int entero = 5588;
          long grande;
          double decimales;
          double cuatro;

          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          System.out.println("Introduce el primer nÃºmero");
          int uno = Integer.parseInt(br.readLine());

          Scanner sc = new Scanner(System.in);
          System.out.println("Introduce el segundo numero");
          int dos = sc.nextInt();
          System.out.println("Introduce el tercer numero");
          int tres = sc.nextInt();

          //Condicionales
          if (uno >= dos && uno >= tres) {
              System.out.println("El mÃ¡ximo es " + uno);
          } else if (dos >= uno && dos >= tres) {
              System.out.println("El mÃ¡ximo es " + dos);
          } else {
              System.out.println("El mÃ¡ximo es " + tres);
          }

          //Residuo de la division 2=par
          if (uno % 2 == 0) {
              System.out.println("El primer nÃºmero es par");
          } else {
              System.out.println("El primer nÃºmero no es par");
          }

          //Comprovar si son mas pequeños que 100
          if (uno + dos > 100) {
              System.out.println("La suma de los dos primeros nÃºmeros es mayor que 100.");
          } else {
              System.out.println("La suma de los dos primeros nÃºmeros no es mayor que 100.");
          }

          //Comprovar si son distintos entre ellos
          if (uno != dos && uno != tres && dos != tres) {
              System.out.println("Los tres nÂºs que has introducido son diferentes.");
          } else {
              System.out.println("Repites algÃºn nÃºmero (o los tres!!)");
          }

          //Convinaciones matematicas
          System.out.println("Tu primer nÃºmero es " + uno);
          System.out.println("Le vamos a sumar 10");
  //        uno = uno + 10;
          uno += 10;
          System.out.println("Ahora uno vale: " + uno);
          System.out.println("Ahora lo multiplicamos por dos");
          uno *= 2;
          System.out.println("Ahora uno vale: " + uno);
          dos = uno++;
          System.out.println("Ahora dos vale: " + dos + "Y uno vale " + uno);
          dos = ++uno;
          System.out.println("Dos: " + dos + "Uno " + uno);
          String palabra = br.readLine();
          int numero = Integer.parseInt(palabra);
          System.out.println(entero);
          // ConversiÃ³n implÃ­cita (num mediano en num mÃ¡s grande)
          grande = entero;
          System.out.println(grande);
          // ConversiÃ³n explÃ­cita (num mediando en num mÃ¡s pequeÃ±o)
          peque = (short) entero;
          System.out.println(peque);
          decimales = entero;
          System.out.println(decimales);
          decimales = 345.498;
          System.out.println(decimales);
          entero = (int) decimales;
          System.out.println(entero);
          uno = (int) Math.round(decimales);
          dos = (int) Math.floor(decimales);
          System.out.println("Uno " + uno);
          System.out.println("Dos " + dos);
          tres = (int) Math.ceil(decimales);
          cuatro = Math.ceil(decimales);
          System.out.println("Tres " + tres);
          System.out.println("Cuatro " + cuatro);

          palabra = "1234";
          System.out.println(palabra);
          // Convertir un String (un texto) en un nÃºmero (explÃ­cita)
          entero = Integer.parseInt(palabra);
          System.out.println(entero);
          String nombre = "Juan";
          // ConvesiÃ³n que lanza excepciÃ³n
          //        entero = Integer.parseInt(nombre);
          //        System.out.println(entero);

          String texto = String.valueOf(decimales);
          System.out.println(texto);
          System.out.println(decimales);

  }
}
