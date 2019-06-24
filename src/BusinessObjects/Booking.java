/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessObjects;

/**
 *
 * @author 91030283
 */
public class Booking {
    
    private int BookingNumber;  
    private String FlightNumber;
    private double Price;
    private String CabinClass;
    private int Quantity; 
    private int Insurance ;

    /**
     * @return the BookingNumber
     */
    public int getBookingNumber() {
        return BookingNumber;
    }

    /**
     * @param BookingNumber the BookingNumber to set
     */
    public void setBookingNumber(int BookingNumber) {
        this.BookingNumber = BookingNumber;
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
     * @return the CabinClass
     */
    public String getCabinClass() {
        return CabinClass;
    }

    /**
     * @param CabinClass the CabinClass to set
     */
    public void setCabinClass(String CabinClass) {
        this.CabinClass = CabinClass;
    }

    /**
     * @return the Quantity
     */
    public int getQuantity() {
        return Quantity;
    }

    /**
     * @param Quantity the Quantity to set
     */
    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    /**
     * @return the Insurance
     */
    public int getInsurance() {
        return Insurance;
    }

    /**
     * @param Insurance the Insurance to set
     */
    public void setInsurance(int Insurance) {
        this.Insurance = Insurance;
    }
    
    
}
