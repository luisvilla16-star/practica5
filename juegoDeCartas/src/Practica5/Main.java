package Practica5;
public class Main {
    public static void main(String[] args) {
        Carta carta1 = new Carta(Carta.Tipo.Picas, 7);

        Posicion p = new Posicion(40,40);

        Visualizador.carta(carta1, p);
    }
}
