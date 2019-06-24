
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 91030283
 */
public class Launcher {
    
    
    public Launcher()
    {
        
    }
    
        public void test(String[] args) {
        String path1 = "H:\\Sherine Balaha's Suff\\OCA Java 2\\Project\\uFlyBookingSystem\\src\\Locations.txt";
        
        String[] files = {path1};
        
        if(files.length == 0) {
            System.err.println("pass the name of the file(s) as argument");
            System.exit(-1);
        }
        
        for (String file: files) {
           try (FileReader inputFile = new FileReader(file)) {
               int ch=0;
               while ((ch = inputFile.read()) != -1) {
                   System.out.print((char)ch);
               }
           }
           catch(FileNotFoundException fnfe){
               System.err.printf("Cannot open the given file %s ", file);
           }
           catch(IOException ioe){
               System.err.printf("Error when processing file %s...skipping it", file);
           }
        }
    }
    
    
}
