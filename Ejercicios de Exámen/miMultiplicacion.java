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
public class miMultiplicacion {
  public static void main(String[] args) {
    int a,b;
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca dos valores enteros: ");
    a = s.nextInt();
    b = s.nextInt();
    s.nextLine();
    System.out.println("El resultado de "+a+" x "+b+" es: "+miProducto(a,b));
    
  }
  
  public static int miProducto(int factor1,int factor2) {
    int resultado = 0;
    
    if (factor1<factor2) {
      int aux=factor2;
      factor2 = factor1;
      factor1 = aux;
    }
    
    int pasada=1;
    
    while (factor2>0) {
      int cifra1 = factor1 %10;
      int cifra2 = factor2 %10;
      resultado = ((cifra1*cifra2)%10)*pasada + resultado;
      pasada *=10;
      factor1 = factor1/10;
      factor2 = factor2/10;
    }
    
    resultado = factor1*pasada + resultado;  
    
    
    
    return resultado;
  }
}
