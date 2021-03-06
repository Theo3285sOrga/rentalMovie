package entities;

/**
 * Create a Customer test suite before refactoring
 * Extract amount calculation (switch case) into a private method
 * Extract frequent renter points calculation into a private method
 * Extract string result computation into a private method
 * Prepare package structure following clean architecture principles
 * Move amount calculation into Rental entity
 * Replace amount Temp variable with amount calculation method call from Rental entity
 * Remove amount Temp variable
 * Move frequent renter points calculation method into Rental entity
 * Replace frequent renter points Temp variable with frequent renter points calculation method call from Rental entity
 * Remove frequent renter points Temp variable
 * Replace total amount Temp variable with private method duplicating the loop
 * Replace total frequent renter points temp variable with private method duplicating the loop
 * Move the getCharge method into the movie entity
 * Create Price abstract class to prepare inheritance
 * Create the movie type classes inheriting from price
 * Change the _pricecode type from int to Price class
 * Change the setPriceCode method into a factory method
 * Make the getPriceCode method into the Price class and make it abstract
 * Make each movie type class implement the getPriceCode method and return its Type
 * Move the calculation from the switch case to the ovirriden getCharge method into their corresponding movie class type
 * Make the getCharge method abstract in Price class
 * Move the getFrequentRenterPoint into the Price class
 * Move the Movie type constants into the Price class
 */

public class Customer {
    private String _name;

    public Customer(String name) {
        _name = name;
    }

    public String getName() {
        return _name;
    }

}
