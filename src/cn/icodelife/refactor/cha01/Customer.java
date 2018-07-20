package cn.icodelife.refactor.cha01;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 顾客
 */
public class Customer {

    private String _name;

    private Vector _rentals = new Vector();

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public Vector get_rentals() {
        return _rentals;
    }

    public void set_rentals(Vector _rentals) {
        this._rentals = _rentals;
    }


    public String statement() {
        Enumeration rentals = _rentals.elements();
        String result = "Rental Record for " + get_name() + "\n";
        while (rentals.hasMoreElements()) {

            Rental each = (Rental) rentals.nextElement();


            result += '\t' + each.get_movie().get_title() + '\t' + String.valueOf(each.amountFor());

        }
        result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) + "frequent renter points";

        return result;
    }

    private double getTotalCharge(){
        double result = 0;
        Enumeration rentals = _rentals.elements();
        while(rentals.hasMoreElements()){
            Rental each = (Rental) rentals.nextElement();
            result += each.amountFor();
        }
        return result;
    }

    private double getTotalFrequentRenterPoints(){
        double result = 0;
        Enumeration rentals = _rentals.elements();
        while(rentals.hasMoreElements()){
            Rental each = (Rental) rentals.nextElement();
            result += each.getFrequentRenterPoints();
        }
        return result;
    }


}
