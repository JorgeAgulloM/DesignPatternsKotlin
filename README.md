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
