package Practica5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CartaTest {

    @Test
    public void testConstructorVacio() {
        Carta carta = new Carta();

        assertEquals(Carta.Tipo.Corazones, carta.getTipo());
        assertEquals(1, carta.getValor());
    }

    @Test
    public void testConstructorConParametros() {
        Carta carta = new Carta(Carta.Tipo.Picas, 10);

        assertEquals(Carta.Tipo.Picas, carta.getTipo());
        assertEquals(10, carta.getValor());
    }

    @Test
    public void testSetTipo() {
        Carta carta = new Carta();
        carta.setTipo(Carta.Tipo.Diamantes);

        assertEquals(Carta.Tipo.Diamantes, carta.getTipo());
    }

    @Test
    public void testSetValor() {
        Carta carta = new Carta();
        carta.setValor(7);

        assertEquals(7, carta.getValor());
    }

    @Test
    public void testToStringNumero() {
        Carta carta = new Carta(Carta.Tipo.Treboles, 5);

        String esperado = "Tipo: Treboles, Valor: 5";
        assertEquals(esperado, carta.toString());
    }

    @Test
    public void testToStringAs() {
        Carta carta = new Carta(Carta.Tipo.Corazones, 1);

        String esperado = "Tipo: Corazones, Valor: As";
        assertEquals(esperado, carta.toString());
    }

    @Test
    public void testToStringJ() {
        Carta carta = new Carta(Carta.Tipo.Picas, 11);

        String esperado = "Tipo: Picas, Valor: J";
        assertEquals(esperado, carta.toString());
    }

    @Test
    public void testToStringQ() {
        Carta carta = new Carta(Carta.Tipo.Diamantes, 12);

        String esperado = "Tipo: Diamantes, Valor: Q";
        assertEquals(esperado, carta.toString());
    }

    @Test
    public void testToStringK() {
        Carta carta = new Carta(Carta.Tipo.Treboles, 13);

        String esperado = "Tipo: Treboles, Valor: K";
        assertEquals(esperado, carta.toString());
    }
}