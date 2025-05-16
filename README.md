# exploding-tlacuaches
Una versión alternativa de Exploding Kittens enfocado a tlacuaches. El
objetivo de este proyecto es para ejercitar la programación en
Java.

Nadie sabe cómo quedará finalmente, pero a medida que se trabaje
se desarrollará la idea. Además, explorar la imaginación añadiendo
cartas nuevas, reglas nuevas, imagenes/sonidos Y/O expandir a muchos
jugadores.

Incialmente, está pensado para jugar en multijugador sobre una red
local con interfaz gráfica utilizando Java para fácilmente extenderlo
a Kotlin o Swift.

## Instrucciones del juego.
Exploding tlacuaches es básicamente una _ruleta rusa_, gana el último
jugador en morir. La idea es muy simple.

Cada jugador inicia con K cartas y 1 vida. Mientras sea el turno de
un jugador, puede tirar las cartas que desee, pero *debe* finalizar su
turno agarrando una carta del tope, a menos que tenga otra carta que
especifique finalizar su turno sin agarrar una carta de la pila de
cartas para comer.

Dentro de la pila, existen N-1 bombas, con N el número de
jugadores. Dado que todos los jugadores, eventualmente terminarán su
turno agarrando de la pila, por lo que si un jugador termina su turno
agarrando una bomba, el jugador pierde automáticamente, a menos que
tenga una carta de _defusar_ el cual perimte que el jugador siga
jugando al menos por otra ronda. 

Todas las demás cartas crean varios efectos como

- Negar
- Reversa
- Robar cartas
- Saltar turno
- Ver futuro
- Alterar el futuro
- Préstamos
- ETC

Estos se irán añadiendo al juego dependiendo de su desarrollo.


## Instalación
Para poder ejecutar el proyecto es necesario tener maven instalado,
esto es utilizando

```bash
$ sudo apt update && sudo apt install maven
```

Los ciclos del proyecto (así les llama Maven) que deben pasar son

- mvn compile
- mvn test
- mvn install

Por último ejecutamos la aplicacion como
```bash
$ mvn clean javafx:run
```
