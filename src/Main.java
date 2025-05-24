// Modified Main.java to support running with test files and display all semantic errors
import ANTLR.AngularLexer;
import ANTLR.AngularParser;
import AST.Program;
import VISITOR.BaseVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static void main(String[] args) throws IOException {
        // Check if a specific file path is provided as an argument
        if (args.length > 0) {
            String source = args[0];
            System.out.println("Processing file: " + source);
            processFile(source);
        } else {
            // Process all files in the TEST_FILES directory
            File folder = new File("./TEST_FILES");
            if (!folder.exists() || !folder.isDirectory()) {
                System.err.println("TEST_FILES directory not found. Please create it and add test files.");
                return;
            }
            
            File[] files = folder.listFiles();
            if (files == null || files.length == 0) {
                System.err.println("No test files found in TEST_FILES directory.");
                return;
            }
            
            for (File file : files) {
                if (file.isFile()) {
                    System.out.println("\n\n========== Processing file: " + file.getName() + " ==========");
                    processFile(file.getPath());
                    System.out.println("========== End of file: " + file.getName() + " ==========\n");
                }
            }
        }
    }
    
    private static void processFile(String source) throws IOException {
        try {
            CharStream cs = fromFileName(source);
            AngularLexer lexer = new AngularLexer(cs);
            CommonTokenStream token = new CommonTokenStream(lexer);
            AngularParser parser = new AngularParser(token);
            ParseTree tree = parser.program();
            
            // Create visitor and visit the parse tree
            BaseVisitor visitor = new BaseVisitor();
            Program program = (Program) visitor.visit(tree);
            
            // Print AST Structure
            System.out.println("AST Structure:");
            System.out.println(program);
            
            // Print all semantic errors from all categories
            System.out.println("\n========== SEMANTIC ANALYSIS RESULTS ==========");
            visitor.getSymbolTable().printErrors();
            System.out.println("=================================================\n");
            
        } catch (Exception e) {
            System.err.println("Error processing file: " + source);
            e.printStackTrace();
        }
    }
}
