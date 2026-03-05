package Practica5;

/**
 * Clase que representa una carta de una baraja estándar.
 * Cada carta tiene un tipo (palo) y un valor numérico.
 *
 * Los valores van del 1 al 13 donde:
 * 1 = As
 * 11 = J (Jack)
 * 12 = Q (Queen)
 * 13 = K (King)
 *
 * @author Luis
 */
public class Carta {

    /**
     * Tipo o palo de la carta (Corazones, Picas, Diamantes o Tréboles).
     */
    private Tipo tipo;

    /**
     * Valor numérico de la carta (1 a 13).
     */
    private int valor;

    /**
     * Enumeración que representa los tipos de carta o palos.
     */
    public enum Tipo {
        Corazones,
        Picas,
        Diamantes,
        Treboles
    }

    /**
     * Constructor por defecto.
     * Crea una carta con tipo Corazones y valor 1 (As).
     */
    public Carta() {
        tipo = Tipo.Corazones;
        valor = 1;
    }

    /**
     * Constructor que permite crear una carta con tipo y valor específicos.
     *
     * @param tipo  El tipo o palo de la carta
     * @param valor El valor numérico de la carta
     */
    public Carta(Tipo tipo, int valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    /**
     * Obtiene el tipo de la carta.
     *
     * @return el tipo o palo de la carta
     */
    public Tipo getTipo() {
        return tipo;
    }

    /**
     * Establece el tipo de la carta.
     *
     * @param tipo nuevo tipo de la carta
     */
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    /**
     * Obtiene el valor de la carta.
     *
     * @return valor numérico de la carta
     */
    public int getValor() {
        return valor;
    }

    /**
     * Establece el valor de la carta.
     *
     * @param valor nuevo valor de la carta
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

    /**
     * Devuelve una representación en texto de la carta.
     * Convierte algunos valores especiales:
     * 1 = As, 11 = J, 12 = Q, 13 = K.
     *
     * @return cadena que describe la carta
     */
    @Override
    public String toString() {
        switch (valor) {
            case 11:
                return "Tipo: " + tipo + ", Valor: J";
            case 12:
                return "Tipo: " + tipo + ", Valor: Q";
            case 13:
                return "Tipo: " + tipo + ", Valor: K";
            case 1:
                return "Tipo: " + tipo + ", Valor: As";
            default:
                return "Tipo: " + tipo + ", Valor: " + valor;
        }
    }
}