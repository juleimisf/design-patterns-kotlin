# Design-patterns-kotlin


## 1. Strategy pattern
Es un patron de comportamiendo, donde encapsulamos diferentes logicas, esto con la finalidad de poder intercambiar con mucha facilidad estos algoritmos en tiempo de ejecución. Las estrategias siempre se ejecutan dentro del mismo contexto.

<img width="694" alt="Screen Shot 2022-11-24 at 23 16 38" src="https://user-images.githubusercontent.com/16981896/203886974-3f4e40cc-74d9-432f-8f65-5f4d77d8daaf.png">

- **Strategy:**  es una interfaz que es extendidas por los diferentes algotitmos. Dond el **Contexto** puede llamarla por medio de un **ConcreteStrategy** dentro de ella se define uno o varios metodos que seran utilizados por los algoritmos dentro de los **ConcreteStrategy**.
- **Context:**  Mantiene una referencia de Strategy y selecciona que tipo ConcreteStrategy utilizar.
- **ConcreteStrategy**  implemente la interfaz Strategy y desarrolla el algoritmo.

## 2. Observer pattern

Es un patron de comportamiento el cual establece una relación de 1 a muchos, el objeto(observadores o publicadores) en el momento que haya cambiado su estado, se encarga de notificar de forma automatica a sus objetos que estan subescritos a él (suscriptores).

<img width="620" alt="Screen Shot 2022-11-25 at 22 26 06" src="https://user-images.githubusercontent.com/16981896/204067296-8b8fcdd8-9e90-4e77-895a-6e7cd81ce5f5.png">

- **Subject:** se define la lista de observadores, seguido de los metodos de subcripción y desubcripción.
- **Observer:** interfaz que se encarga de definir uno o varios metodos que implementarán los subcriptores.
- **ConcreteSubject:** registra a todos los observadores, y envia las notificaciones correspondientes a los subcriptores.
- **ConcreteObserver:** Mantiene una relación con el Observer para mostrar dichos cambios emitido por el Concrete Subject.

## 3. Decorator pattern
Tamnien llamado wrapper pattern es un patron de diseño estructural altamente conocido. Este patron nos permite exterder comportamientos de forma dinamica, es decir pemite agregar nuevos comportamientos y funcionalidades a objetos sin que estos alteren su esttructura original.

<img width="926" alt="Screen Shot 2022-11-28 at 22 19 59" src="https://user-images.githubusercontent.com/16981896/204414934-9a5f3dfd-c735-4e69-b3bc-7e2fc64e2a56.png">

- Si buscar aplicar el principio abiertp-cerrado este patron es una buena opción, ya que promueve la extension sobre la modificación.
- Si busca aplicar el principio de responsabilidad unica el patron decotator es una exelente opción, pues, este principio indica que una clase deberia realizar una unica cosa y es lo que hace este patron, los decoradores son colocados en clases separadas y que esta envuelva a la clase original.
- **Component:** aca se describen los comportamientos de los componentes y es lo que permite que tanto el objeto como los objetos envueltos se consideren del mismo tipo.
- **Concrete component:** implementa la interfaz del componente.
- **Decorator:** es una clase abstracta qu etambien implementa la interfaz del componente y tambien posee una instancia de esta iterfaz.
- **Concrete decorator:** es una subclase de la clase abstracta Decorator donde se establecen los comportamiento para los objetos proporcionados.


## 3. Factory pattern
Es un patron de diseño creacional, que proporciona una forma de delegar la lógica de creación de instancias, a objetos secundarios. Aca el usuario final no se preocupa por la logica de creacion del objeto. Normalmente se puede hacer uso de este patron cuando se posee una super clase y esta posee multiples subclases, para asi entonces devolver una de las subclases segun sea el requerimientop del usuario final.

Cuando puedo usar este patron? 
- Cuando una clase no sabe qué subclases se requerirán para crear
- Cuando una clase quiere que sus subclases especifiquen los objetos a crear.
- Cuando las clases padres eligen la creación de objetos para sus subclases.

<img width="701" alt="Screen Shot 2022-12-01 at 18 10 01" src="https://user-images.githubusercontent.com/16981896/205159845-8bcda4c0-a133-4e22-a9e9-679967d726e8.png">

- **Product:** es una interfaz que es comun entre todos los objetos que puede crear el factory y sus subclases.
- **Product concrete:** son diferentes implemnetaciones del **product**.
- **Factory:** se encarga de declarar un metodo para la creación de los objetos del tipo **product** donde es importante que el tipo devuelto dentro de este metodo sea igual a la intefaz **product**.

- **Concrete Factory:** se encarga de devolver nuevos objetos diferentes, anulando el metedoto base del **factory**

## 4. Abstract Factory

<img width="769" alt="Screen Shot 2022-12-10 at 19 16 25" src="https://user-images.githubusercontent.com/16981896/206877361-ccd79c4c-6fef-4c89-9bc7-13c15498abcf.png">


## GUIA
![guia_uml](https://user-images.githubusercontent.com/16981896/204416505-99a97310-5096-4677-8fe5-cfeb7815d002.png)


referencias:
- https://en.proft.me/2016/09/20/factory-design-pattern-java-and-python/


