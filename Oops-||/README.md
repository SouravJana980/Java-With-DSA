
🌟 Deep Copy & Shallow Copy in Java – README.md
📘 Overview

This project demonstrates the difference between Shallow Copy and Deep Copy in Java using a simple Student class.
I will understand:

✔ What is a Shallow Copy

✔ What is a Deep Copy

✔ How arrays behave during copying

✔ Why Strings behave differently (immutable)

✔ Practical Java code examples

🚀 Features

✨ Parameterized constructor

✨ Deep Copy constructor

✨ Array copy example

✨ Clear output to observe differences

📂 Project Structure
Deep_copy/
│
├── Deep_copy.java
└── README.md            

🧠 Concept Explanation
🔹 Shallow Copy

Copies only the reference of an object → both objects share the same memory.

Changes in one object affect the other.
Example:

this.marks = s1.marks;

🔹 Deep Copy

Creates a new independent copy of the object → no shared memory.

Changes in one do NOT affect the other.
Example:

this.marks = new int[s1.marks.length];
for(int i = 0; i < s1.marks.length; i++) {
    this.marks[i] = s1.marks[i];
}

🧩 Java Code (Deep Copy Example)
public class Deep_copy {
    public static void main(String[] args) {
        int marks[] = {99, 93, 89};
        Student s1 = new Student("sou", marks, 123);

        s1.display();

        Student s2 = new Student(s1); // deep copy
        s2.marks[0] = 100;
        s2.name = "ram";              // Does not affect s1 (String is immutable)

        s2.display();
        s1.display();                 // s1 remains unchanged
    }
}

class Student {
    String name;
    int marks[];
    int roll;

    // Parameterized constructor
    Student(String name, int marks[], int roll) {
        this.name = name;
        this.marks = marks;
        this.roll = roll;
    }

    // Deep Copy constructor
    Student(Student s1) {
        this.name = s1.name;  // String is immutable, safe to copy
        this.roll = s1.roll;

        // Deep copy for array
        this.marks = new int[s1.marks.length];
        for (int i = 0; i < s1.marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    void display() {
        System.out.println(name);
        System.out.println(roll);
        for (int m : marks) {
            System.out.print(m + " ");
        }
        System.out.println();
    }
}

🎯 Output Explanation
sou
123
99 93 89

ram
123
100 93 89

sou
123
99 93 89

✔ s2.marks[0] = 100;

Does NOT affect s1 because array was deep-copied.

✔ s2.name = "ram";

Does NOT affect s1 because Strings are immutable.

🏁 Conclusion

Deep copying is essential when working with mutable objects like arrays, lists, or custom classes.
This project helps you understand how data is stored and copied in Java.

