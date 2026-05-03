# BMIQ
### _know your body. track your health._

```
  ██████╗ ███╗   ███╗██╗ ██████╗ 
  ██╔══██╗████╗ ████║██║██╔═══██╗
  ██████╔╝██╔████╔██║██║██║   ██║
  ██╔══██╗██║╚██╔╝██║██║██║▄▄ ██║
  ██████╔╝██║ ╚═╝ ██║██║╚██████╔╝
  ╚═════╝ ╚═╝     ╚═╝╚═╝ ╚══▀▀═╝ 
```

> A Java health calculator with both a console and GUI mode, built from scratch.

---

## what it does

| feature | status |
|---|---|
| BMI Calculator | ✅ done |
| Ideal Weight Estimator | ✅ done |
| Water Intake Calculator | ✅ done |
| Console Mode | ✅ done |
| GUI Mode (Swing) | ✅ done |
| History Tracking | 🔧 coming soon |

---

## project structure

```
BMIQ/
├── BM IQ (Latest)/
│   ├── console/        ← console version
│   └── GUI/            ← Swing GUI version

```

---

## how to run it

**requirements**
- JDK 8 or higher

### console version

```bash
# clone the repo
git clone https://github.com/v-nne/BMIQ.git

# navigate to console folder
cd BM IQ (Latest)/console

# compile
javac *.java

# run
java MainMenu
```

### GUI version

```bash
# navigate to GUI folder
cd /BM IQ (Latest)/GUI

# compile
javac *.java

# run
java MainMenuGUI
```

---

## modes

**console mode**
- Full calculator suite with input validation
- Metric and imperial support across all calculators
- Clean minimal UI in the terminal

**GUI mode**
- Dark mode Swing interface
- Metric only

---

## supported units

| | metric | imperial |
|---|---|---|
| console | ✅ | ✅ |
| GUI | ✅ | Soon |

---

## how it looks

**console**
```
──────────────────────────
  HEALTH PROGRAM
  Hello, VXNNE!
──────────────────────────
  1  BMI Calculator
  2  Ideal Weight
  3  Water Intake
  4  Graphical User Interface
  5  Exit
──────────────────────────
  
```

**GUI**

> dark navy + green theme, hover effects on all buttons

---

## built with

- Java — no external libraries
- Notepad++ for most of the console logic (yes really)
- Initially Intellij then NetBeans + Swing for the GUI
- Devine formula for ideal weight
- A lot of `System.out.println`

---

## roadmap

- [x] BMI calculator with categories
- [x] Ideal weight estimator
- [x] Water intake calculator
- [x] Swing GUI with dark mode
- [ ] History saved to file
- [ ] Imperial support in GUI
- [ ] Health score combining all three calculators

---

## author

made by **Von** — built from scratch over 3 days.

---

> _"logic first, GUI later. then GUI too."_