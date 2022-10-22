//programa que recibe un numero por teclado e imprime en pantalla el doble y el triple
import java.util.Scanner;


public class operarconnumeros{

  public static void main(String args[]){
  
  int numero = 0;
  Scanner entrada = new Scanner(System.in);

  System.out.println("");
  System.out.print("POR FAVOR DIGITE UN NUMERO:  ");
  numero = entrada.nextInt();

  System.out.println("El doble del numero ingresado es " + 2*numero);
  System.out.println("El triple del numero ingresado es " + 3*numero);
 }
}