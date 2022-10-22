// Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit y viceversa.
//La fórmula correspondiente para pasar de grados centígrados a fahrenheit es:
//F = 32 + ( 9 * C / 5)

import java.util.Scanner;

public class conversorGrados{

  public static void main(String args[]){
  
  double gradoCent = 0, gradoFaren = 0, grado;
  Scanner entrada = new Scanner(System.in);
  int parametro = 0;

  System.out.println("");
  System.out.println("****BIENVENIDO AL CONVERSOR DE TEMPERATURA*****");
  System.out.println("");
  
  System.out.println("");
  System.out.print("INGRESE EL NUMERO DE GRADOS QUE DESEA CONVERTIR  ");
  grado = entrada.nextDouble();
  
  System.out.println("");
  System.out.println("");
  System.out.println("Para convertir de °C a °F marque 1");
  System.out.println("Para convertir de °F a °C marque 2");
  System.out.println("");  

  parametro = entrada.nextInt();
 
  switch(parametro){

    case 1: gradoFaren = 32 + (9*grado/5);
 	    System.out.println(grado + " GRADOS CENTIGRADOS ES IGUAL A " + gradoFaren + " GRADOS FARENHEIT");
          break;

    case 2: gradoCent = 5*(grado - 32)/9;
 	    System.out.println(grado + " GRADOS FARENHEIT ES IGUAL A " + gradoCent + " GRADOS CENTIGRADOS");
          break;
  
    default: System.out.println("La opcion es invalida");
           break;
    }  
 }
}