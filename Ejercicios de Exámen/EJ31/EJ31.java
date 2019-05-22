/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ31;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 7300HQ
 */
public class EJ31 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Persona> cola = new ArrayList<>();

        int numero = 0;

        do {

            System.out.println(
                    "1. Añadir a la cola\n"
                    + "2. Atender a persona\n"
                    + "3. Ver cola (orden descendente)\n"
                    + "4. Salir");
            numero = Integer.parseInt(sc.nextLine());

            switch (numero) {
                case 1:

                    //Apartado A añadir persona al final de la cola
                    añadirPersona(cola);

                    break;

                case 2:

                    //Apartado B atender persona que este en la posicion 0, es 
                    //decir la primera en llegar y si introduces una persona 
                    //que no es la primera, no atiende a nadie e indica que se
                    //mire la lista para saber quien es la primera persona.
                    atenderPersona(cola);

                    break;

                case 3:

                    //Apartado C mostrar por orden descendente la cola en caso
                    //de estar vacia indicarlo.
                    verCola(cola);
                    
                    break;

            }

        } while (numero != 4);

    }

    public static void añadirPersona(ArrayList x) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introuce el nombre de la persona:");
        String nombre = sc.nextLine();

        System.out.println("Introuce el DNI de la persona:");
        String DNI = sc.nextLine();

        x.add(new Persona(nombre, DNI));
    }

    public static void atenderPersona(ArrayList<Persona> x) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introuce el nombre de la persona para atenderla:");
        String nombre = sc.nextLine();

        Persona aux = x.get(0);

        if (aux.getNombre().equals(nombre)) {
            System.out.println("La persona " + nombre + " ha sido atendida.");
            x.remove(0);
        } else {
            System.out.println("Vaya por orden de lista, puede que no exista o la cola este vacia.");
        }
    }

    public static void verCola(ArrayList<Persona> x) {
        
        if (x.isEmpty()){
            System.out.println("La cola esta vacia.");
        }else {
            for (Persona e : x) {
                System.out.println(e.getNombre());
            }
        }

    }

}
