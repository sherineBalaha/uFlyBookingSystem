/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uflybookingsystem.Forms;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import uflybookingsystem.BaseImporter;
import uflybookingsystem.ImportResult;

/**
 *
 * @author 91030283
 */
public class FlightImporter extends BaseImporter{
    
    private ImportResult results;
    private String fileName ="";
    private String fileData = "";
    private String firstLine ="" ;
    private int lineNum = 0;
    String[] columns ;
    

    public FlightImporter(String fileName)
    {
        super(fileName);
        this.fileName = fileName;
    }
    
  
    @Override
    public void run() {
        
        this.setResults(results);
        
        
        String path1 = this.fileName;
        
        String[] files = {path1};
        
        if(files.length == 0) {
            System.err.println("pass the name of the file(s) as argument");
            System.exit(-1);
        }
        
        for (String file: files) {
            
           try (FileReader inputFile = new FileReader(file)) {
               int ch = 0;
               while ((ch = inputFile.read()) != -1)  {
                   
                   System.out.print(firstLine);
                   fileData += (char)ch;

               }
               
               String[] lines = fileData.replace("\r\n","\n").replace("\r","\n").split("\n");
               firstLine = lines[0];
             
               //check first line contains table heading.
               if (firstLine.matches("Flight Number,Departure Airport,Destination Airport,Price,DateTime,Plane,Seats Taken"))
               {
                   System.out.print("yaaaay first line matchs");
                   System.out.print(fileData);
                   
                   
                   //remove first line
                   lines[0] = " ";
                   for (String line : lines)
                    {
                                   if(line.isEmpty())
                                   {
                                    //increment failed rows diplay error message with line number
                                    results.incrementfailedRows();
                                    //throw new Exception();
                                    
                                   }
                                   else 
                                   { 
                                       
                                    results.incrementTotalRows();
                                    System.out.print("incremented");
                                   }                                    
                    }
                                   
                    }
             
           }
           catch(FileNotFoundException fnfe){
               results.setErrorMessages(fnfe.getMessage());
           }
           catch(IOException ioe){
               results.setErrorMessages(ioe.getMessage());
           }
           catch(NullPointerException npe)
           {
              
           }
        }
        
        
        
    }
    
    
    
    
    
    
    
    
}
