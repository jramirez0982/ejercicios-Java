import java.util.Scanner;

public class imprimenombre{

  public static void main(String args[]){

  String nombre;
  Scanner entrada = new Scanner(System.in);

  System.out.print("POR FAVOR INGRESE SU NOMBRE  ");
  nombre = entrada.nextLine();

  System.out.println("");
  System.out.println("");
  System.out.println("BIENVENIDO A BORDO: ***" + nombre + "*** UN PLACER SALUDARTE");
  
  }
}