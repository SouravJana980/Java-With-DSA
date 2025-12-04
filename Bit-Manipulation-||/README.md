
# 🌈 **Java Bit Manipulation – Complete Guide**

A vibrant and detailed collection of Java programs covering **bitwise operations**, perfect for beginners, students, and interview preparation.

---

## 📁 **Files Included (With Explanation)**

### 🔹 **1. Check_tows_power_or_not.java**

Checks whether a number is a **power of two**.

* Uses the efficient trick: `n & (n-1) == 0`
* If result is 0 → number is a power of 2.

---

### 🔹 **2. Clear_last_i_times_bit_simple_way.java**

Clears the **last i bits** of a number.

* Uses mask: `(number >> i) << i` or `(number & (~0 << i))`
* Very helpful for trimming binary numbers.

---

### 🔹 **3. Clear_range_of_bits.java**

Clears bits in a specific **range [i, j]**.

* Creates a mask containing 1s everywhere except between i and j.
* Combines two masks: left mask + right mask.

---

### 🔹 **4. Cleare_last_ith_bit.java**

Clears the **i-th bit** (sets it to 0).

* Uses mask: `~(1 << i)`
* Very commonly used in toggling bits.

---

### 🔹 **5. Count_set_bit.java**

Counts how many bits are **set to 1** in the number.

* Can use loop OR
* Brian Kernighan’s Algorithm → Removes the rightmost set bit each iteration

---

### 🔹 **6. Update_ith_bit.java**

Updates the **i-th bit** to either **0 or 1**.

* Combines: clear i-th bit → then OR with newBit.
* Very useful while setting flags.

---

## 🎯 **Key Concepts Covered**

* ✔ Bit masking
* ✔ Bitwise AND, OR, XOR
* ✔ Left & right shifts
* ✔ Clearing bits
* ✔ Updating bits
* ✔ Power-of-two checks
* ✔ Counting set bits

---

## 🧠 **Why Learn Bit Manipulation?**

* Boosts logical thinking ⚡
* Helps in competitive programming 🏆
* Frequently asked in interviews 💼
* Makes you understand how computers work internally 💻

---

## ⭐ **Contribution**

You can contribute by:

* Adding new examples
* Improving explanations
* Submitting optimised solutions

---

## 💙 **Support the Project**

If you like this, give the repo a **⭐ Star** on GitHub!

Happy Coding! 😄🚀
