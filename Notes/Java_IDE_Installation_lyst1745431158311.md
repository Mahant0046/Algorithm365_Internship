# Java IDE Installation – Lecture Notes

## Introduction

In this session, we will learn how to set up a **Java development environment**. This includes installing Java (JDK), selecting the right IDE, and writing and running your first Java program.

---

## What is an IDE?

An **IDE (Integrated Development Environment)** is a tool that combines:
- Source code editor
- Compiler/interpreter
- Debugger
- Project manager

It simplifies the process of writing, running, and debugging code.

---

## Popular IDEs for Java

When searching online for “best IDE for Java”, you’ll commonly see these options:

- **IntelliJ IDEA** (by JetBrains) – Most popular and modern IDE
- **Eclipse** – Widely used in the industry, especially for large enterprise apps
- **NetBeans** – Simple and good for beginners
- **BlueJ** – Educational tool for students
- **JDeveloper** – Oracle’s IDE for enterprise Java
- **Android Studio** – For Android app development
- **VS Code** – Lightweight and supports Java via extensions

> 🔍 Use Google or ChatGPT to compare features and choose what suits your needs best.

---

## Step-by-Step Java Development Environment Setup

### 1. Install Java (JDK)

Java code needs the **Java Development Kit (JDK)** to compile and run.

#### Options:
- **Oracle JDK** – Official version
- **OpenJDK** – Open-source version

#### Installation:
1. Visit [https://jdk.java.net](https://jdk.java.net) or [https://www.oracle.com/java](https://www.oracle.com/java)
2. Download for your OS (Windows/Linux/macOS)
3. Install and **add JDK to system environment variables**
   - Set `JAVA_HOME`
   - Add `%JAVA_HOME%/bin` to `PATH`

#### Verify Installation:
```bash
java -version
javac -version
```

---

### 2. Install Your IDE

#### Option 1: IntelliJ IDEA (Recommended for Java)

1. Go to [https://www.jetbrains.com/idea](https://www.jetbrains.com/idea)
2. Download **Community Edition** (free)
3. Install and launch IntelliJ

#### Option 2: Eclipse

1. Visit [https://www.eclipse.org](https://www.eclipse.org)
2. Download the Eclipse IDE for Java Developers
3. Install and open Eclipse

#### Option 3: VS Code

1. Go to [https://code.visualstudio.com](https://code.visualstudio.com)
2. Install **Java Extension Pack**
   - Includes Language Support for Java, Debugger, Maven, etc.

---

## First Java Program

Create a new file called `Main.java` in your IDE or editor of choice.

### Code:
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Java World!");
    }
}
```

### Run It:
- Use the **Run** button in IDE
- Or use terminal:
```bash
javac Main.java
java Main
```

---

## Debugging Java

### How to Debug:
- Set **breakpoints** by clicking next to the line number.
- Use **Step Over**, **Step Into**, and **Inspect Variables** to trace code execution.

### Common Debugging Features:
- Toggle breakpoints
- Watch expressions
- View call stack
- Console output

> Think of the debugger like a GPS that helps trace the path your program is taking.

---

## Summary

- Choose an IDE: IntelliJ IDEA, Eclipse, NetBeans, or VS Code.
- Install JDK (Oracle or OpenJDK) and set environment variables.
- Write and run a basic Java program using your chosen IDE.
- Learn to debug using breakpoints and step-through execution.
- Use official sources and forums to troubleshoot setup issues.

---

**End of Lecture Notes**
