package Practica5;

/**
 * Clase encargada de mostrar visualmente una carta en pantalla.
 * Utiliza figuras gráficas como cuadrados y círculos para representar
 * la carta y su tipo (corazones, diamantes, tréboles o picas).
 */
public class Visualizador {

    /**
     * Dibuja una carta en una posición específica de la pantalla.
     *
     * @param c Carta que se desea visualizar. Contiene el tipo de carta
     *          (Corazones, Diamantes, Tréboles o Picas) y su valor.
     * @param p Posición donde se dibujará la carta en la ventana gráfica.
     */
    public static void carta(Carta c, Posicion p){

        int x = p.getX();
        int y = p.getY();

        if(x < 0 || y < 0 || x > 105 || y > 105){
            System.out.println("Advertencia: la carta está fuera del canvas");
            return;
        }
        // Se crea el fondo de la carta utilizando un cuadrado
        Square square = new Square();
        square.changeSize(100);           // Tamaño de la carta
        square.changeColor("blue");       // Color del fondo
        square.moveHorizontal(p.getX()-60); // Posición horizontal
        square.moveVertical(p.getY()-25);   // Posición vertical
        square.makeVisible();             // Hace visible la figura

        // Si la carta es de tipo Corazones
        if (c.getTipo()==Carta.Tipo.Corazones) {
            int valor = c.getValor(); // Obtiene el valor de la carta

            // Se dibujan círculos que representan los símbolos
            for (int i = 0; i < valor; i++) {
                Circle circle = new Circle();
                circle.changeColor("red");   // Color rojo para corazones
                circle.changeSize(10);// Tamaño del símbolo
                circle.moveHorizontal(p.getX() + 20 + (i % 3) * 30);
                circle.moveVertical(p.getY() +20 + (i / 3) * 25);
                circle.makeVisible();        // Hace visible el símbolo
            }
        }

        // Si la carta es de tipo Diamantes
        else if(c.getTipo()==Carta.Tipo.Diamantes) {
            int valor = c.getValor();

            for (int i = 0; i < valor; i++) {
                Circle circle = new Circle();
                circle.changeColor("red");   // Diamantes también son rojos
                circle.changeSize(15);
                circle.moveHorizontal(p.getX() + 20 + (i % 3) * 30);
                circle.moveVertical(p.getY() +20 + (i / 3) * 25);
                circle.makeVisible();
            }
        }

        // Si la carta es de tipo Tréboles
        else if(c.getTipo()==Carta.Tipo.Treboles){
            int valor = c.getValor();

            for(int i=0;i<valor;i++) {
                Circle circle = new Circle();
                circle.changeColor("black"); // Color negro para tréboles
                circle.changeSize(15);
                circle.moveHorizontal(p.getX() + 20 + (i % 3) * 30);
                circle.moveVertical(p.getY() +20 + (i / 3) * 25);
                circle.makeVisible();
            }
        }

        // Si la carta es de tipo Picas
        else if(c.getTipo()==Carta.Tipo.Picas){
            int valor = c.getValor();

            for(int i=0;i<valor;i++){
                Circle circle = new Circle();
                circle.changeColor("black"); // Color negro para picas
                circle.changeSize(15);
                circle.moveHorizontal(p.getX() + 20 + (i % 3) * 30);
                circle.moveVertical(p.getY() +20 + (i / 3) * 25);
                circle.makeVisible();
            }
        }
    }
}