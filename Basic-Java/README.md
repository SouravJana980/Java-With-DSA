# ☕ Java Conditional Statements Practice

This repository contains beginner-friendly **Java programs** demonstrating the use of  
✅ `if-else` statements  
✅ `switch-case` statements  
✅ `ternary operator`

---

## 📘 Topics Covered

### 🧩 If-Else Examples
Basic decision-making programs:
- 🔹 Find Odd or Even Number  
- 🔹 Find Quadrant of a Point  
- 🔹 Check Leap Year or Not  
- 🔹 Find Largest of Three Numbers  
- 🔹 Check Student Pass or Fail  
- 🔹 Create Mini Calculator  

### 🔁 Switch-Case Examples
Programs using `switch` for multiple choices:
- 🔹 Print Day Name Using Switch  
- 🔹 Simple Calculator Using Switch  

### ⚡ Ternary Operator Examples
Compact logic using conditional operators:
- 🔹 Find Largest Number Using Ternary Operator  
- 🔹 Check Even or Odd Using Ternary Operator  

---

## 💻 Sample Programs

### 🔹 Odd or Even (if-else)
```java
import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 2 == 0)
            System.out.println(num + " is Even");
        else
            System.out.println(num + " is Odd");
    }
}
````

---

### 🔹 Print Day Using Switch

```java
import java.util.Scanner;
public class PrintDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day number (1-7): ");
        int day = sc.nextInt();

        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid day number");
        }
    }
}
```

---

### 🔹 Largest of Two Numbers (Ternary Operator)

```java
import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int largest = (a > b) ? a : b;
        System.out.println("Largest number is: " + largest);
    }
}
```

---

## ⚙️ How to Run

1. **Clone the repository**

   ```bash
   git clone https://github.com/<your-username>/Java-Conditional-Statements.git
   ```
2. **Open the folder** in your Java IDE (VS Code, IntelliJ, or Eclipse)
3. **Compile and run** any `.java` file:

   ```bash
   javac OddEven.java
   java OddEven
   ```

---

## 🧠 Concepts You’ll Learn

* Flow Control in Java
* Nested if-else logic
* Switch-case syntax (Java 14+ arrow syntax)
* Ternary operator usage
* Scanner class for user input

---

## 📄 License

This project is open source and available under the [MIT License](LICENSE).

---

## ✨ Author

**Sourav Jana**
🎓 Student | 💻 Java Learner | 🌱 Exploring DSA & OOPs

📫 *Connect on *

```

---

Would you like me to make the **README include your GitHub username and LinkedIn link automatically** (so you can upload it directly)?
```
