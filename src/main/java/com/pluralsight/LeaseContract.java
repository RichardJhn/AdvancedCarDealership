package com.pluralsight;

public class LeaseContract extends Contract {

    private double endValue;
    private double leaseFee;

    public LeaseContract(String date, String customerName, String customerEmail,
                         Vehicle vehicleSold, double totalPrice, double monthlyPayment,
                         double endValue, double leaseFee) {
        super(date, customerName, customerEmail, vehicleSold, totalPrice, monthlyPayment);
        this.endValue = endValue;
        this.leaseFee = leaseFee;
    }

    public double getEndValue() {
        return endValue;
    }

    public double getLeaseFee() {
        return leaseFee;
    }
    public double getTotalPayment(){

        return 0;

    }


    public double getMonthlyPayment(){

        return 0;
    }
}

