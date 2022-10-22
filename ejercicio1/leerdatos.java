import java.util.Scanner;

public class leerdatos{

  public static void main(String args[]){
  
  // crea objeto de tipo escaner llamdo entrada
  Scanner entrada = new Scanner(System.in);
  int numUno = 0, numDos = 0;
  
  System.out.println("");
  System.out.print("Digite el primer numero: ");
  numUno = entrada.nextInt();   
  
  System.out.println("");
  System.out.print("Digite el segundo numero: ");
  numDos = entrada.nextInt();

  System.out.println("");
  System.out.println("EL PRIMER NUMERO ES " + numUno + " EL SEGUNDO NUMERO ES  " + numDos);
  }
}