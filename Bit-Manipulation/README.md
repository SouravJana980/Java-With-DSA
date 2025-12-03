
# 🔢 Java Bitwise Operations Repository

A beginner‑friendly collection of Java programs demonstrating **bitwise operations**. This repository includes clear examples for AND, OR, XOR, shifts, bit checking, setting, clearing, and more.

---

## 🎯 **About This Repository**

This repo is designed for students and beginners who want to understand how **binary operators** work in Java. Each program is simple, well‑commented, and covers one specific operation.

---

## 📁 **Files Included**

Below is a short explanation of what each file does so visitors can understand your repository easily.

### ✔️ Basic Bitwise Operators

### ✔️ **Basic Bitwise Operators**

#### `Binary_AND_operator.java`

Explains how the **AND (`&`) operator** works. AND returns `1` only if both bits are `1`. Useful for masking operations and even/odd checking.

#### `Binary_OR_operator.java`

Demonstrates the **OR (`|`) operator** which returns `1` if any one of the bits is `1`. Helpful for setting bits.

#### `Binary_XOR_operator.java`

Shows how **XOR (`^`)** works. It returns `1` only when bits are different. Commonly used in toggling bits, parity checks, and advanced algorithms.

#### `Binary_ones_complement.java`

Covers the **NOT (`~`) operator**, also known as one's complement. It flips every bit (0 → 1, 1 → 0). Also demonstrates how NOT affects integer sign due to 2's complement representation.**

* `Binary_AND_operator.java`
* `Binary_OR_operator.java`
* `Binary_XOR_operator.java`
* `Binary_ones_complement.java`

### 🔄 **Bit Shift Operators**

#### `Binary_left_shift.java`

Explains the **left shift (`<<`) operator**, which shifts bits left and multiplies a number by 2 for each shift.

#### `Binary_right_shift.java`

Demonstrates the **right shift (`>>`) operator**, which divides the number by 2 for each shift. Shows how sign bits are preserved in signed shifts.**

* `Binary_left_shift.java`
* `Binary_right_shift.java`

### 🎯 **Bit Manipulation Programs**

#### `Get_ith_bit_using_left_shift.java`

Gets the value of the **ith bit** by creating a bitmask using left shift and performing AND with the target number.

#### `Get_ith_bit_using_right_shift.java`

Extracts the **ith bit** using right shift first and then AND with `1`. This method is often simpler for beginners.

#### `Set_ith_bit.java`

Demonstrates how to **set (turn ON)** the ith bit using OR operation. Useful for bitmask creation.

#### `Clear_ith_bit.java`

Shows how to **clear (turn OFF)** the ith bit using AND and NOT mask. One of the most important skills in bit manipulation.

#### `Check_number_is_even_or_odd_using_binary_operator.java`

Checks whether a number is even or odd using the `& 1` operator — a very fast and efficient method.**

* `Get_ith_bit_using_left_shift.java`
* `Get_ith_bit_using_right_shift.java`
* `Set_ith_bit.java`
* `Clear_ith_bit.java`
* `Check_number_is_even_or_odd_using_binary_operator.java`

---

## 🌟 **Key Concepts Covered**

* How AND, OR, XOR work internally
* How shifting left/right affects binary numbers
* How to set, clear, and get a specific bit
* How bitwise operations can help determine even/odd numbers
* Binary mask techniques

---

## 🎨 **Why This Repo Is Helpful**

* Clean and simple Java examples
* Perfect for DSA beginners
* Great for interview preparation
* Helps build a strong foundation in bit manipulation

---

## 🤝 **Contribute**

Feel free to fork, improve code, fix bugs, or add more bit manipulation examples!

---

## ⭐ **If you like this repository, give it star on GitHub!** ⭐

Happy Coding! 🚀
