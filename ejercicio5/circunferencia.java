// Programa que lee por teclado el valor del radio de una circunferencia 
//y calcula y muestra por pantalla la longitud y el área de la circunferencia. 

import java.util.Scanner;

public class circunferencia{

  public static void main(String args[]){
  
  double radioCircunferencia = 0, longCircunferencia = 0, area = 0;
  Scanner entrada = new Scanner(System.in);

  System.out.println("");
  System.out.print("****POR FAVOR INGRESE EL RADIO DE LA CIRCUNFERENCIA****  ");
  radioCircunferencia = entrada.nextDouble(); 

  longCircunferencia = 2*Math.PI*radioCircunferencia;
  area = Math.PI*Math.pow(radioCircunferencia,2);

  System.out.println("");
  System.out.print("La longitud de la circunferencia es: " + longCircunferencia);

  System.out.println("");
  System.out.print("El area de la circunferencia es: " + area);
      
  }
}