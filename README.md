# Juego de Cartas en Java

## Descripción

Este proyecto implementa un sistema básico de juego de cartas utilizando programación orientada a objetos en Java.
Se crea una baraja estándar de 52 cartas, se pueden barajar y repartir cartas a los jugadores.

El proyecto está diseñado con fines educativos para practicar conceptos de:

* Clases y objetos
* Enumeraciones
* Listas dinámicas (`ArrayList`)
* Métodos
* Encapsulación

---

## Estructura del Proyecto

El proyecto contiene las siguientes clases:

### Carta

Representa una carta individual de la baraja.

Atributos:

* `tipo`: palo de la carta (Corazones, Picas, Diamantes, Tréboles)
* `valor`: valor numérico de la carta (1–13)

Funciones principales:

* Obtener el tipo de carta
* Obtener el valor
* Mostrar la carta en formato de texto

---

### Mazo

Representa el mazo completo de cartas.

Funciones principales:

* Inicializar el mazo con 52 cartas
* Barajar el mazo
* Mostrar cartas del mazo
* Repartir cartas

---

### Jugador

Representa un jugador dentro del juego.

Atributos:

* `nombre`: nombre del jugador
* `mano`: colección de cartas que posee

Funciones principales:

* Recibir cartas
* Descartar cartas
* Mostrar las cartas del jugador

---

### Juego

Contiene el método `main` que ejecuta el programa.

Funciones:

* Crear el mazo
* Barajar las cartas
* Repartir cartas a los jugadores
* Mostrar las cartas en pantalla

---

## Cómo ejecutar el programa

1. Compilar los archivos Java

```
javac *.java
```

2. Ejecutar la clase principal

```
java Juego
```

---

## Ejemplo de funcionamiento

```
Creando mazo...
Barajando mazo...

Jugador 1 recibe 5 cartas
Jugador 2 recibe 5 cartas

Cartas del Jugador 1:
Corazones 7
Picas 3
Diamantes 12
Treboles 5
Corazones 1
```

---

## Autor

Luis Gabriel Villa Coronilla

Proyecto académico para práctica de programación en Java.
