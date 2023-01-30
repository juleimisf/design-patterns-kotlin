Los patrones de diseño son soluciones estandarizadas a problemas que surgen en el desarrollo de programas. Estos patrones nos ayudan a estructurar el código de una manera que sea fácil de entender, de escalar y mantener. Existen diferentes categorias de patrones de diseño como por ejemplo:

- **Estructurales:** son aquellos que se enfocan en como conectar y organizar objetos para lograr una funcionalidad en particular.
- **De comportamiento:** se enfoca en como los objetos de comunican e interactuan entre si.


<img width="400" alt="Screen Shot 2022-12-15 at 00 02 05" src="https://user-images.githubusercontent.com/16981896/207762533-84cc2199-2e7e-42b1-bfc2-c7c09c5ad593.png">
# Design-patterns-kotlin


## 1. Strategy 
Es un patron de comportamiendo, donde encapsulamos diferentes logicas, esto con la finalidad de poder intercambiar con mucha facilidad estos algoritmos en tiempo de ejecución. Las estrategias siempre se ejecutan dentro del mismo contexto.

<img width="694" alt="Screen Shot 2022-11-24 at 23 16 38" src="https://user-images.githubusercontent.com/16981896/203886974-3f4e40cc-74d9-432f-8f65-5f4d77d8daaf.png">

- **Strategy:**  es una interfaz que es extendidas por los diferentes algotitmos. Dond el **Contexto** puede llamarla por medio de un **ConcreteStrategy** dentro de ella se define uno o varios metodos que seran utilizados por los algoritmos dentro de los **ConcreteStrategy**.
- **Context:**  Mantiene una referencia de Strategy y selecciona que tipo ConcreteStrategy utilizar.
- **ConcreteStrategy**  implemente la interfaz Strategy y desarrolla el algoritmo.

## 2. Observer 

Es un patron de comportamiento el cual establece una relación de 1 a muchos, el objeto(observadores o publicadores) en el momento que haya cambiado su estado, se encarga de notificar de forma automatica a sus objetos que estan subescritos a él (suscriptores).

<img width="620" alt="Screen Shot 2022-11-25 at 22 26 06" src="https://user-images.githubusercontent.com/16981896/204067296-8b8fcdd8-9e90-4e77-895a-6e7cd81ce5f5.png">

- **Subject:** se define la lista de observadores, seguido de los metodos de subcripción y desubcripción.
- **Observer:** interfaz que se encarga de definir uno o varios metodos que implementarán los subcriptores.
- **ConcreteSubject:** registra a todos los observadores, y envia las notificaciones correspondientes a los subcriptores.
- **ConcreteObserver:** Mantiene una relación con el Observer para mostrar dichos cambios emitido por el Concrete Subject.

## 3. Decorator 
Tamnien llamado wrapper pattern es un patron de diseño estructural altamente conocido. Este patron nos permite exterder comportamientos de forma dinamica, es decir pemite agregar nuevos comportamientos y funcionalidades a objetos sin que estos alteren su esttructura original.

<img width="926" alt="Screen Shot 2022-11-28 at 22 19 59" src="https://user-images.githubusercontent.com/16981896/204414934-9a5f3dfd-c735-4e69-b3bc-7e2fc64e2a56.png">

- Si buscar aplicar el principio abiertp-cerrado este patron es una buena opción, ya que promueve la extension sobre la modificación.
- Si busca aplicar el principio de responsabilidad unica el patron decotator es una exelente opción, pues, este principio indica que una clase deberia realizar una unica cosa y es lo que hace este patron, los decoradores son colocados en clases separadas y que esta envuelva a la clase original.
- **Component:** aca se describen los comportamientos de los componentes y es lo que permite que tanto el objeto como los objetos envueltos se consideren del mismo tipo.
- **Concrete component:** implementa la interfaz del componente.
- **Decorator:** es una clase abstracta qu etambien implementa la interfaz del componente y tambien posee una instancia de esta iterfaz.
- **Concrete decorator:** es una subclase de la clase abstracta Decorator donde se establecen los comportamiento para los objetos proporcionados.


## 3. Factory Method
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
Este patron se encarga de crear otras fabricas y proporciona una de las mejores formas de crear un objeto es decir nos permite crear familias de productos. Al igual que el patron Factory Method tambien es considerado un patron de creacion.

<img width="769" alt="Screen Shot 2022-12-10 at 19 16 25" src="https://user-images.githubusercontent.com/16981896/206877361-ccd79c4c-6fef-4c89-9bc7-13c15498abcf.png">

- **Abstract Factory:** es una interfaz que define varios metodos para la creación de los objetos.
- **Concrete Factory:** se encarga de implemnetar metodos de la clase **Abstract Factory** es decir los diferentes tipos de familia de productos.
- **Abstract Product:** procude un conjunto de productos.

## 5. Singleton
Este es un patron creacional y su función principal es crear una unica instancia de una clase y q ue esta tenga un acceso goblal. Este quizá sea una de los patrones mas faciles de implementar pero hay que tener sumo cuidado de no abusar del mismo. Es ideal que el constructor no sea publico y que el cliente solo tenga acceso a la obtención de la instancia.

<img width="814" alt="Screen Shot 2022-12-12 at 23 10 44" src="https://user-images.githubusercontent.com/16981896/207208964-df3a83a7-ea44-4cd6-9f5f-cdcc228fd0ed.png">

- **Singleton Class:** declarra un metodo que se encarga de devolver la misma instancia de su propia clase.

Varias de las ventajas de este patron es que asegura que solo tengamos una única instancia de una clase, ademas de que dicha instancia se podrá acceder de forma global y este singleton solo se crea una única vez.

## 5. Command
Es un patron de comportamiento, nos permite desacoplar las acciones de los objetos, es decir del objeto que solicita realizar una acción del que realizará dicha acción. Convierte las solicitudes o operaciones en objetos.

- **Client:** crear los comandos concretos es decir los *Concrere Commands* que implementan la interfaz *Command*, ademas de esto tambien crea el *Receiver*
- **Commmand:** es una interfaz que declara el meedo *execute()* encargado de ejecutar el comando.
- **Invoker:** es el encargado de almacenar una lista de comandos listos para ejecutarse. Importante mencionar que el *Invoker* desconoce la forma de implementación de la solicitud.
- **Receiver:** es quien conoce la forma de implementar la solicitud, lo hace a traves del comando concreto que hace uso de la interfaz Command.
- **Concrete Commands:** es el que implementa la solicitud en si.
<img width="762" alt="Screen Shot 2022-12-29 at 00 32 57" src="https://user-images.githubusercontent.com/16981896/209899863-65076852-3b57-4451-bb62-edae0e635d5f.png">

## 5. Adapter
Entra dentro d elos patrones estructurales

## 5. Facade
 Imagina que deseas implementar un sistema de seguridad en tu casa que contengas subsistemas como por ejemplo: un sistema de alarma, sistema de sensores, sistema de camara de vigilancia en entre otros. El dueño de la casa necesita de una interfaz simple, comoda y facil de usar  para interactuar con estos subsistema y mantener su hogar seguro, aqui es que aparace el patron Facade, el usuario no tiene la necesidad de  saber todo lo complejo o lo que ocurre en cada subsistema para poder funcionar.

### Definición
 Definido como una patron de diseño estructural permite ocultar la complejidad de un subsistema esto por medio de una interfaz bastate simple. Esto nos ayuda a poder interactura con el sistema de forma más sencilla sin tener que procuparnos de lo que sucede por detras.

 ### ¿Qué puedo hacer con Facade?
  1. **Ocultar la complejidad:** podemos ocultar lo complejo de un sistema por medio una una interdaz facil de usar. 
  2. **Interfaz Única:** Proporcionando dicha interfaz unica que nos permite que sea facil de interacturar con el sistema complejo.
  3. **Reutilizar:** permite la reutilización de los componentes dentro del mismo sistema.
  4. **Seguridad:** ya que se ocultan los detalles técnicos o internos de un sistema y solo se hace uso de la interfaz que proporciona asegura que solo se limite la interaccion a travez de esta interfaz.
  5. **Bajo acoplamiento:** con este patrón se evita que las clases **Client** esta acopladas las clases del subsistema de forma directa esto permite actualizarlas, modificarlas y hasta cambiarlas y no afectara el comportamiento del Client.

<img width="640" alt="Screen Shot 2023-01-26 at 21 23 28" src="https://user-images.githubusercontent.com/16981896/214979850-7e7f305d-6ce1-4659-847b-eb985894e971.png">

### Deninición de cada elemento
- **Client:** hace uso de la interfaz para interactuar con el subsistema.
- **Facade:** interfaz simplificada para interactuar con el subsistema complejo. 
- **SubSystem:** son los componentes del subsistema

## 6.Template Method

Suponga que es su primer dia en una pizzeria, sus compañeros cada dia crean diferentes tipos de pizzas Margarita, vegetariana, Peperoni, etc, donde cada una de ellos siguen el mismo proceso general que es mezclar los ingredientes para la masa, amasar, colococarlos los topping y hornear sin embargo cada tipo de pizza varian un poco en sus ingredientes o tiempo de cocción, el patron template es similar proporciona una estructura para un proceso o algoritmo pero permite que detalles especifcos sean implementados por las subclases.

### Ventajas
- **Abtracción:** gracias a este patrón podemos abstraer la logica de un algoritmo de sus implementación especifica.
- **Modificable:** permite hacer cambios sobre un algoritmo en especifico sin tener que cambiar el código existente.
- **Adaptable:** haciendo uso de este patrón podemos crear jerarquias de clases que se adapten a diferentes escenarios sin la necesidad de escribir código adicional. 

<img width="702" alt="Screen Shot 2023-01-27 at 20 24 03" src="https://user-images.githubusercontent.com/16981896/215224371-b0c34171-8b25-4ac3-8520-72977e074c8a.png">

### 7.Iterator
Estas de vacaciones por Roma y quieres visitar varios sitios como por ejemplo: el Coliseo Romano, la Fontana de Trevi, El Vaticano, etc para ello contratas un chofer esto,para qye sea mucho mas facil y comodo visitar cada uno de estos lugares. En este caso el conductor o chofer hace de Iterator y cada uno de los lugares actuan como los elementos a recorrer, ya que el chofer sabe como llegar a cada destinao y como acceder a cada uno de ellos. El cliente que uso el Iterator no se preocupa de que forma ni como hace el recorrido.

### Definicíon
El patrón Iterator provee una forma bastante estandar de acceder a los elementos de una colección sin exponer su representación interna, lo hace recorriendo una colección y devuelve elemento por elemento es decir uno a uno.

### Ventajas de su uso
- **Abtracción:** permite abstraer la implementación de la estructura de los datos subyacentes y provee una forma facil de acceder a los datos.
- **Encapsulamiento:** proteje los detalles de implementación de la estrcutura de datos al proveer una interfaz para acceder a los datos.
- **Reutilización:** permite reeutilizar la logica de iteración en diferentes estrcuturas de datos, sin la necesidad de duplicar código.

### Deninición de cada elemento

-**Interfaz Iterador:** aca se especifican cada uno de los metodos que debe implementar el iterator.
-**ConcreteIterator:** implementa la interfaz Iterator manteniendo una referencia a la colección de estructura de datos.
-**Aggreagate:** aca se especifican los metodos de deben proporcionar una colección de datos.
-**ConcreteAggreagate:** implementa la interfaz Aggreagate y proporciona una implementación para obtener un Iterator y acceder a los elementos

<img width="860" alt="Screen Shot 2023-01-29 at 21 56 18" src="https://user-images.githubusercontent.com/16981896/215366940-d573607a-7113-4b55-be3f-0e6febcb4977.png">


## GUIA
![guia_uml](https://user-images.githubusercontent.com/16981896/204416505-99a97310-5096-4677-8fe5-cfeb7815d002.png)


referencias:
- https://en.proft.me/2016/09/20/factory-design-pattern-java-and-python/


