package Practica5;

/**
 * Clase que representa una posición en un espacio 2D.
 * Se utiliza para indicar coordenadas (x, y) en la ventana gráfica.
 */
public class Posicion {

    /** Coordenada horizontal (eje X) */
    private int x;

    /** Coordenada vertical (eje Y) */
    private int y;

    /**
     * Constructor para crear una posición con coordenadas específicas.
     *
     * @param x Valor de la coordenada horizontal
     * @param y Valor de la coordenada vertical
     */
    public Posicion(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Obtiene la coordenada horizontal (X) de la posición.
     *
     * @return Coordenada X
     */
    public int getX() {
        return x;
    }

    /**
     * Modifica la coordenada horizontal (X) de la posición.
     *
     * @param x Nuevo valor de X
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Obtiene la coordenada vertical (Y) de la posición.
     *
     * @return Coordenada Y
     */
    public int getY() {
        return y;
    }

    /**
     * Modifica la coordenada vertical (Y) de la posición.
     *
     * @param y Nuevo valor de Y
     */
    public void setY(int y) {
        this.y = y;
    }
}