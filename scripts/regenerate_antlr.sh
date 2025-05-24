#!/bin/bash

# ANTLR Regeneration Script for Angular Compiler Project
# This script regenerates all ANTLR parser and lexer files from the grammar files

echo "Starting ANTLR file regeneration..."

# Check if Java is installed
if ! command -v java &> /dev/null; then
    echo "Error: Java is required but not found. Please install Java first."
    exit 1
fi

# Check if ANTLR jar exists, download if not
ANTLR_JAR="antlr-4.9.2-complete.jar"
if [ ! -f "$ANTLR_JAR" ]; then
    echo "Downloading ANTLR 4.9.2..."
    curl -O https://www.antlr.org/download/$ANTLR_JAR
fi

# Copy grammar files to working directory
echo "Copying grammar files to working directory..."
cp src/main/resources/AngularLexer.g4 .
cp src/main/resources/AngularParser.g4 .

# Run ANTLR on grammar files
echo "Generating ANTLR files from grammar..."
java -jar $ANTLR_JAR -visitor -listener AngularLexer.g4 AngularParser.g4

echo "Adding package declarations to generated files..."
# Add package declaration to all generated files
for file in AngularLexer.java AngularParser.java AngularParserBaseListener.java AngularParserListener.java AngularParserBaseVisitor.java AngularParserVisitor.java; do
    if [ -f "$file" ]; then
        sed -i '1s/^/package ANTLR;\n\n/' "$file"
    else
        echo "Warning: Expected file $file was not generated."
    fi
done

echo "Moving generated files to src/main/java/ANTLR directory..."
# Create ANTLR directory if it doesn't exist
mkdir -p src/main/java/ANTLR

# Move generated files to the ANTLR directory
mv AngularLexer.java src/main/java/ANTLR/
mv AngularParser.java src/main/java/ANTLR/
mv AngularParserBaseListener.java src/main/java/ANTLR/
mv AngularParserListener.java src/main/java/ANTLR/
mv AngularParserBaseVisitor.java src/main/java/ANTLR/
mv AngularParserVisitor.java src/main/java/ANTLR/

# Clean up temporary files
echo "Cleaning up temporary files..."
rm -f *.tokens *.interp AngularLexer.g4 AngularParser.g4

echo "ANTLR file regeneration complete!"
echo "You can now compile and run your project."
