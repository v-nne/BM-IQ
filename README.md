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

> A Java health calculator with both a console and GUI mode — built from scratch.

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

## how to run it

**requirements**
- JDK 8 or higher
- Apache NetBeans (recommended)

**steps**
```bash
# clone the repo
git clone https://github.com/v-nne/BMIQ.git
```
1. Open **NetBeans**
2. File → Open Project → select the BMIQ folder
3. Hit **Run** (F6)

---

## modes

**console mode**
- Full calculator suite with input validation
- Metric and imperial support across all calculators
- Clean minimal UI in the terminal

**GUI mode**
- Dark mode Swing interface
- Select GUI from the console main menu
- Metric only

---

## supported units

| | metric | imperial |
|---|---|---|
| console | ✅ | ✅ |
| GUI | ✅ | ➖ |

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
  4  View History
  5  Exit
  6  Switch to GUI
──────────────────────────
  >
```

**GUI**

> dark navy + green theme, hover effects on all buttons

---

## built with

- Java — no external libraries
- Notepad++ for console logic (yes really)
- NetBeans + Swing for the GUI
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