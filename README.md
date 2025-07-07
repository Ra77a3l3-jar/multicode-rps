# 🎮 MultiCode RPS - Rock Paper Scissors CLI Game

<div align="center">
  
![Game Demo](https://img.shields.io/badge/Game-Rock%20Paper%20Scissors-blue)
![Platform](https://img.shields.io/badge/Platform-CLI-lightgrey)

![C](https://img.shields.io/badge/C-00599C?style=for-the-badge&logo=c&logoColor=white)
![C++](https://img.shields.io/badge/C++-00599C?style=for-the-badge&logo=c%2B%2B&logoColor=white)
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Zig](https://img.shields.io/badge/Zig-F7A41D?style=for-the-badge&logo=zig&logoColor=white)

</div>

A classic Rock Paper Scissors CLI game implemented in multiple programming languages, featuring player vs computer gameplay with random AI opponent.

## 📖 About This Project

This repository showcases the classic Rock Paper Scissors game implemented across multiple programming languages. Each implementation features a clean Command Line Interface where you battle against a computer opponent that uses random number generation to make its moves.

## 🎯 Game Features

- **Player vs Computer gameplay** - Battle against an AI opponent
- **Random AI opponent** - Computer uses RNG for unpredictable moves
- **Clean CLI interface** - Intuitive prompts and clear feedback
- **Input validation** - Handles invalid entries gracefully
- **Consistent experience** - Same game logic across all implementations
- **Multiple rounds** - Play as many games as you want

## 🛠️ Languages & Implementations

<div align="center">
  
![C](https://img.shields.io/badge/C-00599C?style=for-the-badge&logo=c&logoColor=white)
![C++](https://img.shields.io/badge/C++-00599C?style=for-the-badge&logo=c%2B%2B&logoColor=white)
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Zig](https://img.shields.io/badge/Zig-F7A41D?style=for-the-badge&logo=zig&logoColor=white)

</div>

This project demonstrates the same game logic implemented in different programming paradigms:

| Language | Status | Files | Compiler/Runtime |
|----------|--------|-------|------------------|
| ![C](https://img.shields.io/badge/C-00599C?style=for-the-badge&logo=c&logoColor=white) | ✅ Complete | `rock-paper-scissors.c` | GCC |
| ![C++](https://img.shields.io/badge/C++-00599C?style=for-the-badge&logo=c%2B%2B&logoColor=white) | ✅ Complete | `rockPaperScissor.cpp` | G++ |
| ![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white) V1 | ✅ Complete | `RockPaperScissors.java` | OpenJDK |
| ![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white) V2 | ✅ Complete | `main.java`, `utils.java`, `getChoices.java`, `gamEngine.java` | OpenJDK |
| ![Zig](https://img.shields.io/badge/Zig-F7A41D?style=for-the-badge&logo=zig&logoColor=white) | ✅ Complete | `src/main.zig` | Zig Compiler |

## 🚀 Quick Start

### Prerequisites

Ensure you have the required tools installed:

```bash
# Check if compilers/runtimes are available
gcc --version      # For C
g++ --version      # For C++
java --version     # For Java (runtime)
javac --version    # For Java (compiler)
zig version        # For Zig
```

## 🎯 Choose Your Language & Play

### 🔧 ![C](https://img.shields.io/badge/C-00599C?style=for-the-badge&logo=c&logoColor=white) Implementation

```bash
# Compile and run
gcc rps.c -o rps
./rps
```

### 🔧 ![C++](https://img.shields.io/badge/C++-00599C?style=for-the-badge&logo=c%2B%2B&logoColor=white) Implementation

```bash
# Compile and run
g++ rps.cpp -o rps
./rps
```

### 🔧 ![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white) V1 Implementation (Single File)

```bash
# Navigate to Java V1 directory
cd "Java V1"

# Compile and run
javac rps.java
java rps
```

### 🔧 ![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white) V2 Implementation (Modular)

```bash
# Navigate to Java V2 directory
cd "Java V2"

# Compile all files
javac main.java

# Run the main class
java main
```

### 🔧 ![Zig](https://img.shields.io/badge/Zig-F7A41D?style=for-the-badge&logo=zig&logoColor=white) Implementation

```bash
# Navigate to Zig directory
cd Zig

# Build and run
zig build run

# Or build executable
zig build
./zig-out/bin/Zig

# Or run directly
zig run src/main.zig
```

## 🎮 How to Play

1. **Launch the game** using any implementation above
2. **Make your choice** when prompted:
   - Enter `r` for Rock 🪨
   - Enter `p` for Paper 📄
   - Enter `s` for Scissors ✂️
3. **Watch the computer** make its random choice
4. **See who wins** based on the classic rules
5. **Continue playing** or quit anytime

## 📋 Game Rules

- **Rock crushes Scissors** ✂️ → 🪨 wins
- **Scissors cuts Paper** 📄 → ✂️ wins  
- **Paper covers Rock** 🪨 → 📄 wins
- **Identical choices** result in a **Draw** 🤝

## 📁 Repository Structure

```
multicode-rps/
├── 📄 README.md                   # Project documentation
├── 🔧 .gitignore                  # Git ignore rules
├── 📝 rps.c                       # C implementation
├── 📝 rps.cpp                     # C++ implementation  
├── 📁 Java V1/                    # Single-file Java version
│   └── 📝 rps.java                # Main Java file
├── 📁 Java V2/                    # Modular Java version
│   ├── 📝 main.java               # Entry point
│   ├── 📝 utils.java              # Utility functions
│   ├── 📝 getChoices.java         # Input handling
│   └── 📝 gamEngine.java          # Game logic
└── 📁 Zig/                        # Zig implementation
    ├── 📝 build.zig               # Build configuration
    ├── 📝 build.zig.zon           # Build manifest
    └── 📁 src/
        └── 📝 main.zig            # Main implementation
```

## 🛡️ Technical Implementation Details

### Random Number Generation

Each language uses its native approach to randomization:

- ![C](https://img.shields.io/badge/C-00599C?style=for-the-badge&logo=c&logoColor=white): `rand()` function with `srand(time(NULL))` seeding
- ![C++](https://img.shields.io/badge/C++-00599C?style=for-the-badge&logo=c%2B%2B&logoColor=white): `<random>` library with proper distribution  
- ![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white): `java.util.Random` class for robust randomization
- ![Zig](https://img.shields.io/badge/Zig-F7A41D?style=for-the-badge&logo=zig&logoColor=white): `std.Random` module with proper seeding

### Input Handling

- **Flexible input parsing** - accepts single character inputs
- **Case-insensitive** input recognition (automatically converts to lowercase)
- **Input validation** with helpful error messages
- **Loop-based gameplay** with easy exit options

### Cross-Platform Compatibility

- All implementations use **standard library functions only**
- **No external dependencies** required
- Works on **Linux, macOS, and Windows**
- **Consistent behavior** across all platforms

## 🎓 Learning Objectives

This project demonstrates:

### Programming Fundamentals:
- Variables, functions, and control structures
- User input/output operations
- Random number generation and seeding
- String handling and parsing

### Language-Specific Features:
- ![C](https://img.shields.io/badge/C-00599C?style=for-the-badge&logo=c&logoColor=white): Procedural programming with manual memory management
- ![C++](https://img.shields.io/badge/C++-00599C?style=for-the-badge&logo=c%2B%2B&logoColor=white): Object-oriented programming with classes and namespaces
- ![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white) V1: Single-class design with static methods
- ![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white) V2: Modular design with separation of concerns
- ![Zig](https://img.shields.io/badge/Zig-F7A41D?style=for-the-badge&logo=zig&logoColor=white): Memory safety and modern systems programming

### Software Development:
- Code organization and readability
- Input validation and error handling
- Cross-platform development considerations
- Modular vs monolithic design patterns

## 🚀 Performance Comparison

| Implementation | Compile Time | Binary Size | Memory Usage |
|---------------|--------------|-------------|--------------|
| ![C](https://img.shields.io/badge/C-00599C?style=for-the-badge&logo=c&logoColor=white) | Fast | Small | Minimal |
| ![C++](https://img.shields.io/badge/C++-00599C?style=for-the-badge&logo=c%2B%2B&logoColor=white) | Medium | Medium | Low |
| ![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white) V1 | Medium | Medium | Medium |
| ![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white) V2 | Medium | Medium | Medium |
| ![Zig](https://img.shields.io/badge/Zig-F7A41D?style=for-the-badge&logo=zig&logoColor=white) | Fast | Small | Minimal |

## 📝 License

This project is open source and available under the [MIT License](LICENSE).

---

<div align="center">

## 🚀 Ready to Code & Play?

**Happy Coding!** 💻✨

Choose your favorite programming language and dive into the classic Rock Paper Scissors experience!

<div style="margin: 20px 0;">
  
![C](https://img.shields.io/badge/C-00599C?style=for-the-badge&logo=c&logoColor=white)
![C++](https://img.shields.io/badge/C++-00599C?style=for-the-badge&logo=c%2B%2B&logoColor=white)
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Zig](https://img.shields.io/badge/Zig-F7A41D?style=for-the-badge&logo=zig&logoColor=white)

</div>

### 🌟 **Explore • Learn • Code • Play** 🌟

*From procedural programming to modern systems languages - there's something for every developer!*

---

**Made with** ❤️ **and lots of** ☕ **by passionate developers**

🔗 [**View Repository**](https://github.com/yourusername/multicode-rps) | 🐛 [**Report Issues**](https://github.com/yourusername/multicode-rps/issues)

</div>
