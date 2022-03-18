package com.ug6.soal1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class App
{
    private static String phoneName;
    private static String phoneCode;
    private static String androidCode;
    private static String companyCode;
    private static int ramCapacity;
    private static int romCapacity;
    private static int cameraResolution;
    private static float screenSize;
    private static final Scanner scanner;
    private static Production production;
    private static Phones phone;

    public static void main(final String[] args) throws InterruptedException {
        final TimeUnit time = TimeUnit.SECONDS;
        int increment = 0;
        System.out.println("Produce Your Phone");
        System.out.println("\n\n");
        System.out.println("Phone Detail");
        System.out.println("Pick Company Code");
        for (final String compCode : Codes.COMPANYCODES) {
            System.out.println(1 + increment + ". " + compCode);
            ++increment;
        }
        System.out.print("Your choice (1/2/...): ");
        String choice = App.scanner.nextLine();
        increment = Integer.parseInt(choice) - 1;
        setCompanyCode(Codes.COMPANYCODES.get(increment));
        System.out.print("Phone Name: ");
        setPhoneName(App.scanner.nextLine());
        increment = 0;
        System.out.print("Configure android level now?\nYes (y) or No (n): ");
        choice = App.scanner.nextLine();
        if (choice.equalsIgnoreCase("y")) {
            System.out.println("Pick your android level");
            for (final String compCode : Codes.ANDROIDCODES) {
                System.out.println(increment + 1 + ". " + compCode);
                ++increment;
            }
            System.out.print("Your choice (1/2/...): ");
            choice = App.scanner.nextLine();
            increment = Integer.parseInt(choice) - 1;
            setAndroidCode(Codes.ANDROIDCODES.get(increment));
            System.out.println("Generating Phone Code\nPlease Wait a moment");
            time.sleep(3L);
            setPhoneCode(Codes.generatePhoneCode(getCompanyCode(), getAndroidCode()));
            System.out.println("Phone code: " + getPhoneCode());
        }
        else if (choice.equalsIgnoreCase("n")) {
            System.out.println("Generating Phone Code\nPlease Wait a moment");
            time.sleep(3L);
            setPhoneCode(Codes.generatePhoneCode(getCompanyCode()));
            System.out.println("Phone code: " + getPhoneCode());
        }
        else {
            System.out.println("Wrong Input");
            main(args);
        }
        System.out.print("Add specification to phone ?\n yes (y) or no (n): ");
        choice = App.scanner.nextLine();
        if (choice.equalsIgnoreCase("y")) {
            addPhoneSpecification();
            conductProductionMenu();
        }
        else {
            App.phone = new Phones(getPhoneName(), getPhoneCode(), getCompanyCode(), getAndroidCode());
            conductProductionMenu();
        }
    }
    private static void conductProductionMenu() {
        final ArrayList<Long> productionDueDays = new ArrayList<Long>();
        final ArrayList<LocalDate> productionDate = new ArrayList<LocalDate>();
        System.out.println("\n\n Begin to Start");
        System.out.print("How much production capacity that can produce: ");
        final int productionCapacity = Integer.parseInt(App.scanner.nextLine());
        App.production = new Production(productionCapacity, productionDate, productionDueDays);
        System.out.println("Check Specification Requirement");
        checkSpecificationRequirement();
    }
    private static void checkSpecificationRequirement() {
        if (App.phone.getRamCapacity() == 0 && App.phone.getRomCapacity() == 0 && App.phone.getScreenSize() == 0.0f && App.phone.getCameraResolution() == 0) {
            if (App.production.checkPhonesSpecification(App.phone.getAndroidCode())) {
                System.out.println("Starting To Production");
                System.out.println("Do you want to add production rate (faster production higher cost)");
                System.out.print("Yes (y) or No (n): ");
                final String choice = App.scanner.nextLine();
                if (choice.equalsIgnoreCase("y")) {
                    System.out.print("Production rate (0.1 - 2.0): ");
                    final float productionRate = Float.parseFloat(App.scanner.nextLine());
                    getProduction().conductProduction(App.phone, productionRate);
                }
                else {
                    getProduction().conductProduction(App.phone);
                }
            }
            else {
                System.out.println("Failed to pass specification requirement");
            }
        }
        else if (App.production.checkPhonesSpecification(App.phone.getAndroidCode(), App.phone.getRamCapacity(), App.phone.getRomCapacity())) {
            System.out.println("Starting To Production");
            System.out.println("Do you want to add production rate (faster production higher cost)");
            System.out.print("Yes (y) or No (n): ");
            final String choice = App.scanner.nextLine();
            if (choice.equalsIgnoreCase("y")) {
                System.out.print("Production rate (0.1 - 2.0): ");
                final float productionRate = Float.parseFloat(App.scanner.nextLine());
                getProduction().conductProduction(App.phone, productionRate);
            }
            else {
                getProduction().conductProduction(App.phone);
            }
        }
        else {
            System.out.println("Failed to pass specification requirement");
        }
    }
    private static void addPhoneSpecification() {
        System.out.print("RAM Capacity: ");
        final int ram = Integer.parseInt(App.scanner.nextLine());
        System.out.print("ROM Capacity: ");
        final int rom = Integer.parseInt(App.scanner.nextLine());
        System.out.print("Screen Size (Inch): ");
        final float screenSize = Float.parseFloat(App.scanner.nextLine());
        System.out.print("Camera Resolution: ");
        final int cameraResolution = Integer.parseInt(App.scanner.nextLine());
        setRamCapacity(ram);
        setRomCapacity(rom);
        setScreenSize(screenSize);
        setCameraResolution(cameraResolution);
        App.phone = new Phones(getPhoneName(), getPhoneCode(), getCompanyCode(), getAndroidCode(), getRamCapacity(), getRomCapacity(), getCameraResolution(), getScreenSize());
    }

    public static String getPhoneName() {
        return App.phoneName;
    }
    public static void setPhoneName(final String phoneName) {
        App.phoneName = phoneName;
    }
    public static String getCompanyCode() {
        return App.companyCode;
    }
    public static void setCompanyCode(final String companyCode) {
        App.companyCode = companyCode;
    }
    public static String getAndroidCode() {
        return App.androidCode;
    }
    public static void setAndroidCode(final String androidCode) {
        App.androidCode = androidCode;
    }
    public static String getPhoneCode() {
        return App.phoneCode;
    }
    public static void setPhoneCode(final String phoneCode) {
        App.phoneCode = phoneCode;
    }
    public static int getRomCapacity() {
        return App.romCapacity;
    }
    public static void setRomCapacity(final int romCapacity) {
        App.romCapacity = romCapacity;
    }
    public static int getRamCapacity() {
        return App.ramCapacity;
    }
    public static void setRamCapacity(final int ramCapacity) {
        App.ramCapacity = ramCapacity;
    }
    public static float getScreenSize() {
        return App.screenSize;
    }
    public static void setScreenSize(final float screenSize) {
        App.screenSize = screenSize;
    }
    public static int getCameraResolution() {
        return App.cameraResolution;
    }
    public static void setCameraResolution(final int cameraResolution) {
        App.cameraResolution = cameraResolution;
    }
    public static Production getProduction() {
        return App.production;
    }
    static {
        App.phoneName = "";
        App.phoneCode = "";
        App.androidCode = "";
        App.companyCode = "";
        App.ramCapacity = 0;
        App.romCapacity = 0;
        App.cameraResolution = 0;
        App.screenSize = 0.0f;
        scanner = new Scanner(System.in);
    }
}
