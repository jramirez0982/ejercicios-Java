//Programa que tome como dato de entrada un número que corresponde a la longitud del 
//radio una esfera y nos calcula y escribe el volumen de la esfera que se corresponden con dicho radio.
//La fórmula para calcular el volumen de la esfera es v = (4/3)*PI*r^3

import java.util.Scanner;
 
public class volumen{

  public static void main(String args[]){

    double radio = 0, volumen = 0;
    Scanner entrada = new Scanner(System.in);

    System.out.println("INGRESE LA LONGITUD DEL RADIO DE LA ESFERA ");
    radio = entrada.nextDouble();

    volumen = (4.0/3) * Math.PI * Math.pow(radio,3);

    System.out.println("EL VOLUMEN DE LA ESFERA ES: " + volumen );
     
   
  }
}