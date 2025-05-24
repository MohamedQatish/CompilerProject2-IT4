import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CompilerRunner {
    public static void main(String[] args) {
        try {

            compileProject();
            

            runTests();
        } catch (Exception e) {
            System.err.println("Error running compiler: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    private static void compileProject() throws IOException, InterruptedException {
        System.out.println("Compiling project...");
        
        // Create bin directory if it doesn't exist
        Files.createDirectories(Paths.get("bin"));
        
        // Compile all Java files
        ProcessBuilder pb = new ProcessBuilder(
            "javac", 
            "-d", "bin", 
            "-cp", ".:lib/*", 
            "*.java",
            "SYMBOL_TABLE/*.java",
            "VISITOR/*.java",
            "AST/*.java",
            "ANTLR/*.java"
        );
        
        pb.directory(new File("."));
        pb.redirectErrorStream(true);
        Process process = pb.start();
        

        java.util.Scanner s = new java.util.Scanner(process.getInputStream()).useDelimiter("\\A");
        if (s.hasNext()) {
            System.out.println(s.next());
        }
        
        int exitCode = process.waitFor();
        if (exitCode != 0) {
            throw new RuntimeException("Compilation failed with exit code: " + exitCode);
        }
        
        System.out.println("Compilation successful!");
    }
    
    private static void runTests() throws IOException, InterruptedException {
        System.out.println("\nRunning tests...");
        
        File testDir = new File("TEST_FILES");
        if (!testDir.exists() || !testDir.isDirectory()) {
            System.err.println("TEST_FILES directory not found!");
            return;
        }
        
        File[] testFiles = testDir.listFiles();
        if (testFiles == null || testFiles.length == 0) {
            System.err.println("No test files found in TEST_FILES directory!");
            return;
        }
        
        for (File testFile : testFiles) {
            if (testFile.isFile()) {
                System.out.println("\n========== Testing file: " + testFile.getName() + " ==========");
                
                ProcessBuilder pb = new ProcessBuilder(
                    "java", 
                    "-cp", "bin:lib/*", 
                    "Main",
                    testFile.getPath()
                );
                
                pb.redirectErrorStream(true);
                Process process = pb.start();
                

                java.util.Scanner s = new java.util.Scanner(process.getInputStream()).useDelimiter("\\A");
                if (s.hasNext()) {
                    System.out.println(s.next());
                }
                
                process.waitFor();
                System.out.println("========== End of test: " + testFile.getName() + " ==========\n");
            }
        }
        
        System.out.println("All tests completed!");
    }
}
