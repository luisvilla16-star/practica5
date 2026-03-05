package Practica5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class MazoTest {

    @Test
    public void testInicializacionMazo() {
        Mazo mazo = new Mazo();

        assertEquals(52, mazo.cartas.size());
    }

    @Test
    public void testBarajear() {
        Mazo mazo = new Mazo();
        mazo.barajear();

        assertEquals(52, mazo.cartas.size());
    }

    @Test
    public void testRepartirCartas() {
        Mazo mazo = new Mazo();

        ArrayList<Carta> mano = mazo.repartirCartas(5);

        assertEquals(5, mano.size());
        assertEquals(47, mazo.cartas.size());
    }

    @Test
    public void testMazoHecho() {
        Mazo mazo = new Mazo();

        ArrayList<Carta> cartas = mazo.mazoHecho(3);

        assertEquals(3, cartas.size());
        assertEquals(52, mazo.cartas.size()); // no debe eliminar cartas
    }

    @Test
    public void testTomarCarta() {
        Mazo mazo = new Mazo();

        Carta carta = mazo.tomarCarta();

        assertNotNull(carta);
        assertEquals(51, mazo.cartas.size());
    }

    @Test
    public void testAgregarCarta() {
        Mazo mazo = new Mazo();

        Carta nueva = new Carta(Carta.Tipo.Picas, 7);
        mazo.agregarCartas(nueva);

        assertEquals(53, mazo.cartas.size());
    }

    @Test
    public void testConfiguracionInicial() {
        Mazo mazo = new Mazo();

        mazo.repartirCartas(10);
        assertEquals(42, mazo.cartas.size());

        mazo.configuracionInicial();

        assertEquals(52, mazo.cartas.size());
    }
}