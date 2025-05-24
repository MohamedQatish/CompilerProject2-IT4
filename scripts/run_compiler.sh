#!/bin/bash

# Script to compile and run the compiler project

# Create bin directory if it doesn't exist
mkdir -p bin

# Compile all Java files
echo "Compiling project..."
javac -d bin -cp .:lib/* *.java SYMBOL_TABLE/*.java VISITOR/*.java AST/*.java ANTLR/*.java

# Check if compilation was successful
if [ $? -eq 0 ]; then
    echo "Compilation successful!"
    
    # Run tests
    echo -e "\nRunning tests..."
    java -cp bin:lib/* Main
else
    echo "Compilation failed!"
fi
