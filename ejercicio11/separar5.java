//Programa que lea un número entero N de 5 cifras y muestre sus cifras igual
//que en el ejemplo. Por ejemplo para un número N = 12345   La salida debe ser:

import java.util.Scanner;

public class separar5{
  
  /**
   *
   */
  private static final String INGRESE_UN_NUMERO_DE_CINCO_DIGITOS = "INGRESE UN NUMERO DE CINCO DIGITOS";

  public static void main(String args[]){
   
    int numero = 0, diezmil = 0, miles = 0, centena = 0, decena = 0, unidad = 0;
    Scanner entrada = new Scanner(System.in);

    System.out.println(INGRESE_UN_NUMERO_DE_CINCO_DIGITOS);
    numero = entrada.nextInt();

    diezmil = numero/10000;
    miles = (numero - diezmil*10000)/1000;
    centena = (numero - diezmil*10000 - miles*1000)/100;
    decena = (numero - diezmil*10000 - miles*1000 - centena*100)/10;
    unidad = (numero - diezmil*10000 - miles*1000 - centena*100 - decena*10)/1;

    System.out.println("LAS UNIDADES SON:  " + unidad);
    System.out.println("LAS DECENAS SON:  " + decena);
    System.out.println("LAS CENTENAS SON:  " + centena);
    System.out.println("LAS UNIDADES MIL SON:  " + miles);
    System.out.println("LAS DECENAS MIL SON:  " + diezmil);


  }
}