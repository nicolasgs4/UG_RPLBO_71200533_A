package com.ug6.soal1;

public class Phones
{
    private String phoneName;
    private String phoneCode;
    private String companyCode;
    private String androidCode;
    private int ramCapacity;
    private int romCapacity;
    private int cameraResolution;
    private float screenSize;

    public Phones(String phoneName, String phoneCode, String companyCode, String androidCode) {
        this.ramCapacity = 0;
        this.romCapacity = 0;
        this.cameraResolution = 0;
        this.setCompanyCode(companyCode);
        this.setAndroidCode(androidCode);
        this.setPhoneCode(phoneCode);
        this.setPhoneName(phoneName);
    }
    public Phones (String phoneName, String phoneCode, String companyCode, String androidCode, int ramCapacity, int romCapacity, int cameraResolution, float screenSize) {
        this.ramCapacity = 0;
        this.romCapacity = 0;
        this.cameraResolution = 0;
        this.setCompanyCode(companyCode);
        this.setAndroidCode(androidCode);
        this.setPhoneName(phoneName);
        this.setPhoneCode(phoneCode);
        this.setRamCapacity(ramCapacity);
        this.setRomCapacity(romCapacity);
        this.setScreenSize(screenSize);
        this.setCameraResolution(cameraResolution);
    }
    public String getPhoneName() {
        return this.phoneName;
    }
    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }
    public String getCompanyCode() {
        return this.companyCode;
    }
    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }
    public String getAndroidCode() {
        return this.androidCode;
    }
    public void setAndroidCode(String androidCode) {
        this.androidCode = androidCode;
    }
    public int getRamCapacity() {
        return this.ramCapacity;
    }
    public void setRamCapacity(int ramCapacity) {
        this.ramCapacity = ramCapacity;
    }
    public int getRomCapacity() {
        return this.romCapacity;
    }
    public void setRomCapacity(int romCapacity) {
        this.romCapacity = romCapacity;
    }
    public int getCameraResolution() {
        return this.cameraResolution;
    }
    public void setCameraResolution(int cameraResolution) {
        this.cameraResolution = cameraResolution;
    }
    public float getScreenSize() {
        return this.screenSize;
    }
    public void setScreenSize(float screenSize) {
        this.screenSize = screenSize;
    }
    public String getPhoneCode() {
        return this.phoneCode;
    }
    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }
}

