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

import java.util.ArrayList;

public class ImportResult {
    
    private int totalRows;
    private int importedRows;
    private int failedRows;
    private ArrayList<String> errorMessages = new ArrayList<>();
    
    
    
    public ImportResult()
    {
        totalRows     = 0;
        importedRows  = 0;
        failedRows    = 0;        
        errorMessages.clear();     
    }
    
     public void incrementTotalRows()
             {
                 this.totalRows = this.totalRows++;
             }
    public void incrementfailedRows()
             {
                 this.failedRows = this.failedRows++;
             }
    
     public void incrementImportedRows()
             {
                 this.importedRows = this.importedRows++;
             }
    /**
     * @return the totalRows
     */
    public int getTotalRows() {
        return totalRows;
    }

    /**
     * @param totalRows the totalRows to set
     */
    public void setTotalRows(int totalRows) {
        this.totalRows = totalRows;
    }

    /**
     * @return the importedRows
     */
    public int getImportedRows() {
        return importedRows;
    }

    /**
     * @param importedRows the importedRows to set
     */
    public void setImportedRows(int importedRows) {
        this.importedRows = importedRows;
    }

    /**
     * @return the failedRows
     */
    public int getFailedRows() {
        return failedRows;
    }

    /**
     * @param failedRows the failedRows to set
     */
    public void setFailedRows(int failedRows) {
        this.failedRows = failedRows;
    }

    /**
     * @return the errorMessages
     */
    public ArrayList<String> getErrorMessages() {
        return errorMessages;
        
    }

    /**
     * @param errorMessages the errorMessages to set
     */
    public void setErrorMessages(String errorMessages) {
        this.errorMessages.add(errorMessages)  ;
    }
    
    
}
