
# 🔨   Patrones de diseño

⚡ ¿Estás listo para llevar tus habilidades de programación al siguiente nivel? 
Este repositorio es el lugar perfecto para aprender sobre los patrones de diseño más utilizados en la programación, con enfoque en Kotlin. 

💡 Descubre cómo solucionar problemas comunes y mejorar la calidad de tu código con la ayuda de ejemplos concretos de código, diagramas de clases y explicaciones detalladas de cada patrón. 

# Índice

- [1. Introducción](#introducción)
- [2. Patrones de creación](#patrones-de-creación)
  - [2.1 Patrón de diseño Singleton](#singleton)
  - [2.2 Patrón de diseño Factory Method](#factory-method)
  - [2.3 Patrón de diseño Abstract Factory](#abstract-factory)
- [3. Patrones estructurales](#patrones-estructurales)
  - [3.1 Patrón de diseño Adapter](#adapter)
  - [3.2 Patrón de diseño Decorator](#decorator)
  - [3.3 Patrón de diseño Facade](#facade)
  - [3.4 Patrón de diseño Composite](#composite)
- [4. Patrones de comportamiento](#comportamiento)
  - [4.1 Patrón de diseño Command](#command)
  - [4.2 Patrón de diseño Iterator](#iterator)
  - [4.3 Patrón de diseño Observer](#observer)
  - [4.4 Patrón de diseño State](#state)
  - [4.5 Patrón de diseño Strategy](#strategy)
  - [4.6 Patrón de diseño Template Method](#template)


# Introducción <a name="introducción"></a>
En esta sección, proporcionaremos una introducción breve sobre patrones de diseño, su importancia y los diferentes tipos de patrones que existen.

Los patrones de diseño son soluciones estandarizadas a problemas que surgen en el desarrollo de programas. Estos patrones nos ayudan a estructurar el código de una manera que sea fácil de entender, de escalar y mantener. Existen diferentes categorias de patrones de diseño como por ejemplo:

# Patrones de creación <a name="patrones-de-creación"></a>
Los patrones de creación son aquellos que se centran en la creación de objetos. En esta sección, presentamos los diferentes patrones de creación y su implementación en diferentes lenguajes de programación.

## Singleton <a name="singleton"></a>

El patrón Singleton es un patrón de diseño creacional que se utiliza para crear una única instancia de una clase y que esta tenga un acceso global. Este quizá sea una de los patrones más fáciles de implementar, pero hay que tener sumo cuidado de no abusar del mismo.

**Definición**

El patrón Singleton es uno de los patrones de diseño creacionales más comunes en la programación orientada a objetos. Sus principales elementos son los siguientes:

| **Singleton:** es la clase que se asegura de que solo haya una instancia de sí misma en todo el sistema. Controla el acceso a esa instancia única mediante un método estático que devuelve la instancia. | 
| :--- |
| **Constructor privado:** es un constructor que se define como privado para evitar que se cree una instancia de la clase fuera de la propia clase. | 
| **Método estático de instancia única (Singleton):** es el método que devuelve la única instancia de la clase Singleton. Se suele implementar como un método estático que devuelve la instancia única, creándola si no existe previamente. |

<img width="814" alt="Screen Shot 2022-12-12 at 23 10 44" src="https://user-images.githubusercontent.com/16981896/207208964-df3a83a7-ea44-4cd6-9f5f-cdcc228fd0ed.png">

**Uso**

El patrón Singleton se puede utilizar en situaciones donde se necesita garantizar que sólo exista una instancia de una clase en todo el programa, y que esta instancia sea fácilmente accesible desde cualquier parte del mismo. Algunos casos donde se puede utilizar son:

- En aplicaciones de registro
- En aplicaciones de manejo de configuraciones
- En aplicaciones de acceso a bases de datos

**Implementación**

Para implementar correctamente el patrón Singleton, es necesario seguir los siguientes pasos:

1. Crear una clase que contenga la instancia del objeto que queremos que sea único y privado. Este objeto debe ser estático, es decir, pertenecer a la clase y no a una instancia particular de la misma.
2. Crear un constructor privado para la clase, de manera que la instancia solo pueda ser creada desde la propia clase.
3. Crear un método público estático que permita acceder a la instancia de la clase. Si la instancia no ha sido creada todavía, este método debe crearla y devolverla. Si ya existe, debe devolver la instancia ya creada.
4. Asegurarse de que la clase es segura para ser utilizada en un entorno multihilo. Para ello, es necesario utilizar técnicas de sincronización que eviten que varias instancias de la clase sean creadas al mismo tiempo.

# Factory Method <a name="factory-method"></a>

El Factory Method es un patrón de diseño creacional que proporciona una forma de delegar la lógica de creación de instancias a objetos secundarios. Aquí, el usuario final no se preocupa por la lógica de creación del objeto. Normalmente, se puede hacer uso de este patrón cuando se posee una superclase y esta posee múltiples subclases, para devolver una de las subclases según sea el requerimiento del usuario final.

**¿Cuándo se puede usar este patrón?**
- Cuando una clase no sabe qué subclases se requerirán para crear.
- Cuando una clase quiere que sus subclases especifiquen los objetos a crear.
- Cuando las clases padres eligen la creación de objetos para sus subclases.

![Factory Method](https://user-images.githubusercontent.com/16981896/205159845-8bcda4c0-a133-4e22-a9e9-679967d726e8.png)

**Definción de casa elemento**

| Elemento         | Descripción                                                                                                                           |
| ----------------| ------------------------------------------------------------------------------------------------------------------------------------- |
| Product          | Es una interfaz o clase abstracta que define el tipo de objetos que puede crear el Factory y sus subclases.                           |
| ConcreteProduct  | Son las implementaciones concretas de la interfaz o clase abstracta `Product`.                                                           |
| Creator          | Es una clase abstracta que define un método abstracto para la creación de objetos del tipo `Product`, que las subclases deben implementar. |
| ConcreteCreator  | Son las subclases concretas que implementan el método abstracto definido en `Creator` y crean objetos del tipo `ConcreteProduct`.         |


**Factory Method y Abstract Factory**
El patrón Factory Method y el patrón Abstract Factory pueden parecer similares en algunos aspectos, lo que puede llevar a cierta confusión. Aquí hay algunas razones por las que se pueden confundir:

- Ambos patrones son creacionales y se utilizan para crear objetos. El patrón Factory Method crea objetos a través de una interfaz común, mientras que el patrón Abstract Factory crea objetos relacionados por familias.
- En ambos patrones, el cliente no sabe qué clase concreta está instanciando. En el patrón Factory Method, la creación de objetos se delega a las subclases, y en el patrón Abstract Factory, la creación de objetos se delega a una fábrica abstracta.
- Ambos patrones son útiles para crear objetos que sean compatibles entre sí. El patrón Factory Method garantiza que todos los objetos creados sean del mismo tipo, mientras que el patrón Abstract Factory garantiza que los objetos creados sean compatibles entre sí.

A continuación, se presenta una tabla comparativa entre el patrón de diseño Factory Method y Abstract Factory:

**Tabla comparativa entre el patrón de diseño Factory Method y Abstract Factory**

|       **Factoría de Métodos (Factory Method)**       |   **Factoría Abstracta (Abstract Factory)**   |
| :--------------------------------------------------: | :-------------------------------------------: |
| Define una interfaz para crear un objeto de forma que las subclases puedan decidir qué clase implementar. | Proporciona una interfaz para crear familias de objetos relacionados o dependientes sin especificar sus clases concretas. |
| Es utilizado para crear un solo producto. | Es utilizado para crear múltiples productos relacionados. |
| La subclase determina la clase concreta a instanciar. | La subclase determina la factoría concreta a utilizar. |
| Es una solución más simple y fácil de entender. | Es una solución más compleja pero más flexible y escalable. |
| Útil cuando se tiene un conjunto conocido de tipos de objetos que deben ser creados. | Útil cuando se tiene un conjunto de tipos de objetos que deben ser creados y hay una dependencia entre ellos. |


# Abstract Factory <a name="abstract-factory"></a>

El patrón de diseño Abstract Factory es un patrón creacional que proporciona una interfaz para crear familias de objetos relacionados sin especificar su clase concreta. Es decir, permite crear objetos de diferentes tipos relacionados entre sí, sin conocer la implementación específica de cada uno. Esto permite que la aplicación sea más flexible y escalable, ya que los objetos pueden ser intercambiados sin afectar al resto del sistema.

Este patron se puede pensar como una fábrica de coches, donde hay varias fábricas de coches (fábricas concretas) que producen diferentes tipos de coches (productos concretos). Cada fábrica de coches tiene su propia línea de producción especializada en ciertos tipos de coches. Por ejemplo, una fábrica puede producir coches deportivos mientras que otra puede producir coches familiares.

**Ventajas de su uso**
- Proporciona una forma de crear objetos relacionados sin especificar sus clases concretas. Esto permite desacoplar el código cliente de la creación de objetos, lo que facilita la modificación y extensión del sistema.

- Permite intercambiar fácilmente entre diferentes familias de objetos, ya que cada fábrica concreta implementa una interfaz común para crear objetos abstractos. Esto hace que el código sea más flexible y fácil de mantener.

- Favorece el principio de "abrir/cerrar" (Open/Closed), que es uno de los principios fundamentales de la programación orientada a objetos. Esto significa que el código es abierto para extensión, pero cerrado para modificación, lo que hace que sea más fácil añadir nuevas funcionalidades al sistema sin tener que modificar el código existente.

- Promueve la coherencia y la consistencia en el diseño de la aplicación. Al utilizar el patrón Abstract Factory, se asegura que todos los objetos creados por una fábrica concreta pertenecen a la misma familia y tienen una coherencia y consistencia en su diseño.

<img width="769" alt="Screen Shot 2022-12-10 at 19 16 25" src="https://user-images.githubusercontent.com/16981896/206877361-ccd79c4c-6fef-4c89-9bc7-13c15498abcf.png">

**Definición de cada elemento**
| Elemento | Descripción |
| --- | --- |
| **Abstract Factory** | Define una interfaz para crear familias de objetos relacionados o dependientes sin especificar sus clases concretas. |
| **Concrete Factory** | Implementa la interfaz de la fábrica abstracta para crear objetos de una familia concreta. |
| **Abstract Product** | Define una interfaz para un tipo de objeto que forma parte de la familia de objetos que puede crear la fábrica abstracta. |
| **Concrete Product** | Implementa la interfaz de un producto abstracto para crear objetos de un tipo concreto. |
| **Client** | Usa únicamente las interfaces declaradas por Abstract Factory y Abstract Product para interactuar con objetos de la familia de productos. |

## ¿Cuando usar este patrón? 
- Cuando se necesitan crear objetos que tengan una interfaz común, pero que varíen en la implementación.
- Cuando se necesitan crear objetos que estén relacionados entre sí, como por ejemplo diferentes tipos de objetos que interactúan entre sí en un juego.
- Cuando se desea ocultar la complejidad de la creación de objetos al cliente, por ejemplo al crear diferentes implementaciones de un objeto a partir de una fábrica abstracta sin que el cliente necesite conocer los detalles de cada implementación.
- Cuando se desea cambiar dinámicamente la familia de objetos creados, lo que permite una mayor flexibilidad en el diseño del software.

En conclusion, el patrón Abstract Factory es útil en cualquier situación en la que se necesite crear familias de objetos relacionados entre sí y se quiera ocultar la complejidad de su creación y relación al cliente.

# Patrones estructurales <a name="patrones-estructurales"></a>
Son aquellos patrones que se enfocan en la composición de clases y objetos para formar estructuras más complejas. Se utilizan para crear relaciones entre clases y objetos de forma que puedan trabajar juntos de manera eficiente.

# Adapter <a name="adapter"></a>
El patrón de diseño Adapter se utiliza para adaptar una interfaz existente a otra interfaz requerida por el cliente, permitiendo que objetos con interfaces incompatibles trabajen juntos de manera efectiva.

El adaptador actúa como un puente entre dos interfaces, traduciendo una interfaz en términos que la otra puede entender y utilizar. Este patrón es muy útil cuando se utiliza código heredado o componentes de terceros que no pueden ser modificados para cumplir con los requisitos de la aplicación.

**Lo que debes saber sobre el patrón adapter**

- Propósito: El patrón Adapter se utiliza para convertir una interfaz incompatible en otra interfaz que el cliente espera. Permite que objetos con interfaces incompatibles puedan trabajar juntos.

- Estructura: El patrón Adapter consiste en tres componentes principales: el Adapter, el Adaptee y el Cliente. El Adaptee es la clase existente que necesitamos adaptar, el Adapter es la clase que adapta la interfaz del Adaptee a la interfaz requerida por el Cliente, y el Cliente es la clase que utiliza el Adapter para interactuar con el Adaptee.

- Tipos: Hay dos tipos de adaptadores, el adaptador de clase y el adaptador de objeto. El adaptador de clase utiliza la herencia para adaptar la interfaz del Adaptee a la interfaz del Cliente, mientras que el adaptador de objeto utiliza la composición para adaptar la interfaz del Adaptee a la interfaz del Cliente. Ambos tipos de adaptadores pueden ser útiles dependiendo del contexto de uso.

**Cuándo utilizar Adapter y Bridge en el diseño de software**

El patrón Adapter a menudo se compara con el patrón Bridge debido a que ambos involucran la idea de conectar dos componentes o sistemas diferentes. Sin embargo, mientras que el Adapter se enfoca en hacer que un objeto existente funcione con otro objeto incompatible, el Bridge se enfoca en desacoplar una abstracción de su implementación para que puedan variar de manera independiente.

| **Patrón** | **Adapter** | **Bridge** |
| --- | --- | --- |
| **Tipo de patrón** | Estructural | Estructural |
| **Propósito** | Convierte la interfaz de una clase en otra interfaz esperada por el cliente | Separa una abstracción de su implementación, de manera que ambas puedan variar independientemente |
| **Uso común** | Cuando se desea reutilizar una clase existente que no tiene la interfaz que el cliente requiere | Cuando se desea tener múltiples variantes de la misma abstracción que se pueden modificar y extender de forma independiente |
| **Componentes** | Adaptador, clase Adaptee, interfaz objetivo y cliente | Abstracción, implementación, clases refinadas y cliente |

<img width="398" alt="Screen Shot 2023-02-26 at 22 31 43" src="https://user-images.githubusercontent.com/16981896/221451920-663fb194-b098-4e37-bf22-d2e5943bb3d0.png">

**Posibles escenarios para usar el patrón Adapter**
- Cuando necesitas usar una clase existente que no es compatible con el resto del código, ya sea porque tiene una interfaz diferente o porque tiene un comportamiento diferente al esperado.
- Cuando necesitas reutilizar una clase existente en una nueva aplicación que tiene diferentes requisitos de interfaz.
- Cuando necesitas utilizar varias clases diferentes que tienen interfaces incompatibles en un solo lugar, como en una biblioteca o marco de trabajo.
- Cuando necesitas controlar o limitar el acceso a una clase existente, por ejemplo, para protegerla de cambios o para restringir su uso en un contexto específico.
- Cuando necesitas adaptar un servicio web o una API que tiene una interfaz incompatible con tu aplicación.

# Decorator <a name="decorator"></a>

También llamado _wrapper pattern_ es un patrón de diseño estructural altamente conocido. Este patrón nos permite extender comportamientos de forma dinámica, es decir permite agregar nuevos comportamientos y funcionalidades a objetos sin que estos alteren su estructura original.

**¿Por qué usarlo?**
- Si buscar aplicar el principio abierto-cerrado este patrón es una buena opción, ya que promueve la extensión sobre la modificación.
- Si busca aplicar el principio de responsabilidad única el patrón _decotator_ es una excelente opción, pues, este principio indica que una clase debería realizar una única cosa y es lo que hace este patrón, los decoradores son colocados en clases separadas y que esta envuelva a la clase original.

<img width="926" alt="Screen Shot 2022-11-28 at 22 19 59" src="https://user-images.githubusercontent.com/16981896/204414934-9a5f3dfd-c735-4e69-b3bc-7e2fc64e2a56.png">

**Definición de cada elemento**

- **Component:** acá se describen los comportamientos de los componentes y es lo que permite que tanto el objeto como los objetos envueltos se consideren del mismo tipo.
- **Concrete component:** implementa la interfaz del componente.
- **Decorator:** es una clase abstracta que también implementa la interfaz del componente y también posee una instancia de esta interfaz.
- **Concrete decorator:** es una subclase de la clase abstracta Decorator donde se establecen los comportamientos para los objetos proporcionados.

| Elemento | Descripción |
| --- | --- |
| Component | Define la interfaz de los objetos que pueden tener responsabilidades añadidas dinámicamente. |
| Concrete componen | Es el objeto real al que se le pueden añadir responsabilidades adicionales dinámicamente. |
| Decorator | Mantiene una referencia al componente y define una interfaz que se ajusta a la del componente. |
| Concrete decorator | Añade responsabilidades adicionales al componente concreto. |

**Uso**
El patrón Decorator se puede utilizar en muchas situaciones, como en la creación de interfaces gráficas de usuario, donde se pueden agregar funcionalidades adicionales a los componentes existentes, como etiquetas, botones y cuadros de texto. También se puede utilizar en la creación de filtros de imágenes, donde se pueden agregar efectos adicionales a las imágenes base.

# Facade <a name="facade"></a>
Imagina que deseas implementar un sistema de seguridad en tu casa que contengas subsistemas como por ejemplo: un sistema de alarma, sistema de sensores, sistema de camara de vigilancia en entre otros. El dueño de la casa necesita de una interfaz simple, comoda y facil de usar  para interactuar con estos subsistema y mantener su hogar seguro, aqui es que aparace el patron Facade, el usuario no tiene la necesidad de  saber todo lo complejo o lo que ocurre en cada subsistema para poder funcionar.

**Definición**
Definido como una patron de diseño estructural permite ocultar la complejidad de un subsistema esto por medio de una interfaz bastate simple. Esto nos ayuda a poder interactura con el sistema de forma más sencilla sin tener que procuparnos de lo que sucede por detras.

 **¿Qué puedo hacer con Facade?**
- Ocultar la complejidad: podemos ocultar lo complejo de un sistema por medio una una interdaz facil de usar. 
- Interfaz Única: Proporcionando dicha interfaz unica que nos permite que sea facil de interacturar con el sistema complejo.
- Reutilizar: permite la reutilización de los componentes dentro del mismo sistema.
- Seguridad: ya que se ocultan los detalles técnicos o internos de un sistema y solo se hace uso de la interfaz que proporciona asegura que solo se limite la interaccion a travez de esta interfaz.
- Bajo acoplamiento: con este patrón se evita que las clases **Client** esta acopladas las clases del subsistema de forma directa esto permite actualizarlas, modificarlas y hasta cambiarlas y no afectara el comportamiento del Client.

<img width="640" alt="Screen Shot 2023-01-26 at 21 23 28" src="https://user-images.githubusercontent.com/16981896/214979850-7e7f305d-6ce1-4659-847b-eb985894e971.png">

### Deninición de cada elemento
| Elemento | Descripción |
| --- | --- |
| Facade | Proporciona una interfaz unificada para un conjunto de interfaces en un subsistema. |
| SubSystem | Un conjunto de clases que trabajan juntas para realizar una tarea específica. |
| Client | Interactúa con el subsistema a través de la interfaz proporcionada por la fachada. |

# Composite <a name="comoposite"></a>

Imagina que en un árbol genealógico hay varios individuos que representan objetos simples y complejos. Por ejemplo una persona puede considerarse como un objeto simple mientras que una familia entera es un objeto complejo que a su vez contiene a varias personas. Si quieres calcular la cantidad de personas individuales incluyendo a las familias dentro de este árbol genealógico, se puede hacer uso de una interfaz común para todos los objetos así se trata tanto a los objetos simples como complejos de la misma manera.

**Definición**
El patrón Composite define una forma bastante eficaz de modelar estructuras jerárquicas y tratar a los objetos simple como complejos de la misma forma es decir de forma uniforme.

**¿Por qué elegir este patrón?**
- Abstracción: permite abstraer los detalles de implementación de los objetos simple y complejos, facilitando de esta forma la mantebilidad y escabilidad del código.
- Reutilización del código: definiendo una única interfaz para todos se puede reutilizar para objetos simples y complejos.
- Flexibilidad : con este patron puede quitar o agregar objetos en tiempo de ejecución sin ningun problema, lo que permite ajustar la estructura en uso egun las necesidades.

**Uso**
- Interfaces: para crear una estructura de componentes que represente la interfaz de usuario, menú, botones, formularios, etc.
- Arboles de direcciones: se puede utilizar para modelar estructuras de directorios de archivos.
- Juegos: se utiliza para crear estructuras de objetos en juegos como son niveles, personales, objetos, etc.

Cualquier sistema que requiera una modelación de estructura jerarjicas se puede beneficiar de este patron lo que facilita mucho el diseño y la implementación del código.

<img width="586" alt="Screen Shot 2023-02-05 at 18 13 22" src="https://user-images.githubusercontent.com/16981896/216846482-cd44a469-ab95-4634-9f12-777ad1462bb6.png">

**Definición de cada elemento**
- Component: define todos los metodos comunes que deben ser implementados por los componentes o objetos (simples o complejos).
- Leaf: esta clase implementa la interfaz Component y representa un objetos terminal. Terminal se refieres a que este un objeto es el ultimo nicel de estructura y no se puede subdivir en partes mas pequeñas.
- Composite: es una clase que implementa la interfaz Component y a diferencia de Leaf esta puede contener mas componente dentro de él.

| Elemento     | Descripción                                                  |
| ------------ | ------------------------------------------------------------ |
| Component    | Define la interfaz para los objetos en la estructura de objetos. |
| Leaf         | Representa los objetos hoja en la estructura de objetos. Leaf no tiene sub-elementos. |
| Composite    | Define el comportamiento para los componentes que tienen hijos. Almacena componentes hijos. |
| Cliente      | Manipula los objetos en la estructura de objetos a través de la interfaz Component. |


# Patrones de comportamiento<a name="comportamiento"></a>
son aquellos patrones que se centran en la comunicación entre objetos, en lugar de la composición de los mismos. Se utilizan para gestionar algoritmos, relaciones y responsabilidades entre los objetos.

# Command <a name="command"></a>
Para entender el patrón Command es pensar en un control remoto de televisión. El control remoto es un objeto que te permite enviar comandos a la televisión sin saber cómo funciona exactamente. Solo necesitas presionar el botón "encender" y la televisión se encenderá, sin importar cómo se implemente esa funcionalidad en la televisión.

**Definición**
De la misma manera, el patrón Command te permite encapsular un comando como un objeto independiente de su implementación, de manera que puedas invocar el comando sin necesidad de conocer los detalles de cómo se implementa. En lugar de tener que conocer el funcionamiento interno de una función o método, puedes simplemente llamar al objeto de comando correspondiente y este se encargará de ejecutar el comando adecuado.

Es un patron de comportamiento, nos permite desacoplar las acciones de los objetos, es decir del objeto que solicita realizar una acción del que realizará dicha acción. Convierte las solicitudes o operaciones en objetos.

**Aspectos claves del patrón Command**

- El patrón Command se enfoca en encapsular una petición o acción en un objeto independiente de la petición misma, permitiendo su ejecución en distintos momentos. Es decir, separa la petición de quién la ejecuta y cómo se ejecuta.

- El patrón Command se compone de cuatro elementos: el receptor, el comando, el invocador y el cliente. El receptor es el objeto que recibe la petición, el comando es el objeto que encapsula la petición, el invocador es el objeto que ejecuta la petición, y el cliente es el objeto que crea y configura los objetos Command para ejecutar las distintas acciones.

- El patrón Command es especialmente útil en situaciones donde se requiere la capacidad de deshacer acciones o la implementación de historiales de acciones. Al encapsular cada acción en un objeto, es posible deshacer o rehacer cualquier acción ejecutada en el pasado, o incluso mantener un historial de las acciones realizadas para su posterior análisis.

<img width="762" alt="Screen Shot 2022-12-29 at 00 32 57" src="https://user-images.githubusercontent.com/16981896/209899863-65076852-3b57-4451-bb62-edae0e635d5f.png">

**El patrón de diseño Command se puede implementar siguiendo los siguientes pasos:**

1. Define la interfaz de comando: Define una interfaz común para todos los comandos, que debería tener un método ejecutar().
2. Crea clases concretas de comando: Crea clases que implementen la interfaz de comando para cada tipo de comando que necesites en tu aplicación.
3. Define la clase invocadora: Define una clase invocadora que tenga una referencia a la interfaz de comando y un método para establecer el comando actual.
4. Crea objetos de comando: Crea objetos de comando concretos y configúralos con la clase invocadora.
4. Ejecuta los comandos: Llama al método ejecutar() en el objeto de comando para ejecutar la operación asociada al comando.

**Mejorando la escalabilidad del código con el patrón Command:**

- Desacoplamiento: Al utilizar el patrón Command, puedes desacoplar los objetos que envían comandos de los objetos que los ejecutan, lo que significa que puedes agregar nuevos comandos sin tener que cambiar el código que los envía.

- Flexibilidad: Con el patrón Command, puedes crear comandos genéricos que puedan ser reutilizados en diferentes partes de tu código. Esto significa que puedes crear una amplia gama de comandos para diferentes propósitos y reutilizarlos en diferentes partes de tu código.

- Fácil extensibilidad: El patrón Command facilita la extensión de nuevas funcionalidades en tu código. Al agregar nuevos comandos, puedes proporcionar nuevas funcionalidades a tu aplicación sin tener que cambiar el código existente.

# Iterator <a name="iterator"></a>

Estas de vacaciones por Roma y quieres visitar varios sitios como por ejemplo: el Coliseo Romano, la Fontana de Trevi, El Vaticano, etc para ello contratas un chofer esto, para que sea mucho más fácil y cómodo visitar cada uno de estos lugares. En este caso el conductor o chofer hace de Iterator y cada uno de los lugares actúan como los elementos a recorrer, ya que el chofer sabe como llegar a cada destino y como acceder a cada uno de ellos. El cliente que usa el Iterator no se preocupa de que forma ni como hace el recorrido.

**Definicíon**
El patrón Iterator provee una forma bastante estandar de acceder a los elementos de una colección sin exponer su representación interna, lo hace recorriendo una colección y devuelve elemento por elemento es decir uno a uno.

**Ventajas de su uso**
- Abtracción: permite abstraer la implementación de la estructura de los datos subyacentes y provee una forma facil de acceder a los datos.
- Encapsulamiento: proteje los detalles de implementación de la estrcutura de datos al proveer una interfaz para acceder a los datos.
- Reutilización: permite reeutilizar la logica de iteración en diferentes estrcuturas de datos, sin la necesidad de duplicar código.

<img width="860" alt="Screen Shot 2023-01-29 at 21 56 18" src="https://user-images.githubusercontent.com/16981896/215366940-d573607a-7113-4b55-be3f-0e6febcb4977.png">

### Deninición de cada elemento

| Elemento | Descripción |
| --- | --- |
| Iterator | Define una interfaz para acceder y recorrer elementos de una colección. |
| ConcreteIterator | Implementa la interfaz del Iterator para almacenar el estado actual de la posición del recorrido en la colección. |
| Aggregate | Define una interfaz para crear un objeto que contenga una colección de elementos y su iterador. |
| ConcreteAggregate | Implementa la interfaz del Aggregate para crear y devolver una instancia de ConcreteIterator. |

**Lo que debes saber**
El patrón Iterator es una manera simple y eficiente de recorrer elementos de una colección sin tener que conocer su estructura interna. Permite recorrer la colección de muchas maneras diferentes.

# Observer <a name="observer"></a>

Permite a los objetos interesados en el estado de otro objeto recibir actualizaciones automáticamente sin tener que solicitarlas activamente. Esto puede ser útil en muchas situaciones, como en la actualización automática de una interfaz de usuario cuando se produce un cambio en los datos subyacentes.

**¿Dónde puedo aplicarlo?**
En general, el patrón Observer es útil en cualquier situación en la que se necesite mantener sincronizados varios objetos que dependen del estado de un objeto sujeto. Por ejemplo:

- Actualización de datos: El patrón Observer se utiliza a menudo en sistemas que necesitan actualizar los datos en tiempo real. Por ejemplo, en un sistema de seguimiento de flotas, se pueden tener varios vehículos que necesitan ser monitoreados constantemente en términos de su ubicación, estado y otras variables.
- Sistema de notificaciones: En este caso, el objeto sujeto podría ser una conversación entre dos usuarios, y los objetos observadores podrían ser los usuarios que participan en esa conversación. Cuando uno de los usuarios envía un mensaje en la conversación, el patrón Observer notifica automáticamente a los otros usuarios que están participando en la conversación.
-Int erfaces de usuario: El patrón Observer es muy utilizado en interfaces de usuario para mantener sincronizados los datos del modelo y la vista. Cuando se produce un cambio en el modelo, se notifica automáticamente a la vista para que se actualice.

<img width="620" alt="Screen Shot 2022-11-25 at 22 26 06" src="https://user-images.githubusercontent.com/16981896/204067296-8b8fcdd8-9e90-4e77-895a-6e7cd81ce5f5.png">

**Definición de cada elemento**

- **Subject:** es el objeto que contiene el estado y notifica a los observadores cuando el estado cambia. El sujeto mantiene una lista de todos los observadores interesados en ser notificados..
- **Observer:** es el objeto que desea recibir notificaciones sobre cambios en el estado del sujeto. Los observadores se registran en el sujeto para recibir notificaciones.
- **ConcreteSubject:** registra a todos los observadores, y envia las notificaciones correspondientes a los subcriptores.
- **ConcreteObserver:** mantiene una relación con el Observer para mostrar dichos cambios emitido por el Concrete Subject.

**Ventajas de su uso**

- Desacoplamiento: El patrón Observer se utiliza para desacoplar el sujeto (objeto que notifica) y los observadores (objetos que reciben la notificación). Esto significa que el sujeto y los observadores no tienen que conocer la existencia del otro. El sujeto simplemente notifica a los observadores interesados sin preocuparse por cómo se manejan las notificaciones en cada observador.

- Escalabilidad: El patrón Observer es escalable, lo que significa que se pueden agregar o eliminar observadores fácilmente sin afectar el sujeto o los otros observadores. Los nuevos observadores pueden registrarse para recibir notificaciones y los observadores existentes pueden cancelar su registro sin afectar el funcionamiento general del patrón Observer.

- Flexibilidad: El patrón Observer es flexible, lo que significa que se puede implementar en diferentes tipos de aplicaciones y con diferentes tipos de lenguajes de programación. Este patrón se utiliza en aplicaciones web, aplicaciones móviles, juegos y sistemas embebidos, por nombrar algunos ejemplos. Además, se puede implementar en diferentes lenguajes de programación como Java, Python, C++, entre otros.

**Uso**
El patrón Observer es muy útil en el desarrollo de aplicaciones móviles en Kotlin, ya que permite una comunicación en tiempo real entre los distintos componentes de la aplicación, como ViewModel y Vista, por ejemplo. La implementación del patrón Observer en Kotlin es sencilla y flexible, lo que lo hace una excelente opción para aplicaciones móviles.


# State<a name="state"></a>

Este patron es util para manejar comportamiento diferentes de un objeto en funcion de su estado actual lo que ayuda mucho a mejorar la legibilidad y mantebilidad del códio.

Para entender un poco mas este patron imagina que estas usando un maquina expendedora de bebidas, esta maquina puede estar en un estado determinado en un momento determinado, estos estados podrian ser por ejemplo: "esperando ingreso de efectivo", "expediendo bebida", "mostrar un mensaje de error". Con esto, podemos entender que los objetos de un programa pueden tener varios estados y comportamientas asociados a esos estados. Si cambia de un estado a otro el comportamiento tambien cambia.

#### Aplicaciones
- Sistemas de pagos : por ejemplo un sistema de pagos puede manejar estado de "procesando", "exitoso" "rechazado", "error", "pendiente", entre otros, con el uso del patron State podmeos definir y modelar el compartamiento de cada uno de ellos, ya que son bastante flexibles podemos agrgar tanto nuevos estados como comportamiento sin afectar el sistema completo.
- Maquina expendedora.
- Juegos.

#### Commo comenzar a aplicar el patron State?

1. Lo primero que debemos hacer es identificar los diferentes estados que puede tener el objeto, se debe definir una clase para cada uno de ellos. Importante definir una clase comun para cada una de las clases para garantizar que cada uno de ellas implemente los metodos.
2. Se debe difinir una clase Context que representa el objeto al que se le van a cambiar los estados, que debe mantener una referencia a una clase de estado inicial.
3. La clase Context debe implementar los metodos que le permitiran cambiar de estado.
4. En cada uno de las clases de estado debe defininir la logica correspondiente.

<img width="503" alt="Screen Shot 2023-02-12 at 20 10 12" src="https://user-images.githubusercontent.com/16981896/218342930-6b872d53-3d78-4155-b0b8-cf946ab8fd83.png">

#### Definición de cada elemento

- Context: posee un estado y se comportande de acuerdo a ese estado.
- State: es la interfaz que posee los metodos donde cada clase de estado debe implementar y asi definir el comportamiendo requerido.
- Concrete State: son las clases que representan los diferentes estados y deben implemnetar la interfaz State.

#### Beneficios de usar este patron
- Simplicidad: permite tener una logica bastante separada para cada estado lo que hace que sea mucho mas facil de entender y mantener.
- Flixibilidad: al tener la logica separada para cada estado, podemos de forma rapida y sencilla agragr nuevos estado sy comportamientos sin tener que cambiar la logica del objeto orincipal.
- Organizacion: al mantener las clases separadas de cada estado, esto permite tener un codigo mas organizado y facil de entenderlo que haces mas simple su mantenimiento y depuración.

# Strategy <a name="strategy"></a>

El patrón **Strategy** se puede entender como tener diferentes herramientas en un kit de herramientas. Cada herramienta tiene una función específica, pero todas se pueden utilizar para realizar una tarea similar, como arreglar una bicicleta. Dependiendo de la tarea que necesites realizar en la bicicleta, puedes elegir la herramienta adecuada para el trabajo.

De manera similar, el patrón **Strategy** se utiliza para proporcionar diferentes algoritmos o estrategias para realizar una tarea particular. Cada estrategia es una clase que implementa una interfaz común, lo que permite que las estrategias sean intercambiables. El contexto utiliza una de las estrategias para realizar la tarea según sea necesario.

![Diagrama de clase del patrón Strategy](https://user-images.githubusercontent.com/16981896/203886974-3f4e40cc-74d9-432f-8f65-5f4d77d8daaf.png)

- **Strategy:** es una interfaz que es extendida por los diferentes algoritmos. Donde el **Contexto** puede llamarla por medio de un **ConcreteStrategy** dentro de ella se define uno o varios métodos que serán utilizados por los algoritmos dentro de los **ConcreteStrategy**.
- **Context:** mantiene una referencia de Strategy y selecciona que tipo ConcreteStrategy utilizar.
- **ConcreteStrategy:** implemente la interfaz Strategy y desarrolla el algoritmo.

### Casos de uso comunes del patrón Strategy

- Clasificación: En una aplicación de clasificación, se pueden tener diferentes estrategias para ordenar los datos, como ordenarlos alfabéticamente, por fecha, por tamaño, etc.
- Autenticación: Un sistema de autenticación puede tener diferentes estrategias para validar la identidad del usuario, como autenticación basada en contraseñas, autenticación basada en tokens, autenticación biométrica, etc.
- Compresión de datos: En una aplicación de compresión de datos, se pueden tener diferentes estrategias para comprimir los datos, como la compresión sin pérdida, la compresión con pérdida, etc.
- Algoritmos de búsqueda: Un algoritmo de búsqueda puede tener diferentes estrategias para buscar los datos, como búsqueda en profundidad, búsqueda en amplitud, búsqueda en línea recta, etc.

### Ventajas
- Flexibilidad: El patrón Strategy permite cambiar el comportamiento de un objeto en tiempo de ejecución. Esto significa que puedes cambiar la estrategia utilizada por un objeto en cualquier momento sin tener que modificar el objeto en sí.

- Reutilización de código: Cada estrategia puede ser reutilizada en diferentes contextos, lo que significa que puedes aprovechar el mismo código en diferentes partes de una aplicación.

- Fácil mantenimiento: Como cada estrategia está encapsulada en su propia clase, el patrón Strategy hace que el mantenimiento del código sea mucho más fácil y claro.

- Desacoplamiento: El patrón Strategy separa la lógica de negocio del código que la utiliza, lo que permite una mayor flexibilidad en el diseño y evita un acoplamiento innecesario entre objetos.

### Desventajas
- Aumento de complejidad: A medida que se agregan más estrategias, la complejidad del código aumenta, lo que puede dificultar la comprensión y el mantenimiento.

- Aumento de la cantidad de clases: Cada estrategia se define en su propia clase, lo que puede resultar en una mayor cantidad de clases y archivos en el proyecto.

- Dificultad para elegir la estrategia correcta: Con múltiples estrategias disponibles, puede resultar difícil seleccionar la estrategia correcta para una tarea específica. Esto puede requerir un análisis adicional y puede llevar a una mayor complejidad en el diseño del programa.


# Template Method <a name="template"></a>

Suponga que es su primer dia en una pizzeria, sus compañeros cada dia crean diferentes tipos de pizzas Margarita, vegetariana, Peperoni, etc, donde cada una de ellos siguen el mismo proceso general que es mezclar los ingredientes para la masa, amasar, colococarlos los topping y hornear sin embargo cada tipo de pizza varian un poco en sus ingredientes o tiempo de cocción, el patron template es similar proporciona una estructura para un proceso o algoritmo pero permite que detalles especifcos sean implementados por las subclases.

### Ventajas
- **Abtracción:** gracias a este patrón podemos abstraer la logica de un algoritmo de sus implementación especifica.
- **Modificable:** permite hacer cambios sobre un algoritmo en especifico sin tener que cambiar el código existente.
- **Adaptable:** haciendo uso de este patrón podemos crear jerarquias de clases que se adapten a diferentes escenarios sin la necesidad de escribir código adicional. 

<img width="702" alt="Screen Shot 2023-01-27 at 20 24 03" src="https://user-images.githubusercontent.com/16981896/215224371-b0c34171-8b25-4ac3-8520-72977e074c8a.png">


## GUIA
![guia_uml](https://user-images.githubusercontent.com/16981896/204416505-99a97310-5096-4677-8fe5-cfeb7815d002.png)


referencias:
- https://en.proft.me/2016/09/20/factory-design-pattern-java-and-python/


