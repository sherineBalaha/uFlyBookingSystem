package uflybookingsystem;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 91030283
 */
public abstract class BaseImporter implements Runnable {
    
    private String fileName ="";
    private ImportResult results;
    
    
    
    @Override
    public abstract void run();
    
    public BaseImporter(String fileName)
    {
        
        this.fileName = fileName;
        
    }

    /**
     * @return the results
     */
    public ImportResult getResults() {
        return results;
    }

    /**
     * @param results the results to set
     */
    public void setResults(ImportResult results) {
        this.results = results;
    }

    /**
     * @return the fileName
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * @param fileName the fileName to set
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
   
}
