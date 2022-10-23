//Programa lea la longitud de los catetos de un triángulo rectángulo y
//calcule la longitud de la hipotenusa según el teorema de Pitágoras

import java.util.Scanner;

public class pitagoras{
  public static void main(String args[]){

  double cateto1 = 0, cateto2 = 0, hipotenusa = 0;
  Scanner entrada = new Scanner(System.in);

  System.out.println("******************************************************************")
  System.out.println("BIENVENIDOS AL PROGRAMA DE APLICACION TEOREMA DE PITAGORAS");
  System.out.println("INSERTE EL VALOR DEL CATETO No 1");
  cateto1 = entrada.nextDouble();

  System.out.println("");
  System.out.println("INSERTE EL VALOR DEL CATETO No 2");
  cateto2 = entrada.nextDouble();

  hipotenusa = Math.pow(Math.pow(cateto1,2) + Math.pow(cateto2,2),0.5);

  System.out.println("");
  System.out.println("EL VALOR DE LA HIPOTENUSA ES " + hipotenusa);
   
  }
}