package com.ug6.soal1;

import java.time.LocalDate;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Production
{
    private int productionCapacity;
    private ArrayList<LocalDate> productionDate;
    private ArrayList<Long> productionDueDays;
    private double costCalculation;

    public Production(int productionCapacity, ArrayList<LocalDate> productionDate, ArrayList<Long> productionDueDays) {
        this.costCalculation = 0.0;
        this.setProductionCapacity(productionCapacity);
        this.setProductionDate(productionDate);
        this.setProductionDueDays(productionDueDays);
    }

    public boolean checkPhonesSpecification(String androidCode) {
        int index = 0;
        boolean status = false;
        for (String androidLevel : Codes.ANDROIDCODES) {
            status = (!androidCode.equalsIgnoreCase(androidLevel) || index >= 3);
            ++index;
        }
        return status;
    }

    public boolean checkPhonesSpecification(String androidCode, int ramCapacity, int romCapacity) {
        int increment = 0;
        boolean status = false;
        System.out.println("Starting with status " + status);
        for (final String androidLevel : Codes.ANDROIDCODES) {
            if (increment <= 4 && androidLevel.equalsIgnoreCase(androidCode)) {
                if (ramCapacity <= 8 && ramCapacity >= 1 && romCapacity <= 128 && romCapacity >= 32) {
                    status = true;
                }
            }
            else if (increment > 4 && increment < Codes.ANDROIDCODES.size() - 1 && androidLevel.equalsIgnoreCase(androidCode) && ramCapacity <= 16 && ramCapacity >= 4 && romCapacity <= 256 && romCapacity >= 64) {
                status = true;
            }
            ++increment;
        }
        System.out.println("Finish checking with status " + status);
        return status;
    }

    public void conductProduction(Phones phone) {
        long productionDuration = this.getProductionCapacity() * 3L;
        LocalDate today = LocalDate.now();
        this.getProductionDate().add(today);
        LocalDate productionDueDate = today.plusDays(productionDuration);
        long daysBetweenProduction = ChronoUnit.DAYS.between(today, productionDueDate);
        String todayFormat = today.format(DateTimeFormatter.ISO_LOCAL_DATE);
        String productionDueDateFormat = productionDueDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
        double cost = this.getProductionCapacity() * (double)daysBetweenProduction * 1000;
        this.setCostCalculation(cost);
        String bonusProductionDate = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        String bonusProductionDueDate = productionDueDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        System.out.println("Congratulation\nBegin To Produce Phone " + phone.getPhoneName());
        System.out.println("With code: " + phone.getPhoneCode());
        System.out.println("Production Date: " + todayFormat);
        System.out.println("Production Due date: " + productionDueDateFormat);
        System.out.println("Days Before Due Date = " + daysBetweenProduction + " Days");
        System.out.println("Calculation Production Cost: Rp " + this.getCostCalculation());
    }

    public void conductProduction(Phones phone, float productionRate) {
        if ( productionRate <= 2.0f && productionRate >= 0.0f) {
            long productionDuration = (long)(this.getProductionCapacity()  * productionRate * 3L);
            LocalDate today = LocalDate.now();
            this.getProductionDate().add(today);
            LocalDate productionDueDate = today.plusDays(productionDuration);
            long daysBetweenProduction = ChronoUnit.DAYS.between(today, productionDueDate);
            String todayFormat = today.format(DateTimeFormatter.ISO_LOCAL_DATE);
            String productionDueDateFormat = productionDueDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
            double cost = this.getProductionCapacity() * (double)daysBetweenProduction * 1000 * 2.0;
            this.setCostCalculation(cost);
            String bonusProductionDate = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
            String bonusProductionDueDate = productionDueDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
            System.out.println("Congratulation \n Begin To Produce Phone " + phone.getPhoneName());
            System.out.println("With code: " + phone.getPhoneCode());
            System.out.println("Production Date: " + bonusProductionDate);
            System.out.println("Production Due date: " + bonusProductionDueDate);
            System.out.println("Days Before Due Date = " + daysBetweenProduction + " Days");
            System.out.println("Calculation Production Cost: Rp " + (long)this.getCostCalculation());
        }
        else {
            System.out.println("Please Input valid Production Rate");
        }
    }
    public int getProductionCapacity() {
        return this.productionCapacity;
    }
    public ArrayList<Long> getProductionDueDays() {
        return this.productionDueDays;
    }
    public void setCostCalculation(double costCalculation) {
        this.costCalculation = costCalculation;
    }
    public void setProductionCapacity(int productionCapacity) {
        this.productionCapacity = productionCapacity;
    }
    public ArrayList<LocalDate> getProductionDate() {
        return this.productionDate;
    }
    public void setProductionDueDays(ArrayList<Long> productionDueDays) {
        this.productionDueDays = productionDueDays;
    }
    protected void setProductionDate(ArrayList<LocalDate> productionDate) {
        this.productionDate = productionDate;
    }
    public double getCostCalculation() {
        return this.costCalculation;
    }
}

