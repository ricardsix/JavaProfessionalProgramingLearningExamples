package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class juego3
{
  public static void main(String[] args) throws IOException
  {
    Scanner sc = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Bienvenido a la Recreatica CMD");
    int creditos = 0;

    while (creditos==0)
    {
    System.out.println("Introduzca Creditos:");
    creditos = Integer.parseInt(br.readLine());

    System.out.println("Su saldo es de: "+creditos+"$");

    int apuesta=0;

    boolean win = true;
      while (creditos>0)
      {
        System.out.println("Haga su apuesta");
        apuesta = Integer.parseInt(br.readLine());
        if (apuesta < 25)
        {
          System.out.println("APUESTA MINIMA 25$");
        }
        else
        {
          while (apuesta >= 25) {
            creditos = creditos - apuesta;
            System.out.println("Sobre cuantos numeros quiere jugar?");
            int num = Integer.parseInt(br.readLine());
            if (num < 3)
            {
              System.out.println("NUMEROS MINIMOS 3");
            }
            else
            {
              int a = (int) (num * Math.random() + 1);
              int b = (int) (num * Math.random() + 1);
              int c = (int) (num * Math.random() + 1);
              if (a == b && b == c) {
                int w = 100 * apuesta / 100 * num;
                System.out.println("YOU ARE THE WINNER");
                System.out.println("+" + w + "$");
                creditos = creditos + w;
                System.out.println("Creditos actuales:" + creditos);
                apuesta = 0;
              } else if (a == b + 1 && a == c + 2) {
                int wi = 50 * apuesta / 100 * num;
                System.out.println("WIN");
                System.out.println("+" + wi + "$");
                creditos = creditos + wi;
                System.out.println("Creditos actuales:" + creditos);
                apuesta = 0;
              } else if (c == b + 1 && c == a + 2) {
                int n = 25 * apuesta / 100 * num;
                System.out.println("NICE");
                System.out.println("+" + n + "$");
                creditos = creditos + n;
                System.out.println("Creditos actuales:" + creditos);
                apuesta = 0;
              } else {
                System.out.println("Mala suerte");
                apuesta = 0;
                win = false;
                break;
              }
            }
          }
        }
      }
      System.out.println("GAME OVER");
    }
  }
}
