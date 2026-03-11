package Practica5;

import java.util.ArrayList;

/**
 * Clase que representa a un jugador dentro del juego de cartas.
 *
 * Cada jugador tiene un nombre y una colección de cartas que
 * representan su mano durante el juego.
 *
 * Permite recibir cartas, deshacerse de cartas y mostrar
 * la información del jugador.
 *
 * @author Luis
 */
public class Jugador {

    /**
     * Nombre del jugador.
     */
    public String nombre;

    /**
     * Lista de cartas que posee el jugador (mano).
     */
    private ArrayList<Carta> cartas;

    /**
     * Constructor de la clase Practica5.Jugador.
     *
     * @param nombre nombre del jugador
     * @param cartas lista de cartas inicial del jugador
     */
    public Jugador(String nombre, ArrayList<Carta> cartas) {
        this.nombre = nombre;
        this.cartas = cartas;
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    /**
     * Agrega una carta a la mano del jugador.
     *
     * @param carta carta que recibirá el jugador
     */
    public void recibirCarta(Carta carta) {
        if (cartas != null && carta != null) {
            cartas.add(carta);
        }
    }

    /**
     * Elimina una carta de la mano del jugador.
     *
     * @param carta carta que el jugador quiere descartar
     * @return la carta que fue eliminada
     */
    public Carta deshacerseDeCarta(Carta carta) {
        cartas.remove(carta);
        return carta;
    }

    public boolean verificarCarta(Carta.Tipo tipo, int valor) {

        for (Carta carta : cartas) {
            if (carta.getTipo() == tipo && carta.getValor() == valor) {
                return true;
            }
        }

        return false;
    }
    /**
     * Devuelve una representación en texto del jugador
     * y las cartas que posee.
     *
     * @return información del jugador y su mano
     */
    @Override
    public String toString() {
        return nombre + " tiene: " + cartas;
    }
}