package Practica5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class JugadorTest {

    @Test
    public void testConstructor() {
        ArrayList<Carta> cartas = new ArrayList<>();
        Jugador jugador = new Jugador("Luis", cartas);

        assertEquals("Luis", jugador.nombre);
        assertEquals(0, jugador.getCartas().size());
    }

    @Test
    public void testRecibirCarta() {
        ArrayList<Carta> cartas = new ArrayList<>();
        Jugador jugador = new Jugador("Luis", cartas);

        Carta carta = new Carta(Carta.Tipo.Picas, 5);
        jugador.recibirCarta(carta);

        assertEquals(1, jugador.getCartas().size());
        assertTrue(jugador.getCartas().contains(carta));
    }

    @Test
    public void testDeshacerseDeCarta() {
        ArrayList<Carta> cartas = new ArrayList<>();
        Carta carta = new Carta(Carta.Tipo.Corazones, 10);
        cartas.add(carta);

        Jugador jugador = new Jugador("Luis", cartas);

        jugador.deshacerseDeCarta(carta);

        assertEquals(0, jugador.getCartas().size());
    }

    @Test
    public void testVerificarCartaTrue() {
        ArrayList<Carta> cartas = new ArrayList<>();
        Carta carta = new Carta(Carta.Tipo.Diamantes, 7);
        cartas.add(carta);

        Jugador jugador = new Jugador("Luis", cartas);

        assertTrue(jugador.verificarCarta(Carta.Tipo.Diamantes, 7));
    }

    @Test
    public void testVerificarCartaFalse() {
        ArrayList<Carta> cartas = new ArrayList<>();
        Carta carta = new Carta(Carta.Tipo.Treboles, 3);
        cartas.add(carta);

        Jugador jugador = new Jugador("Luis", cartas);

        assertFalse(jugador.verificarCarta(Carta.Tipo.Picas, 9));
    }

    @Test
    public void testToString() {
        ArrayList<Carta> cartas = new ArrayList<>();
        cartas.add(new Carta(Carta.Tipo.Corazones, 1));

        Jugador jugador = new Jugador("Luis", cartas);

        String texto = jugador.toString();

        assertTrue(texto.contains("Luis"));
        assertTrue(texto.contains("Corazones"));
    }
}