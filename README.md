# Design-patterns-kotlin


## Strategy pattern
Es un patron de comportamiendo, donde encapsulamos diferentes logicas, esto con la finalidad de poder intercambiar con mucha facilidad estos algoritmos en tiempo de ejecución. Las estrategias siempre se ejecutan dentro del mismo contexto.

<img width="694" alt="Screen Shot 2022-11-24 at 23 16 38" src="https://user-images.githubusercontent.com/16981896/203886974-3f4e40cc-74d9-432f-8f65-5f4d77d8daaf.png">

- **Strategy:**  es una interfaz que es extendidas por los diferentes algotitmos. Dond el **Contexto** puede llamarla por medio de un **ConcreteStrategy** dentro de ella se define uno o varios metodos que seran utilizados por los algoritmos dentro de los **ConcreteStrategy**.

- **Context:**  Mantiene una referencia de Strategy y selecciona que tipo ConcreteStrategy utilizar.

- **ConcreteStrategy**  implemente la interfaz Strategy y desarrolla el algoritmo.

## Observer pattern
