# SparkzLang
## A fun project that aims to make writing HTML even more fun!


---


## **Synopsis**
### This project uses ANTLR4 to generate parsers and lexers, from its parser and lexer grammar files!

### The SparkzLang language is inspired from ```JSON```'s simplicity and elegancy, with the hope of eliminating the mild eyesore and headache of HTML Tags.

### The language is broken into two files, the ```Parser``` grammar and the ```Lexer``` grammar.
### **Grammar files**:
- [SparkzParser](Sparkz/src/SparkzParser.g4)
- [SparkzLexer](Sparkz/src/SparkzLexer.g4)

### The goal of this project is to make writing HTML even more fun while cutting back as much as possible on the overhead of Tags; compacting and simplifying is the name of the game!

### **The language** is still in its infancy and needs to be developed, so there will be up's and down's along the way!


---


## **Notes**
### The project was created using [IntelliJ](https://www.jetbrains.com/idea/) as well as using the ANTLRv4 grammar plugin by: ```ANTLR Project```.
- You can also use ```Visual Studio Code``` which I would recommend, using the ```ANTLR4 grammar syntax support``` plugin by: ```Mike Lischke```

### The IntelliJ project structure has a Module Dependency on the ANTLR4 ```.jar``` file, so be aware and make sure to update the location of the jar file on your computer when testing inputs for the grammar using the ```Main.java``` file.

---


## **ANTLR4 Setup**
- If on Windows, I'd recommend checking this YouTube video for setup: [Setting up ANTLR](https://www.youtube.com/watch?v=O0D0Lc5syGA)
  - If you run into issues with ```grun.bat```, overwrite the file and try this code:
  - ```
    @ECHO OFF
    SET TEST_CURRENT_DIR=%CLASSPATH:.;=%
    if "%TEST_CURRENT_DIR%" == "%CLASSPATH%" ( SET CLASSPATH=.;%CLASSPATH% )
    java org.antlr.v4.gui.TestRig %*
    ```

- If on ```Mac``` or ```Linux``` it's much easier! 
  - Check ANTLR4's site: [ANTLR4](https://www.antlr.org/) and look for the '```Quick Start```'


---