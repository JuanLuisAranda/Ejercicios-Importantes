/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioexámenes;
import java.util.Scanner;

/**
 *
 * @author tux
 */
public class CifradoCesar {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    int opcion;
    String frase;
    String frase2;
    
    do {
      System.out.println("Elija opcion:");
      System.out.println("1.- Cifrar");
      System.out.println("2.- Descifrar");
      System.out.println("0.- Salir");
      opcion = Integer.parseInt(s.nextLine());
      switch (opcion) {
        case 1:
          System.out.println("Introduzca la frase: ");
          frase = s.nextLine();
          frase2 = encriptar(frase);
          System.out.println(frase2);
          break;
        case 2:
          System.out.println("Introduzca la frase encriptada: ");
          frase = s.nextLine();
          frase2 = desencriptar(frase);
          System.out.println(frase2);
          break;
          
        default:
      }
      
    } while (opcion != 0);
    
  }
  
  
  public static String encriptar (String textoEnClaro) {
    String resultado = "";
    textoEnClaro = textoEnClaro.toUpperCase();
    
    for (int i=0; i<textoEnClaro.length(); i++) {
      if ((textoEnClaro.charAt(i)>='A') && (textoEnClaro.charAt(i)<='Z')) {
        char desplazado = (char)((int)(textoEnClaro.charAt(i)) + 3);
        if (desplazado > 'Z') {
          desplazado = (char)((int)desplazado - 26);
        }
        resultado = resultado + desplazado;
      } else {
        resultado = resultado + textoEnClaro.charAt(i);
      }
    }
    
    return resultado;
  }
  
  public static String desencriptar (String textoCifrado) {
    String resultado = "";
    textoCifrado= textoCifrado.toUpperCase();
    
    for (int i=0; i<textoCifrado.length(); i++) {
      if ((textoCifrado.charAt(i)>='A') && (textoCifrado.charAt(i)<='Z')) {
        char desplazado = (char)((int)(textoCifrado.charAt(i)) - 3);
        if (desplazado <'A') {
          desplazado = (char)((int)desplazado + 26);
        }
        resultado = resultado + desplazado;
      } else {
        resultado = resultado + textoCifrado.charAt(i);
      }
    }
    
    return resultado;
  }
  
}
