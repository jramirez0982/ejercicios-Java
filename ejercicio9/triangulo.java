//Programa Java que calcule el área de un triángulo en función de las longitudes 
//de sus lados (a, b, c), según la siguiente fórmula:  
//Area = RaizCuadrada(p*(p-a)*(p-b)*(p-c))
//donde p =  (a+b+c)/2

import java.util.Scanner;

public class triangulo{
  public static void main(String args[]){

    double lado1 = 0, lado2 = 0, lado3 = 0;
    double area = 0, p = 0;
    Scanner entrada = new Scanner(System.in);


    System.out.println("");
    System.out.println("******BIENEVENIDO A AREA DE TRIANGULO*******");

    System.out.print("POR FAVOR INGRESE EL VALOR DEL LADO A:  ");
    lado1 = entrada.nextDouble();

    System.out.print("POR FAVOR INGRESE EL VALOR DEL LADO B:  ");
    lado2 = entrada.nextDouble();

    System.out.print("POR FAVOR INGRESE EL VALOR DEL LADO C:  ");
    lado3 = entrada.nextDouble();

    p = (lado1 + lado2 + lado3)/2.0;
    area = Math.sqrt(p*(p-lado1)*(p-lado2)*(p-lado3));
   
    System.out.println("");
    System.out.println("******EL AREA DEL TRIANGULO ES*******");
    System.out.println(area);
 
  }
}