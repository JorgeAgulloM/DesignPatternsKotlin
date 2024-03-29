## Diseño de patrones

Los patrones de diseño son soluciones habituales a problemas que ocurren con frecuencia en el diseño de software. Son como planos prefabricados que se pueden personalizar para resolver un problema de diseño recurrente en tu código.

Información completa en: <a href="https://refactoring.guru/es/design-patterns">https://refactoring.guru</a>

<hr>

###### Ejemplos desarrollados con Kotlin

## Patrones creacionales

#### Patrón Singleton
##### Propósito
Singleton es un patrón de diseño creacional que nos permite asegurarnos de que una clase tenga una única instancia, a la vez que proporciona un punto de acceso global a dicha instancia.

- Más info: <a href="https://refactoring.guru/es/design-patterns/singleton">Patrón Singleton</a>

- <a href="https://github.com/JorgeAgulloM/DesignPatternsKotlin/blob/main/app/src/main/java/com/softyorch/designpatterns/creational/Singelton.kt">Ejemplo</a> simple con código Kotlin

- Esquema UML:

<img height="45%" width="auto" src ="https://refactoring.guru/images/patterns/diagrams/singleton/structure-es.png">

<hr>

#### Patrón Builder
##### Propósito
Builder es un patrón de diseño creacional que nos permite construir objetos complejos paso a paso. El patrón nos permite producir distintos tipos y representaciones de un objeto empleando el mismo código de construcción. 

- Más info: <a href="https://refactoring.guru/es/design-patterns/builder">Patrón Builder</a>

- <a href="https://github.com/JorgeAgulloM/DesignPatternsKotlin/tree/main/app/src/main/java/com/softyorch/designpatterns/creational/builder">Ejemplo</a> simple con código Kotlin

- Esquema UML:

<img height="45%" width="auto" src ="https://refactoring.guru/images/patterns/diagrams/builder/structure.png">

<hr>

#### Patrón Factory Method
##### Propósito
Factory Method es un patrón de diseño creacional que proporciona una interfaz para crear objetos en una superclase, mientras permite a las subclases alterar el tipo de objetos que se crearán.

- Más info: <a href="https://refactoring.guru/es/design-patterns/factory-method">Patrón Factory Method</a>

- <a href="https://github.com/JorgeAgulloM/DesignPatternsKotlin/tree/main/app/src/main/java/com/softyorch/designpatterns/creational/factoryMethod">Ejemplo</a> simple con código Kotlin

- Esquema UML:

<img height="45%" width="auto" src ="https://refactoring.guru/images/patterns/diagrams/factory-method/structure-indexed.png?id=4c603207859ca1f939b17b60a3a2e9e0">

<hr>

#### Patrón Prototype
##### Propósito
Prototype es un patrón de diseño creacional que nos permite copiar objetos existentes sin que el código dependa de sus clases.

- Más info: <a href="https://refactoring.guru/es/design-patterns/prototype">Patrón Prototype</a>

- <a href="https://github.com/JorgeAgulloM/DesignPatternsKotlin/tree/main/app/src/main/java/com/softyorch/designpatterns/creational/pototype">Ejemplo</a> simple con código Kotlin

- Esquema UML:

<img height="45%" width="auto" src ="https://refactoring.guru/images/patterns/diagrams/prototype/structure-indexed.png">

<hr>

## Patrones estructurales

#### Patrón Adapter
##### Propósito
Adapter es un patrón de diseño estructural que permite la colaboración entre objetos con interfaces incompatibles.

- Más info: <a href="https://refactoring.guru/es/design-patterns/adapter">Patrón Adapter</a>

- <a href="https://github.com/JorgeAgulloM/DesignPatternsKotlin/tree/main/app/src/main/java/com/softyorch/designpatterns/structuralPatterns/adapter">Ejemplo</a> simple con código Kotlin

- Esquema UML:

<img height="45%" width="auto" src ="https://refactoring.guru/images/patterns/diagrams/adapter/structure-object-adapter-indexed.png?id=a20b311948b361a058097e5bcdbf067a">

<hr>

#### Patrón Bridge
##### Propósito
Bridge es un patrón de diseño estructural que te permite dividir una clase grande, o un grupo de clases estrechamente relacionadas, en dos jerarquías separadas (abstracción e implementación) que pueden desarrollarse independientemente la una de la otra.

- Más info: <a href="https://refactoring.guru/es/design-patterns/bridge">Patrón Bridge</a>

- <a href="https://github.com/JorgeAgulloM/DesignPatternsKotlin/tree/main/app/src/main/java/com/softyorch/designpatterns/structuralPatterns/bridge">Ejemplo</a> simple con código Kotlin

- Esquema UML:

<img height="45%" width="auto" src ="https://refactoring.guru/images/patterns/diagrams/bridge/structure-es-indexed.png">

<hr>

#### Patrón Composite
##### Propósito
Composite es un patrón de diseño estructural que te permite componer objetos en estructuras de árbol y trabajar con esas estructuras como si fueran objetos individuales.

- Más info: <a href="https://refactoring.guru/es/design-patterns/composite">Patrón Composite</a>

- <a href="https://github.com/JorgeAgulloM/DesignPatternsKotlin/tree/main/app/src/main/java/com/softyorch/designpatterns/structuralPatterns/composite">Ejemplo</a> simple con código Kotlin

- Esquema UML:

<img height="45%" width="auto" src ="https://refactoring.guru/images/patterns/diagrams/composite/structure-es-indexed.png">

<hr>

#### Patrón Decorator
##### Propósito
Decorator es un patrón de diseño estructural que te permite añadir funcionalidades a objetos colocando estos objetos dentro de objetos encapsuladores especiales que contienen estas funcionalidades.

- Más info: <a href="https://refactoring.guru/es/design-patterns/decorator">Patrón Decorator</a>

- <a href="https://github.com/JorgeAgulloM/DesignPatternsKotlin/tree/main/app/src/main/java/com/softyorch/designpatterns/structuralPatterns/decorator">Ejemplo</a> simple con código Kotlin

- Esquema UML:

<img height="45%" width="auto" src ="https://refactoring.guru/images/patterns/diagrams/decorator/structure-indexed.png">

<hr>

#### Patrón Facade
##### Propósito
Facade es un patrón de diseño estructural que proporciona una interfaz simplificada a una biblioteca, un framework o cualquier otro grupo complejo de clases.

- Más info: <a href="https://refactoring.guru/es/design-patterns/facade">Patrón Facade</a>

- <a href="https://github.com/JorgeAgulloM/DesignPatternsKotlin/tree/main/app/src/main/java/com/softyorch/designpatterns/structuralPatterns/facade">Ejemplo</a> simple con código Kotlin

- Esquema UML:

<img height="45%" width="auto" src ="https://refactoring.guru/images/patterns/diagrams/facade/structure-indexed.png">

<hr>

#### Patrón Flyweight
##### Propósito
Flyweight es un patrón de diseño estructural que te permite mantener más objetos dentro de la cantidad disponible de RAM compartiendo las partes comunes del estado entre varios objetos en lugar de mantener toda la información en cada objeto.

- Más info: <a href="https://refactoring.guru/es/design-patterns/flyweight">Patrón Flyweight</a>

- <a href="https://github.com/JorgeAgulloM/DesignPatternsKotlin/tree/main/app/src/main/java/com/softyorch/designpatterns/structuralPatterns/flyweight">Ejemplo</a> simple con código Kotlin

- Esquema UML:

<img height="45%" width="auto" src ="https://refactoring.guru/images/patterns/diagrams/flyweight/structure-indexed.png">

<hr>

#### Patrón Proxy
##### Propósito
Proxy es un patrón de diseño estructural que te permite proporcionar un sustituto o marcador de posición para otro objeto. Un proxy controla el acceso al objeto original, permitiéndote hacer algo antes o después de que la solicitud llegue al objeto original.

- Más info: <a href="https://refactoring.guru/es/design-patterns/proxyhttps://refactoring.guru/es/design-patterns/proxy">Patrón Proxy</a>

- <a href="https://github.com/JorgeAgulloM/DesignPatternsKotlin/tree/main/app/src/main/java/com/softyorch/designpatterns/structuralPatterns/proxy">Ejemplo</a> simple con código Kotlin

- Esquema UML:

<img height="45%" width="auto" src ="https://refactoring.guru/images/patterns/diagrams/proxy/structure-indexed.png">

<hr>

## Patrones de comportamiento

#### Patrón Chain of Responsibility
##### Propósito
Chain of Responsibility es un patrón de diseño de comportamiento que te permite pasar solicitudes a lo largo de una cadena de manejadores. Al recibir una solicitud, cada manejador decide si la procesa o si la pasa al siguiente manejador de la cadena.

- Más info: <a href="https://refactoring.guru/es/design-patterns/chain-of-responsibility">Patrón Chain of Responsibility</a>

- <a href="https://github.com/JorgeAgulloM/DesignPatternsKotlin/tree/main/app/src/main/java/com/softyorch/designpatterns/behaviour/chainOfResponsibility">Ejemplo</a> simple con código Kotlin

- Esquema UML:

<img height="45%" width="auto" src ="https://refactoring.guru/images/patterns/diagrams/chain-of-responsibility/structure-indexed.png">

<hr>

#### Patrón Command
##### Propósito
Command es un patrón de diseño de comportamiento que convierte una solicitud en un objeto independiente que contiene toda la información sobre la solicitud. Esta transformación te permite parametrizar los métodos con diferentes solicitudes, retrasar o poner en cola la ejecución de una solicitud y soportar operaciones que no se pueden realizar.

- Más info: <a href="https://refactoring.guru/es/design-patterns/command">Patrón Command</a>

- <a href="https://github.com/JorgeAgulloM/DesignPatternsKotlin/tree/main/app/src/main/java/com/softyorch/designpatterns/behaviour/command">Ejemplo</a> simple con código Kotlin

- Esquema UML:

<img height="45%" width="auto" src ="https://refactoring.guru/images/patterns/diagrams/command/structure-indexed.png">

<hr>

#### Patrón Iterator
##### Propósito
Iterator es un patrón de diseño de comportamiento que te permite recorrer elementos de una colección sin exponer su representación subyacente (lista, pila, árbol, etc.).

- Más info: <a href="https://refactoring.guru/es/design-patterns/iterator">Patrón Iterator</a>

- <a href="https://github.com/JorgeAgulloM/DesignPatternsKotlin/tree/main/app/src/main/java/com/softyorch/designpatterns/behaviour/iterator">Ejemplo</a> simple con código Kotlin

- Esquema UML:

<img height="45%" width="auto" src ="https://refactoring.guru/images/patterns/diagrams/iterator/structure-indexed.png">

<hr>

#### Patrón Mediator
##### Propósito
Mediator es un patrón de diseño de comportamiento que te permite reducir las dependencias caóticas entre objetos. El patrón restringe las comunicaciones directas entre los objetos, forzándolos a colaborar únicamente a través de un objeto mediador.

- Más info: <a href="https://refactoring.guru/es/design-patterns/mediator">Patrón Mediator</a>

- <a href="https://github.com/JorgeAgulloM/DesignPatternsKotlin/tree/main/app/src/main/java/com/softyorch/designpatterns/behaviour/mediator">Ejemplo</a> simple con código Kotlin

- Esquema UML:

<img height="45%" width="auto" src ="https://refactoring.guru/images/patterns/diagrams/mediator/structure-indexed.png">

<hr>

#### Patrón Memento
##### Propósito
Memento es un patrón de diseño de comportamiento que te permite guardar y restaurar el estado previo de un objeto sin revelar los detalles de su implementación.

- Más info: <a href="https://refactoring.guru/es/design-patterns/memento">Patrón Memento</a>

- <a href="https://github.com/JorgeAgulloM/DesignPatternsKotlin/tree/main/app/src/main/java/com/softyorch/designpatterns/behaviour/memento">Ejemplo</a> simple con código Kotlin

- Esquema UML:

<img height="45%" width="auto" src ="https://refactoring.guru/images/patterns/diagrams/memento/structure2-indexed.png">

##### Modelo de acceso más restrictivo

- <a href="https://github.com/JorgeAgulloM/DesignPatternsKotlin/tree/main/app/src/main/java/com/softyorch/designpatterns/behaviour/memento/restrictiveExample">Ejemplo</a> simple con código Kotlin

- Esquema UML:

<img height="45%" width="auto" src ="https://refactoring.guru/images/patterns/diagrams/memento/structure3-indexed.png">

<hr>

#### Patrón Observer
##### Propósito
Observer es un patrón de diseño de comportamiento que te permite definir un mecanismo de suscripción para notificar a varios objetos sobre cualquier evento que le suceda al objeto que están observando.

- Más info: <a href="https://refactoring.guru/es/design-patterns/observer">Patrón Observer</a>

- <a href="https://github.com/JorgeAgulloM/DesignPatternsKotlin/tree/main/app/src/main/java/com/softyorch/designpatterns/behaviour/observer">Ejemplo</a> simple con código Kotlin

- Esquema UML:

<img height="45%" width="auto" src ="https://refactoring.guru/images/patterns/diagrams/observer/structure-indexed.png">

<hr>

#### Patrón State
##### Propósito
State es un patrón de diseño de comportamiento que permite a un objeto alterar su comportamiento cuando su estado interno cambia. Parece como si el objeto cambiara su clase.

- Más info: <a href="https://refactoring.guru/es/design-patterns/state">Patrón State</a>

- <a href="https://github.com/JorgeAgulloM/DesignPatternsKotlin/tree/main/app/src/main/java/com/softyorch/designpatterns/behaviour/state">Ejemplo</a> simple con código Kotlin

- Esquema UML:

<img height="45%" width="auto" src ="https://refactoring.guru/images/patterns/diagrams/state/structure-es-indexed.png">

<hr>

#### Patrón Strategy
##### Propósito
Strategy es un patrón de diseño de comportamiento que te permite definir una familia de algoritmos, colocar cada uno de ellos en una clase separada y hacer sus objetos intercambiables.

- Más info: <a href="https://refactoring.guru/es/design-patterns/strategy">Patrón Strategy</a>

- <a href="https://github.com/JorgeAgulloM/DesignPatternsKotlin/tree/main/app/src/main/java/com/softyorch/designpatterns/behaviour/strategy">Ejemplo</a> simple con código Kotlin

- Esquema UML:

<img height="45%" width="auto" src ="https://refactoring.guru/images/patterns/diagrams/strategy/structure-indexed.png">

<hr>

#### Patrón Template Method
##### Propósito
Template Method es un patrón de diseño de comportamiento que define el esqueleto de un algoritmo en la superclase pero permite que las subclases sobrescriban pasos del algoritmo sin cambiar su estructura.

- Más info: <a href="https://refactoring.guru/es/design-patterns/template-method">Patrón Template Method</a>

- <a href="https://github.com/JorgeAgulloM/DesignPatternsKotlin/tree/main/app/src/main/java/com/softyorch/designpatterns/behaviour/templateMethod">Ejemplo</a> simple con código Kotlin

- Esquema UML:

<img height="45%" width="auto" src ="https://refactoring.guru/images/patterns/diagrams/template-method/structure-indexed.png?id=4ced6107519bc66710d2f05c0f4097a1">

<hr>

#### Patrón Visitor
##### Propósito
Visitor es un patrón de diseño de comportamiento que te permite separar algoritmos de los objetos sobre los que operan.

- Más info: <a href="https://refactoring.guru/es/design-patterns/visitor">Patrón Visitor</a>

- <a href="https://github.com/JorgeAgulloM/DesignPatternsKotlin/tree/main/app/src/main/java/com/softyorch/designpatterns/behaviour/visitor">Ejemplo</a> simple con código Kotlin

- Esquema UML:

<img height="45%" width="auto" src ="https://refactoring.guru/images/patterns/diagrams/visitor/structure-es-indexed.png">

<hr>
