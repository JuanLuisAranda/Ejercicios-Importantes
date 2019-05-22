/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen06SolEnClase;
import java.util.Scanner;
/**
 *
 * @author tux
 */
public class CheckSudoku {
  public static void main (String[] args) {
    int[][] tablero1 = new int[9][9];
    Scanner s = new Scanner (System.in);
    
    System.out.println("Introduzca línea a línea los 9 dígitos de cada línea:");
    for (int i=0; i<9; i++) {
      for (int j=0; j<9; j++) {
        tablero1[i][j] = s.nextInt();
      }
      //s.nextLine();
    }
    
    System.out.println();
    for (int i=0; i<9; i++) {
      for (int j=0; j<9; j++) {
        System.out.print(tablero1[i][j]);
      }
      System.out.println();
    }
    
    
    if (correctoSudoku(tablero1)) {
      System.out.println("CORRECTO");
    } else {
      System.out.println("INCORRECTO");
    }
  }
   
  public static boolean correctoSudoku(int[][] tablero) {
    boolean repetido = false;
    // iterar por filas
    for (int i=0; i<9 && !repetido; i++) {
      for (int j=0; j<9 && !repetido; j++) {
        for (int k=0; k<j && !repetido; k++) {
          if (tablero[i][j]==tablero[i][k]) {
            repetido = true;
          }
        }
      }
    }
    
    // iterar por columnas
    for (int j=0; j<9 && !repetido; j++) {
      for (int i=0; i<9 && !repetido; i++) {
        for (int k=0; k<i && !repetido; k++) {
          if (tablero[i][j]==tablero[k][j]) {
            repetido = true;
          }
        }
      }
    }
    
    // iterar por subgrupos 3x3
    
    for (int o=0; o<3 && !repetido; o++) {
      for (int p=0; p<3 && !repetido; p++) {
        // fija el subgrupo de 3x3
        
        // a continuación, linealizamos 3x3 en 1x9
        int [] lineal = new int[9];
        for (int i=0; i<3; i++) {
          for (int j=0; j<3; j++) {
            lineal[i*3+j] = tablero[o*3+i][p*3+j];
          }
        }
        
        // se comprueba si se repiten
        for (int i=0; i<9 && !repetido; i++) {
          for (int k=0; k<i && !repetido; k++) {
            if (lineal[i]==lineal[k]) {
              repetido = true;
            }
          }
        }
      }
    }
    return !repetido;
    
  }
}
