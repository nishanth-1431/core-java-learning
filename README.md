# ☕ Core Java Learning — Nishanth

> A structured, hands-on Java learning repository covering everything from fundamentals to advanced concurrency and collections — built with class notes, practice problems, and mini-projects.

[![Java](https://img.shields.io/badge/Java-17%2B-ED8B00?style=flat-square&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![Topics](https://img.shields.io/badge/Topics-20-4CAF50?style=flat-square)](#-learning-path)
[![Files](https://img.shields.io/badge/Java%20Files-294-2196F3?style=flat-square)](#-folder-structure)
[![Status](https://img.shields.io/badge/Status-Active-brightgreen?style=flat-square)](#-progress-tracker)

---

## 📑 Table of Contents

- [About](#-about)
- [Learning Path](#-learning-path)
- [Folder Structure](#-folder-structure)
- [Progress Tracker](#-progress-tracker)
- [How to Run](#-how-to-run)
- [Mini Projects](#-mini-projects)
- [References](#-references)

---

## 📖 About

This repo follows a topic-by-topic progression through Core Java — from writing the first `Hello World` to building multithreaded programs with the Executor Framework. Each module has:

- **Concept files** — standalone `.java` files demonstrating one idea clearly
- **Practice problems** — in a `problems/` subfolder for each topic
- **A README** — explaining topics covered in that module

---

## 🗺️ Learning Path

| Phase | Topics | Modules |
|-------|--------|---------|
| **Phase 1** — Foundations | Java basics, control flow, loops, arrays | `01` → `04` |
| **Phase 2** — Methods & Recursion | Methods, overloading, recursion | `05` → `06` |
| **Phase 3** — Strings | String methods, StringBuffer, StringBuilder | `07` |
| **Phase 4** — OOP | Classes, inheritance, polymorphism, abstraction, encapsulation | `08` → `14` |
| **Phase 5** — Error Handling & Advanced | Exceptions, wrapper classes, multithreading | `15` → `17` |
| **Phase 6** — Collections & I/O | Collections framework, Stream API, file I/O | `18` → `20` |

---

## 📂 Folder Structure

```
java-with-ai/
│
├── 01-basics/              → Variables, data types, operators, Scanner, JVM/JRE/JDK
├── 02-control-flow/        → if, else-if, nested if, switch-case
├── 03-loops/               → for, while, do-while, nested loops
├── 04-arrays/              → 1D & 2D arrays, traversal, sorting
├── 05-methods/             → Functions, parameters, return types, overloading
├── 06-recursion/           → Recursive logic, base case, factorial, Fibonacci
├── 07-strings/             → String methods, comparison, StringBuffer, StringBuilder
│
├── 08-oop/                 → Classes, objects, access modifiers, scope
├── 09-inheritance/         → extends, single, multilevel, hierarchical, hybrid
├── 10-polymorphism/        → Method overloading, method overriding
├── 11-abstraction/         → Abstract class, interface, implements
├── 12-aggregation/         → HAS-A relationship, object composition
├── 13-encapsulation/       → Getters, setters, this, super, final
├── 14-constructors/        → Default, parameterized, overloaded, copy constructor
│
├── 15-exceptions/          → try-catch-finally, throw, throws, custom exceptions
├── 16-wrapper-classes/     → Autoboxing, unboxing, Integer, Double, Character
├── 17-threads/             → Thread class, Runnable, lifecycle, synchronization,
│                             inter-thread communication, Executor Framework
│
├── 18-collections/         → ArrayList, LinkedList, HashSet, HashMap, Iterators
├── 19-Stream-api/          → Stream operations, filter, map, reduce, collectors
├── 20-file-handling/       → File class, reading, writing, appending, exceptions
│
├── mini-projects/          → Programs combining multiple topics (e.g., Guessing Game)
├── notes/                  → Class notes (java_notes.pptx)
│
└── CHAPTERS.md             → Detailed chapter-by-chapter guide
```

---

## 📊 Progress Tracker

**Overall: 28 / 29 topics complete — 97%** 🚀

```
█████████████████████████████████████████████████░  97%
```

---

### Phase 1 — Foundations `7/7`

- [x] Java program structure — `main()`, `System.out.println`, how a Java program runs
- [x] JVM, JRE, JDK — what each does and how they relate
- [x] Variables and data types — `int`, `double`, `char`, `boolean`, `String`
- [x] Operators — arithmetic, assignment, logical, relational, bitwise, unary
- [x] User input — `Scanner`, `DataInputStream`
- [x] Type casting — implicit and explicit casting
- [x] Control flow — `if`, `else-if`, nested `if`, `switch-case`

---

### Phase 2 — Loops & Arrays `3/3`

- [x] Loops — `for`, `while`, `do-while`
- [x] Nested loops — patterns and grids
- [x] Arrays — 1D, 2D, traversal, sorting algorithms

---

### Phase 3 — Methods & Recursion `3/3`

- [x] Creating and calling methods
- [x] Parameters, return values, method overloading
- [x] Recursion — base case, recursive case, factorial, Fibonacci

---

### Phase 4 — Strings `4/4`

- [x] String declaration, access, modification
- [x] String methods — `length()`, `charAt()`, `substring()`, `indexOf()`, etc.
- [x] String comparison — `equals()` vs `==`
- [x] `StringBuffer` and `StringBuilder` — mutable string alternatives

---

### Phase 5 — OOP `8/8`

- [x] Classes and objects — fields, methods, `new` keyword
- [x] Access modifiers — `public`, `private`, `protected`, default
- [x] Inheritance — single, multilevel, hierarchical, hybrid (`extends`)
- [x] Polymorphism — method overloading and method overriding
- [x] Abstraction — abstract classes and interfaces (`implements`)
- [x] Aggregation — HAS-A relationship, object inside object
- [x] Encapsulation — getters, setters, `this`, `super`, `final`
- [x] Constructors — default, parameterized, overloaded, copy constructor

---

### Phase 6 — Error Handling & Advanced `5/5`

- [x] Exception handling — `try`, `catch`, `finally`, checked vs unchecked, multiple catch blocks
- [x] `throw` and `throws` — custom exception classes
- [x] Wrapper classes — autoboxing, unboxing, `Integer`, `Double`, `Character`
- [x] Multithreading — `Thread` class, `Runnable` interface, thread lifecycle
- [x] Synchronization, inter-thread communication, `wait()` / `notify()`
- [x] Executor Framework — `ExecutorService`, thread pools

---

### Phase 7 — Collections & I/O `3/3 + 1 in progress`

- [x] `ArrayList` — ordered, allows duplicates, fast index access
- [x] `LinkedList` — efficient add/remove from middle
- [x] `HashSet` — unordered, no duplicates
- [x] `HashMap` — key-value pairs, fast lookup
- [x] Iterators — safely iterate any collection
- [ ] Stream API — `filter()`, `map()`, `reduce()`, collectors 🔄
- [x] File handling — `File` class, reading, writing, appending, `FileNotFoundException`

---

### Mini Projects

- [x] Guessing Game — control flow, loops, Scanner, methods

---

**Overall Progress: 28 / 29 topics complete ≈ 97%** 🚀

---

## ▶️ How to Run

### Prerequisites

- [JDK 17+](https://www.oracle.com/java/technologies/downloads/) installed
- `java` and `javac` available on your system `PATH`

### Compile & Run (terminal)

```bash
# Navigate to the module folder
cd 01-basics

# Compile
javac variables.java

# Run
java variables
```

### Run with an IDE

Open the project in **IntelliJ IDEA** (already configured via `.idea/` and `.iml` files) and click ▶️ on any class with a `main()` method.

---

## 🎮 Mini Projects

| # | Project | Topics Used | Folder |
|---|---------|-------------|--------|
| 1 | Guessing Game | Control flow, loops, Scanner, methods | [`mini-projects/1. guessing game/`](./mini-projects/1.%20guessing%20game/) |

> More projects will be added as learning progresses.

---

## 📚 References

### Official Documentation
- [Java SE 17 API Docs](https://docs.oracle.com/en/java/releases/17/) — Oracle official Java reference
- [Java Language Specification (JLS)](https://docs.oracle.com/javase/specs/) — Formal Java spec
- [OpenJDK](https://openjdk.org/) — Open-source JDK implementation

### Learning Resources
- [Oracle Java Tutorials](https://docs.oracle.com/javase/tutorial/) — Structured beginner-to-advanced guide
- [Baeldung Java Guides](https://www.baeldung.com/) — Deep dives and how-tos for Java topics
- [GeeksForGeeks — Java](https://www.geeksforgeeks.org/java/) — Quick references, examples, and problems
- [W3Schools Java](https://www.w3schools.com/java/) — Syntax quick reference

### Topic-Specific References
| Topic | Reference |
|-------|-----------|
| Collections Framework | [Java Collections (Baeldung)](https://www.baeldung.com/java-collections) |
| Multithreading | [Java Concurrency in Practice](https://jcip.net/) |
| Stream API | [Stream API Guide (Baeldung)](https://www.baeldung.com/java-8-streams) |
| Exceptions | [Oracle — Exception Handling](https://docs.oracle.com/javase/tutorial/essential/exceptions/) |
| File I/O | [Oracle — Basic I/O](https://docs.oracle.com/javase/tutorial/essential/io/) |

### Books
- **Head First Java** — Kathy Sierra & Bert Bates (beginner-friendly)
- **Effective Java** — Joshua Bloch (best practices)
- **Java: The Complete Reference** — Herbert Schildt (comprehensive reference)

---

## 👤 Author

**Nishanth** — [@nishanth-1431](https://github.com/nishanth-1431)

> *"Learning Java one commit at a time."*
