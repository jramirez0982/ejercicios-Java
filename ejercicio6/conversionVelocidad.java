//Programa que pase una velocidad en Km/h a m/s. La velocidad 
//se lee por teclado

import java.util.Scanner;

public class conversionVelocidad{
  public static void main(String args[]){
  
  double velMS = 0, velKH = 0;
  Scanner entrada = new Scanner(System.in);

  System.out.println("");
  System.out.println("Ingrese la velocidad en Km/H:   ");
  velKH = entrada.nextDouble();

  velMS = velKH*10/36;
  System.out.println(velKH + " Kilometros por hora equivale a:  " + velMS + " metros por segundo");
   

 }
}