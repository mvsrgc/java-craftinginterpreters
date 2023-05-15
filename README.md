# Lox Interpreter - Crafting Interpreters Book

This guide provides steps to compile and run the Lox interpreter. You can either use Maven to package the application or use the maven-exec-plugin for quick execution.

## Compilation

1. Open your terminal/command prompt.
2. Navigate to the root directory of the project.
3. Execute the command `mvn package`. This will build the project and package it into a .jar file.

## Execution

You can run the Lox interpreter in two ways:

### 1. Using the Packaged .jar

- To run the interpreter with a test file, execute: `java -cp target/lox-1.0-SNAPSHOT.jar com.craftinginterpreters.lox.Lox test1`
- To use the interactive interpreter, execute: `java -cp target/lox-1.0-SNAPSHOT.jar com.craftinginterpreters.lox.Lox`

### 2. Using the maven-exec-plugin

- To run the GenerateAst tool, execute: `mvn exec:java@generate-ast`
- To run the Lox interpreter, execute: `mvn exec:java@run-lox`
- To run the Lox interpreter with a test file, execute: `mvn exec:java@run-file -Dfile=test1` (Ensure the file is in the root directory)

Please replace `test1` with your actual test file name.
