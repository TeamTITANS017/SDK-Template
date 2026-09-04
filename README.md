## 📢 NOTICE
Acest repository conține un FTC SDK Template pentru sezonul DECODE (2025-2026) modularizat, optimizat și preconfigurat cu librării utile.
## 📦 CONȚINUT
Template-ul vine preconfigurat cu Pedro Pathing, FTCLib, FTC Dashboard și librăria internă a echipei TITANS 19055.
## 🛠️ CERINȚE
Pentru acest proiect aveți nevoie de Android Studio Ladybug (2024.2) sau mai nou.

## 🗂️ STRUCTURA PROIECTULUI

```text
teamcode/
├── config/           # Configurația hardware și constante 
├── hardware/         # Tot ce ține de componenta hardware 
├── lib/              # Librărie internă partajată
└── opmodes/          # TeleOp-uri si Auto-uri
```

### config/

```text
config/
├── HardwareConfig.java   # Denumirile din configurația hardware din FTC Driver Station
└── RobotConstants.java   # Constante utilizate de robot sub formă de enum-uri
```

### hardware/

```text
hardware/
├── pedroPathing/     # Fișierele librăriei Pedro Pathingg
├── subsystems/       # Clase ce gestionează câte un mecanism al robotului (ex. Drivetrain, Arm, Lifter etc.)
├── LynxManager.java  # Bulk reads în modul MANUAL (nu schimbați)
└── Robot.java        # Containerul principal (conectează toate subsistemele)
```

### lib/

```text
lib/
├── control/     
├── feedforward/       
├── interfaces/   
├── motion/
├── pid/
├── tests/
└── vision/  
```

Librăria internă a echipei, cod păstrat din sezoanele trecute.

### opmodes/

```text
opmodes/
├── auto/              # Rutine autonome 
└── teleop/            # Rutine TeleOp
```
