package EJ22;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author 7300HQ
 */
public class EJ22 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, String> frases = new HashMap<>();

        int numero = 0;

        do {

            System.out.println(
                    "1. Ver/Crear capital\n"
                    + "2. Mostrar las capitales introducidas\n"
                    + "3. Salir");
            numero = Integer.parseInt(sc.nextLine());

            switch (numero) {
                case 1:

                    //Apartado A mostrar pareja que contenda dicho indice y si no crearla con funcion "contiene"
                    System.out.println("Escribe el nombre de un país y te diré su capital: ");
                    String indice = sc.nextLine();

                    contiene(frases, indice);

                    break;

                case 2:

                    //Apartado C, mostrar todo el diccionario de parejas con funcion "mostrarHM"
                    mostrarHM(frases);

                    break;

            }

        } while (numero != 3);
    }

    public static void contiene(HashMap frases, String indice) {

        Scanner sc = new Scanner(System.in);

        if (frases.containsKey(indice)) {

            System.out.println("La capital de " + indice +  " es: " + frases.get(indice));
        } else {

            System.out.println("No conozco la respuesta ¿cuál es la capital de " + indice);
            String frase = sc.nextLine();

            frases.put(indice, frase);
        }

    }

    public static void mostrarHM(HashMap x) {

        System.out.println(x.entrySet());
    }

}
