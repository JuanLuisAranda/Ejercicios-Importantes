package barajacartas;

import java.util.ArrayList;

/**
 *
 * @author Juan Luis Aranda
 */
public class BarajaCartas {

    public static void main(String[] args) {
        
        ArrayList<Carta> mazo1 = new ArrayList<>();
        for (int i = 1; i <= (int) (Math.random() * 5) + 1; i++) {
            mazo1.add(new Carta());
        }

        ArrayList<Carta> mazo2 = new ArrayList<>();
        for (int i = 1; i <= (int) (Math.random() * 5) + 1; i++) {
            mazo2.add(new Carta());
        }

        System.out.println("Mazo 1");
        for (Carta carta : mazo1) {
            System.out.println(carta);
        }
        System.out.println("\nMazo 2");
        for (Carta carta : mazo2) {
            System.out.println(carta);
        }

        ArrayList<Carta> mezcla = new ArrayList<>();
        
        while (!mazo1.isEmpty() || !mazo2.isEmpty()) {
            if ((int)(Math.random()* 2) == 0) {
                if (!mazo1.isEmpty()) {
                    int indice = (int)(Math.random() * mazo1.size());
                    Carta cartaAux = new Carta(mazo1.get(indice).getFigura(),mazo1.get(indice).getPalo());
                    mezcla.add(cartaAux);
                    mazo1.remove(indice);
                }
            } else {
                if (!mazo2.isEmpty()) {
                    int indice = (int)(Math.random() * mazo2.size());
                    Carta cartaAux = new Carta(mazo2.get(indice).getFigura(),mazo2.get(indice).getPalo());
                    mezcla.add(cartaAux);
                    mazo2.remove(indice);
            }
        }
    }
        System.out.println("\nMezcla");
        
        for (Carta carta : mezcla) {
            System.out.println(carta);
        }
    }
}
