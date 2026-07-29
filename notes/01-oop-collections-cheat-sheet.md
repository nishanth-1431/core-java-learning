# Core Java Cheat Sheet: OOP & Collections
*Date: July 29, 2026*

## 1. Object-Oriented Programming (OOP) Pillars
- **Encapsulation:** Wrapping data (fields) and code (methods) together into a single unit; using private fields with getters and setters.
- **Inheritance:** Mechanism where a child class acquires the properties and methods of a parent class using the `extends` keyword.
- **Polymorphism:** Ability of an object to take on many forms.
  - *Compile-time (Method Overloading):* Same method name with different parameter signatures.
  - *Runtime (Method Overriding):* Child class provides specific implementation of a method defined in superclass (`@Override`).
- **Abstraction:** Hiding internal implementation details and showing only functionality (using `abstract class` and `interface`).

## 2. Collections Framework Overview
- **List:** Ordered collection allowing duplicates (`ArrayList`, `LinkedList`).
- **Set:** Unordered collection prohibiting duplicate elements (`HashSet`, `TreeSet` for sorted).
- **Map:** Key-value pairs with unique keys (`HashMap`, `LinkedHashMap`, `TreeMap`).
