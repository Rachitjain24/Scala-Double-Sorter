# 🔢 DoubleSorter – Scala 2.11.12 Program

This project implements a program to:

✅ Read `Double` values from keyboard or file  
✅ Sort the values in ascending order  
✅ Output sorted values to screen or file  
✅ Measure execution time for reading, sorting, and writing  
✅ Log results to `log_scala.txt`

---

## 💻 **Files**

| File Name           | Description                              |
|---------------------|------------------------------------------|
| `DoubleSorter.scala`| Scala 2.11.12-compatible sorter program |
| `log_scala.txt`     | Auto-generated execution time log       |

---

## ⚙️ **Requirements**

- **Scala version:** 2.11.12
- **JDK:** OpenJDK 11 or higher (for Java dependency resolution)
- Runs on **WSL, Linux, or any Unix-like environment**

---

## 🚀 **How to compile and run**

1. **Compile**

```bash
scalac DoubleSorter.scala
````

2. **Run**

```bash
scala DoubleSorter
```

---

## 📝 **Program Usage**

### 🔹 **Input options**

```
1. Keyboard
2. File
```

If **keyboard**:

* Enter number of values
* Enter values (space-separated or line by line)

If **file**:

* Enter input filename (e.g. `data.txt`)

---

### 🔹 **Output options**

```
1. Screen
2. File
```

If **screen**, sorted values are printed.
If **file**, specify output filename.

---

## ⏱️ **Time Logging**

Each run appends execution times to `log_scala.txt`:

```
Scala Time Measurements:
Read:  xx ms
Sort:  xx ms
Write: xx ms
--------------------------
```

---

## 🧪 **Sample Input File: `data.txt`**

```
3.5 2.1 4.7 1.9
5.6
```

Supports **space-separated or one-per-line** input format.

---

## 📌 **Program Structure**

* Uses `try-finally` blocks for file handling (compatible with Scala 2.11.12)
* Uses traditional `main` within an `object`
* Fully functional on systems without Scala 2.13+ features

---

## ✨ **Author**

Developed by **Rachit Jain** for Scala warmup and benchmarking assignment.

---



```

