package uflybookingsystem.Forms;


import BusinessObjects.Location;
import uflybookingsystem.ImportResult;
import uflybookingsystem.BaseImporter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import uflybookingsystem.DatabaseOperations;
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
public class LocationImporter extends BaseImporter{
    
    
    private ImportResult results;
    private String fileName ="";
    private String fileData = "";
    private String firstLine ="" ;
    private int lineNum = 0;
    String[] columns ;
    Location locationToUpdate = new Location();
    Location locationToAdd ;
    
    public LocationImporter(String fileName)
    {
        super(fileName);
        this.fileName = fileName;
    }
    
    public boolean firstLineCheck(String firstLine)
    {
        columns = firstLine.split(",");

        if (columns.length != 2){
            return false;
        }
            
        if  (!(columns[0].matches("City")) || !(columns[1].matches("Airport Code"))  )
        {
            return false;
        }

        return true;
    }
  
    @Override
    public void run() {
        //this.setResults();
        results =  new ImportResult();
        
        
        
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
                    //System.out.print(firstLine);
                    fileData += (char)ch;
                }
                System.out.print(fileData);
                String[] lines = fileData.replace("\r\n","\n").replace("\r","\n").split("\n");
                firstLine = lines[0];

                if (!firstLineCheck(firstLine)) {
                    //excep
                    results.incrementfailedRows();
                    //trhow exception
                }
                lines[0] = "";
               
                // Do the rest of the file
                lineNum = 1;
                for (String line : lines)
                {

                   
                    try 
                    {
                        if(line.isEmpty())
                        {
                            continue;
                        }
                        
                        results.incrementTotalRows();
                        columns = line.split(",");

                        if (columns.length != 2){
                               results.incrementfailedRows();
                               results.setErrorMessages("Row number is wrong" +lineNum );
                               continue;
                        }
                        
                        //checks City element
                        if ((columns[0].isEmpty())){
                             results.incrementfailedRows();
                             results.setErrorMessages("Row number is wrong" +lineNum );
                             continue;
                        }
                        
                        //checks Airport element
                        if ((columns[1].isEmpty())){
                             results.incrementfailedRows();
                             results.setErrorMessages("Row number is wrong" +lineNum );
                             continue;
                        }    
                        else
                        {
                            //reg expression pattern
                        }
                 
                        locationToUpdate = DatabaseOperations.getLocationByAirportCode(columns[1].toString());
                        
                        if(locationToUpdate == null) { // location not in db 
                            locationToAdd = new Location(); // instantiate 
                            locationToAdd.setCity(columns[0]);
                            locationToAdd.setAirportCode(columns[1]);
                            DatabaseOperations.AddLocation(locationToAdd);
                            BookingForm bookingForm = new BookingForm();
                            bookingForm.locationsList.add(locationToAdd); //needs to be setVisible with true somewhere
                            
                        }
                        else
                        {
                            //if the record already exists therefore update only columns required
                            locationToUpdate.setCity(columns[0]);
                            DatabaseOperations.UpdateLocation(locationToUpdate);
                            
                        }
                        
                        results.incrementImportedRows();

                    }
                    

                    catch (Exception e)
                    {
                     //diplay error message with line number
                        
                    }
                     
                    finally 
                    {
                         lineNum++;
                    }
                    
                }

           }
           catch(FileNotFoundException fnfe){
               
               results.setErrorMessages("Cannot open the given file");
           }
           catch(IOException ioe){
               
               results.setErrorMessages("Input Output Error encountered when processing file ");
           }
           catch (Exception e)
           {
               results.setErrorMessages("Unknown error was encountered");
           }
        }
        
        
        
    }
    
    
    
    
}
