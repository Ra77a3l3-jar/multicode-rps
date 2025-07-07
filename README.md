# 🎮 MultiCode RPS - Rock Paper Scissors CLI Game

![Game Demo](https://img.shields.io/badge/Game-Rock%20Paper%20Scissors-blue)
![Languages](https://img.shields.io/badge/Languages-C%20%7C%20C%2B%2B%20%7C%20Java%20%7C%20Zig-green)
![Platform](https://img.shields.io/badge/Platform-CLI-lightgrey)

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

This project demonstrates the same game logic implemented in different programming paradigms:

| Language | Status | Files | Compiler/Runtime |
|----------|--------|-------|------------------|
| **C** | ✅ Complete | `rock-paper-scissors.c` | GCC |
| **C++** | ✅ Complete | `rockPaperScissor.cpp` | G++ |
| **Java V1** | ✅ Complete | `RockPaperScissors.java` | OpenJDK |
| **Java V2** | ✅ Complete | `main.java`, `utils.java`, `getChoices.java`, `gamEngine.java` | OpenJDK |
| **Zig** | ✅ Complete | `src/main.zig` | Zig Compiler |

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

### 🔧 C Implementation

```bash
# Compile and run
gcc rock-paper-scissors.c -o rock-paper-scissors
./rock-paper-scissors

# Or use the pre-compiled binary (if available)
./rock-paper-scissors.cbin
```

### 🔧 C++ Implementation

```bash
# Compile and run
g++ rockPaperScissor.cpp -o rockPaperScissor
./rockPaperScissor

# Or use the pre-compiled binary (if available)
./rock-paper-scissors.cppbin
```

### 🔧 Java V1 Implementation (Single File)

```bash
# Navigate to Java V1 directory
cd "Java V1"

# Compile and run
javac RockPaperScissors.java
java RockPaperScissors

# Or run the pre-compiled class (if available)
java RockPaperScissors
```

### 🔧 Java V2 Implementation (Modular)

```bash
# Navigate to Java V2 directory
cd "Java V2"

# Compile all files
javac *.java

# Run the main class
java main

# Or compile and run individually
javac gamEngine.java utils.java getChoices.java main.java
java main
```

### 🔧 Zig Implementation

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
├── 📝 rock-paper-scissors.c       # C implementation
├── 📝 rockPaperScissor.cpp        # C++ implementation  
├── 📁 Java V1/                    # Single-file Java version
│   └── 📝 RockPaperScissors.java # Main Java file
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

- **C**: `rand()` function with `srand(time(NULL))` seeding
- **C++**: `<random>` library with proper distribution  
- **Java**: `java.util.Random` class for robust randomization
- **Zig**: `std.Random` module with proper seeding

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
- **C**: Procedural programming with manual memory management
- **C++**: Object-oriented programming with classes and namespaces
- **Java V1**: Single-class design with static methods
- **Java V2**: Modular design with separation of concerns
- **Zig**: Memory safety and modern systems programming

### Software Development:
- Code organization and readability
- Input validation and error handling
- Cross-platform development considerations
- Modular vs monolithic design patterns

## 🚀 Performance Comparison

| Implementation | Compile Time | Binary Size | Memory Usage |
|---------------|--------------|-------------|--------------|
| C | Fast | Small | Minimal |
| C++ | Medium | Medium | Low |
| Java V1 | Medium | Medium | Medium |
| Java V2 | Medium | Medium | Medium |
| Zig | Fast | Small | Minimal |

## 🤝 Contributing

Feel free to:
- Add implementations in new languages
- Improve existing code
- Fix bugs or add features
- Enhance documentation

## 📝 License

This project is open source and available under the [MIT License](LICENSE).

## 🔗 Links

- **Repository**: [multicode-rps](https://github.com/yourusername/multicode-rps)
- **Issues**: [Report bugs or request features](https://github.com/yourusername/multicode-rps/issues)

---

**Happy Gaming!** 🎮 Choose your favorite language and start playing!
