package Practica5;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Clase que representa un mazo de cartas de una baraja estándar.
 * El mazo contiene 52 cartas (4 tipos y 13 valores).
 *
 * Permite inicializar el mazo, barajearlo, repartir cartas
 * y tomar cartas del mazo.
 *
 * @author Luis
 */
public class Mazo {

    /**
     * Lista que almacena todas las cartas del mazo.
     */
    ArrayList<Carta> cartas;

    /**
     * Constructor de la clase Practica5.Mazo.
     * Inicializa el mazo automáticamente al crearse.
     */
    public Mazo() {
        Inicializar();
    }

    /**
     * Inicializa el mazo con 52 cartas.
     * Se crean cartas para cada tipo (palo) y valor (1 a 13).
     */
    public void Inicializar() {
        cartas = new ArrayList<>();

        for (Carta.Tipo tipo : Carta.Tipo.values()) {
            for (int valor = 1; valor <= 13; valor++) {
                Carta nueva = new Carta(tipo, valor);
                cartas.add(nueva);
            }
        }
    }

    /**
     * Restablece el mazo a su configuración inicial.
     * Limpia el mazo actual y vuelve a generar todas las cartas.
     */
    public void configuracionInicial() {
        cartas.clear();
        Inicializar();
    }

    /**
     * Barajea el mazo de cartas de forma aleatoria.
     */
    public void barajear() {
        Collections.shuffle(cartas);
    }

    /**
     * Reparte un número específico de cartas del mazo.
     * Las cartas repartidas se eliminan del mazo.
     *
     * @param numeroCartas cantidad de cartas que se desean repartir
     * @return una lista con las cartas repartidas
     */
    public ArrayList<Carta> repartirCartas(int numeroCartas) {
        ArrayList<Carta> mano = new ArrayList<>();

        if (numeroCartas > cartas.size()) {
            numeroCartas = cartas.size();
        }

        for (int i = 0; i < numeroCartas; i++) {
            mano.add(cartas.remove(0));
        }

        return mano;
    }

    /**
     * Muestra un número específico de cartas del mazo
     * sin eliminarlas.
     *
     * @param numeroCartas cantidad de cartas a mostrar
     * @return lista con las cartas solicitadas
     */
    public ArrayList<Carta> mazoHecho(int numeroCartas) {
        ArrayList<Carta> mano = new ArrayList<>();

        if (numeroCartas > cartas.size()) {
            numeroCartas = cartas.size();
        }

        for (int i = 0; i < numeroCartas; i++) {
            mano.add(cartas.get(i));
        }

        return mano;
    }

    /**
     * Agrega una carta al mazo.
     *
     * @param carta carta que se desea agregar al mazo
     */
    public void agregarCartas(Carta carta) {
        cartas.add(carta);
    }

    /**
     * Toma la primera carta del mazo.
     * La carta se elimina del mazo.
     *
     * @return la carta tomada o null si el mazo está vacío
     */
    public Carta tomarCarta() {
        if (!cartas.isEmpty()) {
            return cartas.remove(0);
        }
        return null;
    }
}





