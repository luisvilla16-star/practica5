package Practica5;

public class VisualizadorTest{

    public static void main(String[] args) {

        // Crear algunas cartas
        Carta carta1 = new Carta(Carta.Tipo.Corazones, 5);
        Carta carta2 = new Carta(Carta.Tipo.Diamantes, 3);
        Carta carta3 = new Carta(Carta.Tipo.Treboles, 7);
        Carta carta4 = new Carta(Carta.Tipo.Picas, 4);

        // Crear posiciones
        Posicion p1 = new Posicion(40, 40);
        Posicion p2 = new Posicion(120, 40);
        Posicion p3 = new Posicion(40, 120);
        Posicion p4 = new Posicion(120, 120);

        // Dibujar las cartas
        Visualizador.carta(carta1, p1);
        Visualizador.carta(carta2, p2);
        Visualizador.carta(carta3, p3);
        Visualizador.carta(carta4, p4);

        // Prueba fuera del canvas
        Posicion fuera = new Posicion(200, 200);
        Visualizador.carta(carta1, fuera);
    }
}