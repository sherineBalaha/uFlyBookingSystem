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
public class Enumerators {
    
    public enum CabinClass {
        ECONOMY_ClASS, PRESTIGE_CLASS, FIRST_CLASS;
    }
    
    
    public enum Plane {
        AIRBUSA350(270),AIRBUSA280(500),BOEING737(215),BOEING747(460);
        
        private int passengerCapacity;
        
        private Plane(int passengerCapacity)
        {
            this.passengerCapacity = passengerCapacity;
        }

        /**
         * @return the passengerCapacity
         */
        public int getPassengerCapacity() {
            return passengerCapacity;
        }
                
                
    }
    
    
}
