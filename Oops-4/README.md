
# 🚀 Java OOP Concepts – Multiple Inheritance Using Interface & Super Keyword

This repository contains Java programs demonstrating two important OOP concepts:

* **Multiple Inheritance using Interface**
* **super Keyword Usage**

---

## 📌 **Files Included**

### 1️⃣ **Interface.java**

Contains basic interface structure and usage demonstration.

### 2️⃣ **Multiple_inheritance_using_Interface.java**

Shows how Java achieves **multiple inheritance** through interfaces.

Example:

```java
interface Herbivore {
    void eatPlants();
}

interface Carnivore {
    void eatMeat();
}

class Bear implements Herbivore, Carnivore {
    public void eatPlants() { System.out.println("Bear eats plants"); }
    public void eatMeat() { System.out.println("Bear eats meat"); }
}
```

✔ Java doesn't allow multiple inheritance using classes but supports it using **interfaces**.

---

### 3️⃣ **Super_keyword.java**

Shows how `super` keyword is used for:

* Accessing **parent class variables**
* Calling **parent class methods**
* Invoking **parent class constructor**

Example:

```java
class Animal {
    String name = "Animal";

    Animal() {
        System.out.println("Animal constructor called");
    }

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    String name = "Dog";

    Dog() {
        super();
        System.out.println("Dog constructor called");
    }

    void sound() {
        System.out.println("Dog barks");
    }

    void display() {
        System.out.println(super.name); // Parent variable
        System.out.println(name);       // Child variable
        super.sound();                  // Parent method
        sound();                        // Child method
    }
}
```

---

## 📚 **Concepts Covered**

### 🔹 Multiple Inheritance using Interface

* Java does **not** support multiple inheritance with classes.
* Interfaces allow a class to implement multiple behaviors.
* Helps achieve abstraction & loose coupling.

### 🔹 super Keyword

Used to refer to parent class:

* Variables
* Methods
* Constructors

`super()` must be the **first line** inside a constructor.

---

## 🧠 **Why These Concepts Matter?**

* They are fundamental topics in **OOP**.
* Frequently asked in **interviews**.
* Used in real-world Java frameworks (Spring, Hibernate, etc.).

---

# 🧩 Java Interface vs Class – Clear Explanation

This README provides a clean and beginner‑friendly explanation of **what an interface is** and the **difference between a class and an interface** in Java.
Perfect for uploading to your GitHub Java learning repository.

---

# 📘 **What is an Interface in Java?**

An **interface** in Java is a blueprint of a class. It contains **only method declarations** (rules) and **constants**. It does *not* contain method implementation (until Java 8, where default & static methods were added).

Interfaces are used to:

* Achieve **abstraction**
* Achieve **multiple inheritance**
* Define **rules/contract** for classes
* Provide **loose coupling**

### ✅ Example:

```java
interface Animal {
    void sound();  // abstract method
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}
```

A class **must** implement all abstract methods of an interface.

---

# 🧩 **What is a Class?**

A **class** is a blueprint used to create objects. It contains:

* Variables
* Methods
* Constructors
* Code blocks
* Full implementation of behavior

### Example:

```java
class Car {
    void start() {
        System.out.println("Car starts");
    }
}
```

You can create objects from a class, but not from an interface.

---

# 🔥 **Difference Between Interface and Class**

| Feature                   | Class                            | Interface                                             |
| ------------------------- | -------------------------------- | ----------------------------------------------------- |
| **Contains**              | Variables, methods, constructors | Abstract methods, constants, default & static methods |
| **Method Implementation** | Yes                              | No (except default/static methods)                    |
| **Object Creation**       | ✔ Yes                            | ❌ No                                                  |
| **Multiple Inheritance**  | ❌ Not supported                  | ✔ Supported                                           |
| **Access Modifiers**      | public, private, protected       | Methods are public by default                         |
| **Variables**             | Normal variables                 | public static final (constants)                       |
| **Constructor**           | ✔ Has constructor                | ❌ No constructor                                      |

---

# 🧠 **Why Use Interface?**

Interfaces are used when:

* You want **multiple inheritance**
* You want to force classes to follow **rules**
* You want **full abstraction**
* You want a flexible system with **loosely-coupled** code

Example in real Java API:

* `List` is an interface
* `ArrayList`, `LinkedList` are classes

```java
List<Integer> list = new ArrayList<>();
```

switch implementation easily.

---

# 🎯 **Quick Summary**

➡ **Class = Blueprint + Implementation**
➡ **Interface = Rules (no implementation)**

➡ Class shows **how** things work.
➡ Interface shows **what** must be done.

---


## ⭐ **Author**

Made by: **Sourav Jana**



