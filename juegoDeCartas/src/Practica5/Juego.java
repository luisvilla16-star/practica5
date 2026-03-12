package Practica5;

/**
 * Clase principal del programa.
 *
 * Esta clase se encarga de ejecutar una simulación simple
 * de un juego de cartas utilizando las clases Practica5.Carta, Practica5.Mazo y Practica5.Jugador.
 *
 * El programa realiza las siguientes acciones:
 * 1. Crea un mazo de cartas.
 * 2. Muestra algunas cartas antes de barajear.
 * 3. Barajea el mazo.
 * 4. Crea jugadores.
 * 5. Reparte cartas a cada jugador.
 * 6. Muestra las cartas de los jugadores.
 * 7. Devuelve algunas cartas al mazo.
 * 8. Busca quiente niene una carta sis el mazo o un jugador
 *
 * @author Luis
 */
public class Juego {

    /**
     * Método principal del programa.
     * Aquí se ejecuta la simulación del juego.
     *
     * @param args argumentos de línea de comandos (no utilizados).
     */
    public static void main(String[] args) {

        System.out.println("Creando mazo");
        Mazo mazo = new Mazo();

        System.out.println("Mostrando primeras 5 cartas sin barajerar");
        System.out.println(mazo.mazoHecho(5));

        System.out.println("Barajeando mazo...");
        mazo.barajar();

        System.out.println("Mostrando las primeras 5 cartas del mazo despues de barajar");
        System.out.println(mazo.mazoHecho(5));

        System.out.println("Creado 3 jugadores");
        Jugador jugador1 = new Jugador("Luis", mazo.repartirCartas(5));
        Jugador jugador2 = new Jugador("Pedro", mazo.repartirCartas(5));
        Jugador jugador3 = new Jugador("Gabriel", mazo.repartirCartas(5));

        System.out.println("Practica5.Jugador 1: " + jugador1.nombre);
        System.out.println("Practica5.Jugador 2: " + jugador2.nombre);
        System.out.println("Practica5.Jugador 3: " + jugador3.nombre);

        System.out.println("Repartiendo 5 cartas a cada jugador");

        System.out.println("Mostrando las cartas de cada jugador");
        System.out.println("jugador 1: " + jugador1);
        System.out.println("jugador 2: " + jugador2);
        System.out.println("jugador 3: " + jugador3);

        System.out.println("Cartas restante en el mazo (despues de repartir)");
        System.out.println("Quedan " + mazo.cartas.size() + " en el mazo");

        System.out.println(mazo.mazoHecho(5));

        Carta carta = jugador1.getCartas().get(0);
        mazo.agregarCartas(jugador1.deshacerseDeCarta(carta));

        Carta cartas = jugador1.getCartas().get(1);
        mazo.agregarCartas(jugador1.deshacerseDeCarta(cartas));

        System.out.println("Cartas de " + jugador1.nombre + " despues de devolver:");
        System.out.println(jugador1);

        System.out.println("Practica5.Mazo despues de recibir cartas devueltas: ");
        System.out.println("hay " + mazo.cartas.size() + " en el mazo");

        System.out.println("Buscando carta AS de corazones :");
        if (jugador1.verificarCarta(Carta.Tipo.Corazones, 1)) {
            System.out.println(jugador1.nombre + " tiene el As de Corazones");
        } else if (jugador2.verificarCarta(Carta.Tipo.Corazones, 1)) {
            System.out.println(jugador2.nombre + " tiene el As de Corazones");
        } else if (jugador3.verificarCarta(Carta.Tipo.Corazones, 1)){
            System.out.println(jugador2.nombre + " tiene el As de Corazones");
        } else{
            System.out.println ("El mazo tiene el As de Corazones");
        }
    }
}