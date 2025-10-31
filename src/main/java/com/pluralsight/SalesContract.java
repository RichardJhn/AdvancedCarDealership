package com.pluralsight;

public class SalesContract extends Contract {

    private double salesTax;
    private double recordingFee;
    private double processingFee;
    private  boolean finance;

    public SalesContract(String date, String customerName, String customerEmail, Vehicle vehicleSold,
                         double totalPrice, double monthlyPayment, boolean finance, double processingFee,
                         double recordingFee, double salesTax) {
        super(date, customerName, customerEmail, vehicleSold, totalPrice, monthlyPayment);
        this.finance = finance;
        this.processingFee = processingFee;
        this.recordingFee = recordingFee;
        this.salesTax = salesTax;
    }

    public double getSalesTax() {
        return salesTax;
    }

    public double getRecordingFee() {
        return recordingFee;
    }

    public double getProcessingFee() {
        return processingFee;
    }

    public boolean isFinance() {
        return finance;
    }

    @Override
    public double getTotalPayment(){
        double vehiclePrice = getVehicleSold().getPrice();


        double total = vehiclePrice + (vehiclePrice * .05) + recordingFee + processingFee;

        return total;


    }

    @Override
    public double getMonthlyPayment(){

        //double rate = (price < 10000 ? 0.425:0.50);

        return 0;
    }
}
