# Reality Glitch Detector

## About

Reality Glitch Detector is a Java console application that records events related to different people and checks those events for unusual patterns, called "reality glitches".

The application supports person management, event recording, glitch detection, report generation, file handling, and a small multithreading simulation.

---

## Requirements

* Java JDK 8 or above
* Command Prompt, PowerShell, or any terminal
* Git (only if cloning the repository)

**External dependencies:** None.
The project uses Java's standard library only.

---

## Project Structure

```text
Reality-Glitch-Detector/
│
├── src/
│   ├── Main.java
│   ├── Person.java
│   ├── Event.java
│   ├── Glitch.java
│   ├── LocationGlitch.java
│   ├── TimeGlitch.java
│   ├── RuleChecker.java
│   ├── GlitchDetector.java
│   ├── EventThread.java
│   └── FileManager.java
│
├── data/
│   └── report.txt
│
└── README.md
```

---

## Setup

### 1. Check Java

Open a terminal and run:

```bash
java -version
javac -version
```

Make sure both commands work and show a Java version of 8 or above.

### 2. Get the Project

Clone the repository:

```bash
git clone <REPOSITORY-URL>
```

Or download and extract the repository ZIP.

### 3. Compile

Open the terminal inside the project folder and move to `src`:

```bash
cd src
```

Compile all Java files:

```bash
javac *.java
```

No additional libraries or dependency installation is required.

### 4. Run

After compilation:

```bash
java Main
```

---

## How to Use

The application displays the following menu:

```text
1. Add Person
2. Add Event
3. View People
4. View Events
5. Detect Glitches
6. View Glitch Report
7. Save Report
8. Simulate Event Processing
9. Exit
```

A basic workflow is:

**Add Person → Add Event → Detect Glitches → View Report → Save Report**

For an event, the user enters the person's name, event type (`ENTER`/`EXIT`), location, and time.

The generated report is saved in:

```text
data/report.txt
```

---

## Main Modules

* **Person Management** – stores people.
* **Event Management** – records events.
* **RuleChecker** – checks events using predefined rules.
* **GlitchDetector** – detects and manages glitches.
* **LocationGlitch / TimeGlitch** – represent different glitch types.
* **EventThread** – demonstrates multithreading.
* **FileManager** – saves the report.
* **Main** – handles the console menu and program flow.

---

## Java Concepts Used

* Classes and Objects
* Constructors
* Encapsulation
* Inheritance and Polymorphism
* ArrayList
* Exception Handling
* File Handling
* Multithreading
* Loops and Conditional Statements

---

## Input Validation

The application handles common invalid inputs such as:

* Empty names
* Unknown people
* Invalid event types
* Empty locations
* Negative or invalid time values
* Invalid menu choices

---

## Functional Requirements

1. Add and view people.
2. Add and view events.
3. Validate event information.
4. Detect unusual event patterns.
5. View and save glitch reports.
6. Simulate event processing using threads.

---

## Non-Functional Requirements

* **Usability:** Simple menu-based interface.
* **Reliability:** Handles invalid input.
* **Maintainability:** Uses separate classes for different functions.
* **Portability:** Runs on systems with a compatible JDK.
* **Readability:** Uses a modular project structure.

---

## Future Improvements

* GUI interface
* Database integration
* More glitch detection rules
* Event search and filtering
* CSV/JSON report support
* Real-time event monitoring

---
## Screenshots
<img width="278" height="197" alt="image" src="https://github.com/user-attachments/assets/9d4e64f3-e049-4465-9fd6-4e703aeca569" />

<img width="224" height="55" alt="image" src="https://github.com/user-attachments/assets/c9d03d08-fcd7-45c9-abb6-ac27351439e3" />

<img width="269" height="70" alt="image" src="https://github.com/user-attachments/assets/0bb0abc5-f65f-4397-a5f6-2369d6ea753e" />

<img width="227" height="68" alt="image" src="https://github.com/user-attachments/assets/1d0fd4f1-89f4-460d-b6e2-752cac1c8072" />

<img width="258" height="142" alt="image" src="https://github.com/user-attachments/assets/37676ba1-9a02-4c62-9de0-dd1a17594170" />

<img width="220" height="68" alt="image" src="https://github.com/user-attachments/assets/05c65e0e-bd17-43cd-8304-dbaf401f230e" />

<img width="295" height="128" alt="image" src="https://github.com/user-attachments/assets/451b7651-351d-428e-b52d-93d321811b38" />

<img width="350" height="71" alt="image" src="https://github.com/user-attachments/assets/6931ff08-7a9b-4444-b054-5a5d9d757c62" />





## Author

**Vaanya Singh**
VIT Bhopal University
Programming in Java Project
