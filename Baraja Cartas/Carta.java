package barajacartas;

/**
 *
 * @author Juan Luis Aranda
 */
public class Carta {

    private String figura;
    private String palo;

    private static String[] figuras = {"as", "dos", "tres", "cuatro", "cinco", "seis", "siete", "sota", "caballo", "rey"};
    private static String[] palos = {"oros", "bastos", "copas", "espadas"};

    public Carta(String figura, String palo) {
        this.figura = figura;
        this.palo = palo;
    }

    public Carta() {
        this.figura = figuras[(int) (Math.random() * 10)];
        this.palo = palos[(int) (Math.random() * 4)];
    }

    public String getFigura() {
        return figura;
    }

    public String getPalo() {
        return palo;
    }

    @Override
    public String toString() {
        return figura + " de " + palo;
    }

}
