/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessObjects;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 91030283 
 */
public class Flight {
    
    private String FlightNumber ;
    private String DepartureAirport ;
    private String DestinationAirport ;
    private double Price ; 
    private Date datetime; 
    private String Plane ; 
    private int SeatsTaken ;
    
    //date declarations
    Date formattedFlightDate = new Date();
    //Date   flightDate    = new Date();
    String strflightDate;
    //String strFlightDateSelected;
    
           DateFormat formate  = new SimpleDateFormat("dd/mm/yyyy HH:mm");
           
           
           
           
//           strflightDate = flightDateBox.getText().toString();
//           try 
//           {
//            
//                formattedFlightDate =  formate.parse(strflightDate);
//           }
//           catch (ParseException ex) 
//           {
//            Logger.getLogger(Flight.class.getName()).log(Level.SEVERE, null, ex);
//           }
           
//           strstartDateSelectedContSub = startDateOfPayPeriodTxtBox.getText().toString();
//        
//        startDateSelectedContSub = formate.parse(strstartDateSelectedContSub);
    
    public String toString()
    {

        // Read from file to date
        String fromFile = "21/5/2018 01:23";
        Date d;
        try {
            d = formate.parse(fromFile);
        } catch (ParseException e) {

        }
        
        
        
        // date to String
        String niceDate = formate.format(d);


        
        
        
        return formattedFlightDate;
    }
            
    
            
 
    
    /**
     * @return the FlightNumber
     */
    public String getFlightNumber() {
        return FlightNumber;
    }

    /**
     * @param FlightNumber the FlightNumber to set
     */
    public void setFlightNumber(String FlightNumber) {
        this.FlightNumber = FlightNumber;
    }

    /**
     * @return the DepartureAirport
     */
    public String getDepartureAirport() {
        return DepartureAirport;
    }

    /**
     * @param DepartureAirport the DepartureAirport to set
     */
    public void setDepartureAirport(String DepartureAirport) {
        this.DepartureAirport = DepartureAirport;
    }

    /**
     * @return the DestinationAirport
     */
    public String getDestinationAirport() {
        return DestinationAirport;
    }

    /**
     * @param DestinationAirport the DestinationAirport to set
     */
    public void setDestinationAirport(String DestinationAirport) {
        this.DestinationAirport = DestinationAirport;
    }

    /**
     * @return the Price
     */
    public double getPrice() {
        return Price;
    }

    /**
     * @param Price the Price to set
     */
    public void setPrice(double Price) {
        this.Price = Price;
    }

    /**
     * @return the datetime
     */
    public Date getDatetime() {
        return datetime;
    }

    /**
     * @param datetime the datetime to set
     */
    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    /**
     * @return the Plane
     */
    public String getPlane() {
        return Plane;
    }

    /**
     * @param Plane the Plane to set
     */
    public void setPlane(String Plane) {
        this.Plane = Plane;
    }

    /**
     * @return the SeatsTaken
     */
    public int getSeatsTaken() {
        return SeatsTaken;
    }

    /**
     * @param SeatsTaken the SeatsTaken to set
     */
    public void setSeatsTaken(int SeatsTaken) {
        this.SeatsTaken = SeatsTaken;
    }
    
}
