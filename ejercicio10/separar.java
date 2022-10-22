//Programa Java que lea un número entero de 3 cifras 
//y muestre por separado las cifras del número.

import java.util.Scanner;

public class separar{
  public static void main(String args[]){

    int numero = 0, unidad = 0, decena = 0, centena = 0;
    Scanner entrada = new Scanner(System.in);

    System.out.print("DIGITE EL NUMERO ENTERO DE 3 CIFRAS:   ");
    numero = entrada.nextInt();

    centena = numero/100;
    decena = numero/10 - 10*centena;
    unidad = numero - centena*100 - decena*10;

    System.out.println("EL PRIMER DIGITO ES:  " + unidad);
    System.out.println("EL SEGUNDO DIGITO ES:  " + decena);
    System.out.println("EL TERCER DIGITO ES:  " + centena);
  }
}